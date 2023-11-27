package com.grupoutn.tpintegrador;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "persona_id_seq")
    @SequenceGenerator(name = "persona_id_seq", sequenceName = "persona_id_seq", allocationSize = 1)
    private long id;
    private String dni;
    private String nombre;


    public Persona(String dni, String nombre ) {
        this.dni = dni;
        this.nombre = nombre;
    }
    public Persona(){}
}
