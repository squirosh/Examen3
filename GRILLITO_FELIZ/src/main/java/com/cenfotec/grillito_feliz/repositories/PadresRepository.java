package com.cenfotec.grillito_feliz.repositories;

import com.cenfotec.grillito_feliz.entities.Padres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PadresRepository extends JpaRepository<Padres, Integer> {
}


