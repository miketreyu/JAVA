package clases;
import clases.*;
import java.util.*;

public class ejercicioTienda {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precioBase=0;

        // Crear un array de objetos Producto
        Producto[] productos = new Producto[5];

        // Pedir los datos de los productos por teclado
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Ingrese los datos del producto #" + (i + 1));

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Precio: ");
            double precio = scanner.nextDouble();

            System.out.print("Unidades: ");
            int unidades = scanner.nextInt();

            // Limpiar el buffer del scanner para evitar problemas con nextLine()
            scanner.nextLine();

            // Crear un objeto Producto con los datos ingresados
            productos[i] = new Producto(nombre, precio, unidades);
            if (precio>=precioBase) {
            	precioBase=precio;
            }
        }
        System.out.println("El producto más caro cuesta: " +precioBase);

        // Mostrar la información de cada producto
        System.out.println("\nInformación de los productos:");
        for (Producto producto : productos) {
            producto.mostrarInformacion();
        }

        // Cerrar el scanner
        scanner.close();
    }

}
