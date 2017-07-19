package com.grupoatrium.modelo;

import java.util.List;

public class Libro {
	private String isbn;
	private String titulo;
	private List<Autor> autores;
	private Editorial editorial;
	private int publicacion;
	private double precio;
	private String descripcion;
	
	public Libro() {
		super();
	}
	
	public Libro(String isbn, String titulo, List<Autor> autores, Editorial editorial, int publicacion, double precio,
			String descripcion) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autores = autores;
		this.editorial = editorial;
		this.publicacion = publicacion;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public Editorial getEditorial() {
		return editorial;
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	public int getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(int publicacion) {
		this.publicacion = publicacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autores=" + autores + ", editorial=" + editorial
				+ ", publicacion=" + publicacion + ", precio=" + precio + ", descripcion=" + descripcion
				+ ", getClass()=" + getClass() + "]";
	}
	
	public void iniciarMetodo() {
		System.out.println("iniciarMetodo: " + this.toString());
	}
	
	public void destruirMetodo() {
		System.out.println("destruirMetodo: " + this.toString());
	}
	
}
