package modelo.beans;

public class CPersonal extends Contacto{
	
	private String telefCasa;
	
	public CPersonal() {
		super();
	}

	public CPersonal(String nombre, String telefono, String telefCasa) {
		super(nombre, telefono);
		this.telefCasa = telefCasa;
	}

	public String getTelefCasa() {
		return telefCasa;
	}

	public void setTelefCasa(String telefCasa) {
		this.telefCasa = telefCasa;
	}

	@Override
	public String toString() {
		return "CPersonal [nombre=" + nombre + ", telefono=" + telefono + ", telefCasa=" + telefCasa + "]";
	}

	@Override
	public void mostrarFoto() {
		System.out.println("Soy un contacto personal mira que foto tan chula : " + nombre);
		
	}
	
	

}
