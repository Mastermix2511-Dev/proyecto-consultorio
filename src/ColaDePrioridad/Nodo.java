package ColaDePrioridad;

public class Nodo {
    public int dat;
    public int nPrio;
    public Nodo siguiente;

    public Nodo(int dat, int nPrio) {
        this.dat = dat;
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
                "dat: " + dat + ", numPrio: " + nPrio + "}";
    }
}
