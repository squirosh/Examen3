package com.cenfotec.grillito_feliz.services;

import com.cenfotec.grillito_feliz.entities.Libros;
import com.cenfotec.grillito_feliz.repositories.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class LibrosService implements LibrosServiceInterface{

    @Autowired
    LibrosRepository librosRepository;


    @Override
    public List<Libros> findAllLibros() {
        return librosRepository.findAll();

    }

    @Override
    public Optional<Libros> findLibroById(int LibroId) {
        return librosRepository.findById(LibroId);
    }

    @Override
    public Optional<Libros> findLibroByIdNinno(int idNinno) {
        return librosRepository.findByIdNinnoContaining(idNinno);
    }

    @Override
    public void saveLibro(Libros libro) {
        librosRepository.save(libro);
    }

    @Override
    public void saveAll(List<Libros> libros) {
        librosRepository.saveAll(libros);

    }
}
