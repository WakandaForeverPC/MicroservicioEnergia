package com.proyecto.microservicioenergia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/energia")
public class EnergiaController {

    @GetMapping
    public String obtenerEnergia() {
        // Lógica para obtener información de energía
        return "Información de energía";
    }

    @PostMapping
    public String crearEnergia(@RequestBody String nuevaEnergia) {
        // Lógica para crear nueva información de energía
        return "Nueva energía creada";
    }
}