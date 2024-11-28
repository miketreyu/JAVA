package ejercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class ejemplo19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matriz ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		Scanner sc = new Scanner(System.in);
		int i, j;
		int[][] invertida = new int [4][4];
		
		System.out.println("Indica las variables: ");
		for (i=0; i<matriz.length;i++) {
			for (j=0; j<matriz.length; j++) {
				invertida[i][j] = matriz[i][matriz[i].length - 1 - j];
			}
		}
		
		System.out.println(Arrays.deepToString(matriz));
		System.out.println(Arrays.deepToString(invertida));

	}

}

