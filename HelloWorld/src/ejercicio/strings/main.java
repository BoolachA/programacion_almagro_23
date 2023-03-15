package ejercicio.strings;

public class main {

	public static void main(String[] args) {
		
		String email = "prueba@gmail.com";
		email = email.trim();
		
		String mensajeError = "";
		
		//Email debe contener una @
		if(email.indexOf("@")==-1) {
			mensajeError += "El email no tiene arroba";
		}else if(email.lastIndexOf("@")!=email.indexOf("@")){
			mensajeError += "El email no puede tener mas de un arroba";
		}else {
			//Email con espacio en blanco
			if(email.contains(" ")) {
				mensajeError += "El email no puede tener un espacio en blanco";
			}else {
				//Punto despues del arroba
				if(email.indexOf("@")-email.indexOf(".") > 0) {
					mensajeError += "El email debe tener un punto después del arroba";
				}else {
					//Despues del punto 2 a 6 caracteres
					if(email.length()-(email.lastIndexOf(".")+1) < 2 || email.length()-(email.lastIndexOf(".")+1) > 6) {
						mensajeError += "Despues del punto 2 a 6 caracteres";
					}
				}
			}
		}
		
		
		
		
		if(mensajeError.equals("")) {
			System.out.println("El email es correcto");
		}else {
			System.out.println("Formato incorrecto: " + mensajeError);
		}
		
	}

}
