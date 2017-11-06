import java.util.Scanner;

public class CuotaColegio {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		int opcion1,opcion2;
		
		System.out.println("INDIQUE EL TIPO DE COLEGIO DEL QUE PROCEDE: ");
		System.out.println("Opcion 1: Nacional");
		System.out.println("Opcion 2: Particular");
		opcion1 = teclado.nextInt();
		while(opcion1 != 1 && opcion1 != 2) {
			System.out.println("INTRODUZCA UNA DE LAS DOS OPCIONES VÁLIDAS:");
			opcion1 = teclado.nextInt();
		}
		System.out.println("INDIQUE CUAL ES SU NIVEL SOCIOECONÓMICO:");
		System.out.println("Opcion 1: Nivel A");
		System.out.println("Opcion 2: Nivel B");
		System.out.println("Opcion 3: Nivel C");
		opcion2 = teclado.nextInt();
		while(opcion2 != 1 && opcion2 != 2 && opcion2 != 3) {
			System.out.println("INTRODUZCA UNA DE LAS TRES OPCIONES VÁLIDAS:");
			opcion2 = teclado.nextInt();
		}
		if(opcion1 == 1) {
			if(opcion2 == 1) {
				System.out.println("Usted procede de un colegio Nacional y su nivel socioeconómico es de tipo A.");
				System.out.println("Por tanto el valor de su matrícula será de 300 euros.");
			}else {
			if(opcion2 == 2) {
				System.out.println("Usted procede de un colegio Nacional y su nivel socioeconómico es de tipo B.");
				System.out.println("Por tanto el valor de su matrícula será de 200 euros.");
			}else {
				System.out.println("Usted procede de un colegio Nacional y su nivel socioeconómico es de tipo C.");
				System.out.println("Por tanto el valor de su matrícula será de 100 euros.");
				}
			}
			
		}else {
				if(opcion2 == 1) {
					System.out.println("Usted procede de un colegio Particular y su nivel socioeconómico es de tipo A.");
					System.out.println("Por tanto el valor de su matrícula será de 400 euros.");
				}else {
				if(opcion2 == 2) {
					System.out.println("Usted procede de un colegio Particular y su nivel socioeconómico es de tipo B.");
					System.out.println("Por tanto el valor de su matrícula será de 300 euros.");
				}else{
					System.out.println("Usted procede de un colegio Particular y su nivel socioeconómico es de tipo C.");
					System.out.println("Por tanto el valor de su matrícula será de 200 euros.");
				}
			}	
			
		}
		
		
		
		
		
		
		
	}
}
