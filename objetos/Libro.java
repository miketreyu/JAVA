
package objetos;


public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    private static int totalLibros;
    private static int totalPrestados;

public Libro()
{
    
}
public Libro(String titulo, String autor,int ejemplares, int prestados)
{
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
        this.prestados=prestados;
        totalLibros+=ejemplares;
        totalPrestados+=prestados;
}
public String getTitulo()
{
    return this.titulo;
}
public String getAutor()
{
    return this.autor;
}
public int getEjemplares()
{
    return this.ejemplares;
}
public int getTotalLibros()
{
	return totalLibros;
}
public int getTotalPrestados()
{
	return totalPrestados;
}
public int getPrestados()
{
    return this.prestados;
}
public void setTitulo(String titulo)
{
    this.titulo=titulo;
}
public void setAutor(String autor)
{
    this.autor=autor;
}
public void setEjemplares(int ejemplares)
{
    this.ejemplares=ejemplares;
}
public void setPrestados(int prestados)
{
    this.prestados=prestados;
}
public boolean prestamo()
{
    boolean prestamoOk= false;
    if(this.prestados<this.ejemplares)
    {
    prestamoOk=true;
    this.prestados++;
    totalPrestados++;
    }
    return prestamoOk;
}
public boolean devolucion()
{
    if(this.prestados>0){
        this.prestados--;
        totalLibros--;
        return true;
    }
    else 
        return false;
}
public void mostrarLibro() {
    System.out.println("El titulo es " + this.titulo);
    System.out.println("El autor es " + this.autor);
    System.out.println("El numero de ejemplares es " + this.ejemplares);
    System.out.println("El numero de prestados es " + this.prestados);
    System.out.println("Porcentaje prestados " + this.prestados*100/totalPrestados+"%");
    System.out.println("Porcentaje de libros " + this.ejemplares*100/totalLibros+"%");

}
@Override
public String toString() {
	return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados=" + prestados
			+ "]";
}

}
