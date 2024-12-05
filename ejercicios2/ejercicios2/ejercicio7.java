package ejercicios2;

import java.util.Arrays;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=1;
		int [][] matriz = new int [10][10];
		for(int i=0; i<10;i++) {
			for(int j=0; j<10; j++) {
				matriz[i][j] = cont*(j+1);
			}
			cont++;
		}
		System.out.println(Arrays.deepToString(matriz));

	}

}
