package com.grupoutn.tpintegrador;

import javax.persistence.*;
import lombok.Data;
 
@Data
@Entity
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String descripcion;
    public Servicio() { }

    public Servicio(String nombreServicio) {
        this.descripcion = nombreServicio;
    }

    @Override
    public String toString (){
        return "Nombre del Servicio: "+this.getDescripcion();
    }
}
