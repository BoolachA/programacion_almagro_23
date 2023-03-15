package edu.ucjc.programacion.ejercicioPoo;

public class Concesionaria {

	public static void main(String[] args) {
		/*
		 * 2 coches
		 * marca, piston, color, volante
		 */
		// TODO Auto-generated method stub
		
		Volante volante1 = new Volante("V1", "Cuadrado", "Negro");
		Volante volante2 = new Volante("V2", "Circular", "Azul");
		
		Piston piston1 = new Piston("P1", "Volkswagen");
		Piston piston2 = new Piston("P2", "Bosch");	
		
		Motor motor1 = new Motor("Renault", 180, piston2);
		Motor motor2 = new Motor("Citroen", 195, piston1);
		
		Coche coche1 = new Coche("Renault", "0261AMG", motor2, volante1);
		Coche coche2 = new Coche("Mercedes", "9943IFH", motor1, volante2);
		
		System.out.println("\n\nCoche 1:\nMarca: " + coche1.getMarca() + "\nPiston: " + coche1.getMotorCoche().getPistonMotor().getId() + 
				"\nColor volante: " + coche1.getVolanteCoche().getColor() + "\nVolante: " + coche1.getVolanteCoche().getId());
		
		System.out.println("\n\nCoche 2:\nMarca: " + coche2.getMarca() + "\nPiston: " + coche2.getMotorCoche().getPistonMotor().getId() + 
				"\nColor volante: " + coche2.getVolanteCoche().getColor() + "\nVolante: " + coche2.getVolanteCoche().getId());
		
		coche1.Conducir();
		coche2.Conducir();
		
		

	}

}
