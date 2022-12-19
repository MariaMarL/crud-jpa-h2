package com.example.crudapih2.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_persona")
    private Long personaId;

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

    //@OneToOne()
    //private Cliente cliente;
}
