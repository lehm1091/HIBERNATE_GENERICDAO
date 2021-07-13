/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lehm.dao;

import com.google.common.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import com.lehm.domain.Domicilio;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Luis
 */

public class GenericDao<T> implements Dao<T> {

    protected static EntityManager entityManager;
    private static EntityManagerFactory emf;
    private static final String PU = "HibernatePU";
    private final TypeToken<T> typeToken = new TypeToken<T>(getClass()) {
    };
    private final Type type = typeToken.getType(); // or getRawType() to return Class<? super T>

    public Type getType() {
        return type;
    }

    public GenericDao() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(PU);
        }

    }

    public EntityManager getEntityManager() {
        if (entityManager == null) {
            entityManager = emf.createEntityManager();
        }
        return entityManager;
    }

    @Override
    public Optional<T> get(long id) {
        System.out.println(getType().getClass());
        System.out.println(getType().toString());
        System.out.println(getType().getTypeName());

        Class<T> clazz = (Class<T>) type;
        System.out.println(clazz);
        return Optional.ofNullable(getEntityManager().find(clazz, id));
    }

    @Override
    public List<T> getAll() {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        Class<T> clazz = (Class<T>) type;
        System.out.println(clazz);
        CriteriaQuery<T> cr = cb.createQuery(clazz);
        Root<T> root = cr.from(clazz);
        cr.select(root);
        Query query;
        query = entityManager.createQuery(cr);
        return query.getResultList();
    }

    @Override
    public void save(T t) {
        executeInsideTransaction(entityManager -> getEntityManager().persist(t));
    }

    @Override
    public void update(T t) {

        executeInsideTransaction(entityManager -> getEntityManager().merge(t));
    }

    @Override
    public void delete(T t) {
        executeInsideTransaction(entityManager -> getEntityManager().remove(t));
    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityTransaction tx = getEntityManager().getTransaction();
        try {
            tx.begin();
            action.accept(entityManager);
            tx.commit();
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        } finally {
            
        }
    }

}
