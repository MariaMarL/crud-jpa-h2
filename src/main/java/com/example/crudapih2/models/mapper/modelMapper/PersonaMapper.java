package com.example.crudapih2.models.mapper.modelMapper;

import com.example.crudapih2.models.dto.PersonaDto;
import com.example.crudapih2.models.entities.Persona;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PersonaMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public PersonaDto toPersonaDto(Persona persona){
        return modelMapper.map(persona, PersonaDto.class);
    }

    public Persona toPersonaEntity(PersonaDto personaDto){
        return modelMapper.map(personaDto, Persona.class);
    }

}
