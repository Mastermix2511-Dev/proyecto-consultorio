package ColaDePrioridad;

public class Doctor {
    private String nombreDoctor;
    private int claveDoctor;
    Nodo nodo;


    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }

    public Doctor(String nombreDoctor, int claveDoctor) {
        this.nombreDoctor = nombreDoctor;
        this.claveDoctor = claveDoctor;
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
        return "Doctor{" +
                "nombreDoctor='" + nombreDoctor + '\'' +
                ", claveDoctor=" + claveDoctor +
                ", nodo=" + nodo +
                '}';
    }
}
