import java.util.Scanner;

public class Principal {

	public static void main(String args[]) {

		Scanner lector = new Scanner(System.in);
		System.out.println
		("Vamos a crear una cuenta y realizar el primer ingreso de 100 euros");
		CuentaBancaria miCuenta = new CuentaBancaria
				(38143, "Amelia González");
		miCuenta.agregarMovimiento("Ingreso inicial", 100);
		System.out.println("Cuánto dinero deseas retirar: ");
		
		//Bloque try catch para tratar las excepciones:
		try {
			int dinero;
			dinero = Integer.parseInt(lector.nextLine());
			lector.close();
			if ((miCuenta.getSaldo()-dinero)<0) {
				throw new NumerosRojosException("No dispone de suficiente saldo. Saldo Actual: "+
												miCuenta.getSaldo());
			}
			else {
				miCuenta.agregarMovimiento("Retirada de fondos", -dinero);
				System.out.println(miCuenta);
				System.out.println(miCuenta.listarMovimientos());
			}
		}
		catch(NumberFormatException e){
			System.out.println("Cantidad introducida no válida: "+ e.getMessage());
		}
		catch(NumerosRojosException e) {
			System.out.println("Fallo al intentar retirar dinero: " + e.getMessage());
		}
	}
}
