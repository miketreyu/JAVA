package ejercicios2;

import java.util.Arrays;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=1;
		int [][] matriz = new int [5][5];
		for(int i=0; i<5;i++) {
			for(int j=0; j<5; j++) {
				matriz[i][j] = cont;
				cont++;
			}
		}
		System.out.println(Arrays.deepToString(matriz));

	}

}

