package ar.edu.unlar.programacion3.proyecto.controller;

import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlar.programacion3.proyecto.models.Cancion;
import ar.edu.unlar.programacion3.proyecto.service.CancionService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/canciones")
public class CancionController {

    private final CancionService cancionService;

    public CancionController(CancionService cancionService) {
        this.cancionService = cancionService;
    }

    @GetMapping
    public List<Cancion> listarTodas() {
        return cancionService.listarTodas();
    }

    @GetMapping("/buscar")
    public List<Cancion> buscar(@RequestParam(required = false) String titulo, 
                                @RequestParam(required = false) String artista) {
        return cancionService.buscarPorFiltros(titulo, artista);
    }
}
