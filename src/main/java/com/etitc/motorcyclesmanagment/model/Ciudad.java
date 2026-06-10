package com.etitc.motorcyclesmanagment.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ciudades")

public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    // Relación Uno a Muchos: Una ciudad tiene muchos municipios
    // 'mappedBy' indica el campo en la clase Municipio
    @OneToMany(mappedBy = "ciudadPadre", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Municipio> municipios = new ArrayList<>();

    public Ciudad() {}

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Municipio> getMunicipios() { return municipios; }
    public void setMunicipios(List<Municipio> municipios) { this.municipios = municipios; }
}
