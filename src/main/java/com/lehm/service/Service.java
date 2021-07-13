/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lehm.service;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;

@Local
public interface Service<T> {

    List<T> getAll();

    void save(T t);
    
    void update(T t);

    void remove(Long id);

    T getById(Long id);

}
