package controlador;

import modelo.Logica;
import vista.VentanaClienteCredito;
import vista.VentanaLogin;
import vista.VentanaPrincipal;
import modelo.DAO.*;

public class Aplicacion {
	public void iniciarSistema() {
		 //creamos nuestra ventana principal,ventana de login, coordinador y la logica
		Coordinador miCoordinador = new Coordinador();
		VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        VentanaLogin miVentanaLogin = new VentanaLogin(miVentanaPrincipal,true);
        Logica miLogica = new Logica();
        PersonalDAO miPersonalDAO = new PersonalDAO();
        ProductoDAO miProductoDAO = new ProductoDAO();
        VentasDAO miVentasDAO = new VentasDAO();
        VentanaClienteCredito miVentanaClienteCredito = new VentanaClienteCredito(miVentanaPrincipal,true);
        
        //hacemos que se relacionen las clases con el coordinador y el coordinador con las clases
        miVentanaPrincipal.setCoordinador(miCoordinador);
        miVentanaLogin.setCoordinador(miCoordinador);
        miLogica.setCoordinador(miCoordinador);
        miPersonalDAO.setCoordinador(miCoordinador);
        miProductoDAO.setCoordinador(miCoordinador);
        miVentasDAO.setCoordinador(miCoordinador);
        miVentanaClienteCredito.setCoordinador(miCoordinador);
        
        miCoordinador.setLogica(miLogica);
        miCoordinador.setVentanaLogin(miVentanaLogin);
        miCoordinador.setVentanaPrincipal(miVentanaPrincipal);
        miCoordinador.setPersonalDAO(miPersonalDAO);
        miCoordinador.setProductoDAO(miProductoDAO);
        miCoordinador.setVentasDAO(miVentasDAO);
        miCoordinador.setVentanaClienteCredito(miVentanaClienteCredito);
        
        //hacemos visibles nuestras ventanas
        miVentanaPrincipal.setProductosVO(miCoordinador.getProductosVO());
        miVentanaPrincipal.setVisible(true);
        miVentanaLogin.setVisible(true);
	}
}
