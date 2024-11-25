package ejercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
		1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
		programa mostrará la nota mínima, máxima y media de cada alumno.	 
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay 4 alumnos");
		System.out.println("Tienen 5 notas, introduce la nota de cada alumno");
		int i = 4;
		int j = 5;
		float [][] matriz = new float [i][j];
		for(int k=0; k<4;k++) {
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
