package com.cenfotec.grillito_feliz.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Libros implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "idNinno", nullable = false)
    private int idNinno;

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

    public int getIdNinno() {
        return idNinno;
    }

    public void setIdNinno(int idNinno) {
        this.idNinno = idNinno;
    }
}
