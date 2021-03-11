
public class Alumno extends Persona{
	
	//Campos
	private String curso;

	//Constructor
	public Alumno (String nif, String nombre, String direccion, String telefono, String curso) {
		this.setNif(nif);
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setTelefono(telefono);
		this.setCurso(curso);
	}
	
	//Métodos
	public String hacerExamen() {
		return ("El alumno " +this.getNombre()+ " va a hacer su examen");
	}
	@Override
	public String trabajar() {
		return ("El alumno "+ this.getNombre() +" va a estudiar para el curso " + this.getCurso());
	}
	
	public String toString() {
		return "Alumno [nif=" + getNif() + ", nombre=" + getNombre() + ", direccion=" + getDireccion() + 
				", telefono=" + getTelefono() + ", curso=" + getCurso() + "]";
	}

	//Setters & Getters
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}


}
