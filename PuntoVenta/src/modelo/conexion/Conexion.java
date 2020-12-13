package modelo.conexion;
import java.sql.*;

public class Conexion {
	private String nombreBD="ejemplo";
	private String usuario = "root";
	private String password = "";
	private String url = "jdbc:mysql://localhost/"+nombreBD;
	
	Connection conn = null;
	//constructor
	public Conexion() {
		try {
			//obtener el driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//hacemos la conexion con la base
			conn = DriverManager.getConnection(url,usuario,password);
			if(conn!=null) {
				System.out.println("Conexion exitosa a la BD:"+nombreBD);
			}
		}catch(ClassNotFoundException e) {
			System.out.println("Error del driver: " + e.getMessage());
		}catch(SQLException e) {
			System.out.println("Error de conexion: " + e.getMessage());
		}
	}
	//setter and getter
	public Connection getConnection() {
		return conn;
	}
	public void desconectar() {
		conn=null;
	}
}
