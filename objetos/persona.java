package objetos;

public class persona {
	private String nombre;
	private int edad;
	private String NIF;
	private char sexo;
	private double altura;
	private double peso;
	private static final char SEXO_DEFECTO = 'H';
	
	public persona() {
		
	}
	public persona(String nombre, int edad, String NIF, char sexo, float altura) {
		this.nombre="";
		this.edad=0;
		this.NIF=NIF;
		this.sexo=SEXO_DEFECTO;
		this.altura=0.0;
		this.peso=0.0;
	}
    public persona(String nombre, int edad, char sexo, String NIF) {
        this.nombre = nombre;
        this.edad = edad;
        this.NIF = NIF;
        this.sexo = comprobarSexo(sexo);
        this.peso = 0.0;
        this.altura = 0.0;
    }
	public String getNombre() {
		return this.nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public String getNIF() {
		return this.NIF;
	}
	public char getSexo() {
		return this.sexo;
	}
	public double getAltura() {
		return this.altura;
	}
	public double getPeso() {
		return this.peso;
	}
	/*public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public void setNIF(String NIF) {
		this.NIF=NIF;
	}
	public void setSexo(char sexo) {
		this.sexo=sexo;
	}
	public void setAltura(double altura) {
		this.altura=altura;
	}
	public void setPeso(double peso) {
		this.peso=peso;
	}
	*/
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }
    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return SEXO_DEFECTO;
        }
    }
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nSexo: " + sexo + "\nPeso: " + peso + "\nAltura: " + altura + "\nNIF: " + NIF.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
