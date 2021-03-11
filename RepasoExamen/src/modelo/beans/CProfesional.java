package modelo.beans;

public class CProfesional extends Contacto{
	
	private static final long serialVersionUID = 1L;
	
	private String telOficina;
	private String email;

	public CProfesional() {
		super();
	}

	public CProfesional(String nombre, String telefono, String telOficina, String email) {
		super(nombre, telefono);
		this.telOficina = telOficina;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelOficina() {
		return telOficina;
	}

	public void setTelOficina(String telOficina) {
		this.telOficina = telOficina;
	}

	@Override
	public String toString() {
		return "CProfesional [getNombre()=" + getNombre() + ", getTelefono()=" + getTelefono() + ", telOficina="
				+ telOficina + ", email=" + email + "]";
	}

	public int compareTo(Contacto o) {
		// TODO Auto-generated method stub
		return nombre.compareTo(o.nombre);
	}
	

	
	
	
	

}
