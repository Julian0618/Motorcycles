package com.etitc.motorcyclesmanagment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.RestController;

@Getter
@AllArgsConstructor

public class InfoResponse {

    private String nombre;
    private String version;

}
