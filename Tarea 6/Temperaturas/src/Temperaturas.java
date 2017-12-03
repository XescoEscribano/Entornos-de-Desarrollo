import java.util.Scanner;

public class Temperaturas {
	private static Scanner teclado;

	public static void main(String[] args) {

		int temperatura = 0;
		teclado = new Scanner(System.in);
		
		System.out.println("Introduzca la temperatura de su población:");
		temperatura = teclado.nextInt();
		
		if(temperatura <= 10) {
			System.out.println("El Clima de hoy en su población es FRIO.");
		}else {
			if(temperatura > 10 && temperatura <= 20) {
				System.out.println("El Clima de hoy en su población es TEMPLADO.");
			}else {
				if(temperatura > 20 && temperatura <= 30) {
					System.out.println("El Clima de hoy en su población es CALOR.");
				}else {
					System.out.println("El Clima de hoy en su población es TROPICAL.");
				}
			}
		}
		
		
	}

}
