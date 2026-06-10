package com.etitc.motorcyclesmanagment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "motos")

public class Moto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private int cilindraje;
    private int precio;

    // Constructores
    public Moto() {}

    public Moto(String marca, String modelo, int cilindraje, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.precio = precio;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getCilindraje() { return cilindraje; }
    public void setCilindraje(int cilindraje) { this.cilindraje = cilindraje; }

    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }

}
