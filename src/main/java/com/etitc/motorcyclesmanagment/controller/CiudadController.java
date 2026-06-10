package com.etitc.motorcyclesmanagment.controller;
import com.etitc.motorcyclesmanagment.dto.CiudadDTO;
import com.etitc.motorcyclesmanagment.model.Ciudad;
import com.etitc.motorcyclesmanagment.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ciudades")

public class CiudadController {
    @Autowired
    private CiudadService ciudadService;

    @GetMapping
    public ResponseEntity<List<Ciudad>> listarArbolCiudades() {
        return ResponseEntity.ok(ciudadService.obtenerTodas());
    }

    @PostMapping
    public ResponseEntity<Ciudad> registrarCiudadArbol(@RequestBody CiudadDTO ciudadDTO) {
        Ciudad ciudadGuardada = ciudadService.guardarCiudadConMunicipios(ciudadDTO);
        return ResponseEntity.ok(ciudadGuardada);
    }

}
