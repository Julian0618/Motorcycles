package com.etitc.motorcyclesmanagment.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "municipios")

public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    // Relación Muchos a Uno: Muchos municipios pertenecen a una Ciudad Padre
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ciudad_id", nullable = false)
    @JsonBackReference
    private Ciudad ciudadPadre;

    public Municipio() {}

    public Municipio(String nombre, Ciudad ciudadPadre) {
        this.nombre = nombre;
        this.ciudadPadre = ciudadPadre;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Ciudad getCiudadPadre() { return ciudadPadre; }
    public void setCiudadPadre(Ciudad ciudadPadre) { this.ciudadPadre = ciudadPadre; }
}
