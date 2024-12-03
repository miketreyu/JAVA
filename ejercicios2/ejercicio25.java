package ejercicios2;

import java.util.Scanner;

public class ejercicio25 {

	/*
	8. Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
	productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:
	int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
	int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
	double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
	*/
	
	public static int suma1aN(int n) {
		int suma = 1;
		for (int i = 1; i <= n; i++) {
            suma += i; 
        }
		return suma;
	}
	public static int producto1aN(int n) {
		int producto=1;
		for (int i = 1; i <= n; i++) {
            producto *= i; 
        }
		return producto;
	}
	public static double intermedio1aN(int n) {
        return (1 + n) / 2.0;  
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique un numero:");
		int n = sc.nextInt();
		int sumatorio = suma1aN(n);
		int productorio = producto1aN(n);
		double intermedio = intermedio1aN(n);
		System.out.println("El sumatorio es: "+ sumatorio+" el productorio es: " +productorio +" y el intermedio es: "+ intermedio);

	}

}
