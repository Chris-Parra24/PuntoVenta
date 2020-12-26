package controlador;
import vista.*;
import modelo.Logica;
import modelo.DAO.*;
import modelo.VO.*;
import java.util.ArrayList;

public class Coordinador {
	//atributos
	private VentanaLogin miVentanaLogin;
	private VentanaPrincipal miVentanaPrincipal;
	private Logica miLogica;
	private PersonalDAO miPersonalDAO;
	private PersonalVO miPersonalVO;
	private ProductoDAO miProductoDAO;
	private ArrayList<ProductoVO> misProductosVO;
	private ProductoVO miProductoVenta = null;
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
	
	public int insertarPersonal(String nombre, String paterno, String materno, String telefono, String password,String rol) {
		//checamos el rol
		int mi_rol = miLogica.validaRol(rol);
		if(mi_rol != -1) {
			//creamos la instancia del personal
			PersonalVO empleado = new PersonalVO(nombre,password,paterno,materno,telefono,mi_rol);
			return miPersonalDAO.insertarPersonal(empleado); 
		}else {
			return -1;
		}
		
	}
	
	public boolean insertarProducto(String descripcion, String precioMenudeo, String precioMayoreo, String unidad,int departamento, String descuento, boolean status) {
		//cambiamos los precios , el descuento a flotante
		float precioMen = miLogica.convertirFloat(precioMenudeo);
		float precioMay = miLogica.convertirFloat(precioMayoreo);
		float descu = miLogica.convertirFloat(descuento);
		return miProductoDAO.insertarProducto(descripcion,precioMen,precioMay,unidad,departamento,descu,status);
	}
	
	public void buscarProductos() {
		this.misProductosVO = miProductoDAO.buscarProductos();
	}
	
	public boolean updateProducto(int id,float precio) {
		return this.miProductoDAO.updateProducto(id,precio);
	}
	
	//funcion que valida si una cadena esta vacia o no
	public boolean isVacio(String cadena) {
		return miLogica.isVacio(cadena);
	}
	
	
	
	//funcion que nos valida los campos de un formulario
	public boolean validarCampos(String nombre, String password, String paterno, String materno, String telefono,String rol) {
		return miLogica.validarCampos(nombre, paterno, materno, telefono, password,rol);
	}
	public boolean validarCampos(String descripcion,String precioMenudeo,String precioMayoreo,String unidad,String descuento) {
		return miLogica.validarCampos(descripcion,precioMenudeo,precioMayoreo,unidad,descuento);
	}
	public boolean validarCampos(String campo) {
		return miLogica.validarCampos(campo);
	}
	public boolean validarCampos(String id,String descripcion,String precio) {
		return miLogica.validarCampos(id,descripcion,precio);
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
	public void setProductoDAO(ProductoDAO miProductoDAO) {
		this.miProductoDAO = miProductoDAO;
	}
	public ArrayList<ProductoVO> getProductosVO() {
		buscarProductos();
		return this.misProductosVO;
	}
	public void setProductoVenta(ProductoVO productoBuscadoVenta) {
		this.miProductoVenta = productoBuscadoVenta;
	}
	public ProductoVO getProductoVenta() {
		return this.miProductoVenta;
	}
}
