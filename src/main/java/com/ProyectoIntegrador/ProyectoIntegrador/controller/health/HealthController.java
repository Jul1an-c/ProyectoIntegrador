package com.ProyectoIntegrador.ProyectoIntegrador.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/health")

@RestController
public class HealthController {

    @GetMapping
    public String checkAPI(){
        return "<h1>The API is working ok!</h1>";
    }

}
