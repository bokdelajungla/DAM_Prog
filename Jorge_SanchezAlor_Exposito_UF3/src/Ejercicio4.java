import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		//Variable de control de opcion
		int opcion = 0;
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("PROGRAMA OPERACIONES NUMEROS ALEATORIOS");
		
		//Bucle principal del programa
		while (opcion != 6) {
			//Presentamos el menú
			System.out.println("Seleccione el número de OPCIÓN:");
			System.out.println("1 - Sumar");
			System.out.println("2 - Restar");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Cociente de la división");
			System.out.println("5 - Resto de la división");
			System.out.println("6 - Terminar");
			//Leemos la opcion seleccionada
			opcion = sc.nextInt();
			
			
			
			//Si la opción es válida y no es Terminar
			if (opcion >=1 && opcion <=5) {
				//Generamos un par de números enteros aleatorios
				//Para generar números aleatorios podemos usar la clase Math como en el Ejercicio1
				//O también podemos usar la clase Random
				Random aleatorio = new Random();
				
				//Random.nextInt(valor) genera un entero entre 0 y valor-1
				int num1 = (aleatorio.nextInt(10)+1);
				int num2 = (aleatorio.nextInt(10)+1);
				System.out.println("Los número generados son: " + num1 + " y " + num2);
				
				switch (opcion) {
					case 1:
						System.out.println("Ha elegido Suma");
						System.out.println(metodoSuma(num1,num2));
						break;
					case 2:
						System.out.println("Ha elegido Resta");
						System.out.println(metodoResta(num1,num2));
						break;
					case 3:
						System.out.println("Ha elegido Multiplicacion");
						System.out.println(metodoMultiplicacion(num1,num2));
						break;
					case 4:
						System.out.println("Ha elegido Division");
						System.out.println(metodoDivision(num1,num2));
						break;
					case 5:
						System.out.println("Ha elegido Resto de la Division");
						System.out.println(metodoResto(num1,num2));
						break;				
				}
			}
			//Si la opcion es inválida o Terminar
			else {
				if (opcion == 6) {
					System.out.println("Ha elegido Terminar. FIN");
				}
				else {
					System.out.println("Opción incorrecta. Por favor elija de nuevo");
					opcion = 0;
				}
			}
		}
		//Si se escoge la opcion 6 salimos del bucle
		//Cerramos el Scanner
		sc.close();
		
	}
	
	public static int metodoSuma(int a, int b) {
		int suma = a + b;
		return suma;
	}
	public static int metodoResta(int a, int b) {
		int resta = a - b;
		return resta;
	}
	public static int metodoMultiplicacion(int a, int b) {
		int multiplicacion = a * b;
		return multiplicacion;
	}
	public static int metodoDivision(int a, int b) {
		int division = a / b;
		return division;
	}
	public static int metodoResto(int a, int b) {
		int resto = a % b;
		return resto;
	}

}
