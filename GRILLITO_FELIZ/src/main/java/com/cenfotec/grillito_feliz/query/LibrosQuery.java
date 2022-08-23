package com.cenfotec.grillito_feliz.query;

import com.cenfotec.grillito_feliz.entities.Libros;
import com.cenfotec.grillito_feliz.services.LibrosService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class LibrosQuery implements GraphQLQueryResolver {
    @Autowired
    private LibrosService librosService;
    public List<Libros> getLibros(int count) {
        return this.librosService.getAllLibros(count);
    }
    public Optional<Libros> getLibro(int id) {
        return this.librosService.getLibro(id);
    }
}
