package modelo.negocio;

import java.util.ArrayList;
import java.util.Collections;

import modelo.beans.Contacto;

public class AgendaContactos implements IntAgendaContactos{
	
	private ArrayList<Contacto> listin;
	
	public AgendaContactos() {
		super();
		listin = new ArrayList<Contacto>();
	}

	public ArrayList<Contacto> getListin() {
		return listin;
	}

	public void setListin(ArrayList<Contacto> listin) {
		this.listin = listin;
	}

	
	@Override
	public boolean addContacto(Contacto contacto) {
 		if (!listin.contains(contacto))
			return listin.add(contacto);
 		else
 			return false;
  		
	}

	@Override
	public Contacto borrarContacto(int posRelativa) {
		if (posRelativa >= listin.size())
			return null;
		else
			return listin.remove(posRelativa);
	}

	@Override
	public boolean borrarContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		return listin.remove(contacto);
	}

	@Override
	public void vaciarAgenda() {
		listin.clear();
		
	}

	@Override
	public void ordenarAgenda() {
		Collections.sort(listin);
		
	}

	@Override
	public void mostrarFoto(Contacto contacto) {
		 int i = listin.indexOf(contacto);
		 if (i != -1)
			 listin.get(i).mostrarFoto();
		 else
			 System.out.println("contacto no existe, No hay foto que valga");
		
	}

	@Override
	public void listarContactos() {
		for (Contacto contacto: listin)
			System.out.println(contacto);
		
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
