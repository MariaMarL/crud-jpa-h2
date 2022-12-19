package com.example.crudapih2.models.dto;

import com.example.crudapih2.models.entities.Cliente;
import lombok.Data;

@Data
public class PersonaDto {

    private String personaId;

    private String nombre;

    private String genero;

    private Integer edad;

    private Long identificacion;

    private String direccion;

    private Long telefono;

}
