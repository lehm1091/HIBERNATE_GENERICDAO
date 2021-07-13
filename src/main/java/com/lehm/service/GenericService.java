/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lehm.service;

import com.google.common.reflect.TypeToken;
import com.lehm.dao.AlumnoDao;
import com.lehm.dao.Dao;
import com.lehm.dao.GenericDao;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.lang.reflect.Type;

public abstract class GenericService<T> implements Service<T> {

    public Dao dao;

    @Override
    public List<T> getAll() {
        return dao.getAll();
    }

    @Override
    public void save(T t) {
        dao.save(t);
    }

    @Override
    public void remove(Long id) {
        dao.delete(getById(id));
    }

    @Override
    public T getById(Long id) {
        return (T) dao.get(id).get();
    }

    @Override
    public void update(T t) {
        dao.update((T) t);
    }

}
