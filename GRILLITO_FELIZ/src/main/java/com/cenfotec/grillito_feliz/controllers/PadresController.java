package com.cenfotec.grillito_feliz.controllers;

import com.cenfotec.grillito_feliz.entities.Padres;
import com.cenfotec.grillito_feliz.repositories.PadresRepository;
import com.cenfotec.grillito_feliz.services.PadresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class PadresController {
    @Autowired
    PadresService padresService;

    @RequestMapping("/")
    private String homePage(Model model) {
        return "index";
    }

    @RequestMapping("/registrarPadre")
    private String getRegistrarPadre(Model model) {
        Padres padre = new Padres();
        model.addAttribute("nueva", padre);
        return "registrar";
    }

    @PostMapping(value = "/registrarPadre",consumes = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<Object> postRegistrarPadre(@RequestBody Padres nueva) {
        this.padresService.savePadre(nueva);
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @GetMapping(value = "/listaPadres", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<Object> getListPadres() {
        return ResponseEntity.ok(this.padresService.findAllPadres());
    }

    @GetMapping(value = "/detalle/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findById(@PathVariable("id") int id){
        return ResponseEntity.ok(this.padresService.findByPadreId(id));

    }
    @GetMapping(value = "/by/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findById(@PathVariable("nombre") String nombre){
        return ResponseEntity.ok(this.padresService.findPadreByNombre(nombre));

    }

}
