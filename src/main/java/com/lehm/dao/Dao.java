/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lehm.dao;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import static com.lehm.dao.GenericDao.entityManager;

/**
 *
 * @author Luis
 */
public interface Dao<T> {

    

    EntityManager getEntityManager();

    Optional<T> get(long id);

    List<T> getAll();

    void save(T t);

    void update(T t);

    void delete(T t);
}
