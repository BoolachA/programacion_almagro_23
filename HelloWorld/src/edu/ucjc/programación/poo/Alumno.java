package edu.ucjc.programación.poo;

public class Alumno {
	
	//Variables de instancia
	private String nombre;
	private String apellidos;
	private double notaMedia;
	private Asignatura asignaturaAlumno;
	
	
	//Constructores
	public Alumno(String nombre, String apellidos, double notaMedia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaMedia = notaMedia;
	}
	
	public Alumno(String nombre, String apellidos, double notaMedia, Asignatura asignaturaAlumno) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaMedia = notaMedia;
		this.asignaturaAlumno = asignaturaAlumno;
	}
	
	public Asignatura getAsignaturaAlumno() {
		return asignaturaAlumno;
	}

	public void setAsignaturaAlumno(Asignatura asignaturaAlumno) {
		this.asignaturaAlumno = asignaturaAlumno;
	}

	public Alumno(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	
	//Metodo
	public void estudiar() {
		System.out.println("El alumno "+ nombre + " " + apellidos 
				+ " esta estudiando.\nNota media: "+ notaMedia);
	}
	
	
	//Getter y setter
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}