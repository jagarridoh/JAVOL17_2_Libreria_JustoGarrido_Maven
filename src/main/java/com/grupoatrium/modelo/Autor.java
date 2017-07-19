package com.grupoatrium.modelo;

public class Autor {
	private String nombre;
	private String nacionalidad;
	private String comentarios;
	
	public Autor() {
		super();
	}

	public Autor(String nombre, String nacionalidad, String comentarios) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.comentarios = comentarios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", comentarios=" + comentarios
				+ ", getClass()=" + getClass() + "]";
	}
	
	public void iniciarMetodo() {
		System.out.println("iniciarMetodo: " + this.toString());
	}
	
	public void destruirMetodo() {
		System.out.println("destruirMetodo: " + this.toString());
	}
	
	
}
