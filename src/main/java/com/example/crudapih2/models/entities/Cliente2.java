package com.example.crudapih2.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(referencedColumnName = "id_persona")
public class Cliente2 extends Persona{

    @Column(name = "clienteId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String clienteId;

   // @OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "id_persona", referencedColumnName = "personaId")
    //private Long id_persona;

    @Column(nullable = false)
    private String contrasena;

    @Column(nullable = false)
    private Boolean estado;


}
