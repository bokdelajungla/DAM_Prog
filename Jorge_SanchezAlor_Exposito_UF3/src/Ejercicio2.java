import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Creamos un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		//Variables
		int lado1, lado2, lado3;
		
		//Leemos los 3 datos
		System.out.println("PROGRAMA TRIÁNGULO:");
		System.out.println("Introduzca el valor del primer lado");
		lado1 = sc.nextInt();
		System.out.println("Introduzca el valor del segundo lado");
		lado2 = sc.nextInt();
		System.out.println("Introduzca el valor del tercer lado");
		lado3 = sc.nextInt();
		
		//Comprobamos la validez del triángulo
		if ((lado1+lado2>lado3)&&(lado2+lado3>lado1)&&(lado3+lado1>lado2)){
			//¿Es Equilatero?
			if ((lado1==lado2)&&(lado1==lado3)){
				System.out.println("El triángulo es EQUILATERO");
			}
			else {
				//¿Si no es Equilatero, es Escaleno?
				if ((lado1!=lado2)&&(lado1!=lado3)&&(lado2!=lado3)){
					System.out.println("El triángulo es ESCALENO");
				}
				else {
					//Si no es ni Equilatero, ni Escaleno -> es Isósceles
					System.out.println("El triángulo es ISÓSCELES");
				}
			}
		}
		//Si no se cumple la condición de validez
		else {
			System.out.println("Triángulo no válido. Inténtelo de nuevo");
		}
		
		//Cerramos el objeto de la clase Scanner
		sc.close();
	}

}
