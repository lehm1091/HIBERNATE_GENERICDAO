/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lehm.test;

import com.lehm.dao.AlumnoDao;
import com.lehm.dao.AsignacionDao;
import com.lehm.dao.CursoDao;
import com.lehm.dao.DomicilioDao;
import java.util.List;
import com.lehm.domain.*;
import java.util.Optional;

/**
 *
 * @author Luis
 */
public class TestDaos {

    public static void main(String[] args) {
        AlumnoDao aDao = new AlumnoDao();
        Alumno alumno = new Alumno();
        alumno.setApellido("Hernandez");
        alumno.setNombre("Juan");
        //aDao.save(alumno);

        DomicilioDao dDao = new DomicilioDao();

        Domicilio domicilio = new Domicilio();
        /*domicilio.setCalle("primera calle");
        domicilio.setPais("El Salvador");
        domicilio.setNoCalle("1");
        dDao.save(domicilio);*/
        //aDao.setTypeParameterClass(Alumno.class);
        //domicilio = dDao.get(1).get();
        alumno = aDao.get(2).get();
        // alumno.setApellido("Menendez");
        // alumno.setDomicilio(domicilio);
        //aDao.save(alumno);
        System.out.println(alumno);
        System.out.println(alumno.getDomicilio());
        CursoDao cDao = new CursoDao();

        Curso curso = new Curso();
        curso.setNombre("Ciencias");
        curso.setPrecio(4.0);
        cDao.save(curso);
        AsignacionDao asDao = new AsignacionDao();

        Asignacion asignacion = new Asignacion();
        asignacion.setTurno("primer turno");
        asignacion.setAlumno(alumno);
        asignacion.setCurso(curso);
        //asDao.save(asignacion);

        //imprimir(aDao.getAll());
        System.out.println(
                cDao.get(1)
                        .map(Curso::getPrecio)
                        .filter(p -> p >= 2)
                        .isPresent());

       aDao.delete(alumno);
    }

    private static void imprimir(List coleccion) {
        for (Object o : coleccion) {
            System.out.println("Valor " + o);
        }
    }
}
