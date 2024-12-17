package com.proyecto.microservicioenergia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EnergiaController {

    @GetMapping("/energia")
    public String showCity() {
        return "board-energia";
    }
}
