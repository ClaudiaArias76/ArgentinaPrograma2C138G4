package com.grupoutn.tpintegrador;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    private String descripcion;
    //Set<Servicio> servicio;

    public Especialidad() {
    }
}
