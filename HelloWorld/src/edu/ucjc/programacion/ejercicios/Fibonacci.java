package edu.ucjc.programacion.ejercicios;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int limite = 0;
		int a = 1, b = 1, c = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		limite= scan.nextInt();  
		
		for(int x=1; x<limite+1; x++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
		

	}

}
