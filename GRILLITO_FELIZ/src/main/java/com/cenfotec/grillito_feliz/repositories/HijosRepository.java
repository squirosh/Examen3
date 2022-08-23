package com.cenfotec.grillito_feliz.repositories;

import com.cenfotec.grillito_feliz.entities.Hijos;
import com.cenfotec.grillito_feliz.entities.Padres;
import com.cenfotec.grillito_feliz.services.HijosService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HijosRepository extends JpaRepository<Hijos, Integer> {

    Optional<Hijos> findByNombreContaining(String word);

    Optional<Hijos> findById(Long aLong);
}