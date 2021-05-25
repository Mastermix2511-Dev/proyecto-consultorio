package ColaDePrioridad;


public class Consultorio {
    Nodo cabeza = null;
    Nodo cola = null;
    Doctor doctor;


    public Consultorio(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
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


    public void insertarCita(Cita cita, int nPrm) {// hora
        Nodo nuevoNodo = new Nodo(cita, nPrm);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else if (cabeza.nPrio > nPrm) {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        } else {
            Nodo aux = null;
            Nodo route = cabeza;
            while (route != null && route.nPrio <= nPrm) {
                aux = route;
                route = route.siguiente;
            }
            nuevoNodo.siguiente = route;
            aux.siguiente = nuevoNodo;
            if (route == null) {
                cola = nuevoNodo;
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
            while (route != null) {
                System.out.println("->" + route.toString());
                route = route.siguiente;
            }
            System.out.println();
        }
    }
}