package ejercicios2;

public class ejercicio32 {
    
    public static void numeroRecursivo(int n) {
        
        if (n == 1) {
            System.out.println(n);
            return;  
        }

        // Imprimir el número n
        System.out.println(n);

        // Llamada recursiva con n-1
        numeroRecursivo(n - 1);
    }

    public static void main(String[] args) {
        // Llamar a la función con el número 5
        numeroRecursivo(5);
    }
}
