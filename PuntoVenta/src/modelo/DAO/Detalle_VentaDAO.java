package modelo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import controlador.Coordinador;
import modelo.Producto;
import modelo.conexion.Conexion;

public class Detalle_VentaDAO {
	//atributos
	private Coordinador miCoordinador;
	//metodos
	public void insertarPedido(Producto miProducto, int id_venta) {
		//1.- Hacemos la conexion con la base de datos 
		Connection conn = null;
		Conexion miConn = new Conexion();
		conn = miConn.getConnection();
		//2.- Debemos de buscar al usuario que intente ingresar a nuestro sistema
		String consulta = "INSERT INTO DETALLE_VENTA (id_venta,id_producto) values (?,?)";
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(consulta);
			
			st.setInt(1, id_venta);
			st.setInt(2, miProducto.getId_producto());
			
			st.executeUpdate();
			
		}catch(SQLException ex) {
			System.out.println("Ocurrio un error en la insercion de la BD: " + ex.getMessage());
		}finally {
			try {
				st.close();
				conn.close();
				miConn.desconectar();
			}catch(SQLException err) {
				System.out.println("Ocurrio un erro en cerrar la BD: " + err.getMessage());
			}
		}
	}
	//metodo setter
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}
