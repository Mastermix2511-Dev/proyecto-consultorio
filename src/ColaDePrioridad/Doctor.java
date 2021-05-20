package ColaDePrioridad;

public class Doctor {
    private String nombre;

    public Doctor(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "nombre='" + nombre;
    }
}
