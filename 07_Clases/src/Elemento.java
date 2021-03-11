
public class Elemento {
	
	private int entero;
	private double decimal;
	private String cadena;
	
	public Elemento (int entero, double decimal, String cadena){
		this.entero = entero;
		this.decimal = decimal;
		this.cadena = cadena;
	}
	
	public int getEntero() {
		return entero;
	}
	public void setEntero(int entero) {
		this.entero = entero;
	}
	public double getDecimal() {
		return decimal;
	}
	public void setDecimal(double decimal) {
		this.decimal = decimal;
	}
	public String getCadena() {
		return cadena;
	}
	public void setCadena(String cadena) {
		//this se refiere al elemento del la clase
		this.cadena = cadena;
	}

}
