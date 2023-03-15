package edu.ucjc.programacion.ejercicioPoo;

public class Motor {
	/*
	 * Marca
	 * numCaballos
	 * piston
	 */
	
	private String marca;
	private int numCaballos;
	private Piston pistonMotor;
	
	public Motor(String marca, int numCaballos, Piston pistonMotor) {
		super();
		this.marca = marca;
		this.numCaballos = numCaballos;
		this.pistonMotor = pistonMotor;
	}

	public String getMarca() {
		return marca;
	}

	public int getNumCaballos() {
		return numCaballos;
	}

	public Piston getPistonMotor() {
		return pistonMotor;
	}

}
