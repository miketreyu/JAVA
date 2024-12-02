package HolaMundo;

public class funciones5 {
	// Función que divide dos números y maneja excepciones
    public static double dividir(int num1, int num2) {
        try {
            return num1 / num2;  // Intenta realizar la división
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;  // Retorna 0 en caso de error
        }
    }

    public static void main(String[] args) {
        double resultado = dividir(10, 2);  // Llamada correcta
        System.out.println("Resultado: " + resultado);

        resultado = dividir(10, 0);  // Llamada con división por cero
        System.out.println("Resultado: " + resultado);
    }

}
