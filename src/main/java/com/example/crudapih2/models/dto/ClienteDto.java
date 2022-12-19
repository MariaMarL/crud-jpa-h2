package com.example.crudapih2.models.dto;

import com.example.crudapih2.models.entities.Persona;
import lombok.Data;

@Data
public class ClienteDto extends PersonaDto{

    private  String clienteId;

    //private Long id_persona;

    private String contrasena;

    private Boolean estado;
}
