
import modelo.negocio.*;
import modelo.beans.*;

public class TestAgendaContacto {
	
	public static void main(String[] args) {
		AgendaContactos miAgenda = new AgendaContactos();
		miAgenda.addContacto(new CPersonal("tomas", "1234567890", "0987654321"));
		miAgenda.addContacto(new CPersonal("ana", "1234567890", "0987654321"));
		miAgenda.addContacto(new CPersonal("isabel", "1234567890", "0987654321"));
		miAgenda.addContacto(new CPersonal("raul", "1234567890", "0987654321"));
		miAgenda.addContacto(new CProfesional("raul", "1234567890", "0987654321", "culo@mali.to"));
		miAgenda.addContacto(new CProfesional("raul", "1234567890", "0987654321", "culo@mali.to"));
		miAgenda.addContacto(new CProfesional("raul", "1234567890", "0987654321", "culo@mali.to"));
	}
	
	

}
