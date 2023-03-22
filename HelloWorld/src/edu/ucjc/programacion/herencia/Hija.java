package edu.ucjc.programacion.herencia;

public class Hija extends Padre{
	private int valor3;
	
	public Hija(String valor1, String valor2, int valor3) {
		super(valor1, valor2);
		this.valor3 = valor3;
	}
	
	public int getValor3() {
		return valor3;
	}
}
