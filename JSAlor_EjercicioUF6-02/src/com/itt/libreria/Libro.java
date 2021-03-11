package com.itt.libreria;

public class Libro {

	//Atributos de la clase
	private String titulo;
	private String genero;
	private Autor autor;
	
	//Constructor
	public Libro(String titulo, String genero, Autor autor) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.autor = autor;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", genero=" + genero + ", autor=" + autor.toString() + "]";
	}
	
	//Getters & Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}
