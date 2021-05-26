package main;

import ColaDePrioridad.Cita;
import ColaDePrioridad.Consultorio;
import ColaDePrioridad.Dias;
import ColaDePrioridad.Doctor;

import java.util.Scanner;

public class Principal {
    public static Scanner strings = new Scanner(System.in);
    public static Scanner numeros = new Scanner(System.in);
    public static Consultorio consultorios[] = new Consultorio[4]; // Cambiar el tamaño a 10
    public static Dias dias[] = new Dias[27];//Cambiar el tamaño a 27
    public static int opc, opc2;

    public static void main(String[] args) {
        medicos();
        do {
            menu();
            opc = numeros.nextInt();

            switch (opc) {
                case 1 -> insertarCita();
                case 2 -> imprimir();
                case 0 -> System.out.println("Hasta la proxima...");
                default -> System.out.println("Digita una de las opciones anteriores...");
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

                System.out.println("Que dia desea su cita: ");
                int diaCita = numeros.nextInt();

                if (diasMesJunio(diaCita) != 0) { //Se checa si ese dia es domingo

                    System.out.println("Digita el nombre del paciente");
                    String nombrePaciente = strings.next();
                    System.out.println("Digita la hora de la cita");
                    int hora = numeros.nextInt();
                    // System.out.println("Digita el mes de la cita");
                    // int mes = numeros.nextInt();
                    consultorios[i].insertarCita(new Cita(nombrePaciente, 06, 2021, diasMesJunio(diaCita)), hora);

                    /*if (mes == 6) {

                    } else {
                        System.out.println("Solo se permite consulta el mes de Junio(06)");
                    }

                     */


                } else {
                    System.out.println("Los dias domingos no laboran los doctores...");
                }
                break;
            } else {
                System.out.println("No se encuentra este doctor en la lista...");
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


        if (dia == 6 || dia == 13 || dia == 20 || dia == 27) {
            return 0;
        }

        for (int i = 0; i < consultorios.length; i++) {
            consultorios[i].getDoctor().setDias(dias);
        }
        return 0;

        /*
        if (dia >= 1 && dia <= 30) {
            for (int i = 0; i < dias.length; i++) {
                if (dia == consultorios[i].getDoctor().setDias(dias) {

                    consultorios[i].getDoctor();
                    return dia;
                }
            }

            return dia;
        }
        return 0;
        *
         */
    }


    public static void imprimir() {
        dias();

        consultorios[0].getDoctor().setDias(dias);
        consultorios[1].getDoctor().setDias(dias);
        consultorios[2].getDoctor().setDias(dias);


        System.out.println("-----Doctores-----");
        for (int i = 0; i < consultorios.length; i++) {
            consultorios[i].imprimir();
            System.out.println(consultorios[i].getDoctor());
            for (int j = 0; j < dias.length; j++) {
                System.out.println(consultorios[i].getDoctor().getDias()[j].toString());
            }

            System.out.println("-----------");
        }



        /*
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i].getDia());
        }

         */
    }


    public static void horarios() {
        System.out.println("1.- 8:00");
        System.out.println("2.- 8:30");
        System.out.println("3.- 9:00");
        System.out.println("4.- 9:30");
        System.out.println("5.- 10:00");
        System.out.println("6.- 10:30");
        System.out.println("7.- 11:00");
        System.out.println("8.- 11:30");
        System.out.println("9.- 12:00");
        System.out.println("10.- 12:30");
        System.out.println("11.- 13:00");
        System.out.println("12.- 13:30");
    }

    /*
    public static int diasMesJunio(int dat) {
        if (dat == 1 || dat == 2 || dat == 3 || dat == 4 || dat == 5 || dat == 7 || dat == 8 ||
                dat == 9 || dat == 10 || dat == 11 || dat == 12 || dat == 14 || dat == 15 || dat == 16 ||
                dat == 17 || dat == 18 || dat == 19 || dat == 21 || dat == 22 || dat == 23 || dat == 24 ||
                dat == 25 || dat == 26 || dat == 28 || dat == 29 || dat == 30) {
            return dat;
        } else {
            return 0; // Si retorna 0 significa que ese dia es domingo y no se labora
        }
    }

     */

}
