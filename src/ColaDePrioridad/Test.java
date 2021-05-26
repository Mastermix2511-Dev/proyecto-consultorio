package ColaDePrioridad;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Consultorio consultorios[] = new Consultorio[2];


        consultorios[0] = new Consultorio(new Doctor("Luis", 1));
        consultorios[1] = new Consultorio(new Doctor("Fernando", 2));




        /*

        Puedo agregar citas hasta que el conteo de citas sea igual 12, despues de eso
        puedo decir que no se permiten sacar mas citas

         */

        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("Digita un numero");
            int dia = sc.nextInt();
            for (int j = 0; j < dias.length; j++) {
                if (dia == dias[j].getDia()) {
                    if (dias[j].getContadorDia() < 5) {
                        int temp = dias[j].getContadorDia() + 1;
                        dias[j].setContadorDia(temp);
                    }

                }
            }
        }

        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i].getDia() + " Se repitio  : " + dias[i].getContadorDia() + " veces");
        }

         */

        /*

        System.out.println("Digita la clave del doctor");
        int claveDoctor = sc.nextInt();

        for (int i = 0; i < consultorios.length; i++) {
            if (claveDoctor == consultorios[i].getDoctor().getClaveDoctor()) { // se busca el doctor

                consultorios[i].getDoctor().getDias();

                System.out.println("Digita el dia de su cita: ");
                int dia = sc.nextInt();
                if (dia == consultorios[i].getDoctor().getDias().getContadorDia()) { // si
                    int temp_2 = consultorios[i].getDoctor().getDias().getContadorDia() + 1;
                    consultorios[i].getDoctor().getDias().setContadorDia(temp_2);
                } else {
                    System.out.println("Solo se pueden agendar 12 citas al dia, intenta con otro dia");
                }
            }
            break;
        }

         */


    }
}
