package ejercicios2;
import java.util.*;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][] matriz = new int [3][5];
		for(int i=0; i<3;i++) {
			for(int j=0; j<5; j++) {
				System.out.println("Introduce un número");
				matriz[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<3;i++) {
			for(int j=0; j<5; j++) {
				System.out.println(matriz[i][j]);
			}
			}
		System.out.println(Arrays.deepToString(matriz));
		System.out.println("la longitud de la fila 0 es: "+matriz[0].length);
		int[][]matriz2 = new int[3][];
		matriz2[0] = new int[2];
		matriz2[1] = new int[4];
		matriz2[2] = new int[3];
		System.out.println("la longitud de la fila 0 es: "+matriz2[0].length);
		System.out.println("la longitud de la fila 1 es: "+matriz2[1].length);
		System.out.println("la longitud de la fila 2 es: "+matriz2[2].length);
	}

}
