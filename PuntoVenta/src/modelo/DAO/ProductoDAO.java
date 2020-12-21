package modelo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controlador.Coordinador;
import modelo.conexion.Conexion;
import modelo.VO.ProductoVO;


public class ProductoDAO {
	//atributos
	private Coordinador miCoordinador;
	//constructor
	//metodos
	public boolean insertarProducto(String descripcion, float precioMenudeo, float precioMayoreo, String unidad,int departamento, float descuento, boolean status) {
		float cantidad = 1;
		//1.- Hacemos la conexion con la base de datos 
		Connection conn = null;
		Conexion miConn = new Conexion();
		conn = miConn.getConnection();
		//2.- Debemos de buscar al usuario que intente ingresar a nuestro sistema
		String consulta = "INSERT INTO PRODUCTOS (descripcion,precio_menudeo,precio_mayoreo,cantidad,unidad,descuento,status,id_departamento) values (?,?,?,?,?,?,?,?)";
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(consulta);
			
			st.setString(1, descripcion);
			st.setFloat(2, precioMenudeo);
			st.setFloat(3, precioMayoreo);
			st.setFloat(4, cantidad);
			st.setString(5, unidad);
			st.setFloat(6, descuento);
			st.setBoolean(7, status);
			st.setInt(8, departamento);
			
			st.executeUpdate();
			
		}catch(SQLException ex) {
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
	
	public ArrayList<ProductoVO> buscarProductos() {
		ArrayList<ProductoVO> misProductosVO = new ArrayList<ProductoVO>();
		//1.- Hacemos la conexion con la base de datos 
		Connection conn = null;
		Conexion miConn = new Conexion();
		conn = miConn.getConnection();
		//2.- Debemos de buscar al usuario que intente ingresar a nuestro sistema
		String consulta = "SELECT * FROM PRODUCTOS";
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(consulta);
			rs = st.executeQuery();
			while(rs.next()) {				
				misProductosVO.add(new ProductoVO(rs.getInt("id_producto"),rs.getString("descripcion"),rs.getFloat("precio_menudeo"),rs.getFloat("precio_mayoreo"),rs.getFloat("cantidad"),rs.getString("unidad"),rs.getFloat("descuento"),rs.getBoolean("status"),rs.getInt("id_departamento")));
			}
		}catch(SQLException ex) {
			System.out.println("¡Ocurrio un error al consultar todos los productos!: " + ex.getMessage());
			return null;
		}finally {
			try {
				rs.close();
				st.close();
				conn.close();
				miConn.desconectar();
			}catch(SQLException ex) {
				System.out.println("¡Ocurrio un error al cerrar la conexion: " + ex.getMessage());
			}
		}
		return misProductosVO;
	}
	
	public boolean updateProducto(int id, float precio) {
		boolean respuesta = false;
		//1.- Hacemos la conexion con la base de datos 
		Connection conn = null;
		Conexion miConn = new Conexion();
		conn = miConn.getConnection();
		//2.- Debemos de buscar al usuario que intente ingresar a nuestro sistema
		String consulta = "UPDATE PRODUCTOS set precio_menudeo = ?";
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(consulta);
			st.setFloat(1, precio);
			st.executeUpdate();
		}catch(SQLException ex) {
			System.out.println("¡Ocurrio un error al actualizar la BD! " + ex.getMessage());
			respuesta = false;
		}finally {
			try {
				st.close();
				conn.close();
				miConn.desconectar();
				respuesta = true;
			}catch(SQLException ex) {
				System.out.println("Ocurrio un problema al cerrar la BD: " + ex.getMessage());
				respuesta = false;
			}
		}
		return respuesta;
	}
	
	//setter and getter
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
	
}
