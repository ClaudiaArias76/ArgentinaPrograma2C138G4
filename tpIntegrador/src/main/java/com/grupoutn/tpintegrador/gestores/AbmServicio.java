package com.grupoutn.tpintegrador.gestores;

import com.grupoutn.tpintegrador.Servicio;
import lombok.Data;

import java.util.Scanner;

@Data
public class AbmServicio {
    private PersistenciaServicio se;

    public AbmServicio() {
        this.se = new PersistenciaServicio();
    }
    public void agregarServicio() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del servicio: ");
        String nombre = scanner.next();

        Servicio servicio = new Servicio();
        servicio.setDescripcion(nombre);

        se.getEm().getTransaction().begin();
        se.insertar(servicio);
        se.getEm().getTransaction().commit();

        System.out.println("Servicio agregada con éxito.\n");
    }
    public void mostrarServicios(){
        System.out.println("Servicios:");
        se.buscarServicios().forEach(servicio -> System.out.println(servicio));
        System.out.println();
    }

}
