package HolaMundo;

public class funciones3 {
	// Función recursiva para calcular el factorial
    public static int factorial(int num) {
        if (num == 0) {  // Caso base: el factorial de 0 es 1
            return 1;
        } else {
            return num * factorial(num - 1);  // Llamada recursiva
        }
    }

    public static void main(String[] args) {
        int resultado = factorial(5);  // Llamamos a la función con 5
        System.out.println("El factorial de 5 es: " + resultado);  // Muestra el resultado
    }

}
