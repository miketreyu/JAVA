package HolaMundo;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// STRINGS CON BOOLEANS
		
		String frase = "Mi frase";
		// char letras[]= {'M','i','g','e','l'}
		String nombre1 = "Miguel";
		String nombre2 = "miguel";
		boolean iguales;
		iguales = nombre1.equalsIgnoreCase(nombre2);
		if (iguales)
		{
			System.out.println("son iguales");
		}
		else {
			System.out.println("no son iguales");
		}
	}
}
