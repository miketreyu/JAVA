package renos;

public class CarreraRenosNavidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reno rudolf = new Reno("Rudolf", 1000);
		Reno juan = new Reno("Juan", 1000);
		Reno morrisey = new Reno("Morrisey", 1000);
		Reno bandai = new Reno("Bandai", 1000);
		Reno lolo = new Reno("Lolo", 1000);
		Reno mel = new Reno("Mel", 1000);
		Reno a = new Reno("A", 1000);
		
		// Los almacenamos en un array
		
		Reno[] renos = {rudolf, juan, morrisey, bandai, lolo, mel, a};
		Thread[] hilos = new Thread [7];
		
		for (int i = 0; i < renos.length; i++) {
            hilos[i] = new Thread(renos[i]);
        }
        
        // 3. Iniciar carrera
        System.out.println("¡Comienza la carrera de renos!");
        for (Thread hilo : hilos) {
            hilo.start();
        }
        
        try {
            // 4. Esperar y desatar tormenta
            Thread.sleep(2000);
            System.out.println("\n❄️ ¡TORMENTA DE NIEVE! ❄️\n");
            hilos[1].interrupt(); // Interrumpir a Trueno
            hilos[3].interrupt(); // Interrumpir a Cometa
            
            // 5. Esperar a que todos terminen
            for (Thread hilo : hilos) {
                hilo.join();
            }
            
            // 6. Mostrar resultados
            System.out.println("\n=== RESULTADOS ===");
            
            System.out.println("\nRenos que llegaron a meta:");
            for (Reno reno : renos) {
                if (reno.isMeta()) {
                    System.out.println("- " + reno.getNombre());
                }
            }
            
            System.out.println("\nRenos interrumpidos por la tormenta:");
            for (Reno reno : renos) {
                if (!reno.isMeta()) {
                    System.out.println("- " + reno.getNombre());
                }
            }
            
            System.out.println("\nGanador:");
            Reno ganador = Reno.getGanador();
            if (ganador != null) {
                System.out.println("🏆 " + ganador.getNombre());
            } else {
                System.out.println("Carrera desierta");
            }
            
        } catch (InterruptedException e) {
            System.out.println("Error en la carrera");
        }

	}

}
