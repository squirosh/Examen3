package com.cenfotec.grillito_feliz.repositories;

import com.cenfotec.grillito_feliz.entities.Padres;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HijosRepository extends JpaRepository<Padres, Integer> {

    Optional<Padres> findByNombreContaining(String word);

    Optional<Padres> findById(Long aLong);
}