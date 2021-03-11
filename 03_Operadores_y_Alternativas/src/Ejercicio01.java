import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero1 = 212, numero2 = 12;
		double resultado = 0;
		
		System.out.println("Dame un número:");
		numero1 = sc.nextInt();
		System.out.println("Dame otro número:");
		numero2 = sc.nextInt();
		
		resultado = numero1 + numero2;
		System.out.println("La suma es: " + resultado);
		resultado = numero1 - numero2;
		System.out.println("La resta es: " + resultado);
		resultado = numero1 * numero2;
		System.out.println("La multiplicación es: " + resultado);
		resultado = numero1 / numero2;
		System.out.println("La deivisión es: " + resultado);

		sc.close();
		
	}

}
