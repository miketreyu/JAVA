package ejercicios2;
import java.util.Scanner;

public class Ejercicio30 {

    // Función para mostrar el menú y devolver la opción elegida
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menú de opciones:");
        System.out.println("1. Circunferencia");
        System.out.println("2. Área");
        System.out.println("3. Volumen");
        System.out.println("4. Todas");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
        return sc.nextInt();
    }

    // Función para pedir el radio
    public static double pideRadio() {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Introduce el radio: ");
        return sc.nextDouble();
    }

    // Función para calcular la circunferencia
    public static double circunferencia(double r) {
        return 2 * Math.PI * r; // Fórmula de la circunferencia 2 * pi * r
    }

    // Función para calcular el área
    public static double area(double r) {
        return Math.PI * Math.pow(r, 2); // Fórmula del área pi * r^2
    }

    // Función para calcular el volumen de una esfera
    public static double volumen(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3); // Fórmula del volumen 4/3 * pi * r^3
    }

    // Función para mostrar todos los cálculos (circunferencia, área y volumen)
    public static void mostrarTodos(double r) {
        System.out.println("Circunferencia: " + circunferencia(r));
        System.out.println("Área: " + area(r));
        System.out.println("Volumen: " + volumen(r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            opcion = menu(); // Mostrar menú y obtener opción
            
            switch (opcion) {
                case 1:
                    double radioCircunferencia = pideRadio();
                    System.out.println("Circunferencia: " + circunferencia(radioCircunferencia));
                    break;
                case 2:
                    double radioArea = pideRadio();
                    System.out.println("Área: " + area(radioArea));
                    break;
                case 3:
                    double radioVolumen = pideRadio();
                    System.out.println("Volumen: " + volumen(radioVolumen));
                    break;
                case 4:
                    double radioTodos = pideRadio();
                    mostrarTodos(radioTodos);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta nuevamente.");
            }
        } while (opcion != 5); // Repetir el proceso hasta que el usuario elija salir
    }
}

