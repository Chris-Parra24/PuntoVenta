package modelo;

import controlador.Coordinador;

public class Logica {
	//atributos
	private Coordinador coordinador;
	//constructor
	
	//funcion que debe de validar el ingreso
	public String validarIngreso(String usuario,String contraseña) {
		String respuesta = "";
		if(usuario.equals("") || contraseña.equals("")) {
			respuesta = "error";
		}else {
			//debemos de validar que entonces sea usuario correcto en la BD
			respuesta = "exito";
		}
		return respuesta;
	}
	
	//setter and getter
	public void setCoordinador(Coordinador coordinador) {
    	this.coordinador = coordinador;
    }
}
