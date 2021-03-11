import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Creamos un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		//Variables
		int lado1, lado2, lado3;
		
		//Leemos los 3 datos
		System.out.println("PROGRAMA TRI�NGULO:");
		System.out.println("Introduzca el valor del primer lado");
		lado1 = sc.nextInt();
		System.out.println("Introduzca el valor del segundo lado");
		lado2 = sc.nextInt();
		System.out.println("Introduzca el valor del tercer lado");
		lado3 = sc.nextInt();
		
		//Comprobamos la validez del tri�ngulo
		if ((lado1+lado2>lado3)&&(lado2+lado3>lado1)&&(lado3+lado1>lado2)){
			//�Es Equilatero?
			if ((lado1==lado2)&&(lado1==lado3)){
				System.out.println("El tri�ngulo es EQUILATERO");
			}
			else {
				//�Si no es Equilatero, es Escaleno?
				if ((lado1!=lado2)&&(lado1!=lado3)&&(lado2!=lado3)){
					System.out.println("El tri�ngulo es ESCALENO");
				}
				else {
					//Si no es ni Equilatero, ni Escaleno -> es Is�sceles
					System.out.println("El tri�ngulo es IS�SCELES");
				}
			}
		}
		//Si no se cumple la condici�n de validez
		else {
			System.out.println("Tri�ngulo no v�lido. Int�ntelo de nuevo");
		}
		
		//Cerramos el objeto de la clase Scanner
		sc.close();
	}

}
