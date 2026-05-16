package ar.edu.unlar.programacion3.proyecto.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlar.programacion3.proyecto.models.Productora;
import ar.edu.unlar.programacion3.proyecto.service.ProductoraService;

@RestController
@RequestMapping("/api/productoras")
public class ProductoraController {

    private final ProductoraService productoraService;

    public ProductoraController(ProductoraService productoraService) {
        this.productoraService = productoraService;
    }

    @GetMapping
    public List<Productora> listarTodas() {
        return productoraService.listarTodas();
    }
}
