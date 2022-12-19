package com.example.crudapih2.models.mapper.mapstruck;

import com.example.crudapih2.models.dto.ClienteDto;
import com.example.crudapih2.models.entities.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClienteMapper2 {
    @Mappings({
            @Mapping(source = "clienteId", target = "clienteId"),
            @Mapping(source = "persona", target = "persona"),
            @Mapping(source = "contrasena", target = "contrasena"),
            @Mapping(source = "estado", target = "estado")
    })
    ClienteDto toClienteDto(Cliente cliente);
    List<ClienteDto> toClientesDto(List<Cliente> clientes);

    @InheritInverseConfiguration
    Cliente toClienteEntity(ClienteDto clienteDto);
}
