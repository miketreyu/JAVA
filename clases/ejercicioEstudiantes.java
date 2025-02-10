package clases;
import clases.*;
import java.util.*;

public class ejercicioEstudiantes {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array de objetos Estudiante
        estudiantes[] estudiantes = new estudiantes[5];

        // Pedir los datos de los estudiantes por teclado
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese los datos del estudiante #" + (i + 1));
            
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            
            System.out.print("Nota media: ");
            double notaMedia = scanner.nextDouble();
            
            // Limpiar el buffer del scanner para evitar problemas con nextLine()
            scanner.nextLine(); 

            // Crear un objeto Estudiante con los datos ingresados
            estudiantes[i] = new estudiantes(nombre, edad, notaMedia);
        }

        // Mostrar la información de cada estudiante
        System.out.println("\nInformación de los estudiantes:");
        for (estudiantes estudiante : estudiantes) {
            estudiante.mostrarInformacion();
        }

        // Cerrar el scanner
        scanner.close();
    }
}
