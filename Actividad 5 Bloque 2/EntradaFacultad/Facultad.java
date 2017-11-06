import java.util.Scanner;

public class Facultad {
	
	private static Scanner teclado;
	

	public static void main(String[] args) {
		
		
		//CREAMOS LOS STRINGS DE LAS FACULTADES Y LOS ENTEROS PARA LAS NOTAS DE CORTE
		String sistemas = new String(" Sistemas ");
		String electronica = new String(" Electrónica ");
		String industrial = new String(" Industrial ");
		String admin = new String(" Administración.");
		int notafinal;
		
		teclado = new Scanner(System.in);
		//VAMOS A COGER LA NOTA DE CORTE DEL ALUMNO
		System.out.println("Introducza la nota final que ha obtenido:");
		notafinal = teclado.nextInt();
		//COMPROBAMOS SI NUMERO ES VALIDO
		if(notafinal >= 100 || notafinal >= 70 ) {
			if(notafinal >= 100) {
			System.out.println("Puedes cursar en las siguientes facultades:"+ sistemas + ","+ electronica+ ","+ industrial + "y"+ admin);
			}else {
				if(notafinal < 100 && notafinal >= 90) {
					System.out.println("Puedes cursar en las siguientes facultades:"+ electronica+ ","+ industrial + "y"+ admin);
				}else {
					if(notafinal < 90 && notafinal >= 80) {
						System.out.println("Puedes cursar en las siguientes facultades:"+ industrial + "y"+ admin);
					}else {
						if(notafinal < 80 && notafinal >=70) {
							System.out.println("Puedes cursar en las siguientes facultades:"+ admin);
						}
					}
				}
			}
				
		}else {
			System.out.println("La nota final introducida no es válida o no puedes cursar en ninguna de nuestras facultades. Lo sentimos mucho.");
		}
		
		
		

	}

}
