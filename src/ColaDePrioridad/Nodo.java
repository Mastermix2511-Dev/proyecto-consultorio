package ColaDePrioridad;

public class Nodo {
    public Cita cita;
    public int nPrio;// hora
    public Nodo siguiente;


    public Nodo() {
    }

    public Nodo(Cita cita, int nPrio) {
        this.cita = cita;
        this.nPrio = nPrio;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "Cita: " + cita + ", Horario: " + nPrio + ":00 hrs";
    }


}
