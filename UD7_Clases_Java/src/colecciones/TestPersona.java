package colecciones;

import java.util.ArrayList;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("sara","varas",35);
		Persona p2 = new Persona("tomas","escudero",34);
		ArrayList<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona("tomas","escudero",34));
		lista.add(new Persona("sara","varas",35)); //Tiene el mismo valor que p1, pero no es p1
		lista.add(new Persona("john","karras",45));
		lista.add(p2);
		
		//Después de redefinir equals si eliminamos p1, elimina sara varas porque contiene lo mismo que p1
		lista.remove(p1);
		
		for(Persona ele: lista)
			System.out.println(ele);
		
		System.out.println(lista.contains(p1));//Aunque tenemos los mismos datos no son el mismo objeto, por tanto equals falla
		System.out.println(lista.contains(p2));//p2 lo hemos añadido y equals si apunta a la misma zona de memoria

		//Hay que redefinir el equals() de Persona
	}

}
