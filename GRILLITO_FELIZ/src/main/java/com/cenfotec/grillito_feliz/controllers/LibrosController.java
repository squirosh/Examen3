package com.cenfotec.grillito_feliz.controllers;

import com.cenfotec.grillito_feliz.entities.Hijos;
import com.cenfotec.grillito_feliz.entities.Libros;
import com.cenfotec.grillito_feliz.services.HijosService;
import com.cenfotec.grillito_feliz.services.LibrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/libros")
public class LibrosController {
    @Autowired
    LibrosService librosService;

    @RequestMapping("/")
    private String homePage(Model model) {
        return "index";
    }

    @RequestMapping("/registrarLibro")
    private String getRegistrarLibro(Model model) {
        Libros libros = new Libros();
        model.addAttribute("nueva", libros);
        return "registrar";
    }

    @PostMapping(value = "/registrarLibro",consumes = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<Object> postRegistrarHijo(@RequestBody Libros nueva) {
        this.librosService.saveLibro(nueva);
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @GetMapping(value = "/listaLibros", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<Object> getListLibros() {
        return ResponseEntity.ok(this.librosService.findAllLibros());
    }

    @GetMapping(value = "/detalle/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findById(@PathVariable("id") int id){
        return ResponseEntity.ok(this.librosService.findLibroById(id));

    }
    @GetMapping(value = "/by/{idNinno}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findByIdNinno(@PathVariable("idNinno") int idNinno){
        return ResponseEntity.ok(this.librosService.findLibroByIdNinno(idNinno));

    }

}