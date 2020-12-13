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
	//metodos set and get
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}
