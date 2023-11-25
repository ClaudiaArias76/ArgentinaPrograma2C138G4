package com.grupoutn.tpintegrador.gestores;

import com.grupoutn.tpintegrador.Cliente;
import com.grupoutn.tpintegrador.Tecnico;
import lombok.Data;
import java.util.Scanner;

@Data
public class AbmPersona {
    private PersistenciaPersona pe;

    public AbmPersona() {
        this.pe = new PersistenciaPersona();
    }

    public void agregarCliente() {
        
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.next();
        cliente.setNombre(nombreCliente);

        System.out.print("Ingrese la razón social: ");
        nombreCliente = scanner.next();
        cliente.setRazonSocial(nombreCliente);

        System.out.print("Ingrese el cuit: ");
        nombreCliente = scanner.next();
        cliente.setCuit(nombreCliente);

        pe.getEm().getTransaction().begin();
        pe.insertar(cliente);
        pe.getEm().getTransaction().commit();

        System.out.println("Cliente agregado con éxito.\n");
    }

    public void agregarTecnico() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del tecnico: ");
        String nombre = scanner.next();

        Tecnico tecnico = new Tecnico();
        tecnico.setNombre(nombre);
        System.out.print("Ingrese el nro celular: ");
        int celu = scanner.nextInt();
        tecnico.setCelular(celu);
        System.out.print("Ingrese el e-mail: ");
        nombre = scanner.next();
        tecnico.setMail(nombre);
        pe.getEm().getTransaction().begin();
        pe.insertar(tecnico);
        pe.getEm().getTransaction().commit();

        System.out.println("Tecnico agregado con éxito.\n");
    }

    public void mostrarClientes() {
        System.out.println("Clientes:");
        pe.buscarClientes().forEach(
                cliente -> System.out.println(cliente));
        System.out.println();
    }

    public void mostrarTecnicos() {
        System.out.println("Tecnicos:");
        pe.buscarTecnicos().forEach(
                tecnico -> System.out.println(tecnico));
        System.out.println();
    }
}
