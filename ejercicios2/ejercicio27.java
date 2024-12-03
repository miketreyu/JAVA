package ejercicios2;

import java.util.Scanner;

public class ejercicio27 {
	
	/*
	10. Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga si
	la fecha es correcta o no. Supondremos que todos los meses tienen 30 días. Se debe crear una
	función donde le pasemos los datos y devuelva si es correcta o no.
	 */
	
	public static boolean fechaCorrecta(int dia, int mes) {
		if (dia>=1 && dia<=30 && mes <=12) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el dia: ");
		int m = sc.nextInt();
		System.out.println("Escribe el mes: ");
		int n = sc.nextInt();
		boolean a = fechaCorrecta(m,n);

	}

}
