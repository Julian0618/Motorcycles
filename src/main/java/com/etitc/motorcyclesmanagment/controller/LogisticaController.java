package com.etitc.motorcyclesmanagment.controller;

import com.etitc.motorcyclesmanagment.service.LogisticaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/logistica")
public class LogisticaController {

    private final LogisticaService logisticaService;

    public LogisticaController(LogisticaService logisticaService) {
        this.logisticaService = logisticaService;
    }

    // Endpoint para ver la Lista de Adyacencia completa del Grafo
    @GetMapping("/rutas")
    public ResponseEntity<Map<String, Object>> obtenerGrafoCompleto() {
        return ResponseEntity.ok(logisticaService.obtenerMapaRutas());
    }

    // Endpoint para consultar el costo de envío (peso de la arista) entre dos nodos
    @GetMapping("/costo")
    public ResponseEntity<String> consultarCosto(
            @RequestParam Long origenId,
            @RequestParam Long destinoId) {

        double costo = logisticaService.calcularCostoDirecto(origenId, destinoId);
        if (costo == -1) {
            return ResponseEntity.badRequest().body("No existe una ruta de distribución directa entre las ciudades seleccionadas.");
        }
        return ResponseEntity.ok("El costo logístico de traslado para la motocicleta es: $" + costo);
    }
}