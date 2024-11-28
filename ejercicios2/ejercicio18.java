package ejercicios2;
import java.util.*;

public class ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matriz = new int [3][3];
		Scanner sc = new Scanner(System.in);
		int[][] traspuesta = new int[3][3];
		
		System.out.println("Indica las variables: ");
		for (int i=0; i<matriz.length;i++ ) {
			for (int j=0; j<matriz.length; j++) {
				matriz[i][j]= sc.nextInt();
				for (int k = 0; k < matriz[i].length; k++) 
				{ 
					traspuesta[j][i] = matriz[i][j]; 
				} 
			}
		} 
		/*for (int i = 0; i < matriz.length; i++) 
		{ 
			for (int j = 0; j < matriz[i].length; j++) 
			{ 
				traspuesta[j][i] = matriz[i][j]; 
			} 
		}
		*/
		System.out.println(Arrays.deepToString(matriz));
		System.out.println(Arrays.deepToString(traspuesta));
	}

}
