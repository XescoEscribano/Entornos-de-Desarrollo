import java.util.Scanner;

public class EstacionesA�o {
	private static Scanner teclado;

	public static void main(String[] args) {
		int estacion = 0;
		
			System.out.println("Introduzca un n�mero entre del 1 al 4 para ense�arle su estaci�n del A�o:");
			teclado = new Scanner(System.in);
			estacion = teclado.nextInt();
		
		switch(estacion) {
		case 1:
			System.out.println("Su estaci�n del a�o es VERANO");
			break;
		case 2:
			System.out.println("Su estaci�n del a�o es OTO�O");
			break;
		case 3:
			System.out.println("Su estaci�n del a�o es INVIERNO");
			break;
		case 4:
			System.out.println("Su estaci�n del a�o es PRIMAVERA");
			break;
		default:
			System.out.println("No existe estaci�n del a�o para el n�mero marcado.");
			break;
		
		}
		
	}

}
