package ejercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa
		y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la información
		de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su
		género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Tienen 5 notas, introduce la nota de cada alumno ");
		float i = sc.nextFloat();
		float j = 2;
		float [][] matriz = new float [i][j];
		for(int k=0; k<4;k++) {
			System.out.println("Introdcuza 0 si es hombre y 1 si es mujer:");
			for(int l=0; l<5; l++) {
				matriz[k][l] = sc.nextFloat();
			}
		}
		for(int k=0; k<4;k++) {
			float min = Float.MAX_VALUE; 
			float max = Float.MIN_VALUE;
			float suma = 0;
			for(int l=0; l<5; l++) {
				float nota = matriz[k][l]; 
				if (nota < min) 
				{ 
					min = nota; 
				} 
				if (nota > max) 
				{ 
					max = nota; 
				}
				suma += nota;
			}
			double media = (double) suma / 5; 
			System.out.println("Alumno " + (i + 1) + ":"); 
			System.out.println("Nota mínima: " + min); 
			System.out.println("Nota máxima: " + max); 
			System.out.println("Nota media: " + media);
		}
		System.out.println("Matriz de notas:"); 
		for (int g = 0; g < 4; g++) { 
			System.out.println("Alumno " + (i + 1) + ": " + Arrays.toString(matriz[g])); 
		}


	}

}
