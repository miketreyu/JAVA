package funciones;

import java.util.Scanner;

public class area_triangulo_2 {
	public static int area(int b, int a) {
		return (b*a)/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// EL AREA DE UN TRIANGULO
		System.out.println("introduce la base:");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		System.out.println("introduce la altura:");
		int a = sc.nextInt();
		
		
		System.out.println(area(b,a));

	}

}
