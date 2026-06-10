package com.etitc.motorcyclesmanagment.service;

import com.etitc.motorcyclesmanagment.dto.CiudadDTO;
import com.etitc.motorcyclesmanagment.model.Ciudad;
import com.etitc.motorcyclesmanagment.model.Municipio;
import com.etitc.motorcyclesmanagment.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class CiudadService {
    @Autowired
    private CiudadRepository ciudadRepository;

    public List<Ciudad> obtenerTodas() {
        return ciudadRepository.findAll();
    }

    public Ciudad guardarCiudadConMunicipios(CiudadDTO ciudadDTO) {
        // 1. Crear el objeto Padre (Ciudad)
        Ciudad nuevaCiudad = new Ciudad(ciudadDTO.getNombre());

        // 2. Mapear y enlazar los objetos Hijos (Municipios) si existen
        if (ciudadDTO.getNombresMunicipios() != null) {
            List<Municipio> listaMunicipios = ciudadDTO.getNombresMunicipios().stream()
                    .map(nombreMuni -> new Municipio(nombreMuni, nuevaCiudad))
                    .toList();
            nuevaCiudad.setMunicipios(listaMunicipios);
        }

        // 3. Persistir en cascada
        return ciudadRepository.save(nuevaCiudad);
    }
}
