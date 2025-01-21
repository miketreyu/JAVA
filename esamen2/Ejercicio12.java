package esamen2;

//Ejercicio 1: Sistema de inventario de productos
//Un sistema que permita gestionar un inventario de productos en un almacén.
import java.util.Scanner;

public class Ejercicio12 {
 static Scanner sc = new Scanner(System.in);
 static int[][] inventario;

 public static void main(String[] args) {
     System.out.print("Introduce el número de productos: ");
     int productos = sc.nextInt();
     System.out.print("Introduce el número de almacenes: ");
     int almacenes = sc.nextInt();
     
     inventario = new int[productos][almacenes];

     boolean salir = false;
     while (!salir) {
         System.out.println("\nMenú de Inventario:");
         System.out.println("1. Introducir stock");
         System.out.println("2. Consultar stock");
         System.out.println("3. Producto con más stock");
         System.out.println("4. Salir");
         System.out.print("Selecciona una opción: ");

         int opcion = sc.nextInt();
         switch (opcion) {
             case 1:
                 introducirStock();
                 break;
             case 2:
                 consultarStock();
                 break;
             case 3:
                 productoConMasStock();
                 break;
             case 4:
                 salir = true;
                 System.out.println("Saliendo del sistema de inventario.");
                 break;
             default:
                 System.out.println("Opción no válida.");
                 break;
         }
     }
 }

 public static void introducirStock() {
     System.out.print("Introduce el número del producto: ");
     int producto = sc.nextInt();
     System.out.print("Introduce el número del almacén: ");
     int almacen = sc.nextInt();
     System.out.print("Introduce la cantidad de stock: ");
     int cantidad = sc.nextInt();

     if (producto >= 0 && producto < inventario.length && almacen >= 0 && almacen < inventario[0].length) {
         inventario[producto][almacen] += cantidad;
         System.out.println("Stock actualizado.");
     } else {
         System.out.println("Posición fuera de rango.");
     }
 }

 public static void consultarStock() {
     System.out.print("Introduce el número del producto: ");
     int producto = sc.nextInt();
     if (producto >= 0 && producto < inventario.length) {
         System.out.print("Stock por almacén: ");
         for (int almacen = 0; almacen < inventario[producto].length; almacen++) {
             System.out.print("Almacén " + almacen + ": " + inventario[producto][almacen] + ", ");
         }
         System.out.println();
     } else {
         System.out.println("Producto no válido.");
     }
 }

 public static void productoConMasStock() {
     int maxStock = 0;
     int productoMax = -1;

     for (int producto = 0; producto < inventario.length; producto++) {
         int totalProducto = 0;
         for (int almacen = 0; almacen < inventario[producto].length; almacen++) {
             totalProducto += inventario[producto][almacen];
         }
         if (totalProducto > maxStock) {
             maxStock = totalProducto;
             productoMax = producto;
         }
     }

     if (productoMax >= 0) {
         System.out.println("El producto con más stock es el número " + productoMax + " con " + maxStock + " unidades.");
     } else {
         System.out.println("No hay datos en el inventario.");
     }
 }
}
