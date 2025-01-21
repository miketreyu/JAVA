package esamen2;
import java.util.*;

public class funcionesUtiles {
	
	// Función para convertir String a int.
	public static int stringToInt(String s) {
	    return Integer.parseInt(s);
	}
	// Función para convertir int a String.
	public static String intToString(int n) {
	    return Integer.toString(n);
	}

	// Función para encontrar la posición de un carácter en un String.
	public static int posicionCaracter(String cadena, char c) {
	    return cadena.indexOf(c);
	}
	// Métodos básicos
	public static int max(int a, int b) {
	    return (a > b) ? a : b;
	}

	public static int min(int a, int b) {
	    return (a < b) ? a : b;
	}

	public static double calcularPotencia(double base, double exponente) {
	    return Math.pow(base, exponente);
	}

	public static double calcularRaizCuadrada(double valor) {
	    return Math.sqrt(valor);
	}
	// Métodos void básicos
	public static void imprimirArray(int[] array) {
	    for (int elemento : array) {
	        System.out.print(elemento + " ");
	    }
	    System.out.println();
	}

	public static void mostrarMatriz(int[][] matriz) {
	    for (int[] fila : matriz) {
	        for (int elemento : fila) {
	            System.out.printf("%5d", elemento);
	        }
	        System.out.println();
	    }
	}
	// Métodos recursivos para matrices
	public static int sumarDiagonalPrincipal(int[][] matriz, int n) {
	    if (n == 0) {
	        return matriz[0][0];
	    }
	    return matriz[n][n] + sumarDiagonalPrincipal(matriz, n - 1);
	}

	public static void multiplicarFilaPorEscalar(int[][] matriz, int fila, int escalar, int col) {
	    if (col < 0) {
	        return;
	    }
	    matriz[fila][col] *= escalar;
	    multiplicarFilaPorEscalar(matriz, fila, escalar, col - 1);
	}
	// Métodos no recursivos para matrices
	public static int[][] transponerMatriz(int[][] matriz) {
	    int filas = matriz.length;
	    int columnas = matriz[0].length;
	    int[][] transpuesta = new int[columnas][filas];

	    for (int i = 0; i < filas; i++) {
	        for (int j = 0; j < columnas; j++) {
	            transpuesta[j][i] = matriz[i][j];
	        }
	    }
	    return transpuesta;
	}

	public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
	    int filas = matriz1.length;
	    int columnas = matriz1[0].length;
	    int[][] suma = new int[filas][columnas];

	    for (int i = 0; i < filas; i++) {
	        for (int j = 0; j < columnas; j++) {
	            suma[i][j] = matriz1[i][j] + matriz2[i][j];
	        }
	    }
	    return suma;
	}

	public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
	    int filas1 = matriz1.length;
	    int columnas1 = matriz1[0].length;
	    int columnas2 = matriz2[0].length;
	    int[][] producto = new int[filas1][columnas2];

	    for (int i = 0; i < filas1; i++) {
	        for (int j = 0; j < columnas2; j++) {
	            for (int k = 0; k < columnas1; k++) {
	                producto[i][j] += matriz1[i][k] * matriz2[k][j];
	            }
	        }
	    }
	    return producto;
	}

	// Métodos usando librerías
	public static String matrizComoCadena(int[][] matriz) {
	    return Arrays.deepToString(matriz);
	}

	public static int[] procesarMatrizComoStream(int[][] matriz) {
	    return Arrays.stream(matriz).flatMapToInt(Arrays::stream).toArray();
	}

	// Métodos void específicos
	public static void rellenarMatrizAleatorios(int[][] matriz, int max) {
	    Random random = new Random();
	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	            matriz[i][j] = random.nextInt(max + 1);
	        }
	    }
	}

	public static void mostrarMatrizFormato(int[][] matriz) {
	    for (int[] fila : matriz) {
	        for (int elemento : fila) {
	            System.out.printf("| %4d ", elemento);
	        }
	        System.out.println("|");
	    }
	}



}
