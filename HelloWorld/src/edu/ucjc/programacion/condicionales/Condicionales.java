package edu.ucjc.programacion.condicionales;

public class Condicionales {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 10;
		
		// && -> AND
		// || -> OR
		
		if(num1 > num2) {
			System.out.println("Numero 1 es mayor que numero 2" );
		}
		
		switch(num1) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.print("Nose bro");
		}

	}

}
