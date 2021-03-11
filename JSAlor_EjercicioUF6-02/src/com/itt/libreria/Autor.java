package com.itt.libreria;

public class Autor {
	
	//Atributos de la clase
	private String nombre;
	private String biografia;
	
	//Constructor
	public Autor(String nombre, String biografia) {
		super();
		this.nombre = nombre;
		this.biografia = biografia;
	}

	//Métodos
	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", biografia=" + biografia + "]";
	}

	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
}
