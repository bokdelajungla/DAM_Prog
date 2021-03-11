
public class Administrativo extends Persona{
	
	//Campos
	private String tareas;
	
	//Constructor
	public Administrativo (String nif, String nombre, String direccion, String telefono, String tareas) {
		this.setNif(nif);
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setTelefono(telefono);
		this.setTareas(tareas);;
	}
	
	//Métodos	
	public String gestionarMatricula() {
		return ("El administrativo " + getNombre()+ " va a gestionar una matrícula");
	}
	
	@Override
	public String trabajar() {
		return ("El administrativo " + getNombre()+ " va a realizar estas tareas: " + getTareas());
	}
	
	@Override
	public String toString() {
		return "Administrativo [nif=" + getNif() + ", nombre=" + getNombre() + ", direccion=" + getDireccion() + 
		", telefono=" + getTelefono() + ", tareas=" + getTareas() + "]";
	}

	//Set & Get
	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	

	
	
}
