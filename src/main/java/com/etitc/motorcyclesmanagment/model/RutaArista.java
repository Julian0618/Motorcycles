package com.etitc.motorcyclesmanagment.model;

public class RutaArista {
    private Ciudad destino;
    private double costoEnvio; // El "peso" de la arista

    public RutaArista(Ciudad destino, double costoEnvio) {
        this.destino = destino;
        this.costoEnvio = costoEnvio;
    }

    // Getters y Setters
    public Ciudad getDestino() { return destino; }
    public void setDestino(Ciudad destino) { this.destino = destino; }
    public double getCostoEnvio() { return costoEnvio; }
    public void setCostoEnvio(double costoEnvio) { this.costoEnvio = costoEnvio; }
}
