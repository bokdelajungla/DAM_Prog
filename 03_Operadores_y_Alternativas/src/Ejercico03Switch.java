import java.util.Scanner;

public class Ejercico03Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String figura = "";
		//figura = sc.next();
		
		switch(sc.next()) {
		case "rectangulo":
			System.out.println("rectangulo");
			break;
		case "triangulo":
			System.out.println("triangulo");
			break;
		case "circulo":
			System.out.println("circulo");
			break;
		default:
			System.out.println("Opción Errónea");
			break;
				
		}
		
		sc.close();
	}
}
