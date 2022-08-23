package com.cenfotec.grillito_feliz.repositories;

import com.cenfotec.grillito_feliz.entities.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LibrosRepository extends JpaRepository<Libros, Integer> {

    Optional<Libros> findByIdNinnoContaining(int word);

    Optional<Libros> findById(Long aLong);
}
