package edu.ucjc.programacion.ejercicios;

import java.util.Scanner;

//Ctrl + Shift + O --> Importar librerias

public class Ej1 {

	public static void main(String[] args) {
		
		String mes = "Enero";
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un mes:");
		mes = scan.nextLine();
		
		switch(mes) {
		case "Diciembre":
		case "Enero":
		case "Febrero":
			System.out.println("Invierno");
			break;
		case "Marzo":
		case "Abril":
		case "Mayo":
			System.out.println("Primavera");
			break;
		case "Junio":
		case "Julio":
		case "Agosto":
			System.out.println("Verano");
			break;
		default:
			System.out.println("Otoño");
		}
		//equalsIgnoreCase()
		if(mes.equalsIgnoreCase("Diciembre") || mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Febrero")) {
			System.out.println("Invierno");
		}
		else if(mes.equalsIgnoreCase("Marzo") || mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo")){
			System.out.println("Primavera");
		}
		else if(mes.equalsIgnoreCase("Junio") || mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto")) {
			System.out.println("Verano");
		}else {
			System.out.println("Otoño");
		}
			
		}

	}
