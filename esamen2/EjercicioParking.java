package esamen2;
import java.util.*;

public class EjercicioParking {
    public static void main(String[] args) {
        final int FILAS = 5;
        final int COLUMNAS = 10;
        char[][] parking = new char[FILAS][COLUMNAS];
        inicializarParking(parking);
        menuParking(parking);
    }

    // Inicializa el parking con todas las plazas libres ('L')
    public static void inicializarParking(char[][] parking) {
        for (int i = 0; i < parking.length; i++) {
            for (int j = 0; j < parking[i].length; j++) {
                parking[i][j] = 'L';
            }
        }
    }

    // Muestra el menú del parking
    public static void menuParking(char[][] parking) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ DEL PARKING ---");
            System.out.println("1. Ver estado del parking");
            System.out.println("2. Aparcar un coche");
            System.out.println("3. Retirar un coche");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarParking(parking);
                    break;
                case 2:
                    aparcarCoche(parking);
                    break;
                case 3:
                    retirarCoche(parking);
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
        sc.close();
    }

    // Muestra el estado del parking
    public static void mostrarParking(char[][] parking) {
        System.out.println("\nEstado del parking:");
        for (int i = 0; i < parking.length; i++) {
            for (int j = 0; j < parking[i].length; j++) {
                System.out.print(parking[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Aparca un coche en la primera plaza libre
    public static void aparcarCoche(char[][] parking) {
        boolean aparcado = false;

        for (int i = 0; i < parking.length && !aparcado; i++) {
            for (int j = 0; j < parking[i].length; j++) {
                if (parking[i][j] == 'L') {
                    parking[i][j] = 'O';
                    System.out.printf("Coche aparcado en la plaza [%d][%d].\n", i, j);
                    aparcado = true;
                    break;
                }
            }
        }

        if (!aparcado) {
            System.out.println("No hay plazas libres disponibles.");
        }
    }

    // Retira un coche de una plaza específica
    public static void retirarCoche(char[][] parking) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la fila de la plaza: ");
        int fila = sc.nextInt();
        System.out.print("Introduce la columna de la plaza: ");
        int columna = sc.nextInt();

        if (fila >= 0 && fila < parking.length && columna >= 0 && columna < parking[0].length) {
            if (parking[fila][columna] == 'O') {
                parking[fila][columna] = 'L';
                System.out.printf("Coche retirado de la plaza [%d][%d].\n", fila, columna);
            } else {
                System.out.println("La plaza ya está libre.");
            }
        } else {
            System.out.println("Coordenadas fuera del rango del parking.");
        }
    }
}