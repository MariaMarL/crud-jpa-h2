package com.example.crudapih2.repository;

import com.example.crudapih2.models.dto.ClienteDto;
import com.example.crudapih2.models.entities.Cliente;
import com.example.crudapih2.models.mapper.modelMapper.ClienteMapper;
import com.example.crudapih2.services.gateway.ClienteGateway;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Slf4j
@Qualifier("Jpa")
public class ClienteRepositoryImp implements ClienteGateway {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    ClienteMapper mapper;

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = repository.findAll();
       // return mapper.toClientesDto(clientes);
        //return mapper.toClienteDto(cliente);
        return repository.findAll();
    }

    @Override
    public ClienteDto obtenerClientePorId(Long id) {
        Cliente cliente = repository.findById(id).get();
        return mapper.toClienteDto(cliente);
    }

    @Override
    public ClienteDto guardarCliente(ClienteDto clienteDto) {
        Cliente cliente = mapper.toClienteEntity(clienteDto);
        return mapper.toClienteDto(repository.save(cliente));
    }

    @Override
    public void eliminarCliente(Long id) {
        repository.deleteById(id);
    }

    @Override
    public ClienteDto actualizarCliente(Long id, ClienteDto clienteDto) {
        Cliente cliente = mapper.toClienteEntity(clienteDto);
        log.info("Buscando cliente");
        Boolean clienteExiste = repository.existsById(id);
        cliente.setClienteId(id);
        //Cliente clienteEncontrado = repository.findById(id).get();
        if(clienteExiste){
            log.info("Cliente encontrado");
            repository.save(cliente);
            log.info("Cliente actualizado");
            return mapper.toClienteDto(cliente);
        }

        log.info("Cliente no encontrado, verifique el id");
        return clienteDto;
    }
}
