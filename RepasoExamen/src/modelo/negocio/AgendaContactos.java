package modelo.negocio;

import modelo.beans.*;
import java.util.ArrayList;
import java.util.Collection;

public class AgendaContactos implements IntAgendaContactos{

	private ArrayList<Contacto> listin;
	
	public AgendaContactos () {
		super();
		listin = new ArrayList<Contacto>();
	}

	@Override
	public boolean addContacto(Contacto contacto) {
		if(!listin.contains(contacto)) {
			return listin.add(contacto);
		}
		else {
			return false;
		}
	}

	@Override
	public Contacto borrarContacto(int posicionRelativa) {
		if(posicionRelativa >= listin.size()) {
			return null;
		}
		else {
			return listin.remove(posicionRelativa);
		}
	}

	@Override
	public boolean borrarContacto(Contacto contacto) {
		return listin.remove(contacto);
	}

	@Override
	public void vaciarAgenda() {
		listin.clear();
	}

	@Override
	public void ordenarAgenda() {
		//Ordenar ArrayList:
		//Llamar al método sort() de Collection
		//Necesitamos que la clase que es contenida implemente Comparable
		Collection.sort(listin);
		
	}

	@Override
	public void mostrarFoto(Contacto contacto) {
		//Primero buscamos si está el contacto en el listin
		int i = listin.indexOf(contacto);
		if (i!=-1) {
			listin.get(i).mostrarFoto();
			System.out.println();
		}
		else {
			System.out.println("No hay Foto que valga");
		}
	}

	@Override
	public void listarContactos() {
		for(Contacto contacto: listin) {
			System.out.println(contacto);
		}
	}

	@Override
	public boolean exportarAgenda(String nombreFichero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean importarAgenda(String nombreFichero) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
