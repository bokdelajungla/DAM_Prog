package com.itt.fiestas;
import java.time.LocalDateTime;


public class Principal {

	public static void main(String[] args) {
		//Creamos los objetos de clase Fiesta:
		//1- Constructor aleatorio
		//(Comprobar el nñumero de fiestas creadas
		System.out.println("Hay " + Fiesta.getContadorFiestas()+ " fiestas");
		Fiesta fiesta1 = new Fiesta();
		Fiesta fiesta2 = new Fiesta();
		System.out.println("Hay " + Fiesta.getContadorFiestas()+ " fiestas");
		//2- Constructor con parámetros
		//Creamos un objeto de tipo LocalDateTime para guardar la fecha 
		LocalDateTime fecha = LocalDateTime.now().plusDays(3);
		Fiesta fiesta3 = new Fiesta("cumpleaños", fecha, "C/Algarrobo, 5", 30, 30);
		Fiesta fiesta4 = new Fiesta("disfraces", fecha, "C/Cedro, 17", 25, 50);
		System.out.println("Hay " + Fiesta.getContadorFiestas()+ " fiestas");
		
		/////////////
		//invitar()//
		/////////////
		//Llamamos al método invitar() de cada fiesta múltiples veces
		int contador = 0;
		for(contador=0;contador<10;contador++) {
			fiesta1.invitar();
		}
		contador=0;
		while(contador<20) {
			fiesta2.invitar();
			contador++;
		}
		fiesta3.invitar(17);
		fiesta4.invitar(1);

		
		//////////////
		//consulta()//
		//////////////
		System.out.println(fiesta1.consulta());
		System.out.println(fiesta2.consulta());
		System.out.println(fiesta3.consulta());
		System.out.println(fiesta4.consulta());
		
		////////////////////////
		//cancelarInvitacion()//
		////////////////////////
		fiesta1.cancelarInvitacion();
		fiesta2.cancelarInvitacion();
		fiesta3.cancelarInvitacion();
		
		fiesta4.cancelarInvitacion();
		fiesta4.cancelarInvitacion();
		
		//////////////////
		//precioFiesta()//
		//////////////////
		System.out.println(fiesta1.precioFiesta());
		System.out.println(fiesta2.precioFiesta());
		System.out.println(fiesta3.precioFiesta());
		System.out.println(fiesta4.precioFiesta());
		
	}

}
