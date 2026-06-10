package com.etitc.motorcyclesmanagment.service;

import com.etitc.motorcyclesmanagment.dto.MotoDTO;
import com.etitc.motorcyclesmanagment.model.Moto;
import com.etitc.motorcyclesmanagment.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MotoService {
    @Autowired
    private MotoRepository motoRepository;

    // Obtener todas las motos
    public List<Moto> obtenerTodas() {
        return motoRepository.findAll();
    }

    // Registrar una nueva moto
    public Moto guardarMoto(MotoDTO motoDTO) {
        Moto nuevaMoto = new Moto(
                motoDTO.getMarca(),
                motoDTO.getModelo(),
                motoDTO.getCilindraje(),
                motoDTO.getPrecio()
        );
        return motoRepository.save(nuevaMoto);
    }
}
