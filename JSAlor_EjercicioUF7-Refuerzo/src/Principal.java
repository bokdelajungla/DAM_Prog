import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		String menu = "MÁQUINA DE BEBIDAS \n" +
					"-----------------------------\n" +
					" 1. Coca-Cola ------- 1.30 € \n" +
					" 2. Fanta Naranja --- 1.20 € \n" +
					" 3. Fanta Limón ----- 1.20 € \n" +
					" 4. Agua ------------ 1.00 € \n" +
					" 5. Apagar máquina \n" +
					"-----------------------------\n" +
					"¿Qué opción elige? \n";
		
		ArrayList<Bebida> ventas = new ArrayList<Bebida>();
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		while(opcion!=5) {
			System.out.println(menu);
			opcion = sc.nextInt();			
			addBebida(opcion, ventas);
		}
		
		sc.close();
		System.out.println("SERVICIO DE VENTAS");
		for (int i=0;i<ventas.size();i++) {
			System.out.println(ventas.get(i).toString());
		}
	}
	
	public static void addBebida(int opcion, ArrayList<Bebida> ventas) {
		
		Bebida b;
		switch (opcion) {
		case 1:
			b = new Bebida("Coca-Cola", 1.30F);
			ventas.add(b);
			System.out.println("Su "+b.getBebida()+", gracias");
			break;
		case 2:
			b = new Bebida("Fanta Naranja", 1.20F);
			ventas.add(b);
			System.out.println("Su "+b.getBebida()+", gracias");
			break;
		case 3:
			b = new Bebida("Fanta Limón", 1.20F);
			ventas.add(b);
			System.out.println("Su "+b.getBebida()+", gracias");
			break;
		case 4:
			b = new Bebida("Agua", 1.00F);
			ventas.add(b);
			System.out.println("Su "+b.getBebida()+", gracias");
			break;
		case 5:
			System.out.println("HASTA PRONTO");
			break;
		default:
			System.out.println("OPCION INCORRECTA");
			break;
			
		}		
		System.out.println();	
	}

}
