package envolventes;
import java.lang.*;

public class TestEnvolventes {
	
	static void main(String args[]) {
		
		String numero = "1234";
		int resultado = 0;
		
		try {
			resultado = Integer.parseInt(numero);
			System.out.println(resultado);		
		}
		catch(NumberFormatException e){
			System.out.println("No es un número");
		}
		
		Double sueldo = 12345.67;
		String real = "12345.67";
		
		sueldo = Double.valueOf(real);
		System.out.println(sueldo);
		sueldo = 321.90;
		System.out.println(sueldo);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		
	}

}
