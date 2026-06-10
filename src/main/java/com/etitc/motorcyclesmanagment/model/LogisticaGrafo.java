package com.etitc.motorcyclesmanagment.model;

import java.util.*;

public class LogisticaGrafo {
    // Lista de adyacencia: Cada Ciudad (ID) tiene una lista de rutas hacia otras ciudades
    private Map<Long, List<RutaArista>> listaAdyacencia;

    public LogisticaGrafo() {
        this.listaAdyacencia = new HashMap<>();
    }

    // Registrar una ciudad como vértice
    public void agregarCiudad(Ciudad ciudad) {
        listaAdyacencia.putIfAbsent(ciudad.getId(), new ArrayList<>());
    }

    // Registrar una ruta dirigida con costo de envío
    public void agregarRuta(Ciudad origen, Ciudad destino, double costo) {
        agregarCiudad(origen);
        agregarCiudad(destino);
        listaAdyacencia.get(origen.getId()).add(new RutaArista(destino, costo));
    }

    public List<RutaArista> getRutasDesde(Long ciudadId) {
        return listaAdyacencia.getOrDefault(ciudadId, new ArrayList<>());
    }

    public Map<Long, List<RutaArista>> getListaAdyacencia() {
        return listaAdyacencia;
    }
}
