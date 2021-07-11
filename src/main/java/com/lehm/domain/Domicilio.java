/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lehm.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Luis
 */
@Entity
public class Domicilio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID_DOMICILIO")
    @GeneratedValue(generator = "gen_domicilio", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "gen_domicilio", sequenceName = "domicilio_sequence",allocationSize=1)

    private Long idDomicilio;
    private String calle;
    @Column(name = "no_calle")
    private String noCalle;
    private String pais;

    public Long getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Long idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoCalle() {
        return noCalle;
    }

    public void setNoCalle(String noCalle) {
        this.noCalle = noCalle;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
