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
public class Contacto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "gen_contacto", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "gen_contacto", sequenceName = "contacto_sequence", allocationSize = 1)
    @Column(name = "id_contacto")
    private Long idContacto;
    private String telefono;
    private String email;

    /**
     * @return the idContacto
     */
    public Long getIdContacto() {
        return idContacto;
    }

    /**
     * @param idContacto the idContacto to set
     */
    public void setIdContacto(Long idContacto) {
        this.idContacto = idContacto;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contacto{idContacto=").append(idContacto);
        sb.append(", telefono=").append(telefono);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }

}
