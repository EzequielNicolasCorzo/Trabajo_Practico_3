package ar.edu.unlar.programacion3.proyecto.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import ar.edu.unlar.programacion3.proyecto.config.DataConfig;
import ar.edu.unlar.programacion3.proyecto.models.Artista;

@Service
public class ArtistaService {
    private final DataConfig data;

    public ArtistaService(DataConfig data) {
        this.data = data;
    }

    public List <Artista> listarTodos() {
        Set<Artista> artistas = new HashSet<>();
        data.getCatalogo().forEach(c -> artistas.add(c.getAlbum().getArtista()));
        return new ArrayList<>(artistas);
    }

    public Artista buscarPorId(String id) {
        return listarTodos().stream()
                .filter(a -> a.getId().equals(id))
                .findFirst().orElse(null);
    }
}
