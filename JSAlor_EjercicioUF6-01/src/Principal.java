
public class Principal {

	public static void main(String[] args) {
		Profesor prof1 = new Profesor("12345678X", "Carlos Gonzalez", "C/Mariposa 3", "912345678", "Geografía e Historia");
		Alumno alum1 = new Alumno("87654321V", "Rubén Pulido", "C/Escarabajo 33", "9154678321", "4º ESO");
		Administrativo admin1 = new Administrativo("13572468F", "Román Pedestre", "C/Gorrión 7", "9156124398", "hacer matriculas, limpiar el baño, dar de comer al perro");
		
		//Método toString():
		System.out.println(prof1.toString());
		System.out.println(alum1.toString());
		System.out.println(admin1.toString());
		
		//Método trabajar():
		System.out.println(prof1.trabajar());
		System.out.println(alum1.trabajar());
		System.out.println(admin1.trabajar());
		
		//Alumno llama a Profesor:
		System.out.println(alum1.llamar(prof1));
		
		//Profesor.ponerNotas():
		System.out.println(prof1.ponerNotas());
		
		//Alumno.haceExamen():
		System.out.println(alum1.hacerExamen());
		
		//Administrativo.gestionarMatricula():
		System.out.println(admin1.gestionarMatricula());
		
	}

}
