import java.util.Scanner;

public class Temperaturas {
	private static Scanner teclado;

	public static void main(String[] args) {

		int temperatura = 0;
		teclado = new Scanner(System.in);
		
		System.out.println("Introduzca la temperatura de su poblaci�n:");
		temperatura = teclado.nextInt();
		
		if(temperatura <= 10) {
			System.out.println("El Clima de hoy en su poblaci�n es FRIO.");
		}else {
			if(temperatura > 10 && temperatura <= 20) {
				System.out.println("El Clima de hoy en su poblaci�n es TEMPLADO.");
			}else {
				if(temperatura > 20 && temperatura <= 30) {
					System.out.println("El Clima de hoy en su poblaci�n es CALOR.");
				}else {
					System.out.println("El Clima de hoy en su poblaci�n es TROPICAL.");
				}
			}
		}
		
		
	}

}
