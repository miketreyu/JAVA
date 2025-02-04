package clases;
import java.util.Scanner;
import clases.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos para el primer festivo
        System.out.println("Ingrese el nombre del primer festivo:");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese el día del primer festivo:");
        int dia1 = scanner.nextInt();
        System.out.println("Ingrese el mes del primer festivo:");
        int mes1 = scanner.nextInt();
        System.out.println("Ingrese el año del primer festivo:");
        int anio1 = scanner.nextInt();
        System.out.println("Ingrese el tipo de formato (0, 1 o 2):");
        int tipo1 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Crear el primer festivo
        Fecha fecha1 = new Fecha(dia1, mes1, anio1, tipo1);
        Festivo festivo1 = new Festivo(nombre1, fecha1);

        // Solicitar datos para el segundo festivo
        System.out.println("\nIngrese el nombre del segundo festivo:");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese el día del segundo festivo:");
        int dia2 = scanner.nextInt();
        System.out.println("Ingrese el mes del segundo festivo:");
        int mes2 = scanner.nextInt();
        System.out.println("Ingrese el año del segundo festivo:");
        int anio2 = scanner.nextInt();
        System.out.println("Ingrese el tipo de formato (0, 1 o 2):");
        int tipo2 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Crear el segundo festivo
        Fecha fecha2 = new Fecha(dia2, mes2, anio2, tipo2);
        Festivo festivo2 = new Festivo(nombre2, fecha2);

        // Mostrar la información de los festivos
        System.out.println("\nFiesta 1:");
        System.out.println(festivo1);
        System.out.println("Fiesta 2:");
        System.out.println(festivo2);

        // Calcular y mostrar la diferencia de días
        int diferencia = festivo1.diferencia(festivo2);
        System.out.println("\nDiferencia: " + diferencia + " días");

        scanner.close();
    }
}
