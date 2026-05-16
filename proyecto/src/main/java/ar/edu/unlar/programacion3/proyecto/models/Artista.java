package ar.edu.unlar.programacion3.proyecto.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artista {
    private String id;
    private String nombre;
    private Genero genero;
}