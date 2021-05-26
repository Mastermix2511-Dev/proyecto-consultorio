package main;

import ColaDePrioridad.Cita;
import ColaDePrioridad.Consultorio;
import ColaDePrioridad.Dias;
import ColaDePrioridad.Doctor;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Principal {
    public static Scanner strings = new Scanner(System.in);
    public static Scanner numeros = new Scanner(System.in);
    public static Consultorio consultorios[] = new Consultorio[4]; // Cambiar el tamaño a 10
    public static Dias dias[] = new Dias[30];//Cambiar el tamaño a 27   ////////CAMBIÉ EL TAMAÑO A 30
    public static int opc, opc2;

    public static void main(String[] args) {
        medicos();
        do {
            menu();
            opc = numeros.nextInt();

            switch (opc) {
                case 1:
                    insertarCita();
                    break;
                case 2:
                    imprimir();
                    break;
                case 0:
                    System.out.println("Hasta la proxima...");
                    break;
                default:
                    System.out.println("Digita una de las opciones anteriores...");
                    break;
            }
        } while (opc != 0);
    }

    public static void menu() {
        System.out.println();
        System.out.println("Luis Felipe Martinez Ruiz");
        System.out.println("1.- Agregar Cita:----------------------");
        System.out.println("2.- Imprimir Doctores:-----------------");
        System.out.println("0.- Salir del programa: ---------------");
        System.out.println();
    }

    public static void insertarCita() {
        System.out.println("Digita la clave del doctor");
        int claveDoctor = numeros.nextInt();

        for (int i = 0; i < consultorios.length; i++) {
            if (consultorios[i].getDoctor().getClaveDoctor() == claveDoctor) {// verficacion si existe el doctor
                System.out.println("Elejiste al doctor: " + consultorios[i].getDoctor().getNombreDoctor());

                System.out.println("Ingrese la fecha de su cita con el formato correspondiente (dd/mm/yyyy): ");
                System.out.println("Dia:");
                int diaCita = numeros.nextInt();
                System.out.println("Mes");
                int mes = numeros.nextInt();
                System.out.println("Año");
                int anio = numeros.nextInt();
                ValidaFecha(diaCita, mes);

                if (diasMesJunio(diaCita) != 0) { //Se checa si ese dia es domingo
                    System.out.println("Digita el nombre del paciente");
                    String nombrePaciente = strings.next();
                    System.out.println("Digite la opción correspondiente a la hora que desee");
                    horarios(i);
                    int hora = (numeros.nextInt() - 1);
                    consultorios[i].insertarCita(new Cita(nombrePaciente, (diasMesJunio(diaCita)), mes, anio), diaCita, hora);
                }
                break;
            } else {
                System.out.println("No se encuentra este doctor en la lista...");
                break;
            }
        }
    }

    public static void medicos() {
        consultorios[0] = new Consultorio(new Doctor("Luis", 1));
        consultorios[1] = new Consultorio(new Doctor("Fernando", 2));
        consultorios[2] = new Consultorio(new Doctor("Jose", 3));
        consultorios[3] = new Consultorio(new Doctor("Diana", 4));
        /*
        consultorios[4] = new Consultorio(new Doctor("Rafael", 5));
        consultorios[5] = new Consultorio(new Doctor("Rodrigo", 6));
        consultorios[6] = new Consultorio(new Doctor("Maximo", 7));
        consultorios[7] = new Consultorio(new Doctor("Abelardo", 8));
        consultorios[8] = new Consultorio(new Doctor("Martin", 9));
        consultorios[9] = new Consultorio(new Doctor("Raul", 10));
         */
    }

    public static void ValidaFecha(int d, int m) {
        if (d > 0 && d <= 30) {
            if (d == 6 || d == 13 || d == 20 || d == 27) {
                System.out.println("Dia domingos no se agendan citas");
            } else if (m == 06) {
                System.out.println("Fecha valida");
            } else {
                System.out.println("Lo lamento, sólo agendamos citas del mes de Junio\n" + " .......Volverás al menú de inicio......");
            }
        } else {
            System.out.println("Día no válido, volverás al menú de inicio");
        }
    }

    public static void dias() {
        dias[0] = new Dias(1);
        dias[1] = new Dias(2);
        dias[2] = new Dias(3);
        dias[3] = new Dias(4);
        dias[4] = new Dias(5);
        dias[5] = new Dias(7);
        dias[6] = new Dias(8);
        dias[7] = new Dias(9);
        dias[8] = new Dias(10);
        dias[9] = new Dias(11);
        dias[10] = new Dias(12);
        dias[11] = new Dias(14);
        dias[12] = new Dias(15);
        dias[13] = new Dias(16);
        dias[14] = new Dias(17);
        dias[15] = new Dias(18);
        dias[16] = new Dias(19);
        dias[17] = new Dias(21);
        dias[18] = new Dias(22);
        dias[19] = new Dias(23);
        dias[20] = new Dias(24);
        dias[21] = new Dias(25);
        dias[22] = new Dias(26);
        dias[23] = new Dias(28);
        dias[24] = new Dias(29);
        dias[25] = new Dias(30);

    }

    public static int diasMesJunio(int dia) {

        int n = 0;


        for (int i = 0; i < 30; i++) {
            dias[i] = new Dias((i + 1));
        }

        if (dia == 6 || dia == 13 || dia == 20 || dia == 27) {
            n = 0;
        } else {
            n = dia;
        }

        return n;
    }


    public static void imprimir() {

        System.out.println("-----Doctores-----");
        for (int i = 0; i < consultorios.length; i++) {
            consultorios[i].imprimir();
            System.out.println(consultorios[i].getDoctor());

            System.out.println("-----------");
        }

    }

    public static void horarios(int pC) {
        System.out.println(" -------------- HORARIOS DISPONIBLES -------------");
        for (int i = 0; i < 12; i++) {
            if (consultorios[pC].estaVacia()) {
                System.out.println((i + 1) + ".- " + consultorios[pC].getHorarios(i));
            } else {
                if (consultorios[pC].cabeza.nPrio != i) {
                    System.out.println((i + 1) + ".- " + consultorios[pC].getHorarios(i));
                }
            }
        }
    }
}