package com.example.crudapih2.models.mapper.modelMapper;

import com.example.crudapih2.models.dto.ClienteDto;
import com.example.crudapih2.models.entities.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public ClienteDto toClienteDto(Cliente cliente){
        return modelMapper.map(cliente, ClienteDto.class);
    }

    public Cliente toClienteEntity(ClienteDto clienteDto){
        return modelMapper.map(clienteDto, Cliente.class);
    }

    //public List<ClienteDto> toClientesDto(List<Cliente> clientes){
    //    return modelMapper.map(clientes, ClienteDto.class);
    //}

}
