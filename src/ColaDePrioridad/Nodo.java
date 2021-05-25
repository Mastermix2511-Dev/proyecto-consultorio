package ColaDePrioridad;

public class Nodo {
    public Cita cita;
    public int nPrio;// hora
    public Nodo siguiente;

    public Nodo(Cita cita, int nPrio) {
        this.cita = cita;
        this.nPrio = nPrio;
        this.siguiente = null;
    }


    public Nodo() {
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dat: " + cita + ", numPrio: " + nPrio + "}";
    }
}
