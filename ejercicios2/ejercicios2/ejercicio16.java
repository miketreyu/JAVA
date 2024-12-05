package ejercicios2;

import java.util.Arrays;

public class ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MATRIZ 10*10 TABLA, PARES 1 IMPARES 0
		int[][] matriz = new int[10][10];
		for(int i = 0; i <matriz.length; i++) {
			for(int j = 0; j<matriz.length;j++) {
				if (j%2==0) {
					matriz[i][j]=1;
				}
				else {
					matriz[i][j]=0;
				}
			}
		}
		System.out.println(Arrays.deepToString(matriz));

	}

}
