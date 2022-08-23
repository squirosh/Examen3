package com.cenfotec.grillito_feliz.repositories;

import com.cenfotec.grillito_feliz.entities.Padres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PadresRepository extends JpaRepository<Padres, Integer> {
    Optional<Padres> findByNombreContaining(String word);

    Optional<Padres> findById(Long aLong);
}


