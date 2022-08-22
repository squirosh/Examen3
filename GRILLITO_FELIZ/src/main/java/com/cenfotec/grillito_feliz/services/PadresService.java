package com.cenfotec.grillito_feliz.services;

import com.cenfotec.grillito_feliz.entities.Padres;
import com.cenfotec.grillito_feliz.repositories.PadresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PadresService {
    @Autowired
    PadresRepository padresRepository;
    public List<Padres> getAllPadres(int count) {
        return
                this.padresRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }
    public Optional<Padres> getPadre(int id) {
        return this.padresRepository.findById(id);
    }
    public Padres createPadres(String nombre, String direccion,
                                 String telefonoP,  String telefonoS) {

        Padres padres = new Padres();
        padres.setNombre(nombre);
        padres.setDireccion(direccion);
        padres.setTelefonoP(telefonoP);
        padres.setTelefonoS(telefonoS);
        return this.padresRepository.save(padres);
    }
}
