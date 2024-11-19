package HolaMundo;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= new int[20];
		int numero2=20;
		int i;
		for(i = 0; i < array.length; i++) {
		    array[i] = numero2; 
		    numero2--;
		    System.out.println(array[i]);
		}
		
		
		
		System.out.println("ejercicio 3");
		int array2[]= new int[20];
		int array3[]=new int[30];
		for(int j=0; j<array2.length;j++)
		{
			array3[j]=array2[j];
		}
		for(int k=0; k<array3.length;k++) {
			System.out.println(array3[k]);
		}
		/*int contador=0;
		int array1[]=new int[100];
		for(int p=20; p<array3.length;p++) {
			array3[p]=array1
			}
		*/			
					
					
		

}
}
