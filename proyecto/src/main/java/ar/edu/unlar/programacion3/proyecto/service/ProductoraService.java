package ar.edu.unlar.programacion3.proyecto.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import ar.edu.unlar.programacion3.proyecto.config.DataConfig;
import ar.edu.unlar.programacion3.proyecto.models.Productora;

@Service
public class ProductoraService {
    private final DataConfig data;

    public ProductoraService(DataConfig data) {
        this.data = data;
    }

    public List<Productora> listarTodas() {
        Set<Productora> productoras = new HashSet<>();
        data.getCatalogo().forEach(c -> {
            if (c.getAlbum().getProductora() != null) {
                productoras.add(c.getAlbum().getProductora());
            }
        });
        return new ArrayList<>(productoras);
    }
}
