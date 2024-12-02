package HolaMundo;

public class funciones2 {
	// Función para verificar si un número es par
    public static boolean esPar(int num) {
        return num % 2 == 0;  // Devuelve true si el número es par, de lo contrario false
    }

    public static void main(String[] args) {
        boolean resultado = esPar(7);  // Llamamos a la función con 7
        System.out.println("¿Es 7 par? " + resultado);  // Muestra el resultado
    }

}
