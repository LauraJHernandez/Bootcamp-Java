package com.protalento.practica_adicional_semana3;

public class Alumno {

	private String nombre;
	private String apellido;
	private float nota;
	
	public Alumno(String nombre, String apellido, float nota) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
	}	
	
	public String obtenerDatos() {
		return nombre + " " + apellido;
	}
	
	public float obtenerNota() {
		return nota;
	}
}
