package com.grupoutn.tpintegrador;

import java.time.LocalDate;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue
    private long id;
    private String dni;
    private String nombre;
    private String apellido;
    private String domicilio;
    private LocalDate fechaDeNacimiento;

    public Persona(String dni, String nombre, String apellido, String domicilio, LocalDate fechaDeNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    
}
