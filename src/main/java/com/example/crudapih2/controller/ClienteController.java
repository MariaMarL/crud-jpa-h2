package com.example.crudapih2.controller;

import com.example.crudapih2.models.dto.ClienteDto;
import com.example.crudapih2.models.entities.Cliente;
import com.example.crudapih2.services.ClienteService;
import com.example.crudapih2.services.gateway.ClienteGateway;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
//@CrossOrigin(origins = "http://localhost:3000/")
@Slf4j
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping()
    public ResponseEntity<List<Cliente>> listarClientes(){
        return ResponseEntity.ok(service.listarClientes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDto> obtenerClientePorId(@PathVariable() Long id){
        return new ResponseEntity(service.obtenerClientePorId(id), HttpStatus.FOUND);
    }

    @PostMapping()
    public ResponseEntity<ClienteDto> guardarCliente(@RequestBody() ClienteDto dto){
        return new ResponseEntity(service.guardarCliente(dto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCliente(@PathVariable() Long id){
        service.eliminarCliente(id);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteDto> actualizarCliente(@PathVariable() Long id,
                                                        @RequestBody() ClienteDto dto){
        return new ResponseEntity(service.actualizarCliente(id, dto),HttpStatus.ACCEPTED);
    }
}
