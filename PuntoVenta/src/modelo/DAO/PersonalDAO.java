package modelo.DAO;
import java.sql.*;
import modelo.VO.*;

import controlador.Coordinador;
import modelo.conexion.Conexion;

public class PersonalDAO {
	//atributos
	private Coordinador miCoordinador;
	//constructor
	
	//metodos
	public void registrarPersonal() {
		
	}
	public PersonalVO buscarPersonal(String usuario,String contraseña) {
		//instanciamos el objeto que vamos a llenar para todo el sistema
		PersonalVO miPersonalVO=null;
		//1.- Hacemos la conexion con la base de datos 
		Connection conn = null;
		Conexion miConn = new Conexion();
		conn = miConn.getConnection();
		//2.- Debemos de buscar al usuario que intente ingresar a nuestro sistema
		String consulta = "SELECT * FROM PERSONAL where nombre=? and contraseña=?";
		//3.- Preparamos nuestra consulta y la variable de retorno
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(consulta);
			st.setString(1, usuario);
			st.setString(2, contraseña);
			//4.- Hacemos la consulta y guardamos el retorno en PersonalVO
			rs = st.executeQuery();
			while(rs.next()) {
				miPersonalVO = new PersonalVO(rs.getInt("id_personal"),rs.getString("nombre"),rs.getString("contraseña"),rs.getString("ap_paterno"),rs.getString("ap_materno"),rs.getString("telefono"),rs.getInt("id_rol"));
			}
			
			
		}catch(SQLException error) {
			System.out.println("Error en busqueda de usuario: " + error.getMessage());
		}finally{
			try {
				conn.close();
				st.close();
				rs.close();
				miConn.desconectar();
			}catch(SQLException err) {
				System.out.println("Error al cerrar conexion: " + err.getMessage());
			}
		}
		return miPersonalVO;
		
	}
	
	public void seleccionarTodosPersonal() {
		
	}
	//cambiamos mejor el estado del Personal a false porque eliminarlo sería que se debe de eliminar de todo lo que
	//tenga relacionado
	public void eliminarPersonal() {
		
	}
	
	public int insertarPersonal(PersonalVO miPersonalVO) {
		//1.- Hacemos la conexion con la base de datos 
		Connection conn = null;
		Conexion miConn = new Conexion();
		conn = miConn.getConnection();
		//2.- Debemos de buscar al usuario que intente ingresar a nuestro sistema
		String consulta = "INSERT INTO PERSONAL (contraseña,nombre,ap_paterno,ap_materno,telefono,id_rol) values (?,?,?,?,?,?)";
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(consulta);
			
			st.setString(1, miPersonalVO.getContraseña());
			st.setString(2, miPersonalVO.getNombre());
			st.setString(3, miPersonalVO.getAp_paterno());
			st.setString(4, miPersonalVO.getAp_materno());
			st.setString(5, miPersonalVO.getTelefono());
			st.setInt(6, miPersonalVO.getId_rol());
			
			st.executeUpdate();
			
		}catch(SQLException ex) {
			System.out.println("Ocurrio un error en la insercion de la BD: " + ex.getMessage());
			return -1;
		}finally {
			try {
				st.close();
				conn.close();
				miConn.desconectar();
			}catch(SQLException err) {
				System.out.println("Ocurrio un erro en cerrar la BD: " + err.getMessage());
				return -1;
			}
		}
		return 1;
	}
	//metodos set and get
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}
