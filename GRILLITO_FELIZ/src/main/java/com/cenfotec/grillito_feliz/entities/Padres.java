package com.cenfotec.grillito_feliz.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Padres implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "telefono_P", nullable = false)
    private String telefonoP;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono_S")
    private String telefonoS;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefonoP() {
        return telefonoP;
    }

    public void setTelefonoP(String telefonoP) {
        this.telefonoP = telefonoP;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoS() {
        return telefonoS;
    }

    public void setTelefonoS(String telefonoS) {
        this.telefonoS = telefonoS;
    }
}
