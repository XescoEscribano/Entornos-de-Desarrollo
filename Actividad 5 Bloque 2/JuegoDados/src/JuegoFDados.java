import java.util.Scanner;

public class JuegoFDados {
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int dado1,dado2,dado3,resjug = 0;
				
		System.out.println("Vamos a ver que medalla obtiene de su lanzamiento de dados:");
			dado1 = 1 + (int)(Math.random() * 6);
			dado2 = 1 + (int)(Math.random() * 6);
			dado3 = 1 + (int)(Math.random() * 6);
			System.out.println("LANZANDO DADOS.... MUCHA SUERTE!!!!");
			System.out.println("JUGADA:");
			System.out.println("DADO 1:" + dado1);
			System.out.println("DADO 2:" + dado2);
			System.out.println("DADO 3:" + dado3);
			if (dado1 == 6) {
				resjug++;
			}
			if (dado2 == 6) {
				resjug++;
			}
			if (dado3 == 6) {
				resjug++;
			}
			if(resjug == 3) {
				System.out.println("USTED HA OBTENIDO UNA MEDALLA DE ORO. ENHORABUENA!!!");
			}
			if(resjug == 2) {
				System.out.println("USTED HA OBTENIDO UNA MEDALLA DE PLATA. ENHORABUENA!!!");
			}
			if(resjug == 1) {
				System.out.println("USTED HA OBTENIDO UNA MEDALLA DE BRONCE. ENHORABUENA!!!");
			}
			if(resjug == 0) {
				System.out.println("OOOOOHHH... MALA SUERTE, INTENTELO DE NUEVO MAS ADELANTE");
			}
	}

}
