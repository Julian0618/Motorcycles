package com.etitc.motorcyclesmanagment.dto;

public class MotoDTO {
    private String marca;
    private String modelo;
    private int cilindraje;
    private int precio;

    // Getters y Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getCilindraje() { return cilindraje; }
    public void setCilindraje(int cilindraje) { this.cilindraje = cilindraje; }

    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }
}


