package edu.ucjc.programacion.ejercicios;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		System.out.println("1.Validar email\n2.Pintar cuadrado\n3.Motrar datos\n4.Salir");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Opción: ");
		int opcion = sc.nextInt();  
		
		switch(opcion) {
		case 1:
			System.out.println("Has seleccionado opc 1\n1.Validar email\n2.Pintar cuadrado\n3.Motrar datos\n4.Salir");
			break;
		case 2:
			pintaCuadrado(4);break;
		case 3:
			System.out.println("Has seleccionado opc 3\n1.Validar email\n2.Pintar cuadrado\n3.Motrar datos\n4.Salir");
			break;
		case 4:
			System.out.println("Has seleccionado opc 4\n1.Validar email\n2.Pintar cuadrado\n3.Motrar datos\n4.Salir");
			break;
		default:
			System.out.println("Opción invalida\n1.Validar email\n2.Pintar cuadrado\n3.Motrar datos\n4.Salir");
		}
		

	}
	
	public static void pintaCuadrado(int size) {
		//Linea 1
		for(int i=0;i<size;i++) {
			System.out.print("X");
		}
		
		//Linea 2-3
		for(int x=0;x<2;x++) {
			System.out.print("\n");
			for(int i=0;i<size;i++) {
				if(i==0 || i==size-1) {
					System.out.print("X");
				}else {
					System.out.print(" ");
				}
			}
		}
		
		//Linea 4
		System.out.print("\n");
		for(int i=0;i<size;i++) {
			System.out.print("X");
		}
	}

}
