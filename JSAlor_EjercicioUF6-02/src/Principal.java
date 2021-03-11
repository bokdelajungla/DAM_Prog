import com.itt.libreria.*;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos el Autor y el Libro
		Autor autor1 = new Autor("Hermenegildo Ramírez", "Nació en 1880... el turrón más caro del mundo");
		Libro libro1 = new Libro("El alcornoque solitario", "Novela Romántica", autor1);

		//Método toString() de Libro
		System.out.println(libro1.toString());	
		/* El toString() se podría omitir, ya que se println lo llama 
		 * automáticamente si el objeto pasado no es de tipo String.
		 * Es decir: System.out.println(libro1);
		 */
		
		//Modificar biografía de Autor desde libro
		libro1.getAutor().setBiografia("No hay nada destacable sobre este autor");
		
		//toString() de Autor de dos formas
		//1-Desde la referencia al objeto libro1
		System.out.println(libro1.getAutor().toString());
		//2-Desde la referencia al objeto autor1
		System.out.println(autor1.toString());

		//Mofificar la propiedad genero
		libro1.setGenero("Novela Infumable");
		System.out.println(libro1);
	}
}
