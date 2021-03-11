
public class Ejercicio2ArrayUnidVacio {

	public static void main (String[] args) {
		int [] numeros;
		numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*20 + 1);
		}
		
		for (int elemento: numeros) {
			System.out.println(elemento);
		}
	}
}
