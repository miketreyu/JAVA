package HolaMundo;

public class funciones4 {

	 // Función para encontrar el número mayor en un array
    public static int encontrarMaximo(int[] numeros) {
        int max = numeros[0];  // Inicializa el primer número como el máximo
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];  // Actualiza el máximo si encontramos un número mayor
            }
        }
        return max;  // Devuelve el número mayor
    }

    public static void main(String[] args) {
        int[] numeros = {3, 5, 7, 2, 8};  // Lista de números
        int resultado = encontrarMaximo(numeros);  // Llamamos a la función
        System.out.println("El número mayor es: " + resultado);  // Muestra el resultado
    }

}
