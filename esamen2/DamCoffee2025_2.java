package examenSegundaEv2;
import java.util.*;

public class DamCoffee2025 {
	static Scanner leer = new Scanner(System.in);
	static double totalRecaudado = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Inicializamos la matriz 
		
		String[ ][ ] bebidas = { 

				{"Capuccino","Capuccino descafeinado","Capuccino extra canela"}, 

				{"Café solo", "Café solo descafeinado", "Café arábiga"}, 

				{"Café moca", "Café moca descafeinado", "Café moca especial"}, 

				{"Café con leche","Café con leche descafeinado","Leche manchada"},

				{"Té negro","Té verde con limón","Té Chai con leche"},

				{"Chocolate","Chocolate con leche","Chocolate light"}

				};
		int compra = 4;
		int[][] cantidadBebidas = new int[bebidas.length][bebidas[0].length];
		double[][] preciosBebidas = new double[bebidas.length][bebidas[0].length];
		// Aqui llamamos las funciones
		inicializarPrecios(preciosBebidas, 0.75, 0.55);
		inicializarCantidad(cantidadBebidas, compra);
		mostrarMenu(bebidas, preciosBebidas, cantidadBebidas);
		}
	

	
	public static void inicializarPrecios(double[][] preciosBebidas, double precioPar, double precioImpar) {
	    for (int i = 0; i < preciosBebidas.length; i++) {
	        for (int j = 0; j < preciosBebidas[i].length; j++) {
	            if (j % 2 == 0) {
	                preciosBebidas[i][j] = precioPar;
	            } else {
	                preciosBebidas[i][j] = precioImpar;
	            }
	        }
	    }
	}
	public static void inicializarCantidad(int[][] cantidadBebidas, int cantidadInicial) {
	    for (int i = 0; i < cantidadBebidas.length; i++) {
	        for (int j = 0; j < cantidadBebidas[i].length; j++) {
	            cantidadBebidas[i][j] = cantidadInicial;
	        }
	    }
	}
	// Hacemos una funcion que nos muestre las bebidas que hay
	public static void mostrarBebidas(String[ ][ ] bebidas, double[][] preciosBebidas, int[][] cantidadBebidas) {
		// Hacemos un printf para formatear las bebidas
		System.out.printf("%10s%10s%10s\n", "Código", "Cantidad", "Precio");
		System.out.println(" ______________________________");
		for (int i = 0; i < bebidas.length; i++) {

			for (int j = 0; j < bebidas[i].length; j++) {

				System.out.printf("%10s %10s %35s \n", i +" "+ j, cantidadBebidas[i][j], preciosBebidas[i][j]+"€--->"+bebidas[i][j]);
			}

		}

	}
	// Aqui estoy haciendo un menu para poder elegir la accion que quiere tomar
	
	public static void mostrarMenu(String[ ][ ] bebidas, double[][] preciosBebidas, int[][] cantidadBebidas) {
		boolean salir = false;
		while (!salir) {
			System.out.println("\n*********************************************************");
			System.out.println("Bienvenid@ a DAWM Coffee 2025. Selecciona una opción:");
			System.out.println("M. Mostrar bebidas");
			System.out.println("P. Pedir bebida");
			System.out.println("R. Reponer bebida");
			System.out.println("S. Salir");
			System.out.println("*********************************************************");
			String opcion = leer.next().toUpperCase();

			switch (opcion) {
			case "M":
				mostrarBebidas(bebidas, preciosBebidas, cantidadBebidas);
				break;
			case "R":
				//pedirBebidas(bebidas, cantidadBebidas, preciosBebidas);
				break;
			case "D":
				//reponerBebidas(bebidas, cantidadBebidas, preciosBebidas);
				break;
			case "S":
				salir=true;
				System.out.println("Se han recaudado "+ totalRecaudado+"€");
				//contarRecaudacion();
				break;
				default:
					System.out.println("La opción introducida no es correcta");
					break;
			}
		}
	}
	/*
	 public static void cancelarReserva(boolean[][] sala,double[][] precio) {
		
		System.out.println("Introduce la clave: ");
		String pass=leer.next();
		if(pass.equals("Polis1DAWM")){
		int[] asiento = pedirPosicionAsiento(sala.length, sala[0].length);
		if (asiento != null) {
			int fila = asiento[0];
			int col = asiento[1];
			if (sala[fila][col] == true) {
				sala[fila][col] = false;
				
				System.out.println("Reserva cancelada: -"+precio[fila][col]+"€");
			} else {
				System.out.println("Ese asiento no está reservado");
			}
		} 
	
	public static void comprarBebida(boolean[][] sala, double[][] precio) {

		int[] asiento = pedirPosicionAsiento(sala.length, sala[0].length);
		if (asiento != null) {
			int fila = asiento[0];
			int col = asiento[1];
			if (sala[fila][col] == false) {
				sala[fila][col] = true;
				totalReservados+=precio[fila][col];
				System.out.println("Reserva realizada por "+precio[fila][col]+" €");

			} else {
				System.out.println("El asiento ya está ocupado");
			}
		}
		
		*/
}
	


