package clases;
import clases.*;

public class Festivo {
    private String nombre;
    private Fecha fecha;
    private static int numFestivos = 0;

    // Constructor con nombre y fecha
    public Festivo(String nombre, Fecha fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        numFestivos++;
    }

    // Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public static int getNumFestivos() {
        return numFestivos;
    }

    // Método diferencia que calcula los días entre dos festividades
    public int diferencia(Festivo otroFestivo) {
        // Número de días entre las dos fechas, sin contar años bisiestos.
        int totalDias1 = this.fecha.getAnio() * 365 + this.fecha.getMes() * 30 + this.fecha.getDia();
        int totalDias2 = otroFestivo.fecha.getAnio() * 365 + otroFestivo.fecha.getMes() * 30 + otroFestivo.fecha.getDia();

        return Math.abs(totalDias1 - totalDias2); // Retorna la diferencia absoluta
    }

    // Método toString para mostrar la información del festivo
    @Override
    public String toString() {
        return "Fiesta: " + nombre + "\nFecha: " + fecha.toString();
    }
}
