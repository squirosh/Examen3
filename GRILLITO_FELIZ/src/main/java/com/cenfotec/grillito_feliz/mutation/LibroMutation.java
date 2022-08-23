package com.cenfotec.grillito_feliz.mutation;

import com.cenfotec.grillito_feliz.entities.Libros;
import com.cenfotec.grillito_feliz.services.LibrosService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibroMutation implements GraphQLMutationResolver {

    @Autowired
    private LibrosService librosService;

    public Libros createLibro(String nombre, String idNinno) {
        return this.librosService.createLibro(nombre, idNinno);
    }
}
