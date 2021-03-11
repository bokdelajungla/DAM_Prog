package modelo.beans;

import java.io.Serializable;

public abstract class Contacto implements Serializable, Comparable<Contacto>{
	
	private static final long serialVersionUID = 1L;
	
	protected String nombre, telefono;
	
	public Contacto() {
		super();
	}

	public Contacto(String nombre, String telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	public abstract void mostrarFoto();

	@Override
	public int compareTo(Contacto o) {
		// TODO Auto-generated method stub
		return o.nombre.compareTo(this.nombre);
		
		 
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Contacto))
			return false;
		Contacto other = (Contacto) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
