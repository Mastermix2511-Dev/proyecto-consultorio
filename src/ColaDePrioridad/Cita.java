package ColaDePrioridad;

public class Cita {
    private String nombrePaciente;
    private String fecha;
    // hora ya va en el nodo, nprim


    public Cita() {

    }

    public Cita(String nombrePaciente, String fecha) {
        this.nombrePaciente = nombrePaciente;
        this.fecha = fecha;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "nombrePaciente='" + nombrePaciente + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }


}
