package com.cenfotec.grillito_feliz.mutation;


import com.cenfotec.grillito_feliz.entities.Padres;
import com.cenfotec.grillito_feliz.services.PadresService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PadresMutation implements GraphQLMutationResolver {
    @Autowired
    private PadresService padresService;

    public Padres createPadre(String nombre, String direccion, String telefonoP,
                                String telefonoS) {
        return this.padresService.createPadres(nombre, direccion,
                telefonoP, telefonoS);
    }
}
