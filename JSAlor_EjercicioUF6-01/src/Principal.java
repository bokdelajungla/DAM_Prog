
public class Principal {

	public static void main(String[] args) {
		Profesor prof1 = new Profesor("12345678X", "Carlos Gonzalez", "C/Mariposa 3", "912345678", "Geograf�a e Historia");
		Alumno alum1 = new Alumno("87654321V", "Rub�n Pulido", "C/Escarabajo 33", "9154678321", "4� ESO");
		Administrativo admin1 = new Administrativo("13572468F", "Rom�n Pedestre", "C/Gorri�n 7", "9156124398", "hacer matriculas, limpiar el ba�o, dar de comer al perro");
		
		//M�todo toString():
		System.out.println(prof1.toString());
		System.out.println(alum1.toString());
		System.out.println(admin1.toString());
		
		//M�todo trabajar():
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
