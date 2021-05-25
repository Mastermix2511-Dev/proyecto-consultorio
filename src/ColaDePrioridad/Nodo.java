package ColaDePrioridad;

public class Nodo {
<<<<<<< HEAD
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
=======
     Nodo siguiente;
     Doctor nombreDoctor;
     Citas citas;
     int nPrio;

    public Nodo() {
>>>>>>> origin/master
    }

    public Nodo(Doctor nombreDoctor,int nPrio, Citas citas) {
        this.nombreDoctor = nombreDoctor;
        this.nPrio = nPrio;
        this.citas = citas;
        this.siguiente = null;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Nodo{" +
                "dat: " + cita + ", numPrio: " + nPrio + "}";
=======
        return "Nombre Doctor" + nombreDoctor + "Citas" + citas;
>>>>>>> origin/master
    }
}
