package clases;
import clases.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    private int tipo;

    // Constructor con tres parámetros (día, mes, año). El tipo por defecto será 0.
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.tipo = 0; // Tipo por defecto
    }

    // Constructor con cuatro parámetros (día, mes, año, tipo).
    public Fecha(int dia, int mes, int anio, int tipo) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.tipo = tipo;
    }

    // Métodos Getters y Setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    // Método toString que devuelve la fecha en el formato correspondiente
    @Override
    public String toString() {
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        String mesNombre = meses[mes - 1]; // El mes empieza desde 1, ajustamos el índice

        switch (tipo) {
            case 0:
                return String.format("%02d/%02d/%d", dia, mes, anio);
            case 1:
                return String.format("%02d – %s – %d", dia, mesNombre, anio);
            case 2:
                return String.format("%02d de %s de %d", dia, mesNombre, anio);
            default:
                return String.format("%02d/%02d/%d", dia, mes, anio); // Por defecto
        }
    }
}
