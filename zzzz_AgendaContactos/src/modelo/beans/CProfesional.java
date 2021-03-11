package modelo.beans;

public class CProfesional extends Contacto{
	
	private String telefOficina, email;
	
	public CProfesional() {
		super();
	}

	public CProfesional(String nombre, String telefono, String telefOficina, String email) {
		super(nombre, telefono);
		this.telefOficina = telefOficina;
		this.email = email;
	}

	public String getTelefOficina() {
		return telefOficina;
	}

	public void setTelefOficina(String telefOficina) {
		this.telefOficina = telefOficina;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "CProfesional [nombre=" + nombre + ", telefono=" + telefono + ", telefOficina=" + telefOficina
				+ ", email=" + email + "]";
	}

	@Override
	public void mostrarFoto() {
		System.out.println("Soy un contacto profesional mira que foto tan maja : " + nombre);
		
	}
	
	

}
