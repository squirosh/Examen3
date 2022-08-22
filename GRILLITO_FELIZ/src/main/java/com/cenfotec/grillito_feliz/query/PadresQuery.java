package com.cenfotec.grillito_feliz.query;

import com.cenfotec.grillito_feliz.entities.Padres;
import com.cenfotec.grillito_feliz.services.PadresService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PadresQuery implements GraphQLQueryResolver {
    @Autowired
    private PadresService padresService;
    public List<Padres> getPadres(int count) {
        return this.padresService.getAllPadres(count);
    }
    public Optional<Padres> getPadre(int id) {
        return this.padresService.getPadre(id);
    }
}
