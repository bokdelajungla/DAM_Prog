package colecciones;

import java.util.ArrayList;

public class TestList {

	public static void main(String args[]) {
		ArrayList<String> lista = new ArrayList<String>();
		String nombre = "Andresa";
				
		lista.add("Tomás");
		lista.add("Andrés");
		lista.add("Eva");
		if (!lista.contains(nombre)){
			lista.add("Andresa");
		}
		
		for(String ele: lista) {
			System.out.println(ele);
		}
		
		System.out.println();
		
		
		
	}
	

}
