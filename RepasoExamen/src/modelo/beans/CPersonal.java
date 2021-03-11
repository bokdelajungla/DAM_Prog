package modelo.beans;

public class CPersonal extends Contacto{
	
	private static final long serialVersionUID = 1L;

	private String telefonoCasa;

	public CPersonal() {
		super();
	}

	public CPersonal(String nobre, String telefono, String telefonoCasa) {
		super(nobre, telefono);
		this.telefonoCasa = telefonoCasa;
	}

	public String getTelefonoCasa() {
		return telefonoCasa;
	}

	public void setTelefonoCasa(String telefonoCasa) {
		this.telefonoCasa = telefonoCasa;
	}

	@Override
	public String toString() {
		return "CPersonal [getNombre()=" + getNombre() + ", getTelefono()=" + getTelefono() + ", telefonoCasa="
				+ telefonoCasa + "]";
	}

	public int compareTo(Contacto o) {
		// TODO Auto-generated method stub
		return nombre.compareTo(o.nombre);
	}

	
	
	
}
