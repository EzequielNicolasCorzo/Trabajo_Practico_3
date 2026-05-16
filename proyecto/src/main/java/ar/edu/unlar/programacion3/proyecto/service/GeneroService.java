package ar.edu.unlar.programacion3.proyecto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unlar.programacion3.proyecto.config.DataConfig;
import ar.edu.unlar.programacion3.proyecto.models.Genero;

@Service
public class GeneroService {
    private final DataConfig data;

    public GeneroService(DataConfig data) {
        this.data = data;
    }

    public List<Genero> listarTodos() {
        return data.getCatalogo().stream()
                .map(c -> c.getAlbum().getArtista().getGenero())
                .distinct() // Evita repetidos (Rock, Rock, Pop -> Rock, Pop)
                .toList();
    }
}
