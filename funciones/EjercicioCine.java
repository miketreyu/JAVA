package funciones;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioCine {

	static Scanner leer = new Scanner(System.in);
	static double totalReservados = 0;

	public static void main(String[] args) {
		boolean[][] sala = { { false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false },
				{ true, false, false, false, true, true, false, false, false },
				{ false, false, false, false, false, false, true, true, false },
				{ false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false } };

		double[][] preciosAsientos = new double[sala.length][sala[0].length];
		inicializarPrecios(preciosAsientos, 9, 12.5);

		mostrarMenu(sala, preciosAsientos);
	}

	public static void inicializarPrecios(double[][] preciosAsientos, double precioMin, double precioMax) {
		//En este método se debe cargar el precio de los asientos en función de su ubicación
	}

	public static void mostrarMenu(boolean[][] sala, double[][] precioAsientos) {
		//Se muestra el menú y en función de la opción elegida 
		//se llama a las funciones que realizan la acción
		
	}

	private static void contarAsientos(boolean[][] sala) {
		int contLibres=0;
		int contOcupados=0;
		
		System.out.println("Hay un total de "+contOcupados+" asientos ocupados y "+contLibres+" asientos libres");
	}

	/*
	 * La función pedirPosicionAsiento() se encarga de solicitar al usuario el
	 * código del asiento y devuelve la fila y columna a las que corresponde ese
	 * código. Si el código introducido no es válido se devolverá un valor nulo
	 * (null)
	 */
	public static int[] pedirPosicionAsiento(int totFilas, int totCols) {
		int[] asiento = null; // array en el que guardaremos la fila y columna a la que corresponde el código
								// del asiento introducido. Lo inicializamos a null para detectar cuándo el
								// código no es válido
		System.out.println("Introduce el código del asiento");
		String codigo = leer.next();
		if (codigo.length() != 3) {// como el código debe tener 3 caracteres, vamos a comprobar el tamaño del
									// código introducido
			System.out.println("El código introducido no es válido");
		} else if (!Character.isDigit(codigo.charAt(1)) || !Character.isDigit(codigo.charAt(2)))// comprobamos que cada
																								// uno de los caracteres
																								// (posición 1 y 2, la
																								// posición 0 es la
																								// letra C)
																								// es un número y si no
																								// mostramos error
		{
			System.out.println("Dato con formato incorrecto");
		} else {// si todo va bien, ya indicamos el tamaño del array y le damos valores
			asiento = new int[2];
			asiento[0] = Integer.parseInt(Character.toString(codigo.charAt(1)));
			asiento[1] = Integer.parseInt(Character.toString(codigo.charAt(2)));

			if (asiento[0] > totFilas || asiento[1] > totCols) {// si la fila/columna introducidas son mayores que el
																// número de filas/columnas, devolvemos error
				System.out.println("Posicion no existente en la maquina");
				asiento = null;
			}

		}

		return asiento;
	}

	public static void cancelarReserva(boolean[][] sala,double[][] precio) {
		
		//Se pedirá al usuario la contraseña, si es correcta se le pedirá la posición del asiento para liberarlo
	}

//El método reservarAsiento se encarga de llamar al método pedirPosicionAsiento, si éste le devuelve el array con la posición, la marcaremos como ocupada
	public static void reservarAsiento(boolean[][] sala, double[][] precio) {

		
	}

	/*
	 * El método mostrarAsientos() recibe el array con los estados de los asientos y
	 * el precio de cada uno de ellos, para mostrar el código, estado y precio de
	 * cada asiento
	 */
	public static void mostrarAsientos(boolean[][] sala, double[][] precioAsientos) {
		

	}

	/*
	 * El método devolverEstado() recibe el estado del asiento (true/false) y
	 * devuelve la cadena Ocupado o Libre
	 */
	public static String devolverEstado(boolean estado) {
		String cadenaEstado="";
		//tenéis que rellenar
		return cadenaEstado;
	}

}
