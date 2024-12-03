package ejercicios2;
import java.util.*;

public class ejercicio23 {
	
	/*
	Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada uno
	tras aplicarle un 21% de IVA. Implementa y utiliza la función:
	double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
	*/
	
	public static double precioConIVA(double precio) {
		return precio*1.21;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique los precios totales: ");
		double precio1 = sc.nextInt();
		double precio2 = sc.nextInt();
		double precio3 = sc.nextInt();
		double precio4 = sc.nextInt();
		double precio5 = sc.nextInt();
		
		double descuento = precioConIVA(precio1);
		double descuento2 = precioConIVA(precio2);
		double descuento3 = precioConIVA(precio3);
		double descuento4 = precioConIVA(precio4);
		double descuento5 = precioConIVA(precio5);
		
		System.out.println("Los descuentos en orden son: "+descuento +" "+ descuento2+" "+ descuento3+" "+ descuento4+" "+ descuento5);
		

	}

}
