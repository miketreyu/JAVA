package ejercicios2;

import java.util.Scanner;

public class ejercicio34 {
	
	public static void numerosAscendentes(int n, int cont) 
	{
		if(n==0){
			return;
		}
		System.out.println(cont);
		
		numerosAscendentes(n-1,cont+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero mayor o igual a 1: ");
        int n = sc.nextInt();
        numerosAscendentes(n,1);
	}

}
