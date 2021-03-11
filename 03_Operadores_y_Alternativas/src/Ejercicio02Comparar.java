import java.util.Scanner;

public class Ejercicio02Comparar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2;
		
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		if (numero1 < numero2) {
			System.out.println("El primer número es menor");
		}else {
			if(numero1 == numero2) {
				System.out.println("Los números son iguales");
			}else {
				System.out.println("El primer número es mayor");
			}
		}
		System.out.println("numero1 = " + numero1);
		System.out.println("numero2 = " + numero2);
		sc.close();
	}

}
