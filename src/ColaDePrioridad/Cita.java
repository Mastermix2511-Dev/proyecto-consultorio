package ColaDePrioridad;

public class Cita {
    private String nombrePaciente;
    private int fecha;
    private int año;
    private int mes;
    private int contadorDeDias;


    // hora ya va en el nodo, es nprim

    public Cita() {
    }

    public Cita(String nombrePaciente, int fecha, int año, int mes) {
        this.contadorDeDias = 0;
        this.nombrePaciente = nombrePaciente;
        this.fecha = fecha;
        this.año = año;
        this.mes = mes;
    }

    public int getContadorDeDias() {
        return contadorDeDias;
    }

    public void setContadorDeDias(int contadorDeDias) {
        this.contadorDeDias = contadorDeDias;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Paciente: " + nombrePaciente + ", Fecha: " + fecha + "/" + mes + "/" + año;
    }

}
