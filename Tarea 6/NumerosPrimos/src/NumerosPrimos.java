import java.util.Scanner;

public class NumerosPrimos {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {	
		
		//DECLARAMOS VARIABLES.
		int salidaprograma;
		
		do
		{
			//RECOGEMOS DATOS DE USUARIO.
			System.out.println("Por favor, introduzca el número para realizar la comprobación (0 para salir del programa):");
			int esmultiplo = teclado.nextInt();
			salidaprograma = esmultiplo;
		
			if(esmultiplo%3 == 0 && esmultiplo%5 == 0) {
				System.out.println("El número introducido, " + esmultiplo + " ,és múltiplo de 3 y de 5.");
			}else {
				if(esmultiplo%3 == 0) {
					System.out.println("El número introducido, " + esmultiplo + " ,és múltiplo de 3.");
				}else {
					if(esmultiplo%5 == 0) {
						System.out.println("El número introducido, " + esmultiplo + " ,és múltiplo de 5.");
					}else{
						System.out.println("El número introducido no es múltiplo ni de 3 ni de 5.");
					}
				}
			}	
		}while(salidaprograma!=0);
		
		System.out.println("Gracias por jugar a nuestro juego!");
			

	}

}
