package com.etitc.motorcyclesmanagment.service;

import com.etitc.motorcyclesmanagment.model.Ciudad;
import com.etitc.motorcyclesmanagment.model.LogisticaGrafo;
import com.etitc.motorcyclesmanagment.model.RutaArista;
import com.etitc.motorcyclesmanagment.repository.CiudadRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LogisticaServiceImpl implements LogisticaService {

    private final CiudadRepository ciudadRepository;
    private LogisticaGrafo grafo;

    public LogisticaServiceImpl(CiudadRepository ciudadRepository) {
        this.ciudadRepository = ciudadRepository;
        this.grafo = new LogisticaGrafo();
    }

    @Override
    public void inicializarGrafo(List<Ciudad> ciudades) {
        this.grafo = new LogisticaGrafo();

        // 1. Añadir todas las ciudades como nodos
        ciudades.forEach(grafo::agregarCiudad);

        // 2. Simulación de rutas comerciales (Aristas con pesos de envío)
        // Conectamos nodos de manera lógica para el ejemplo
        for (int i = 0; i < ciudades.size() - 1; i++) {
            Ciudad origen = ciudades.get(i);
            Ciudad destino = ciudades.get(i + 1);
            // Asignamos un costo simulado basado en sus IDs o reglas de negocio
            double costoEnvio = 50000.0 * (i + 1);
            grafo.agregarRuta(origen, destino, costoEnvio);
        }
    }

    @Override
    public double calcularCostoDirecto(Long origenId, Long destinoId) {
        // Carga dinámica desde la base de datos si el grafo está vacío
        if (grafo.getListaAdyacencia().isEmpty()) {
            inicializarGrafo(ciudadRepository.findAll());
        }

        List<RutaArista> rutas = grafo.getRutasDesde(origenId);
        for (RutaArista ruta : rutas) {
            if (ruta.getDestino().getId().equals(destinoId)) {
                return ruta.getCostoEnvio();
            }
        }
        return -1; // Retorna -1 si no hay ruta directa directa en el grafo
    }

    @Override
    public Map<String, Object> obtenerMapaRutas() {
        if (grafo.getListaAdyacencia().isEmpty()) {
            inicializarGrafo(ciudadRepository.findAll());
        }

        Map<String, Object> respuesta = new HashMap<>();
        grafo.getListaAdyacencia().forEach((id, rutas) -> {
            List<String> conexiones = new ArrayList<>();
            rutas.forEach(r -> conexiones.add("Hacia Ciudad ID: " + r.getDestino().getId() + " ($" + r.getCostoEnvio() + ")"));
            respuesta.put("Ciudad_Origen_ID_" + id, conexiones);
        });

        return respuesta;
    }
}
