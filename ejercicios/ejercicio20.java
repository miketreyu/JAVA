package ejercicios;

public class ejercicio20 {
    public static void main(String[] args) {
        // HACER UN PROGRAMA QUE MUESTRE POR PANTALLA LOS MULTIPLOS DE 8 
        // HASTA LLEGAR A 500
        int suma = 0;
        int consta = 8;

        while(suma <= 500) {
            System.out.println(suma + " - ");
            suma += consta;
        }
    }
}
