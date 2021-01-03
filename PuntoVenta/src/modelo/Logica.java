package modelo;

import controlador.Coordinador;
import java.util.ArrayList;

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
	
	//funcion que nos checa si hay algo vacio
	public boolean isVacio(String cadena) {
		boolean respuesta;
		if(cadena.isEmpty()) {
			respuesta=true;
		}else {
			respuesta = false;
		}
		return respuesta;
	}
	
	//funcion que valida el rol
	public int validaRol(String rol) {
		String miRol = rol.toLowerCase();
		if(miRol.equals("administrador")) {
			return 1;
		}else {
			if(miRol.equals("cajero")) {
				return 2;
			}else {
				if(miRol.equals("empleado")) {
					return 3;
				}
				else {
					return -1;
				}
			}
		}
	}
		
	//funcion que nos valida campos de formulario
	public boolean validarCampos(String nombre, String pass, String paterno, String materno, String telefono ,String rol) {
		boolean respuesta = false;
		if(nombre.isEmpty() || paterno.isEmpty() || materno.isEmpty() || telefono.isEmpty() || pass.isEmpty() || rol.isEmpty()) {
			respuesta = true;
		}
		return respuesta;
	}
	
	public boolean validarCampos(String descripcion,String precioMenudeo,String precioMayoreo,String unidad,String descuento) {
		boolean respuesta = false;
		if(descripcion.isEmpty() || precioMenudeo.isEmpty() || precioMayoreo.isEmpty() || unidad.isEmpty() || descuento.isEmpty()) {
			respuesta = true;
		}
		return respuesta;
	}
	
	public boolean validarCampos(String campo) {
		boolean respuesta = false;
		if(campo.isEmpty()) {
			respuesta = true;
		}
		return respuesta;
	}
	
	public boolean validarCampos(String id,String descripcion,String precio) {
		boolean respuesta = false;
		if(id.isEmpty()||descripcion.isEmpty()||precio.isEmpty()) {
			respuesta = true;
		}
		return respuesta;
	}
	
	public float convertirFloat(String numero) {
		return Float.parseFloat(numero);
	}
	
	public float calcularTotalVenta(ArrayList<Producto> miLista) {
		float total = 0;
		for(int i = 0 ;i<miLista.size(); i++) {
			total = total + miLista.get(i).getTotal();
		}
		total = (float) (Math.round(total*100d)/100d);
		return total;
	}
	
	//setter and getter
	public void setCoordinador(Coordinador coordinador) {
    	this.coordinador = coordinador;
    }
}
