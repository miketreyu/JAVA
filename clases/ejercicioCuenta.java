package clases;
import java.util.*;
import objetos.*;

public class ejercicioCuenta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, numero;
		double tipo, importe;
		//se crea objeto cuenta1 sin parámetros
		//se ejecuta el constructor por defecto
		Cuenta cuenta1 = new Cuenta();
		System.out.print("Nombre : ");
		nombre = sc.nextLine();
		System.out.print("Número de cuenta : ");
		numero = sc.nextLine();
		System.out.print("Tipo de interes : ");
		tipo = sc.nextDouble();
		System.out.print("Saldo: ");
		importe = sc.nextDouble();
		cuenta1.setNombre(nombreCliente);
		cuenta1.setNumeroCuenta(numeroCuenta);
		cuenta1.setTipoInteres(tipo);
		cuenta1.setSaldo(importe);
		//se crea el objeto cuenta2 con los valores leidos por teclado
		//se ejecuta el constructor con parámetros
		Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
		//se crea cuenta3 como copia de cuenta1
		//se ejecuta el constructor copia
		Cuenta cuenta3 = new Cuenta(cuenta1);
		//mostrar los datos de cuenta1
		System.out.println("Datos de la cuenta 1");
		System.out.println("Nombre del titular: " + cuenta1.getNombre());
		System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
		System.out.println("Saldo: " + cuenta1.getSaldo());
		System.out.println();
		       
		//se realiza un ingreso en cuenta1
		cuenta1.ingreso(4000);
		       
		//mostrar el saldo de cuenta1 después del ingreso

}
