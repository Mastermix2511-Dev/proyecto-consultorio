package ColaDePrioridad;

public class Nodo {
    public Cita cita;
    public int prioD;
    public int nPrio;// hora
    public Nodo siguiente;


    public Nodo() {
    }

    public Nodo(Cita cita, int prioD, int nPrio) {
        this.cita = cita;
        this.nPrio = nPrio;
        this.prioD = prioD;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        Consultorio con = new Consultorio();
        con = new Consultorio(con.doctor = new Doctor());//objeto para obtener el horario que se pidió en esa cita
        return "Cita: " + cita + ", Horario: " + con.horarios[nPrio] + " hrs";
    }


}
