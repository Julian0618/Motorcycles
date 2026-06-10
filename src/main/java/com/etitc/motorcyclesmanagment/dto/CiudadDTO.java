package com.etitc.motorcyclesmanagment.dto;
import java.util.List;

public class CiudadDTO {
    private String nombre;
    private List<String> nombresMunicipios; // Permite crear la ciudad con sus hijos de una vez

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<String> getNombresMunicipios() { return nombresMunicipios; }
    public void setNombresMunicipios(List<String> nombresMunicipios) {
        this.nombresMunicipios = nombresMunicipios; }
}
