import java.util.Scanner;

public class EstacionesAño {
	private static Scanner teclado;

	public static void main(String[] args) {
		int estacion = 0;
		
			System.out.println("Introduzca un número entre del 1 al 4 para enseñarle su estación del Año:");
			teclado = new Scanner(System.in);
			estacion = teclado.nextInt();
		
		switch(estacion) {
		case 1:
			System.out.println("Su estación del año es VERANO");
			break;
		case 2:
			System.out.println("Su estación del año es OTOÑO");
			break;
		case 3:
			System.out.println("Su estación del año es INVIERNO");
			break;
		case 4:
			System.out.println("Su estación del año es PRIMAVERA");
			break;
		default:
			System.out.println("No existe estación del año para el número marcado.");
			break;
		
		}
		
	}

}
