package ejercicios2;

import java.util.Arrays;

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HACER MATRIZ Y DECIR CUAL ES LA LONGITUD DEL MAS LARGO, CUAL ES, E IMPRIMIR EL MAS LARGO
		int[][] mat = new int[5][];
		mat[0] = new int[]{43, 1};
	    mat[1] = new int[]{67, 3, 1, 8, 6, 8};
	    mat[2] = new int[]{2, 7, 9, 2, 1};
	    mat[3] = new int[]{1, 6, 8};
	    mat[4] = new int[]{4, 7};
	    int maxLen = 0;
	    int index = -1;
	    
	    for (int i = 0; i < mat.length; i++) {                                            
	         if(mat.length>maxLen) {
	        	 maxLen = mat[i].length;
	        	 index = i;
	         }
	    }
	    System.out.println("la fila mas larga es la fila " + (index+1)+ " y tiene una longitud de " + maxLen);
	    System.out.println(Arrays.toString(mat[index]));
	}

}
