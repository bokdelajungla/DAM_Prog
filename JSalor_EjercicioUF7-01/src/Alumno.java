import java.util.ArrayList;

public class Alumno {
	
	//Campos
	private String nombre;
	private int matricula;
	private ArrayList<Calificacion> calificaciones;

	//Constructor
	public Alumno(String nombre, int matricula) {
		// Asignar a las propiedades nombre y matricula
		// los valores de los parámetros.
		this.nombre = nombre;
		this.matricula = matricula;
		// Construir objeto ArrayList calificaciones.
		this.calificaciones = new ArrayList<Calificacion>();
	}

	// Añadir métodos get para las tres propiedades
	// que serán de solo lectura.
	public String getNombre() {
		return this.nombre;
	}
	public int getMatricula() {
		return this.matricula;
	}
	public ArrayList<Calificacion> getCalificaciones(){
		return this.calificaciones;
	}

	public void calificar(String asignatura, int nota) {
		// Añadir la nueva calificación
	    // a la colección de calificaciones.
		//Comprobamos que el valor está dentro del rango 0-100
		if(nota<0 || nota>100) {
			System.out.println("ERROR: Las notas deben ser un valor entero entre 0 y 100");
		}
		else {
			calificaciones.add(new Calificacion(asignatura, nota));
		}	
	}

	@Override
	public String toString() {
		// Devolver una cadena similar a la de este ejemplo:
		// “Alumno matricula: 31553 - Carmen Torres”
		return "Alumno matricula: " + this.getMatricula()+ " - " + this.getNombre();
	}
}
