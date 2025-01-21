package funciones;

import java.util.Scanner;

public class interval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Diga un numero para saber si está en el intervalo: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int m = 50;
		int n = 60;
		
		if(inter(m,n,num)==true) {
			System.out.println("Se encuentra entre " + m + " y "+ n);
		}else {
			System.out.println("No se encuentra entre los dos numeros");
		}


	}
	public static boolean inter (int m, int n, int num) {
		if(num>=m&&num<=n) {
			return true;
		}
		else {
			return false;
		}
	}

}
