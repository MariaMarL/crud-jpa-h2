package com.example.crudapih2.services;

import com.example.crudapih2.models.dto.ClienteDto;
import com.example.crudapih2.models.entities.Cliente;
import com.example.crudapih2.services.gateway.ClienteGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class ClienteService {

    @Autowired
    private ClienteGateway gateway;

    public List<Cliente> listarClientes(){
        return gateway.listarClientes();
    }

    public ClienteDto obtenerClientePorId(Long id){
        return gateway.obtenerClientePorId(id);
    }

    public ClienteDto guardarCliente(ClienteDto dto){
        dto.setClienteId(UUID.randomUUID().toString());
        return gateway.guardarCliente(dto);
    }

    public void eliminarCliente(Long id){
        gateway.eliminarCliente(id);
    }

    public ClienteDto actualizarCliente(Long id, ClienteDto dto){
        return gateway.actualizarCliente(id, dto);
    }

}
