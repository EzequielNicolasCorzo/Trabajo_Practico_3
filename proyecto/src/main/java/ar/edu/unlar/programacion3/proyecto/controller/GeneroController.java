package ar.edu.unlar.programacion3.proyecto.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlar.programacion3.proyecto.models.Genero;
import ar.edu.unlar.programacion3.proyecto.service.GeneroService;

@RestController
@RequestMapping("/api/generos")
public class GeneroController {
    
    private final GeneroService generoService;

    public GeneroController(GeneroService generoService) {
        this.generoService = generoService;
    }

    @GetMapping
    public List<Genero> listarTodos() {
        return generoService.listarTodos();
    }
}
