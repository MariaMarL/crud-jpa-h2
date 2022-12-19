package com.example.crudapih2.models.mapper.mapstruck;

import com.example.crudapih2.models.dto.PersonaDto;
import com.example.crudapih2.models.entities.Persona;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PersonaMapper2 {
    @Mappings({
            @Mapping(source = "personaId", target = "personaId"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "genero", target = "genero"),
            @Mapping(source = "edad", target = "edad"),
            @Mapping(source = "identificacion", target = "identificacion"),
            @Mapping(source = "direccion", target = "direccion"),
            @Mapping(source = "telefono", target = "telefono"),
            @Mapping(source = "cliente", target = "cliente")
    })
    PersonaDto toPersonaDto(Persona persona);

    @InheritInverseConfiguration
    Persona toPersonaEntity(PersonaDto personaDto);
}
