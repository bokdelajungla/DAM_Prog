
public class Ejercicio1 {

	public static void main(String[] args) {
		//Declara variable num1
		int num1;
		//Math.random genera un número aleatorio entre 0 y 1 (excluido)
		double aleatorio = Math.random(); //0.00 - 0.99
		System.out.println(aleatorio);
		//Para conseguir un número del 1 al 20, operamos
		//Multiplicamos por 20 (0-19.99), le sumamos 1 (1-20.99) y truncamos la parte decimal 
		//haciendo un cast a entero
		num1 = (int) (aleatorio*20+1);
		System.out.println(num1);
		
		//Declaramos num2
		int num2;
		//Evaluamos la condición
		if (num1 >=5 && num1<=15) {
			//Si num1 está entre 5 y 15 (incluidos)
			num2 = num1+15;
		}
		else {
			//En caso contrario
			num2 = num1+5;
		}
		//Mostramos por pantalla el valor de ambas variables
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}

}
