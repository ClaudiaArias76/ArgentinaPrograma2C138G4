/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupoutn.tpintegrador;

/**
 *
 * @author Gustavo
 */

import com.grupoutn.tpintegrador.gestores.AbmPersona;
import com.grupoutn.tpintegrador.gestores.AbmEspecialidad;
import com.grupoutn.tpintegrador.gestores.AbmServicio;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Gustavo
 */
public class Menu {
    
    public static EntityManager getEntityManager(){
            EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("aplicacion");
            EntityManager manager = fabrica.createEntityManager();
            return manager;
    }
    
     public void MenuPrincipal() {
        
         
        Scanner scanner = new Scanner(System.in);        
        int opcion;
        do {
            
            System.out.println("===== Menú Principal =====");
            System.out.println("1. Gestionar Clientes");
            System.out.println("2. Gestionar Técnicos");
            System.out.println("3. Gestionar Especialidades");
            System.out.println("4. Gestionar Incidentes");
            System.out.println("5. Salir");
            System.out.println("==========================");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Gestionar Clientes");
                    // Lógica para gestionar clientes
                    MenuClientes();
                    break;
                case 2:
                    System.out.println("Gestionar Técnicos");
                    // Lógica para gestionar técnicos
                    MenuTecnicos();
                    break;
                case 3:
                    System.out.println("Gestionar Especialidades");
                    // Lógica para gestionar especialidades
                    MenuEspecialidades();
                    break;
                case 4:
                    System.out.println("Gestionar Servicios");
                    // Lógica para gestionar incidentes
                    MenuServicios();
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
     
    }
     
    public void MenuClientes() {
        
        EntityManager em = getEntityManager();
        AbmPersona per = new AbmPersona();
        per.getPe().setEm(em);
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            
            System.out.println("===== Menú Clientes =====");
            System.out.println("1. Gestionar Altas");
            System.out.println("2. Gestionar Bajas");
            System.out.println("3. Gestionar Modificaciones");
            System.out.println("4. Mostrar Clientes");
            System.out.println("5. Salir");
            System.out.println("==========================");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Gestionar Altas");
                    
                     per.agregarCliente();
                    break;
                case 2:
                    System.out.println("Gestionar Bajas");
                    
                    break;
                case 3:
                    System.out.println("Gestionar Modificaciones");
                   
                    break;
                case 4:
                    System.out.println("Mostrar Clientes");
                    
                    per.mostrarClientes();
                    break;
                    
                case 5:
                    System.out.println("Volviendo al Menu Anterior!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
    }
    
    public void MenuTecnicos() {
        
        EntityManager em = getEntityManager();
        AbmPersona per = new AbmPersona();
        per.getPe().setEm(em);
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            
            System.out.println("===== Menú Tecnicos =====");
            System.out.println("1. Gestionar Altas");
            System.out.println("2. Gestionar Bajas");
            System.out.println("3. Gestionar Modificaciones");
            System.out.println("4. Mostrar Tecnicos");
            System.out.println("5. Salir");
            System.out.println("==========================");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Gestionar Altas");
                    
                    per.agregarTecnico();
                    break;
                case 2:
                    System.out.println("Gestionar Bajas");
                    
                    break;
                case 3:
                    System.out.println("Gestionar Modificaciones");
                    
                    break;
                case 4:
                    System.out.println("Mostrar Tecnicos");
                   
                    per.mostrarTecnicos();
                    break;
                
                case 5:
                    System.out.println("Volviendo al Menu Anterior!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
        
    }
    
     public void MenuServicios() {
         
        EntityManager em = getEntityManager();
        AbmServicio per = new AbmServicio();
        per.getSe().setEm(em);
         
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            
            System.out.println("===== Menú Servicios =====");
            System.out.println("1. Gestionar Altas");
            System.out.println("2. Gestionar Bajas");
            System.out.println("3. Gestionar Modificaciones");
            System.out.println("4. Mostrar Servicios");
            System.out.println("5. Salir");
            System.out.println("==========================");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Gestionar Altas");
                    per.agregarServicio();
                    break;
                case 2:
                    System.out.println("Gestionar Bajas");
                   
                    break;
                case 3:
                    System.out.println("Gestionar Modificaciones");
                    
                    break;
                case 4:
                    System.out.println("Mostrar Servicios");
                    per.mostrarServicios();
                    
                    break;
                
                case 5:
                    System.out.println("Volviendo al Menu Anterior!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
        
    }
    
    public void MenuEspecialidades() {
        
        EntityManager em = getEntityManager();
        AbmEspecialidad per = new AbmEspecialidad();
        per.getPe().setEm(em);
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            
            System.out.println("===== Menú Especialidades =====");
            System.out.println("1. Gestionar Altas");
            System.out.println("2. Gestionar Bajas");
            System.out.println("3. Gestionar Modificaciones");
            System.out.println("4. Mostrar Especialidades");
            System.out.println("5. Salir");
            System.out.println("==========================");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Gestionar Altas");
                    per.agregarEspecialidad();
                    break;
                case 2:
                    System.out.println("Gestionar Bajas");
                    
                    break;
                case 3:
                    System.out.println("Gestionar Modificaciones");
                    
                    break;
                 case 4:
                    System.out.println("Mostrar Especialidades");
                    per.mostrarEspecialidades();
                    break;    
                
                
                case 5:
                    System.out.println("Volviendo al Menu Anterior!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
        
    }
    
    
}