package ejercicios2;

import java.util.Arrays;

public class ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SUMAR MATRICES, SUMAR FILA1+FILA2 ETC Y PONERLO EN NUEVA MATRIZ
		
		int index =1;
		int[][] matriz = {
                {2, 5, 7},
                {1, 6, 6},
                {1, 1, 1},
                {6, 8, 5},
                {3, 6, 4},
                {1, 8, 5}
            }; 
		int[][] matriz2 = new int[3][3];
		for (int i=0; i<matriz2.length;i++ ) {
			for (int j=0; j<matriz2.length; j++) {
				matriz2[i][j]= matriz[i*2][j]+matriz[i*2+1][j];
			}
		}
		
		for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
		System.out.println(Arrays.deepToString(matriz2));
	}

}
