import java.util.Scanner;

public class DiferenciaEdad {
	
	private static Scanner teclado;

	public static void main(String[] args) {
	//Creamos las variables necesarias
	int edad1,edad2,diferencia;
	
	teclado = new Scanner(System.in);
	//Recogemos los datos de los participantes
	System.out.println("Introduce la edad del primer Usuario:");
	edad1=teclado.nextInt();
	
	System.out.println("Introduce la edad del segundo Usuario:");
	edad2=teclado.nextInt();
	
	
	//Ahora realizamos la resta con comprobación para que no salga negativa.
	if(edad1>edad2) {
		diferencia= edad1-edad2;
	}else {
		diferencia= edad2-edad1;			
	}	
	System.out.println("La diferencia de edad son " + diferencia + " años");
	
	}	
}
