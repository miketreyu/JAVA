package ejerciciosEntregaLaura;
import java.util.*;

public class ejercicioMatrices1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = new int [5][];
		matriz [0] = new int [1];
		matriz [1] = new int [2];
		matriz [2] = new int [3];
		matriz [3] = new int [4];
		matriz [4] = new int [5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduce un numero: ");
				int numero = sc.nextInt();
				matriz[i][j] = numero; 
				
			}
		}
		System.out.println(Arrays.deepToString(matriz));
	}

}
