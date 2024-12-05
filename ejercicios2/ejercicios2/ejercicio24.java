package ejercicios2;

import java.util.Scanner;

public class ejercicio24 {
	/*
	 7. Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
	su perímetro. Implementa y utiliza las funciones:
	double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
	double areaRectangulo(double ancho, double alto) // Devuelve el área  
	 */
	
	public static double perimetroRectangulo(double ancho, double alto) {
		return (ancho*2)+(alto*2);
	}
	public static double areaRectangulo(double ancho, double alto) {
		return ancho*alto;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme el ancho del rectangulo: ");
		double ancho = sc.nextDouble();
		System.out.println("Deme el ancho del rectangulo: ");
		double alto = sc.nextDouble();
		double perimetro = perimetroRectangulo(ancho, alto);
		double area = areaRectangulo(ancho, alto);
		
		System.out.println("El area es: "+ area +" "+ " y el perimetro es: "+ perimetro);

	}

}
