
public class MetOpMat {

	public static void main(String[] args) {
		int a;
		a = sumar(12,34);
		System.out.println("Resultado de la suma: "+ a);
		
		escribirNombre("Tomasín");
	}

	public static int sumar(int op1, int op2) {
		
		return op1 + op2;
	}
	
	public static void escribirNombre(String nombre) {
		System.out.println("El nombre que ma has pasado es: " + nombre);
	}
}
