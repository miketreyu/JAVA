package HolaMundo;

public class funciones {

	 // Función para sumar dos números
    public static int sumar(int num1, int num2) {
        return num1 + num2;  // Devuelve la suma de num1 y num2
    }

    public static void main(String[] args) {
        int resultado = sumar(5, 3);  // Llamamos a la función
        System.out.println("La suma es: " + resultado);  // Muestra el resultado
    }

}
