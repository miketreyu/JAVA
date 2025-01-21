package esamen2;

public class funcionesRecursivasUtiles {
	
	
	// Función recursiva para sumar elementos de un array.
	public static int sumarElementos(int[] array, int n) {
	    if (n == 0) {
	        return array[0];
	    }
	    return array[n] + sumarElementos(array, n - 1);
	}
	// Función para invertir una cadena de texto.
	public static String invertirCadena(String cadena) {
	    if (cadena.isEmpty()) {
	        return cadena;
	    }
	    return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
	}
}
