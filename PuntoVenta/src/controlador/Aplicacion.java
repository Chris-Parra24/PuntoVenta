package controlador;

import modelo.Logica;
import vista.VentanaLogin;
import vista.VentanaPrincipal;
import modelo.DAO.*;

public class Aplicacion {
	public void iniciarSistema() {
		 //creamos nuestra ventana principal,ventana de login, coordinador y la logica
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        VentanaLogin miVentanaLogin = new VentanaLogin(miVentanaPrincipal,true);
        Coordinador miCoordinador = new Coordinador();
        Logica miLogica = new Logica();
        PersonalDAO miPersonalDAO = new PersonalDAO();
        
        //hacemos que se relacionen las clases con el coordinador y el coordinador con las clases
        miVentanaPrincipal.setCoordinador(miCoordinador);
        miVentanaLogin.setCoordinador(miCoordinador);
        miLogica.setCoordinador(miCoordinador);
        miPersonalDAO.setCoordinador(miCoordinador);
        
        
        miCoordinador.setLogica(miLogica);
        miCoordinador.setVentanaLogin(miVentanaLogin);
        miCoordinador.setVentanaPrincipal(miVentanaPrincipal);
        miCoordinador.setPersonalDAO(miPersonalDAO);
        //hacemos visibles nuestras ventanas
        miVentanaPrincipal.setVisible(true);
        miVentanaLogin.setVisible(true);
	}
}
