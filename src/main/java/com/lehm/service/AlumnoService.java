package com.lehm.service;

import com.lehm.dao.AlumnoDao;
import com.lehm.dao.Dao;
import com.lehm.domain.Alumno;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class AlumnoService extends GenericService<Alumno> {

    @EJB
    AlumnoDao aDao;

    @PostConstruct
    public void init() {
        dao = aDao;
    }

}
