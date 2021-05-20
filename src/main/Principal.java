package main;

import ColaDePrioridad.Consultorio;
import ColaDePrioridad.Doctor;

import java.util.Scanner;

public class Principal {
    public static Scanner sc = new Scanner(System.in);
    public static Consultorio cola = new Consultorio();
    public static Doctor doctores[] = new Doctor[10];
    public static int opc;

    public static void main(String[] args) {

        do {
            menu();
            opc = sc.nextInt();

            switch (opc) {
                case 1 -> insertarNodo();
                case 2 -> eliminarNodo();
                case 3 -> reasinarNPrimNodo();
                case 4 -> imprimir();
                case 5 -> agregarMedicos();
                case 0 -> System.out.println("Hasta la proxima...");
                default -> System.out.println("Digita una de las opciones anteriores...");
            }
        } while (opc != 0);
    }

    public static void menu() {
        System.out.println();
        System.out.println("Luis Felipe Martinez Ruiz");
        System.out.println("1.- Agregar nodo a la lista:----------------------");
        System.out.println("2.- Eliminar nodo a la lista:---------------------");
        System.out.println("3.- Cambiar prioridad del nodo--------------------");
        System.out.println("4.- Imprimir: ---------------- -------------------");
        System.out.println("5.- Agregar Medicos");
        System.out.println("0.- Salir del programa: --------------------------");
        System.out.println();
    }

    public static void insertarNodo() {
        System.out.println("Digita el dato a agregar: ");
        int dato = sc.nextInt();
        System.out.println("Digita la prioridad del dato: ");
        int numPrio = sc.nextInt();
        cola.insertar(dato, numPrio);
    }

    public static void eliminarNodo() {
        System.out.println("Digita la prioridad del a eliminar: ");
        int numPrio = sc.nextInt();
        cola.eliminarNodo(numPrio);
    }

    public static void reasinarNPrimNodo() {
        cola.imprimir();
        System.out.println("Digita el dato de lista a reasignar: ");
        int dato = sc.nextInt();
        System.out.println("Digita la prioridad del dato de la lista a reasignar: ");
        int numPrio = sc.nextInt();
        System.out.println("Digita la nueva prioridad del dato: ");
        int nuevoNumPrio = sc.nextInt();
        // cola.reasignarNodo(dato, numPrio, nuevoNumPrio);
    }

    public static void agregarMedicos() {
        int size = doctores.length;
        for (int i = 0; i < size; i++) {
            System.out.println("Digita el nombre del medico:");
            String nombre = sc.next();
            doctores[i] = new Doctor(nombre);
        }


    }

    public static void imprimir() {
        cola.imprimir();
        for (int i = 0; i < doctores.length; i++) {
            System.out.println(doctores[i].toString());
        }
    }
}
