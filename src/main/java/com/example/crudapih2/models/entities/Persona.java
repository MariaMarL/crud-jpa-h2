package com.example.crudapih2.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String genero;
    @Column(nullable = false)
    private Integer edad;
    @Column(unique = true, nullable = false)
    private Long identificacion;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private Long telefono;
}
