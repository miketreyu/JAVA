package renos;

import java.util.Random;

public class Reno implements Runnable{
	private String nombre;
	private int distanciaTotal;
	private int distanciaRecorrida;
	private boolean meta;
	private static Reno ganador = null;
	
	
	public Reno(String nombre, int distanciaTotal){
		this.nombre = nombre;
		this.distanciaTotal = distanciaTotal;
		this.distanciaRecorrida = 0;
		this.meta = false;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		try {
			while(distanciaRecorrida<distanciaTotal) {
			int avance = random.nextInt(51) + 50;
			distanciaRecorrida = distanciaRecorrida + avance;
			System.out.println(nombre + " avanzó " + avance + " metros. Total avanzado: " + distanciaTotal);
			Thread.sleep(random.nextInt(301) + 200);
			}
			synchronized(Reno.class) {
				if (ganador == null) {
					ganador = this;
				}
			}
			meta = true;
			System.out.println(nombre + " ha llegado a la meta!");
		}
		catch(InterruptedException e){
			System.out.println("Oh no, " + nombre + " fue atrapado por la tormenta");
		}
		
		System.out.println(nombre + " empieza a correr");
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isMeta() {
		return meta;
	}

	public void setMeta(boolean meta) {
		this.meta = meta;
	}

	public static Reno getGanador() {
		return ganador;
	}

	public static void setGanador(Reno ganador) {
		Reno.ganador = ganador;
	}	

}
