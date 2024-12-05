package ejercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][] matriz = new int [5][5];
		for(int i=0; i<5;i++) {
			for(int j=0; j<5; j++) {
				matriz[i][j] = +1;
			}
			System.out.println(Arrays.deepToString(matriz));
		}

	}

}
