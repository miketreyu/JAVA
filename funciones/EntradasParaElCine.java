package funciones;
import java.util.Scanner;

public class EntradasParaElCine {
    static final int FILAS = 8;
    static final int COLUMNAS = 9;
    static final String CLAVE_EMPLEADO = "Polis1DAWM";

    public static void main(String[] args) {
        boolean[][] sala = inicializarSala();
        double[][] precios = inicializarPrecios(9.0, 12.5);
        double totalRecaudado = 0;

        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            mostrarMenu();
            opcion = scanner.next().toUpperCase().charAt(0);
            switch (opcion) {
                case 'M':
                    mostrarAsientos(sala, precios);
                    break;
                case 'R':
                    totalRecaudado += reservarAsiento(sala, precios, scanner);
                    break;
                case 'D':
                    totalRecaudado -= cancelarReserva(sala, precios, scanner);
                    break;
                case 'C':
                    contarAsientos(sala);
                    break;
                case 'S':
                    System.out.printf("Se han recaudado %.2f€%n", totalRecaudado);
                    contarAsientos(sala);
                    System.out.println("Gracias por usar el sistema. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 'S');
    }

    // Inicializa el estado de la sala (todos los asientos libres)
    public static boolean[][] inicializarSala() {
        return new boolean[FILAS][COLUMNAS];
    }

    // Inicializa los precios de los asientos
    public static double[][] inicializarPrecios(double precioNormal, double precioExtremo) {
        double[][] precios = new double[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (j == 0 || j == COLUMNAS - 1) {
                    precios[i][j] = precioExtremo;
                } else {
                    precios[i][j] = precioNormal;
                }
            }
        }
        return precios;
    }

    // Muestra el menú principal
    public static void mostrarMenu() {
        System.out.println("\n*********************************************************");
        System.out.println("Bienvenid@ al sistema de reservas de Cinépolis DAWM.");
        System.out.println("Selecciona una opción:");
        System.out.println("M. Mostrar asientos");
        System.out.println("R. Reservar entrada");
        System.out.println("D. Cancelar reserva");
        System.out.println("C. Contar asientos");
        System.out.println("S. Salir");
        System.out.println("*********************************************************");
    }

    // Muestra el estado actual de los asientos
    public static void mostrarAsientos(boolean[][] sala, double[][] precios) {
        System.out.println("\nCódigo\tEstado\t\tPrecio");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                String estado = sala[i][j] ? "Ocupado" : "Libre";
                System.out.printf("S%02d%02d\t%s\t\t%.2f€%n", i, j, estado, precios[i][j]);
            }
        }
    }

    // Reserva un asiento y devuelve el precio
    public static double reservarAsiento(boolean[][] sala, double[][] precios, Scanner scanner) {
        System.out.println("Introduce el código del asiento (Ejemplo: 0503):");
        String codigo = scanner.next();
        int fila = Integer.parseInt(codigo.substring(0, 2));
        int columna = Integer.parseInt(codigo.substring(2, 4));

        if (esAsientoValido(fila, columna)) {
            if (!sala[fila][columna]) {
                sala[fila][columna] = true;
                System.out.printf("Reserva realizada por %.2f€%n", precios[fila][columna]);
                return precios[fila][columna];
            } else {
                System.out.println("El asiento ya está ocupado.");
            }
        } else {
            System.out.println("Código de asiento no válido.");
        }
        return 0;
    }

    // Cancela la reserva de un asiento
    public static double cancelarReserva(boolean[][] sala, double[][] precios, Scanner scanner) {
        System.out.println("Introduce la clave:");
        String clave = scanner.next();

        if (CLAVE_EMPLEADO.equals(clave)) {
            System.out.println("Introduce el código del asiento a cancelar:");
            String codigo = scanner.next();
            int fila = Integer.parseInt(codigo.substring(0, 2));
            int columna = Integer.parseInt(codigo.substring(2, 4));

            if (esAsientoValido(fila, columna)) {
                if (sala[fila][columna]) {
                    sala[fila][columna] = false;
                    System.out.printf("Reserva cancelada: -%.2f€%n", precios[fila][columna]);
                    return precios[fila][columna];
                } else {
                    System.out.println("El asiento no está ocupado.");
                }
            } else {
                System.out.println("Código de asiento no válido.");
            }
        } else {
            System.out.println("Clave incorrecta.");
        }
        return 0;
    }

    // Cuenta los asientos libres y ocupados
    public static void contarAsientos(boolean[][] sala) {
        int libres = 0, ocupados = 0;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (sala[i][j]) {
                    ocupados++;
                } else {
                    libres++;
                }
            }
        }
        System.out.printf("Hay un total de %d asientos ocupados y %d asientos libres.%n", ocupados, libres);
    }

    // Valida si un asiento está dentro del rango de la sala
    public static boolean esAsientoValido(int fila, int columna) {
        return fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS;
    }
}
