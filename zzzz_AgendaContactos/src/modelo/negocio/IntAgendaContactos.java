package modelo.negocio;

import modelo.beans.Contacto;

public interface IntAgendaContactos {
	
	boolean addContacto(Contacto contacto);
	Contacto borrarContacto(int posRelativa);
	boolean borrarContacto(Contacto contacto);
	void vaciarAgenda();
	void ordenarAgenda();
	void mostrarFoto(Contacto contacto);
	void listarContactos();
	boolean exportarAgenda(String nombreFichero);
	boolean importarAgenda(String nombreFichero);
	
	

}
