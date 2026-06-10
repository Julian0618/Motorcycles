package com.etitc.motorcyclesmanagment.controller;


import com.etitc.motorcyclesmanagment.dto.InfoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Marcar esta clase como controlador
@RestController
@RequestMapping("/api")

public class PingController {
    //Verificar la informacion
    @GetMapping("/ping")
    public String ping(){
        return "Servidor funcionando correctamente";

    }

    //Devolver la informacion del aplicativo
    @GetMapping("/info")
    public InfoResponse info() {
        return new InfoResponse("motorcycles managment", "1.0");
    }
    // Rectificamos que un usuario puede ingresar al servidor
    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre) {
        return "Hola " + nombre + "! Bienvenido a motocicletas de Colombia S.A.";

    }

}
