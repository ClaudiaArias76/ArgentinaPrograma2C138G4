package com.grupoutn.tpintegrador;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "persona")
public class Tecnico extends Persona{

    private String celular;
    private String mail;
    private List<Especialidad> listaEspecialidades;

    private boolean disponible;

    public Tecnico(String celular, String mail, String dni, String nombre) {
        super(dni, nombre);
        this.celular = celular;
        this.mail = mail;
        this.disponible = true;
        this.listaEspecialidades = new ArrayList<>();
    }
    public void agregarEspecialidad( Especialidad espe){
        this.listaEspecialidades.add(espe);
    }
    public String toString() {
       // return "TECNICO\n"+super.toString()+"Celular: "+this.getCelular()+"mail: "+this.getMail()+"Dias disponibles: "+this.getDiasDisponibles()+
       //         "aceptacion: "+this.isAceptacion()+"Clasificacion: "+this.getClasificacion()+"Activo: "+this.isActivo();
       return "TECNICO\n"+super.toString()+"Celular: "+this.getCelular()+"mail: "+this.getMail()+
              "Disponible: "+this.isDisponible();

    }
    public Tecnico(){    }
}


