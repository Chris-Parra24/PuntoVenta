package controlador;
import vista.*;
import modelo.Logica;
import modelo.DAO.*;
import modelo.VO.*;
public class Coordinador {
	//atributos
	private VentanaLogin miVentanaLogin;
	private VentanaPrincipal miVentanaPrincipal;
	private Logica miLogica;
	private PersonalDAO miPersonalDAO;
	private PersonalVO miPersonalVO; 
	//constructor
	
	
	//metodos distintos del getter and setter
	//este metodo sirve para poder llevar a cabo que se cierre la ventana de login
	//cuando se hace correcto el ingreso al sistema
	public void cerrarVentanaLogin() {
		miVentanaLogin.dispose();
	}
	
	//metodo de muestra de ventana de login
	public void mostrarLogin() {
		miVentanaLogin.setVisible(true);
	}
	//metodo que me asigna privilegios en la parte de mi ventana principal
	public void asignarPrivilegios() {
		miVentanaPrincipal.asignarPrivilegios(miPersonalVO.getId_rol());
	}
	//funcion de validacion de ingreso al sistema y que regresa a la persona que accedio
	public PersonalVO validarIngreso(String usuario,String contraseña) {
		//antes validamos que no sean cadenas vacias
		String res = miLogica.validarIngreso(usuario, contraseña);
		if(res.equals("exito")) {
			this.miPersonalVO = miPersonalDAO.buscarPersonal(usuario,contraseña);
			return this.miPersonalVO;
		}else {
			return null;
		}
	}
	//setter and getter
	public PersonalVO getPersonalVO() {
		return this.miPersonalVO;
	}
	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	public void setVentanaLogin(VentanaLogin miVentanaLogin) {
		this.miVentanaLogin = miVentanaLogin;
	}
	public void setLogica(Logica miLogica) {
		this.miLogica = miLogica;
	}
	public void setPersonalDAO(PersonalDAO miPersonalDAO) {
		this.miPersonalDAO = miPersonalDAO;
	}
}
