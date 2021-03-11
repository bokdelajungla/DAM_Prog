import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Creamos un Scanner para introducir texto por teclado
		Scanner sc = new Scanner(System.in);
		String entrada = "";
		StringBuilder texto = new StringBuilder();
		
		//Capturamos la entrada mientras sea distinta de "FIN"
		while(!(entrada.equals("FIN"))) {
			System.out.println("Intoduzca un texto: (FIN para terminar)");
			entrada = sc.nextLine();
			//Si se intoduce FIN
			if (entrada.equals("FIN")) {
				//No hacemos nada y en la siguiente iteración salimos del bucle while
			}
			//En cualquier otro caso
			else {
				//Mostramos la longitud
				System.out.println("Longitud: " + entrada.length());
				//Convertimos a Mayúsculas
				String mayusculas = entrada.toUpperCase();
				//Añadimos la cadena  y el ; al StringBuilder
				texto.append(mayusculas+';');
			}
        }
		//Se ha tecleado "FIN"
		//Creamos el StringTokenizer con la cadena procedente del StringBuilder
		//e indicamos el caracter de separación ";"
		StringTokenizer tokens = new StringTokenizer(texto.toString(), ";");
		//Utilizamos el método hasMoreTokens() para recorrer los elementos
		while(tokens.hasMoreTokens()){
			//Mostramos cada elemento por pantalla
			System.out.println(tokens.nextToken());
		}
		//Cerramos el Scanner
		sc.close();
	}
}
