package com.itt.fiestas;
import java.time.LocalDateTime;

public class Fiesta {
	//Campos
	private String tipo;
	private LocalDateTime fechaHora;
	private String direccion;
	private int bebidas;
	private int bocadillos;
	private int invitados;
	private static final String [] listaTipos = {"cumpleaños", "infantil", "sorpresa", "despedida"};
	private static int contadorFiestas=0;
	
	/////////////////
	//Constructores//
	/////////////////
	public Fiesta(String tipo, LocalDateTime fechaHora, String direccion, int bebidas, int bocadillos) {
		super();
		this.tipo = tipo;
		this.fechaHora = fechaHora;
		this.direccion = direccion;
		this.bebidas = bebidas;
		this.bocadillos = bocadillos;
		this.invitados = 0;
		Fiesta.contadorFiestas++;
	}
	
	//Sin parámetros y rellena de forma aleatoria
	public Fiesta() {
		super();
		//Elegir tipo de forma aleatoria
		int idx = (int)(listaTipos.length*Math.random());
		this.tipo = listaTipos[idx];
		//Elegir una fecha de foma aleatoria
		this.fechaHora = LocalDateTime.now();
		this.fechaHora = this.fechaHora.plusHours((idx+1)*10);
		//Dirección sin especificar 
		this.direccion = "Sin Especificar";
		//Bebidas y Bocadillos de forma aleatoria
		this.bebidas = (idx+1)*(int)((Math.random()*100)+1);
		this.bocadillos = (idx+1)*(int)((Math.random()*100)+1);
		//Cero Invitados
		this.invitados = 0;
		Fiesta.contadorFiestas++;
	}

	////////////////////
	//Metodos de clase//
	////////////////////
	public String consulta() {
		return (this.tipo +" "+ this.fechaHora +" "+ this.direccion +" "+ this.bebidas +" "+ this.bocadillos +" "+ this.invitados);
	}
	
	public void invitar() {
		this.invitados++;
	}
	//Sobrecarga del método invitar() con número de invitados
	public void invitar(int numero) {
		this.invitados += numero;
	}
	
	
	public void cancelarInvitacion() {
		if (this.invitados > 0) {
			this.invitados--;
			System.out.println("Quedan "+ this.invitados + " en la fiesta");
		}
		else System.out.println("No quedan invitados en la fiesta");
	}
	
	public double precioFiesta() {
		return (5*this.invitados + 2*this.bebidas + 3*this.bocadillos);
	}

	/////////////////////
	//Getters & Setters//
	/////////////////////
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getBebidas() {
		return bebidas;
	}

	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	public int getBocadillos() {
		return bocadillos;
	}

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	public int getInvitados() {
		return invitados;
	}

	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}
	
	public static int getContadorFiestas() {
		return contadorFiestas;
	}
}
