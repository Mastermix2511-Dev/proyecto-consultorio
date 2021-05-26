package ColaDePrioridad;


public class Consultorio {
    String[] horarios;
    public Nodo cabeza = null;
    Nodo cola = null;
    Doctor doctor;

    public Consultorio() {
    }


    public Consultorio(Doctor doctor) {
        this.doctor = doctor;
        horarios = new String[12];
        horarios[0] = "8:00";
        horarios[1] = "8:30";
        horarios[2] = "9:00";
        horarios[3] = "9:30";
        horarios[4] = "10:00";
        horarios[5] = "10:30";
        horarios[6] = "11:00";
        horarios[7] = "11:30";
        horarios[8] = "12:00";
        horarios[9] = "12:30";
        horarios[10] = "13:00";
        horarios[11] = "13:30";
    }


    public Doctor getDoctor() {
        return doctor;
    }

    public String getHorarios(int i) {
        return horarios[i];
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public boolean estaVacia() {
        if (this.cabeza == null) {
            return true;
        } else {
            return false;
        }
    }
    /*public void buscaPrioridad(int n){
        Nodo aux=cabeza;
        Nodo auxi = null;
        if(aux.prioD>n)
    }*/

    public void insertarCita(Cita cita, int diaP, int nPrm) {// hora
        Nodo nuevoNodo = new Nodo(cita, diaP, nPrm);
        if (estaVacia()) {
            System.out.println("ESTA VACIA");
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            if (cabeza.prioD > diaP) {
                System.out.println("LA PRIORIDAD DE CABEZA ES MAYOR");
                if (cabeza.nPrio > nPrm) {
                    System.out.println("LA PRIORIDAD DE CABEZA EN DIA Y HORA ES MAYOR");
                    nuevoNodo.siguiente = cabeza;
                    cabeza = nuevoNodo;
                } else {
                    System.out.println("LA HORA DE CABEZA ES MENOR");
                    Nodo aux = null;
                    Nodo route = cabeza;
                    while (route != cola) {
                        if (route.nPrio <= nPrm) {
                            aux = route;
                            break;
                        }
                        route = route.siguiente;
                    }
                    if (route == cola) {
                        cola = nuevoNodo;
                    } else {
                        nuevoNodo.siguiente = route;
                        aux.siguiente = nuevoNodo;
                    }

                }
            } else {
                System.out.println("LA PRIORIDAD DIA DE CABEZA ES MENOR O IGUAL");
//si la prioridad Dia de cabeza no es mayor busca su lugar en el día y luego en la hora.
                Nodo aux = null;
                Nodo route = cabeza;
                Nodo route2 = cabeza;
                while (route != cola && route.prioD <= diaP) {
                    System.out.println("BUSCANDO SU LUGAR");
                    if (cabeza.nPrio > nPrm) {
                        System.out.println("LA PRIORIDAD DE HORA EN CABEZA ES MAYOR");
                        nuevoNodo.siguiente = cabeza;
                        cabeza = nuevoNodo;
                    } else {//en caso de que no sea mayor pues busca a donde pertecene
                        System.out.println("LA PRIORIDAD DE HORA EN CABEZA ES MENOR O IGUAL ");
                        aux = null;
                        route2 = cabeza;
                        while (route2 != cola) {
                            if (route2.nPrio <= nPrm) {
                                System.out.println("BUSCANDO SU LUGAR.... nPrio");
                                aux = route2;
                                break;
                            }
                            route2 = route2.siguiente;
                        }
                        if (route2 == cola) {
                            cola = nuevoNodo;
                        } else {
                            nuevoNodo.siguiente = route2;
                            aux.siguiente = nuevoNodo;
                        }
                    }
                    route = route.siguiente;
                }
                if (route == cola) {
                    if (cabeza.nPrio > nPrm) {
                        System.out.println("LA PRIORIDAD DE HORA EN CABEZA ES MAYOR");
                        nuevoNodo.siguiente = cabeza;
                        cabeza = nuevoNodo;
                    } else {//en caso de que no sea mayor pues busca a donde pertecene
                        System.out.println("LA PRIORIDAD DE HORA EN CABEZA ES MENOR O IGUAL ");
                        aux = null;
                        route2 = cabeza;
                        while (route2 != cola) {
                            if (route2.nPrio <= nPrm) {
                                System.out.println("BUSCANDO SU LUGAR.... nPrio");
                                aux = route2;
                                break;
                            }
                            route2 = route2.siguiente;
                        }
                        if (route2 == cola) {
                            cola = nuevoNodo;
                        } else {
                            nuevoNodo.siguiente = route2;
                            aux.siguiente = nuevoNodo;
                        }
                    }

                }

            }
        }
    }

    /*public void reasignarNodo(int dat, int nNprim, int nuevoNPrim) {
        Nodo nuevoNodo = new Nodo(dat, nuevoNPrim);
        //Eliminar el dato
        if (cabeza.nPrio == nNprim && cabeza.dat == dat) {
            cabeza = cabeza.siguiente;
        } else {
            Nodo anterior = cabeza;
            Nodo temp = cabeza.siguiente;
            if (temp == cola) {
                cola = anterior;
            }
            while (temp != null) {
                if (temp.dat == dat && temp.nPrio == nNprim) {
                    anterior.siguiente = temp.siguiente;
                    break;
                }
                temp = temp.siguiente;
                anterior = anterior.siguiente;
            }
            if (temp == cola) {
                cola = anterior;
            }
        }
        //Insertar el nuevo nodo
        if (cabeza.nPrio > nuevoNPrim) {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        } else {
            Nodo aux_2 = null;
            Nodo route_2 = cabeza;
            while (route_2 != null && route_2.nPrio <= nuevoNPrim) {
                aux_2 = route_2;
                route_2 = route_2.siguiente;
            }
            nuevoNodo.siguiente = route_2;
            aux_2.siguiente = nuevoNodo;
            if (route_2 == null) {
                cola = nuevoNodo;
            }
        }
    }
     */

      /*
    public void eliminarNodo(int numPrioridad) {
        if (estaVacia()) {
            System.out.println("Esta lista esta vacia");
        } else if (cabeza == cola && cabeza.nPrio == numPrioridad) {
            cabeza = cola = null;
        } else if (cabeza.nPrio == numPrioridad) {
            cabeza = cabeza.siguiente;
        } else {
            Nodo anterior = cabeza;
            Nodo temp = cabeza.siguiente;
            while (temp != null && temp.nPrio != numPrioridad) {
                anterior = anterior.siguiente;
                temp = temp.siguiente;
            }
            if (temp != null) {
                anterior.siguiente = temp.siguiente;
                if (temp == cola) {
                    cola = anterior;
                }
            }
        }
    }
     */

    public void imprimir() {
        Nodo route = cabeza;
        if (route == null) {

        } else {
            while (route != cola) {
                System.out.println("->" + route.toString());
                route = route.siguiente;
            }
            System.out.println("->" + route.toString());
        }
    }
}
