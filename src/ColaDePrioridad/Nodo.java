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

    public Nodo(int nPrio) {
        this.nPrio = nPrio;
    }

    public void setnPrio(int nPrio) {
        this.nPrio = nPrio;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dat: " + cita + ", numPrio: " + nPrio + "}";
    }
}
