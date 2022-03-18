package com.protalento.practica_adicional_semana3;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	private ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(); 

	public static void main(String [] args) {      
		Scanner teclado = new Scanner(System.in);
		
		Main controlNotas = new Main();
		
		System.out.println("Ingresa la cantidad de alumnos:");
		int cantidadAlumnos = teclado.nextInt();
		
		for (int i = 0; i < cantidadAlumnos; i++) {                    
			System.out.println("Ingresa nombre del alumno:");
			String nombre = teclado.next();
			
			System.out.println("Ingresa apellido del alumno:");
			String apellido = teclado.next();
			
			System.out.println("Ingresa nota del alumno:");
			float nota = teclado.nextFloat();
			
			Alumno alumno = new Alumno(nombre, apellido, nota);
			
			controlNotas.listaAlumnos.add(alumno);
			System.out.println();
		}
		
		teclado.close();
		
		ArrayList<Alumno> listaCalificacionAlta = new ArrayList<Alumno>(); 
		float calificacionAlta = 0;
		
		ArrayList<Alumno> listaCalificacionBaja = new ArrayList<Alumno>(); 
		float calificacionBaja = 0;
		
		for (int i = 0; i < cantidadAlumnos; i++) { 
			Alumno alumno = controlNotas.listaAlumnos.get(i);
			
			if (alumno.obtenerNota() >= calificacionAlta) {
				if (alumno.obtenerNota() != calificacionAlta) {
					listaCalificacionAlta.clear();
				}
				listaCalificacionAlta.add(alumno);
				calificacionAlta = (float) alumno.obtenerNota();
			}
			
			if (alumno.obtenerNota() <= calificacionBaja) {
				if (alumno.obtenerNota() != calificacionBaja) {
					listaCalificacionBaja.clear();
				}
				listaCalificacionBaja.add(alumno);
				calificacionBaja = (float) alumno.obtenerNota();
			}
		}
		
		System.out.println();	
		System.out.println("Alumnos con la calificacion mas alta:");
		
		for (int i = 0; i < listaCalificacionAlta.size(); i++) { 
			Alumno alumno = listaCalificacionAlta.get(i);
			System.out.println(alumno.obtenerDatos());
		}
		
		System.out.println();	
		System.out.println("Alumnos con la calificacion mas baja:");
		
		for (int i = 0; i < listaCalificacionBaja.size(); i++) { 
			Alumno alumno = listaCalificacionBaja.get(i);
			System.out.println(alumno.obtenerDatos());
		}
		
		System.out.println("Alumnos aprobados:");
		
		for (int i = 0; i < cantidadAlumnos; i++) { 
			Alumno alumno = controlNotas.listaAlumnos.get(i);
			
			if (alumno.obtenerNota() >= 7) {
				System.out.println(alumno.obtenerDatos());
			} 
		}
		
		System.out.println();
        System.out.println("Alumnos reprobados:");
		
		for (int i = 0; i < cantidadAlumnos; i++) { 
			Alumno alumno = controlNotas.listaAlumnos.get(i);
			
			if (alumno.obtenerNota() < 7) {
				System.out.println(alumno.obtenerDatos());
			}
		}	
	}
}
