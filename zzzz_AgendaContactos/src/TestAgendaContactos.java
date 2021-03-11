import modelo.beans.CPersonal;
import modelo.beans.CProfesional;
import modelo.beans.Contacto;
import modelo.negocio.AgendaContactos;

public class TestAgendaContactos {

	public static void main(String[] args) {
		CPersonal con1 = new CPersonal("carlos", "677888777", "918888777");
		AgendaContactos miagenda = new AgendaContactos();
		miagenda.addContacto(new CPersonal("tomas", "677888999", "918888888"));
		miagenda.addContacto(new CPersonal("eva", "677555999", "918888555"));
		miagenda.addContacto(new CPersonal("carlos", "677888777", "918888777"));
		miagenda.addContacto(new CProfesional("pedro", "611111111", "937777777", "p@it.com"));
		miagenda.addContacto(new CProfesional("ana", "611111222", "937777222", "ana@it.com"));
		
		miagenda.addContacto(con1);
		miagenda.ordenarAgenda();
//		miagenda.borrarContacto(con1);
		miagenda.listarContactos();
		
		miagenda.mostrarFoto(con1);
		
		

	}

}
