
public class Profesor extends Persona{
	
	//Campos
	private String competencias;
	
	//Contructor
	public Profesor (String nif, String nombre, String direccion, String telefono, String competencias) {
		this.setNif(nif);
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setTelefono(telefono);
		this.setCompetencias(competencias);
	}
	
	//Métodos
	public String ponerNotas() {
		return ("El profesor " + getNombre()+ " va a corregir los exámenes");
	}
	
	@Override
	public String trabajar() {
		return ("El profesor "+ getNombre() +" va a impartir su clase");
	}

	@Override
	public String toString() {
		return "Profesor [nif=" + getNif() + ", nombre=" + getNombre() + ", direccion=" + getDireccion() + 
				", telefono=" + getTelefono() + ", competencias=" + getCompetencias() + "]";
	}

	//Set & Get
	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}
	
	
	
	
	
	

}
