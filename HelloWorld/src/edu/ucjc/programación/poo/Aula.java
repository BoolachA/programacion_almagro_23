package edu.ucjc.programación.poo;

public class Aula {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Paco", "Perez", 8.9);
		alumno1.estudiar();
		
		Alumno alumno2 = new Alumno("Paco2", "Perez2");
		alumno2.estudiar();
		
		alumno2.setNombre("Juan");
		System.out.println(alumno2.getNombre());
		
		alumno2.estudiar();
		
		Asignatura asignatura1 = new Asignatura("Programación", 9.0);
		Asignatura asignatura2 = new Asignatura("Calculo", 5.0);
		
		Alumno alumno3 = new Alumno("Alumno3", "Apellido3", 6.7, asignatura1);
		
		
	}

}
