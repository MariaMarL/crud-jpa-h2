package com.example.crudapih2.services.gateway;


import com.example.crudapih2.models.dto.ClienteDto;
import com.example.crudapih2.models.entities.Cliente;

import java.util.List;

public interface ClienteGateway {

    List<Cliente> listarClientes();
    //optional
    ClienteDto obtenerClientePorId(Long id);

    ClienteDto guardarCliente(ClienteDto clienteDto);

    void eliminarCliente(Long id);

    ClienteDto actualizarCliente(Long id, ClienteDto clienteDto);
}
