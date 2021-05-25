package test;

import ColaDePrioridad.Citas;
import ColaDePrioridad.Doctor;

import java.util.Scanner;

public class test {
    public static Scanner sc = new Scanner(System.in);
    public static Scanner numeros = new Scanner(System.in);
    public static Citas citas[] = new Citas[1];
    public static String nombrePaciente, hora;
    public static Doctor nombreDoctor;
    public static int fecha;

    public static void main(String[] args) {
        agregarMedicos();
        imprimir();
    }

    public static void agregarMedicos() {
        int tamanio = citas.length;
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Digita el nombre del medico:" + (i + 1));
            nombreDoctor = new Doctor(sc.next());
            citas[i] = new Citas(nombreDoctor);
        }
    }

    public static void imprimir() {
        for (int i = 0; i < citas.length; i++) {
            citas[i].imprimir();
        }
        for (int i = 0; i < citas.length; i++) {
            citas[i].toString();
        }
    }

   /* public static void agregarCita() {
        int tamanio = doctores.length;
        System.out.println("Digita el nombre del doctor para la cita");
        nombreDoctor = sc.next();
        for (int i = 0; i < tamanio; i++) {
            if (!doctores[i].getNombre().equals(nombreDoctor)){
                System.out.println("El nombre del doctor es incorrecto...");
            }else{
                System.out.println("Digita el nombre del paciente");
                nombrePaciente = sc.next();
                System.out.println("Digita la fecha de la cita ");
                fecha = numeros.nextInt();
                System.out.println("Digita la hora de la cita");
                hora = sc.next();
                doctores[i].getCita().insertar(nombrePaciente, fecha, hora);
            }
            break;
        }
    }


    */
}




