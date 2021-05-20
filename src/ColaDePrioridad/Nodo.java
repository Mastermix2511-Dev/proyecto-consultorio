package ColaDePrioridad;

public class Nodo {
     Nodo siguiente;
     Doctor nombreDoctor;
     Citas citas;
     int nPrio;

    public Nodo() {
    }

    public Nodo(Doctor nombreDoctor,int nPrio, Citas citas) {
        this.nombreDoctor = nombreDoctor;
        this.nPrio = nPrio;
        this.citas = citas;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "Nombre Doctor" + nombreDoctor + "Citas" + citas;
    }
}
