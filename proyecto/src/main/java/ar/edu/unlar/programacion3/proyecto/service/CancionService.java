package ar.edu.unlar.programacion3.proyecto.service;

import java.util.List;
import org.springframework.stereotype.Service;
import ar.edu.unlar.programacion3.proyecto.config.DataConfig;
import ar.edu.unlar.programacion3.proyecto.models.Cancion;

@Service
public class CancionService {
    private final List<Cancion> canciones;

    public CancionService(DataConfig data) {
        this.canciones = data.getCatalogo();
    }

    public List<Cancion> listarTodas() {
        return canciones;
    }

    public Cancion buscarPorId(String id) {
        return canciones.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst().orElse(null);
    }

    public List<Cancion> buscarPorFiltros(String titulo, String artista) {
        return canciones.stream()
                .filter(c -> (titulo == null || c.getTitulo().toLowerCase().contains(titulo.toLowerCase())) &&
                             (artista == null || c.getAlbum().getArtista().getNombre().toLowerCase().contains(artista.toLowerCase())))
                .toList();
    }


}
