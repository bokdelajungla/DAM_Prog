
public abstract class Persona {
	
	//Campos
	private String nif;
	private String nombre;
	private String direccion;
	private String telefono;
	
	//Métodos
	public String llamar(Persona p) {
		return (this.getNombre() +" llamando a "+ p.getNombre());
	}
	
	public abstract String trabajar();
	
	@Override
	public String toString() {
		return "Persona [nif=" + getNif() + ", nombre=" + getNombre() + ", direccion=" + getDireccion() + 
				", telefono=" + getTelefono()	+ "]";
	}
	
	//Setters & Getters
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


}
