package modelo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import controlador.Coordinador;
import modelo.VO.ProductoVO;
import modelo.conexion.Conexion;

public class VentasDAO {
	private Coordinador miCoordinador;
	
	public boolean insertarVenta(String metodo_pago,float total,boolean status,int idPersonal) {
		//1.- Hacemos la conexion con la base de datos 
		Connection conn = null;
		Conexion miConn = new Conexion();
		conn = miConn.getConnection();
		//2.- Debemos de buscar al usuario que intente ingresar a nuestro sistema
		String consulta = "INSERT INTO VENTAS (forma_pago,total_pagar,status,id_personal) values (?,?,?,?)";
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(consulta);
			
			st.setString(1, metodo_pago);
			st.setFloat(2, total);
			st.setBoolean(3, status);
			st.setInt(4, idPersonal);
			
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
	
	public int ultimaVenta() {
		int idVenta=-1;
		//1.- Hacemos la conexion con la base de datos 
		Connection conn = null;
		Conexion miConn = new Conexion();
		conn = miConn.getConnection();
		//2.- Debemos de buscar al usuario que intente ingresar a nuestro sistema
		String consulta = "SELECT * FROM VENTAS ORDER BY id_venta DESC LIMIT 1;";
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(consulta);
			rs = st.executeQuery();
			while(rs.next()) {				
				idVenta = rs.getInt("id_venta");
			}
		}catch(SQLException ex) {
			System.out.println("¡Ocurrio un error al consultar todos los productos!: " + ex.getMessage());
			return -1;
		}finally {
			try {
				rs.close();
				st.close();
				conn.close();
				miConn.desconectar();
			}catch(SQLException ex) {
				System.out.println("¡Ocurrio un error al cerrar la conexion: " + ex.getMessage());
				return -1;
			}
		}
		return idVenta;
	}
	
	//metodo setter and getter
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}
