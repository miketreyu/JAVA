package ejercicios2;

public class ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SABER CUAL ES EL NUMERO MAS GRANDE DE LA MATRIZ
		int[][] mat = {{1,2,2,4,5}, {6,7,7,9,10}, {21,22,25,4,2}, {1,2,3,4,3}, {16,17,2,19,20}};
		int maxNum = mat[0][0];
		int index = -1;
		
		for (int i = 0; i < mat.length; i++) {                                            
	         for (int j= 0; j < mat[i].length; j++) {
	        	 if(mat[i][j]>maxNum) {
		        	 maxNum = mat[i][j];
		        	 index = i;
		         }
	         }
	    }
		System.out.println("El numero mas mayor es " + maxNum + " del array: " + (index+1));
		
		
		
	}

}
