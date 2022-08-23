package com.cenfotec.grillito_feliz.services;

import com.cenfotec.grillito_feliz.entities.Libros;

import java.util.List;
import java.util.Optional;

public interface LibrosServiceInterface {

    List<Libros> findAllLibros();

    Optional<Libros> findLibroById(int LibroId);

    Optional<Libros> findLibroByIdNinno(int idNinno);

    void saveLibro(Libros libro);

    void saveAll(List<Libros> libros);

}