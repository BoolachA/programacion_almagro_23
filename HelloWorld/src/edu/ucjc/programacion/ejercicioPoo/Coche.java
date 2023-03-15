package edu.ucjc.programacion.ejercicioPoo;

public class Coche {
	/*
	 * marca
	 * matricula
	 * motor
	 * volante
	 */
	
	private String marca;
	private String matricula;
	private Motor motorCoche;
	private Volante volanteCoche;
	
	public Coche(String marca, String matricula, Motor motorCoche, Volante volanteCoche) {
		this.marca = marca;
		this.matricula = matricula;
		this.motorCoche = motorCoche;
		this.volanteCoche = volanteCoche;
	}
	
	public void Conducir() {
		if(this.getMotorCoche().getNumCaballos() > 190) {
			System.out.println("El coche viaja a 200 km/h");
		}else {
			System.out.println("El coche viaja a 180 km/h");
		}
		
	}

	public String getMarca() {
		return marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public Motor getMotorCoche() {
		return motorCoche;
	}

	public Volante getVolanteCoche() {
		return volanteCoche;
	}

}
