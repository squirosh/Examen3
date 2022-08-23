package com.cenfotec.grillito_feliz.services;

import com.cenfotec.grillito_feliz.entities.Hijos;
import com.cenfotec.grillito_feliz.entities.Padres;

import java.util.List;
import java.util.Optional;

public interface HijosServiceInterface {
    List<Hijos> findAllHijos();

    Optional<Hijos> findHijoById(int hijoId);

    Optional<Hijos> findHijoByNombre(String nombre);

    void saveHijo(Hijos hijo);

    void saveAll(List<Hijos> hijos);

}
