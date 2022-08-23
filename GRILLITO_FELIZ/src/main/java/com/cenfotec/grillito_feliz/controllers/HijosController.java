package com.cenfotec.grillito_feliz.controllers;

import com.cenfotec.grillito_feliz.entities.Hijos;
import com.cenfotec.grillito_feliz.entities.Padres;
import com.cenfotec.grillito_feliz.services.HijosService;
import com.cenfotec.grillito_feliz.services.PadresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hijos")
public class HijosController {
    @Autowired
    HijosService hijosService;

    @RequestMapping("/")
    private String homePage(Model model) {
        return "index";
    }

    @RequestMapping("/registrarHijo")
    private String getRegistrarHijo(Model model) {
        Hijos hijos = new Hijos();
        model.addAttribute("nueva", hijos);
        return "registrar";
    }

    @PostMapping(value = "/registrarHijo",consumes = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<Object> postRegistrarHijo(@RequestBody Hijos nueva) {
        this.hijosService.saveHijo(nueva);
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @GetMapping(value = "/listaHijos", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<Object> getListHijos() {
        return ResponseEntity.ok(this.hijosService.findAllHijos());
    }

    @GetMapping(value = "/detalle/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findById(@PathVariable("id") int id){
        return ResponseEntity.ok(this.hijosService.findHijoById(id));

    }
    @GetMapping(value = "/by/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findById(@PathVariable("nombre") String nombre){
        return ResponseEntity.ok(this.hijosService.findHijoByNombre(nombre));

    }

}

