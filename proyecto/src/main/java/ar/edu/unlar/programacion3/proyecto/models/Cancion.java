package ar.edu.unlar.programacion3.proyecto.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.concurrent.atomic.AtomicInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cancion {
    private String id;
    private String titulo;
    private Album album;
    private int duracionSegundos;
    private AtomicInteger reproducciones = new AtomicInteger(0);

    public Cancion(String id, String titulo, Album album, int duracionSegundos) {
        this.id = id;
        this.titulo = titulo;
        this.album = album;
        this.duracionSegundos = duracionSegundos;
        this.reproducciones = new AtomicInteger(0);
    }
}
