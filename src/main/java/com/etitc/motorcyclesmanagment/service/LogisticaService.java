package com.etitc.motorcyclesmanagment.service;

import com.etitc.motorcyclesmanagment.model.Ciudad;
import java.util.List;
import java.util.Map;

public interface LogisticaService {
    void inicializarGrafo(List<Ciudad> ciudades);
    double calcularCostoDirecto(Long origenId, Long destinoId);
    Map<String, Object> obtenerMapaRutas();
}
