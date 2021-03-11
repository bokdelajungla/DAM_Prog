import java.util.InputMismatchException;
import java.util.Scanner;

public class TestRunTimeException {

	public static void main(String args[]) {

		Scanner leer = new Scanner(System.in);

		String cadena = dameCadena();
		if (cadena != null) {
			System.out.println(cadena);
		} else {
			System.out.println("No me ha dado una cadena");
		}

		// Excepciones
		try {
			int numero = leer.nextInt();
			System.out.println("El número es: " + numero);
		} 
		catch (InputMismatchException e) {
			System.out.println("Introduzca un número GILIPOLLAS!");

		}
		finally {
			System.out.println("Esto se va a ejecutar de todas todas");
		}
		System.out.println("Éxito en el Try-Catch");
		leer.close();
	}

	public static String dameCadena() {
		return null;
	}
}
