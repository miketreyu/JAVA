package clases;
public class estudiantes {
    // Atributos
    private String nombre;
    private int edad;
    private double notaMedia;

    // Constructor
    public estudiantes(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota media: " + notaMedia);
        System.out.println("...");
    }

    // Método para mostrar la información del estudiante
    @Override
    public String toString() {
        return "Estudiante: " + nombre + ", Edad: " + edad + ", Nota media: " + notaMedia;
    }
}
