package com.cenfotec.grillito_feliz.repositories;

import com.cenfotec.grillito_feliz.entities.Hijos;
import com.cenfotec.grillito_feliz.entities.Padres;
import com.cenfotec.grillito_feliz.services.HijosService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HijosRepository extends JpaRepository<Hijos, Integer> {
        Optional<Hijos> findByIdPadreContaining(int id);

        Optional<Hijos> findByNombreContaining(String word);

        Optional<Hijos> findById(Long aLong);
}