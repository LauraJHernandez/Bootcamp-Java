package com.protalento.practica_semanal_semana2;

import java.util.Scanner;

public class ValidarFecha {
	
	public static void main( String[] args ) {
		Scanner teclado = new Scanner(System.in);
		
	    String formatoFecha = "^\\d{2}/\\d{2}/\\d{4}$";
		
		System.out.print("Ingresa la fecha a validar (dd/mm/yyyy): ");
		String entrada = teclado.next();
		
		if (!entrada.matches(formatoFecha)) {                    
			System.out.println("Formato invalido");
			return;
		}
		
		String[] array = entrada.split("/");
		
		int dia = Integer.parseInt(array[0]);
		int mes = Integer.parseInt(array[1]);
		int año = Integer.parseInt(array[2]);
		
		if (!fechaValida(dia, mes, año)) {
			System.out.println("Fecha invalida");
			return;
		}
		
		System.out.println("Fecha valida");	
    }
	
	private static boolean fechaValida(int dia, int mes, int año) {
		if (!(año>=1900 && año<=2099)) {
			return false;
		}
		
		if (!(mes>=1 && mes<=12)) {
			return false;
		}
		
		if (mes==2 && !(dia>=1 && dia<=28)) {
			return false;
		}
		
		if (!(dia>=1 && dia<=30)) {
			return false;
		}
		
		return true;
	}
}
