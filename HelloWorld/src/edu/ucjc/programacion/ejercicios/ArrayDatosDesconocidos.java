package edu.ucjc.programacion.ejercicios;

import java.util.Scanner;

public class ArrayDatosDesconocidos {
	public static void main(String [] args) {
		int [][] numeros = new int[2][3];
		
		numeros[1][1] = 8;
		
		
		for(int x = 0; x < numeros.length;x++) {
			System.out.println("\n");
			for(int y = 0; y < numeros[1].length;y++) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Introduzca un numero posición ["+x+"]["+y+"]");
				numeros[x][y]= scan.nextInt(); 
			}
		}
		
		for(int x = 0; x < numeros.length;x++) {
			System.out.println("\n");
			for(int y = 0; y < numeros[1].length;y++) {
				System.out.print(numeros[x][y] + " ");
			}
		}
	}

}
