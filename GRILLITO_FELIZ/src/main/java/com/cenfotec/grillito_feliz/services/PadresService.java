package com.cenfotec.grillito_feliz.services;

import com.cenfotec.grillito_feliz.entities.Padres;
import com.cenfotec.grillito_feliz.repositories.PadresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
public class PadresService implements PadresServiceInterface{


    @Autowired
    PadresRepository padresRepository;

    @Override
    public List<Padres> findAllPadres() {
        return padresRepository.findAll();
    }

    @Override
    public Optional<Padres> findByPadreId(int padreId) {
        return padresRepository.findById(padreId);
    }

    @Override
    public Optional<Padres> findPadreByNombre(String nombre) {
        return padresRepository.findByNombreContaining(nombre);
    }

    @Override
    public void savePadre(Padres padre) {
            padresRepository.save(padre);
    }

    @Override
    public void saveAll(List<Padres> padres) {
            padresRepository.saveAll(padres);
    }

    @Override
    public void deletePadreById(int padreId) {

    }
}
