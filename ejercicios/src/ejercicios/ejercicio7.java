package ejercicios;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CALCULAR PERIMETRO DE UN TRIANGULO, 5, 12, 7
		//CALCULAR AREA, LONGITUD, VOLUMEN DE UN CIRCULO, RADIO 7
		//AREA DE UN RECTANGULO 9, 5
		
		float ladotri1, ladotri2, ladotri3, radiocir, baserect, altrect;
		ladotri1 = 5;
		ladotri2 = 12;
		ladotri3 = 7;
		radiocir = 7;
		baserect = 9;
		altrect = 5;
		
		final double Perimetrotriangulo, Areacirculo, Longitudcirculo, Volumenesfera, Arearectangulo, PI;
		Perimetrotriangulo = ladotri1 + ladotri2 + ladotri3;
		PI = 3.14;
		Areacirculo = PI * radiocir * radiocir; 
		Longitudcirculo = radiocir * 2;
		Volumenesfera = (4*PI*radiocir*radiocir*radiocir)/3;
		Arearectangulo = baserect * altrect;
		
		System.out.println("El perimetro del triangulo es " + Perimetrotriangulo);
		System.out.println("El area del circulo es " + Areacirculo);
		System.out.println("La longitud del circulo es " + Longitudcirculo);
		System.out.println("El volumen de la esfera es " + Volumenesfera);
		System.out.println("El area del rectangulo es " + Arearectangulo);

	}

}
