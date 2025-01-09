package funciones;

import java.util.Scanner;

public class NombreTrineo {
	public static void random() {
		String array[]= new String[3];
		array[0]="cometa";
		array[1]="relámpago";
		array[2]="estrella";
		
		String array2[]= new String[3];
		array2[0]="veloz";
		array2[1]="fugaz";
		array2[2]="brillante";
		System.out.println("Introduce un numero (use el 1 para cerrar el programa): ");
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {		
		num = sc.nextInt();
		int index1 = (int)(Math.random() * (array.length-1));
		int index2 = (int)(Math.random() * (array2.length-1));
		System.out.println(array[index1]+" "+array2[index2]);
		}while(num!=1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		random();
	

	}

}
