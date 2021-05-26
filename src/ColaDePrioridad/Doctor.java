package ColaDePrioridad;

public class Doctor {
    private String nombreDoctor;
    private int claveDoctor;
    Dias dias[];

    public Doctor() {
    }

    public Doctor(String nombreDoctor, int claveDoctor) {
        this.nombreDoctor = nombreDoctor;
        this.claveDoctor = claveDoctor;
    }


    public Dias[] getDias() {
        return dias;
    }

    public void setDias(Dias[] dias) {
        this.dias = dias;
    }

    public int getClaveDoctor() {
        return claveDoctor;
    }

    public void setClaveDoctor(int claveDoctor) {
        this.claveDoctor = claveDoctor;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }


    @Override
    public String toString() {
        return "Doctor: " + nombreDoctor + ", Clave Id Doctor: " + claveDoctor;

    }
}