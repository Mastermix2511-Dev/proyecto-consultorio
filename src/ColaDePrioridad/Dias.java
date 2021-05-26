package ColaDePrioridad;

public class Dias {

    private int dia;

    private int contadorDia = 0;

    public Dias() {
    }

    public Dias(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getContadorDia() {
        return contadorDia;
    }

    public void setContadorDia(int contadorDia) {
        this.contadorDia = contadorDia;
    }

    @Override
    public String toString() {
        return "Dias{" +
                "dia=" + dia +
                ", diasContador=" + contadorDia +
                '}';
    }
}
