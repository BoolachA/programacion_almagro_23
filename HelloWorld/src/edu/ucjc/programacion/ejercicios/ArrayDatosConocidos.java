package edu.ucjc.programacion.ejercicios;

public class ArrayDatosConocidos {

	public static void main(String[] args) {
		
		String [] colores = {"Rojo", "Azul", "Amarillo"};
		
//		for(int x = 0; x < colores.length; x++) {
//			System.out.println(colores[x]);
//		}
		
		for(String color:colores) {
			System.out.println(color);
		}

	}

}
