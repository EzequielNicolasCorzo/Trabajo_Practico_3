package ar.edu.unlar.programacion3.proyecto.controller;

import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlar.programacion3.proyecto.models.Album;
import ar.edu.unlar.programacion3.proyecto.service.AlbumService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/albumes")
public class AlbumController {

    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }


    @GetMapping
    public List<Album> listarTodos() {
        return albumService.listarTodos();
    }

    @GetMapping("/buscar")
    public List<Album> buscarPorNombre(@RequestParam String nombre) {
        return albumService.buscarPorNombre(nombre);
    }
}
