package com.grupoutn.tpintegrador.gestores;

import com.grupoutn.tpintegrador.Especialidad;
import lombok.Data;
import java.util.Scanner;

@Data
public class AbmEspecialidad {
    private PersistenciaEspecialidad pe;

    public AbmEspecialidad() {
        this.pe = new PersistenciaEspecialidad();
    }
    public void agregarEspecialidad() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la especialidad: ");
        String nombre = scanner.next();

        Especialidad especialidad = new Especialidad();
        especialidad.setDescripcion(nombre);

        pe.getEm().getTransaction().begin();
        pe.insertar(especialidad);
        pe.getEm().getTransaction().commit();

        System.out.println("Especialidad agregada con éxito.\n");
    }
    public void mostrarEspecialidades(){
        System.out.println("Especialidades:");
        pe.buscarEspecialidades().forEach(especialidad -> System.out.println(especialidad));
        System.out.println();
    }

}
