import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int importe, pago;
		
		System.out.println("Introduzca el importe de la Compra (múltiplo de 5)");
		importe = sc.nextInt();
		//Redondeamos al importe inferior más próximo múltiplo de 5
		importe = (importe / 5) * 5;
		System.out.println("El Importe es: " + importe);
		System.out.println("Introduzca la cantidad Pagada");
		pago = sc.nextInt();
		//Redondeamos al importe inferior más próximo múltiplo de 5
		pago = (pago / 5) * 5;
		System.out.println("El Pago es: " + pago);
		
		//Si el pago es mayos que el importe
		if (importe <= pago) {
			//Calculamos el sobrante
			int resto = pago-importe;
			//Definimos las variables que almacenan la cantidad de billetes
			int billetes50=0, billetes20=0, billetes10=0, billetes5=0;
			
			//Mientras el Resto sea mayor que 5 (mínimo importe billete)
			while(resto>=5) {
				//Si el resto es mayor de 50
				if (resto>=50) {
					//Calculamos el número de billetes de 50
					billetes50 = resto/50;
					//Actualizamos el valor del sobrante
					resto %= 50;
				}
				//Aquí el resto siempre es menor que 50
				//Si el resto es mayor de 20
				if (resto>=20) {
					//Calculamos el número de billetes de 20
					billetes20 = resto/20;
					//Actualizamos el valor del sobrante
					resto %= 20;
				}
				//Aquí el resto siempre es menor que 20
				//Si el resto es mayor de 10
				if (resto>=10) {
					//Calculamos el número de billetes de 10
					billetes10 = resto/10;
					//Actualizamos el valor del sobrante
					resto %= 10;
				}
				//Aquí el resto siempre es menor que 10
				//Si el resto es mayor de 5
				if (resto>=5) {
					//Calculamos el número de billetes de 5
					billetes5 = resto/5;
					//Actualizamos el valor del sobrante
					resto %= 5;
				}
				
			}
			System.out.println("Tengo que devolverte:");
			System.out.println(billetes50 + " billetes de 50");
			System.out.println(billetes20 + " billetes de 20");
			System.out.println(billetes10 + " billetes de 10");
			System.out.println(billetes5 + " billetes de 5");
		}
		else {
			System.out.println("No dispone de suficiente dinero para efectuar la compra");
		}
		//LLegamos al final y cerramos el Scanner
		sc.close();
	}
}
