import java.util.Scanner;

public class CuentaAPagar {
	private static Scanner teclado;
	
	public static void main(String[] args) {
		int totalcuenta,descuento,importe;
		
		System.out.println("Introduzca el importe de su cuenta para ver el desglose de la misma:");
		teclado = new Scanner(System.in);
		totalcuenta = teclado.nextInt();
		importe= totalcuenta*19/100;
		totalcuenta=importe+totalcuenta;
		
		if(totalcuenta <= 100){
			descuento = totalcuenta*10 / 100;
			totalcuenta = totalcuenta - descuento;
			System.out.println("Su cuenta se divide en lo siguiente:");
			System.out.println("Descuento: " + descuento);
			System.out.println("Impuesto: " + importe);
			System.out.println("Total de su cuenta: " + totalcuenta);
		}else {
			descuento = totalcuenta*20 / 100;
			totalcuenta = totalcuenta - descuento;
			System.out.println("Su cuenta se divide en lo siguiente:");
			System.out.println("Descuento: " + descuento);
			System.out.println("Impuesto: " + importe);
			System.out.println("Total de su cuenta: " + totalcuenta);
		}
		
		System.out.println("Gracias por visitar el Entornos Café...");
		
	}

}
