package com.grupoutn.tpintegrador;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Cliente extends Persona{
    private String razonSocial;
    private String cuit;
 
    //private Set<Servicio> listaServicios;
    
    public Cliente(String razonSocial, String cuit, String dni, String nombre ) {
        super(dni, nombre );
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }
    @Override
    public String toString() {
        return "CLIENTE\n"+super.toString()+"Razon social: "+this.getRazonSocial()+"CUIT: "+this.getCuit();
    }
    public Cliente() {
    }
  }
