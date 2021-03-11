import java.util.Arrays;

public class Ejercicio1ArrayUnid {

	public static void main(String[] args) {
		int [] numeros = {1,2,3,4,5,6,7,8,9,10};
		String [] nombres = {"Eva", "Carlos", "John", "Pedro"};
		
		String datos [] = new String [7];
		datos[0]="Curro";
		System.out.println(datos[0]);
		
		numeros[2] = 430;
		
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		
		//for iternado sobre el indice:
		for (int i=0; i < numeros.length; i++) {
			System.out.println("fila -> " + i + "valor = " + numeros[i]);
		}
		System.out.println("-------");
		
		//for sin indice:
		for (int elemento:numeros) {
			System.out.println(elemento);
		}
		System.out.println("-------");
		
		for (String elemento:nombres) {
			System.out.println(elemento);
		}
		System.out.println("-------");
		
		//Ordenación array
		Arrays.sort(nombres);
		for (String elemento:nombres) {
			System.out.println(elemento);
		}
		System.out.println("-------");
		
		//Buscar elemento en Array:
		String nombre = "John";
		int i=0;
		while (i < nombres.length && !nombres[i].equals(nombre)) {
			i++;
		}
		if (i >= nombres.length) {
			System.out.println("No se encuentra el nombre");
		}
		else {
			System.out.println("El nombre se encuentra en la posicion " + (i+1));
		}
	}

}
