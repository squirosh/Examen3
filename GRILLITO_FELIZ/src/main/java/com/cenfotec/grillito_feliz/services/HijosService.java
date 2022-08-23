package com.cenfotec.grillito_feliz.services;

import com.cenfotec.grillito_feliz.entities.Hijos;
import com.cenfotec.grillito_feliz.entities.Padres;
import com.cenfotec.grillito_feliz.repositories.HijosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class HijosService implements HijosServiceInterface{

    @Autowired
    HijosRepository hijosRepository;

    @Override
    public List<Hijos> findAllHijos() {
        return hijosRepository.findAll();

    }

    @Override
    public Optional<Hijos> findHijoById(int hijoId) {
        return hijosRepository.findById(hijoId);
    }

    @Override
    public Optional<Hijos> findHijoByNombre(String nombre) {
        return hijosRepository.findByNombreContaining(nombre);
    }

    @Override
    public void saveHijo(Hijos hijo) {
        hijosRepository.save(hijo);
    }

    @Override
    public void saveAll(List<Hijos> hijos) {
        hijosRepository.saveAll(hijos);

    }
}
