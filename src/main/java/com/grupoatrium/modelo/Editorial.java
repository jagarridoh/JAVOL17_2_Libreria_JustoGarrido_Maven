package com.grupoatrium.modelo;

public class Editorial {
	private String nombre;
	private Direccion direccion;
	private String nif;
	
	public Editorial() {
		super();
	}

	public Editorial(String nombre, Direccion direccion, String nif) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	public String toString() {
		return "Editorial [nombre=" + nombre + ", direccion=" + direccion + ", nif=" + nif + ", getClass()="
				+ getClass() + "]";
	}

	public void iniciarMetodo() {
		System.out.println("iniciarMetodo: " + this.toString());
	}
	
	public void destruirMetodo() {
		System.out.println("destruirMetodo: " + this.toString());
	}
	
	
	
}
