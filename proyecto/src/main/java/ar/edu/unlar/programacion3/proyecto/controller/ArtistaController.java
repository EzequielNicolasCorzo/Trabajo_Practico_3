package ar.edu.unlar.programacion3.proyecto.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlar.programacion3.proyecto.models.Artista;
import ar.edu.unlar.programacion3.proyecto.service.ArtistaService;

@RestController
@RequestMapping("/api/artistas")
public class ArtistaController {

    private final ArtistaService artistaService;

    public ArtistaController(ArtistaService artistaService) {
        this.artistaService = artistaService;
    }

    @GetMapping
    public List<Artista> listarTodos() {
        return artistaService.listarTodos();
    }

    @GetMapping("/{id}")
    public Artista buscarPorId(@PathVariable String id) {
        return artistaService.buscarPorId(id);
    }
}
