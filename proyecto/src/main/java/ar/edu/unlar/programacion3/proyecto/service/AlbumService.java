package ar.edu.unlar.programacion3.proyecto.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import ar.edu.unlar.programacion3.proyecto.config.DataConfig;
import ar.edu.unlar.programacion3.proyecto.models.Album;

@Service

public class AlbumService {
    
    private final DataConfig data;

    public AlbumService(DataConfig data) {
        this.data = data;
    }

    public List<Album> listarTodos() {
        Set<Album> albumes = new HashSet<>();
        data.getCatalogo().forEach(c -> albumes.add(c.getAlbum()));
        return new ArrayList<>(albumes);
    }

    public List<Album> buscarPorNombre(String nombre) {
        return listarTodos().stream()
                .filter(al -> al.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .toList();
    }
}