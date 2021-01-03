package modelo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import controlador.Coordinador;
import modelo.conexion.Conexion;

public class CreditosDAO {
	//atributos
	private Coordinador miCoordinador;
	
	//metodos
	public boolean insertarCredito(float total) {
		//1.- Hacemos la conexion con la base de datos 
		Connection conn = null;
		Conexion miConn = new Conexion();
		conn = miConn.getConnection();
		//2.- Debemos de buscar al usuario que intente ingresar a nuestro sistema
		String consulta = "INSERT INTO VENTAS (forma_pago,total_pagar,status,id_personal) values (?,?,?,?)";
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(consulta);
			
			
			
			st.executeUpdate();
			
		}catch(Exception ex) {
			System.out.println("Ocurrio un error en la insercion de la BD: " + ex.getMessage());
			return false;
		}finally {
			try {
				st.close();
				conn.close();
				miConn.desconectar();
			}catch(SQLException err) {
				System.out.println("Ocurrio un erro en cerrar la BD: " + err.getMessage());
				return false;
			}
		}
		return true;
	}
	
	//setter and getter
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}
