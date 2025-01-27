package objetos;

public class NIF {
    private int numero;
    private char letra;

    public NIF() {
        this.numero = 0;
        this.letra = ' ';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return numero + "-" + letra;
    }
}