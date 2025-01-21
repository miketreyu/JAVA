package esamen2;

//Ejercicio: Sistema de reservas en una biblioteca
import java.util.Scanner;

public class Ejercicio11 {
 static Scanner sc = new Scanner(System.in);
 static double totalReservado = 0;

 public static void main(String[] args) {
     boolean[][] libros = new boolean[5][10]; // 5 estanterías, 10 libros por estantería
     double[][] preciosLibros = new double[libros.length][libros[0].length];
     inicializarPrecios(preciosLibros, 2.0, 5.0);
     mostrarMenu(libros, preciosLibros);
 }

 public static void inicializarPrecios(double[][] preciosLibros, double precioMin, double precioMax) {
     for (int i = 0; i < preciosLibros.length; i++) {
         for (int j = 0; j < preciosLibros[i].length; j++) {
             preciosLibros[i][j] = precioMin + (j % 3 == 0 ? precioMax - precioMin : 0); // Alternar precios altos
         }
     }
 }

 public static void mostrarMenu(boolean[][] libros, double[][] preciosLibros) {
     boolean salir = false;
     while (!salir) {
         System.out.println("\n*******************************");
         System.out.println("Sistema de reservas de libros");
         System.out.println("1. Mostrar libros disponibles");
         System.out.println("2. Reservar un libro");
         System.out.println("3. Cancelar una reserva");
         System.out.println("4. Contar libros disponibles");
         System.out.println("5. Salir");
         System.out.println("*******************************");
         System.out.print("Elige una opción: ");

         int opcion = sc.nextInt();
         switch (opcion) {
             case 1:
                 mostrarLibros(libros, preciosLibros);
                 break;
             case 2:
                 reservarLibro(libros, preciosLibros);
                 break;
             case 3:
                 cancelarReserva(libros, preciosLibros);
                 break;
             case 4:
                 contarLibrosDisponibles(libros);
                 break;
             case 5:
                 salir = true;
                 System.out.println("Total recaudado: " + totalReservado + "€");
                 break;
             default:
                 System.out.println("Opción no válida");
                 break;
         }
     }
 }

 public static void mostrarLibros(boolean[][] libros, double[][] preciosLibros) {
     System.out.printf("%10s%10s%10s\n", "Código", "Estado", "Precio");
     for (int i = 0; i < libros.length; i++) {
         for (int j = 0; j < libros[i].length; j++) {
             System.out.printf("%8s %10s %10.2f€\n", "L" + i + j, libros[i][j] ? "Reservado" : "Disponible", preciosLibros[i][j]);
         }
     }
 }

 public static void reservarLibro(boolean[][] libros, double[][] preciosLibros) {
     int[] posicion = pedirPosicion(libros.length, libros[0].length);
     if (posicion != null) {
         int fila = posicion[0];
         int columna = posicion[1];
         if (!libros[fila][columna]) {
             libros[fila][columna] = true;
             totalReservado += preciosLibros[fila][columna];
             System.out.println("Reserva realizada: " + preciosLibros[fila][columna] + "€");
         } else {
             System.out.println("El libro ya está reservado.");
         }
     }
 }

 public static void cancelarReserva(boolean[][] libros, double[][] preciosLibros) {
     int[] posicion = pedirPosicion(libros.length, libros[0].length);
     if (posicion != null) {
         int fila = posicion[0];
         int columna = posicion[1];
         if (libros[fila][columna]) {
             libros[fila][columna] = false;
             totalReservado -= preciosLibros[fila][columna];
             System.out.println("Reserva cancelada: " + preciosLibros[fila][columna] + "€ devueltos");
         } else {
             System.out.println("El libro no estaba reservado.");
         }
     }
 }

 public static void contarLibrosDisponibles(boolean[][] libros) {
     int disponibles = 0;
     int reservados = 0;
     for (boolean[] estanteria : libros) {
         for (boolean estado : estanteria) {
             if (estado) {
                 reservados++;
             } else {
                 disponibles++;
             }
         }
     }
     System.out.println("Libros disponibles: " + disponibles);
     System.out.println("Libros reservados: " + reservados);
 }

 public static int[] pedirPosicion(int totalFilas, int totalColumnas) {
     System.out.print("Introduce el código del libro (ejemplo: L01): ");
     String codigo = sc.next();
     if (codigo.length() != 3 || codigo.charAt(0) != 'L' || !Character.isDigit(codigo.charAt(1)) || !Character.isDigit(codigo.charAt(2))) {
         System.out.println("Código inválido.");
         return null;
     }

     int fila = Character.getNumericValue(codigo.charAt(1));
     int columna = Character.getNumericValue(codigo.charAt(2));
     if (fila >= totalFilas || columna >= totalColumnas) {
         System.out.println("Posición fuera de rango.");
         return null;
     }

     return new int[]{fila, columna};
 }
}
