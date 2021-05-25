package main;

import ColaDePrioridad.Cita;
import ColaDePrioridad.Consultorio;
import ColaDePrioridad.Doctor;

import java.util.Scanner;

public class Principal {
    public static Scanner strings = new Scanner(System.in);
    public static Scanner numeros = new Scanner(System.in);
    public static Consultorio consultorios[] = new Consultorio[10];
    public static int opc, opc2;

    public static void main(String[] args) {

        do {
            menu();
            opc = numeros.nextInt();

            switch (opc) {
                case 1 -> insertarCita();
                case 2 -> imprimir();
                case 3 -> agregarMedicos();
                case 0 -> System.out.println("Hasta la proxima...");
                default -> System.out.println("Digita una de las opciones anteriores...");
            }
        } while (opc != 0);
    }

    public static void menu() {
        System.out.println();
        System.out.println("Luis Felipe Martinez Ruiz");
        System.out.println("1.- Agregar Cita:----------------------");
        System.out.println("2.- Imprimir: ---------------- -------------------");
        System.out.println("3.- Agregar Medicos");
        System.out.println("0.- Salir del programa: --------------------------");
        System.out.println();
    }

    public static void insertarCita() {
        System.out.println("Digita la clave del doctor");
        int claveDoctor = numeros.nextInt();

        for (int i = 0; i < consultorios.length; i++) {
            if (consultorios[i].getDoctor().getClaveDoctor() == claveDoctor) {
                System.out.println("Elejiste al doctor: " + consultorios[i].getDoctor().getNombreDoctor());
                System.out.println("Agrega una cita ");
                System.out.println("Digita el nombre del paciente");
                String nombrePaciente = strings.next();
                System.out.println("Digita le fecha de la cita");
                String fecha = strings.next();
                System.out.println("Digita la hora de la cita");
                int hora = numeros.nextInt();
                consultorios[i].insertar(new Cita(nombrePaciente, fecha), hora);
                break;
            }
        }
    }

    /*

    public static void eliminarNodo() {
        System.out.println("Digita la prioridad del a eliminar: ");
        int numPrio = sc.nextInt();
        cola.eliminarNodo(numPrio);
    }

     */

    /*
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


     */
    public static void agregarMedicos() {
        consultorios[0] = new Consultorio(new Doctor("Luis", 25));
        consultorios[1] = new Consultorio(new Doctor("Fer", 11));
        consultorios[2] = new Consultorio(new Doctor("Jose", 28));
        consultorios[3] = new Consultorio(new Doctor("Raul", 32));
        consultorios[4] = new Consultorio(new Doctor("Raul", 32));
        consultorios[5] = new Consultorio(new Doctor("Raul", 32));
        consultorios[6] = new Consultorio(new Doctor("Raul", 32));
        consultorios[7] = new Consultorio(new Doctor("Raul", 32));
        consultorios[8] = new Consultorio(new Doctor("Raul", 32));
        consultorios[9] = new Consultorio(new Doctor("Raul", 32));

    }

    public static void imprimir() {

        for (int i = 0; i < consultorios.length; i++) {
            System.out.println(consultorios[i].getDoctor());
            consultorios[i].imprimir();
            System.out.println("-----------");
        }
    }
}
