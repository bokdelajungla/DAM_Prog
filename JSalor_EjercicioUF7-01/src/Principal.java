
public class Principal {

	public static void main(String[] args) {
		
		//Creamos un Alumno y le añadimos 6 calificaciones:
		Alumno alumno = new Alumno("Carlos Largo", 123456);
		alumno.calificar("Matemáticas", 20);
		alumno.calificar("Lengua", 52);
		alumno.calificar("Historia", 65);
		alumno.calificar("Física", 16);
		alumno.calificar("Educación Física", 87);
		alumno.calificar("Biología y Geología", 59);
		alumno.calificar("Test", 200); //Prueba para el control de rango
		
		//Mostrar la info:
		System.out.println(alumno.toString());
		
		//Bucle para reccorrer la lista (Opción 1)
		int acumulador=0;
		for(int i=0;i<alumno.getCalificaciones().size();i++) {
			Calificacion c = alumno.getCalificaciones().get(i);
			System.out.println(c);
			acumulador += c.getNota();
		}
		int media = acumulador/alumno.getCalificaciones().size();
		System.out.println("NOTA MEDIA:" +media);
		
		System.out.println("==============================");
		
		//Bucle para recorrer la lista (Opción 2)
		acumulador=0;
		for(Calificacion c: alumno.getCalificaciones()) {
			System.out.println(c);
			acumulador += c.getNota();
		}
		media = acumulador/alumno.getCalificaciones().size();
		System.out.println("NOTA MEDIA:" +media);
	}

}
