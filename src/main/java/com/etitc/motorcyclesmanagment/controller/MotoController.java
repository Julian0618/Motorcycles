package com.etitc.motorcyclesmanagment.controller;
import com.etitc.motorcyclesmanagment.dto.MotoDTO;
import com.etitc.motorcyclesmanagment.model.Moto;
import com.etitc.motorcyclesmanagment.service.MotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/motos")
@RequiredArgsConstructor

public class MotoController {
    @Autowired
    private final MotoService motoService;

    @GetMapping
    public ResponseEntity<List<Moto>> listarMotos() {
        return ResponseEntity.ok(motoService.obtenerTodas());
    }

    @PostMapping
    public ResponseEntity<Moto> registrarMoto(@RequestBody MotoDTO motoDTO) {
        Moto motoGuardada = motoService.guardarMoto(motoDTO);
        return ResponseEntity.ok(motoGuardada);
    }

}
