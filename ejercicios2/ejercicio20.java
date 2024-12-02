package ejercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matriz ={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int i, j, cont=0;
		int[][] sumadiago = new int [4][4];
		
		System.out.println("Indica las variables: ");
		for (i=0; i<matriz.length;i++) {
			sumadiago += matriz[i][i];
			sumadiago +=
		}
		
		System.out.println(Arrays.deepToString(matriz));
		System.out.println(Arrays.deepToString(sumadiago));


	}

}
