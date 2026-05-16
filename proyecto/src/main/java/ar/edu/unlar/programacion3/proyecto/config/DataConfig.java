package ar.edu.unlar.programacion3.proyecto.config;

import org.springframework.stereotype.Repository;

import ar.edu.unlar.programacion3.proyecto.models.Album;
import ar.edu.unlar.programacion3.proyecto.models.Artista;
import ar.edu.unlar.programacion3.proyecto.models.Cancion;
import ar.edu.unlar.programacion3.proyecto.models.Genero;
import ar.edu.unlar.programacion3.proyecto.models.Productora;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository

public class DataConfig {

    private final List<Cancion> catalogo = new ArrayList<>();

    public DataConfig() {
        
        Productora p1 = new Productora(UUID.randomUUID().toString(), "Sony Music Argentina", "Argentina");
        Productora p2 = new Productora(UUID.randomUUID().toString(), "Universal Music Group", "USA");
        Productora p3 = new Productora(UUID.randomUUID().toString(), "Warner Music", "UK");
        Productora p4 = new Productora(UUID.randomUUID().toString(), "PopArt Discos", "Argentina");

        Artista art1 = new Artista(UUID.randomUUID().toString(), "Charly García", Genero.ROCK);
        Artista art2 = new Artista(UUID.randomUUID().toString(), "Luis Alberto Spinetta", Genero.ROCK);
        Artista art3 = new Artista(UUID.randomUUID().toString(), "Gustavo Cerati", Genero.ROCK_POP);
        Artista art4 = new Artista(UUID.randomUUID().toString(), "Fito Páez", Genero.ROCK_POP);
        Artista art5 = new Artista(UUID.randomUUID().toString(), "Mercedes Sosa", Genero.FOLCLORE);
        Artista art6 = new Artista(UUID.randomUUID().toString(), "Duki", Genero.TRAP);
        Artista art7 = new Artista(UUID.randomUUID().toString(), "Nathy Peluso", Genero.URBANO);
        Artista art8 = new Artista(UUID.randomUUID().toString(), "Wos", Genero.RAP_ROCK);
        Artista art9 = new Artista(UUID.randomUUID().toString(), "Babasónicos", Genero.INDIE_ROCK);
        Artista art10 = new Artista(UUID.randomUUID().toString(), "Bizarrap", Genero.URBANO);

        Album alb1 = new Album(UUID.randomUUID().toString(), "Clics Modernos", art1, p1, 1983);
        Album alb2 = new Album(UUID.randomUUID().toString(), "Piano Bar", art1, p1, 1984);
        Album alb3 = new Album(UUID.randomUUID().toString(), "Artaud", art2, p1, 1973);
        Album alb4 = new Album(UUID.randomUUID().toString(), "Bocanada", art3, p2, 1999);
        Album alb5 = new Album(UUID.randomUUID().toString(), "El Amor después del Amor", art4, p3, 1992);
        Album alb6 = new Album(UUID.randomUUID().toString(), "Mujeres Argentinas", art5, p2, 1969);
        Album alb7 = new Album(UUID.randomUUID().toString(), "Desde el Fin del Mundo", art6, p3, 2021);
        Album alb8 = new Album(UUID.randomUUID().toString(), "Calambre", art7, p1, 2020);
        Album alb9 = new Album(UUID.randomUUID().toString(), "Oscuro Éxtasis", art8, p1, 2021);
        Album alb10 = new Album(UUID.randomUUID().toString(), "Jessico", art9, p4, 2001);
        Album alb11 = new Album(UUID.randomUUID().toString(), "Trinchera", art9, p4, 2022);
        Album alb12 = new Album(UUID.randomUUID().toString(), "BZRP Sessions", art10, p3, 2023);

        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Nos siguen pegando abajo", alb1, 210));
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Los Dinosaurios", alb1, 208));
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Demoliendo Hoteles", alb2, 138));
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Cerca de la revolución", alb2, 280));
        
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Todas las hojas son del viento", alb3, 132));
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Cantata de puentes amarillos", alb3, 552));
        
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Puente", alb4, 273));
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Bocanada", alb4, 247));
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Tabú", alb4, 287));
        
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Tumbas de la Gloria", alb5, 277));
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Brillante sobre el Mic", alb5, 248));
        
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Alfonsina y el mar", alb6, 280));
        
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Malbec", alb7, 182));
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Pintao", alb7, 156));
        
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Buenos Aires", alb8, 240));
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Sana Sana", alb8, 178));
        
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Arrancármelo", alb9, 183));
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Culpa", alb9, 215));
        
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "El Loco", alb10, 185));
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Irresponsables", alb10, 158));
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Bye Bye", alb11, 212));
        
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Quevedo: Bzrp Music Sessions, Vol. 52", alb12, 198));
        catalogo.add(new Cancion(UUID.randomUUID().toString(), "Shakira: Bzrp Music Sessions, Vol. 53", alb12, 213));
    }

    public List<Cancion> getCatalogo() {
        return catalogo;
    }
}