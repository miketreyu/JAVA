package ejercicios2;
import java.util.Scanner;

public class ejercicio22 {

    // Método para solicitar un número al usuario
    public static int solicitarNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        return sc.nextInt();  // Solo llamamos a nextInt() una vez
    }

    // Método para voltear un número
    public static int voltea(int numero) {
        int invertido = 0;
        int restante;

        while (numero != 0) {
            restante = numero % 10;           // Obtener el último dígito
            invertido = invertido * 10 + restante;  // Agregarlo a la nueva variable invertida
            numero = numero / 10;              // Eliminar el último dígito del número original
        }

        return invertido;  // Retornar el número invertido
    }

    // Método para verificar si un número es capicúa
    public static boolean esCapicua(int numero) {
        int invertido = voltea(numero);
        return numero == invertido;  // Devuelve true si es capicúa
    }

    // Método para obtener el siguiente número primo
    public static int siguientePrimo(int numero) {
        int siguiente = numero + 1;  // Comenzamos con el siguiente número
        while (!esPrimo(siguiente)) { // Continuamos hasta encontrar el siguiente primo
            siguiente++;
        }
        return siguiente;
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;  // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {  // Mejoramos la eficiencia
            if (numero % i == 0) {
                return false;  // Si es divisible por algún número, no es primo
            }
        }
        return true;  // Si no se encuentra divisor, el número es primo
    }

    // Método para pintar por pantalla un mensaje
    public static void pintarPorPantalla(String mensaje) {
        System.out.println(mensaje);
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        // Solicitar un número
        int numero = solicitarNumero();

        // Verificar si el número es capicúa
        if (esCapicua(numero)) {
            pintarPorPantalla("El número " + numero + " es capicúa.");
        } else {
            pintarPorPantalla("El número " + numero + " no es capicúa.");
        }

        // Verificar si el número es primo
        if (esPrimo(numero)) {
            pintarPorPantalla("El número " + numero + " es primo.");
        } else {
            pintarPorPantalla("El número " + numero + " no es primo.");
        }

        // Encontrar el siguiente primo
        int siguientePrimoNumero = siguientePrimo(numero);
        pintarPorPantalla("El siguiente número primo después de " + numero + " es " + siguientePrimoNumero + ".");
    }
}

	
	/*public static int solicitarNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		sc.nextInt();
		return sc.nextInt();
	}
	
	public static boolean esCapicua(int numero) {
		int original = numero;
		int invertido = 0;
		int restante = 0;
		boolean capicua = false;
		while(numero!=0) {
		       
		    restante=numero%10;
	        invertido=invertido*10+restante;
	        numero=numero/10;
			
			}
		if (invertido == original) {
			capicua = true;
		} else {
			
		}
		return true;
	}
	
	public static boolean esCapicua1(int numero) {
		int original = numero;
		int invertido = 0;
		int restante = 0;
		boolean capicua = false;
		while(numero!=0) {
		       
		    restante=numero%10;
	        invertido=invertido*10+restante;
	        numero=numero/10;
			
			}
		if (invertido == original) {
			return true;
		} else {
		
		}
	
		return true;
	}
	
	public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;  
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true; 
    }
	
	public static String pintarPorPantalla(String pintar) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	

