package ejercicios2;

import java.util.Arrays;
import java.util.*;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
		introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
		matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
		menores que cero y cuántos son igual a cero
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime los valores del array: ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println("Dime los numeros que quieres que entren en el array: ");
		int cont = 0;
		int cont1 = 0;
		int cont2 = 0;
		int [][] matriz = new int [i][j];
		for(int k=0; k<i;k++) {
			for(int l=0; l<j; l++) {
				matriz[k][l] = sc.nextInt();
			}
		}
		for(int k=0; k<i;k++) {
			for(int l=0; l<j; l++) {
				if(matriz[k][l]>0) {
					cont++;
				}
				else if(matriz[k][l]<0) {
					cont1++;
				}
				else {
					cont2++;
				}
			}
		}
		System.out.println(Arrays.deepToString(matriz));
		System.out.println("Hay "+cont+" valor(es) mayores que 0, " +cont1+" valor(es) menores que 0, " + cont2 + " valor(es) iguales a 0");

	}

}
