package main;

import ColaDePrioridad.Citas;
import ColaDePrioridad.Doctor;

import java.util.Scanner;

public class Principal {
    public static Scanner sc = new Scanner(System.in);
    public static Scanner numeros = new Scanner(System.in);
    public static Citas citas = new Citas();
    public static Doctor doctores[] = new Doctor[10];
    public static int opc, opc2;
    public static String nombrePaciente, hora, nombreDoctor;
    public static int fecha;


    public static void main(String[] args) {

        do {
            menu();
            opc = sc.nextInt();
            switch (opc) {
                case 1 -> agregarMedicos();
                case 2 -> agregarCita();
                case 3 -> reasinarNPrimNodo();
                case 4 -> imprimir();
                case 0 -> System.out.println("Hasta la proxima...");
                default -> System.out.println("Digita una de las opciones anteriores...");
            }
        } while (opc != 0);
    }

    public static void menu() {
        System.out.println();
        System.out.println("Luis Felipe Martinez Ruiz");
        System.out.println("1.- Agregar Doctores:-----------------");
        System.out.println("2.- Agregar Cita:---------------------");
        System.out.println("3.- Cambiar prioridad del nodo--------------------");
        System.out.println("4.- Imprimir: ---------------- -------------------");
        System.out.println("0.- Salir del programa: --------------------------");
        System.out.println();
    }

    public static void agregarCita() {
        System.out.println("Digita el nombre del paciente");
        nombrePaciente = sc.next();
        System.out.println("Digita la fecha de la cita ");
        fecha = numeros.nextInt();
        System.out.println("Digita la hora de la cita");
        hora = sc.next();
        citas.insertar(nombrePaciente, fecha, hora);
    }

    public static void eliminarNodo() {
        System.out.println("Digita la prioridad del a eliminar: ");
        int numPrio = sc.nextInt();
        citas.eliminarNodo(numPrio);
    }

    public static void reasinarNPrimNodo() {
        citas.imprimir();
        System.out.println("Digita el dato de lista a reasignar: ");
        int dato = sc.nextInt();
        System.out.println("Digita la prioridad del dato de la lista a reasignar: ");
        int numPrio = sc.nextInt();
        System.out.println("Digita la nueva prioridad del dato: ");
        int nuevoNumPrio = sc.nextInt();
        // cola.reasignarNodo(dato, numPrio, nuevoNumPrio);
    }

    public static void menu2(){
        System.out.println("1.-Agregar otro doctor");
        System.out.println("0.-Salir");
    }

    public static void agregarMedicos() {
        int tamanio = doctores.length;

        for (int i = 0; i < tamanio; i++) {
            System.out.println("Digita el nombre del medico:" + (i + 1));
            String nombre = sc.next();
            doctores[i] = new Doctor(nombre);
        }
    }

    public static void imprimir() {
        citas.imprimir();
        int tamanio = doctores.length;

    }
}
