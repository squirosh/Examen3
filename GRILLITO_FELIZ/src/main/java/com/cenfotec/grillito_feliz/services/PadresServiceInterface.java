package com.cenfotec.grillito_feliz.services;

import com.cenfotec.grillito_feliz.entities.Padres;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface PadresServiceInterface {

    List<Padres> findAllPadres();

    Optional<Padres> findByPadreId(int padreId);

    Optional<Padres> findPadreByNombre(String nombre);



    void savePadre(Padres padre);

    void saveAll(List<Padres> padres);

    void deletePadreById(int padreId);
}
