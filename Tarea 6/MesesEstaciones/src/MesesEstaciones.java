import java.util.Scanner;

public class MesesEstaciones {
	private static Scanner teclado;

	public static void main(String[] args) {
		int meses = 0;
		
		System.out.println("Introduzca el mes del cual quiera saber su Estación:");
		teclado = new Scanner(System.in);
		meses = teclado.nextInt();
		
		switch(meses) {
			case 3:
			case 4:
			case 5:
				System.out.println("Su estación del año es PRIMAVERA");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("Su estación del año es VERANO");
				break;
			case 9:
			case 10:
				System.out.println("Su estación del año es OTOÑO");
				break;
			case 1:
			case 2:
			case 11:
			case 12:
				System.out.println("Su estación del año es INVIERNO");
				break;
			default:
				System.out.println("No existe el mes introducido...");
				break;
		}
	
	
	}

}
