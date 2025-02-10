package clases;

public class Producto {
	private String nombre;
    private double precio;
    private int unidades;
    
    // Constructor
    public Producto(String nombre, double precio, int unidades) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getUnidades() {
        return unidades;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Unidades: " + unidades);
        System.out.println("...");
    }

    // Método para mostrar la información del estudiante
    @Override
    public String toString() {
        return "Estudiante: " + nombre + ", Precio: " + precio + ", Unidades: " + unidades;
    }

}
