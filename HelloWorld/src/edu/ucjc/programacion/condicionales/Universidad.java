package edu.ucjc.programacion.condicionales;

public class Universidad {

	public static void main(String[] args) {
		/*
		 * Pilares poo:
		 * Herencia --> Heredar caracteristicas
		 * Polimorfismo --> Mismo metodo, ejecución distinta
		 * Abstracción --> Centrarse en unos atributos
		 * Encapsulación --> Modificadores de acceso
		 * 		Public: Acceso total
		 * 		Protected: Mismo paquete o clases hijas
		 * 		Package (default): Solo visible en el mismo paquete
		 * 		Private: Solo se puede acceder desde el metodo en la que se crea. No se hereda
		 */
		Persona persona1 = new Persona();
		persona1.nombre = "Maria";
		
		Persona persona2 = new Persona();
		persona2.nombre = "Juan";	
		
		System.out.println(persona1.nombre);
		
		persona1=persona2;
		persona2 = null;
		System.out.println(persona1.nombre);
		persona1.correr();
	}

}
