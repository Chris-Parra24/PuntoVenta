/*
    Esta ventana será para poder acceder al sistema
    Esta ventana deberá tener conexión a la BD para validar al usuario
    Una vez que ya esta hecho esta parte de conexión deberemos de poder
    presionar el botón de Ingreso
*/
package vista;
import controlador.Coordinador;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import modelo.conexion.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class VentanaLogin extends JDialog implements ActionListener{
    //atributos
	private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbIcono;
    private javax.swing.JLabel lbMensajeIngreso;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    private Coordinador coordinador;
    
    //constructor
    public VentanaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(270,320);
        //esto es para que cuando se le de a la x para salirse del programa
        //aparezca un mensaje de confirmación si queremos salir y de ser así se sale de todo el sistema
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent evento) {
        		Object[] opciones = {"Continuar","Cerrar"};
        		int n = JOptionPane.showOptionDialog(null,"Seleccione un tipo de usuario\nSi sale del sistema se cerrara","Confirmacion",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[0]);
        		if(n==JOptionPane.YES_OPTION) {}
        		else if(n==JOptionPane.NO_OPTION) {
        			System.exit(0);
        		}
        	}
        });
    }

    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        lbIcono = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        lbMensajeIngreso = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acceso");
        //setMinimumSize(new java.awt.Dimension(270, 320));
        //setSize(new java.awt.Dimension(270, 320));
        getContentPane().setLayout(null);

        panelLogin.setBackground(java.awt.Color.white);
        //panelLogin.setMinimumSize(new java.awt.Dimension(270, 320));
        //panelLogin.setPreferredSize(new java.awt.Dimension(270, 320));
        panelLogin.setLayout(null);

        lbIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/candado1.png"))); // NOI18N
        panelLogin.add(lbIcono);
        lbIcono.setBounds(90, 20, 90, 100);

        lbUsuario.setForeground(new java.awt.Color(4, 2, 2));
        lbUsuario.setText("Usuario");
        panelLogin.add(lbUsuario);
        lbUsuario.setBounds(10, 170, 60, 16);

        lbContraseña.setForeground(new java.awt.Color(1, 1, 1));
        lbContraseña.setText("Contraseña");
        panelLogin.add(lbContraseña);
        lbContraseña.setBounds(10, 210, 85, 16);

        txtUsuario.setBackground(new java.awt.Color(254, 254, 254));
        txtUsuario.setForeground(new java.awt.Color(1, 1, 1));
        txtUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelLogin.add(txtUsuario);
        txtUsuario.setBounds(105, 170, 120, 20);

        txtContraseña.setBackground(new java.awt.Color(254, 254, 254));
        txtContraseña.setForeground(new java.awt.Color(1, 1, 1));
        panelLogin.add(txtContraseña);
        txtContraseña.setBounds(105, 210, 120, 20);

        lbMensajeIngreso.setForeground(new java.awt.Color(1, 1, 1));
        lbMensajeIngreso.setText("¡Ingrese con cuidado los datos!");
        panelLogin.add(lbMensajeIngreso);
        lbMensajeIngreso.setBounds(20, 130, 225, 16);

        btnIngresar.setBackground(new java.awt.Color(254, 254, 254));
        btnIngresar.setForeground(new java.awt.Color(1, 1, 1));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(this);
        panelLogin.add(btnIngresar);
        btnIngresar.setBounds(70, 250, 120, 20);

        getContentPane().add(panelLogin);
        panelLogin.setBounds(0, 0, 270, 320);

        pack();
    }
    //action listener
    public void actionPerformed(ActionEvent evento) {
    	//El boton de ingreso al sistema y debemos de validar al usuarios de la BD
    	if(evento.getSource()==btnIngresar) {
    		//nos debe de retornar algo distinto de null
    		if(coordinador.validarIngreso(txtUsuario.getText().trim(),txtContraseña.getText().trim())!=null) {
    			JOptionPane.showMessageDialog(null, "Bienvenido " + coordinador.getPersonalVO().getNombre());
    			coordinador.cerrarVentanaLogin();
    			coordinador.asignarPrivilegios();
    			
    		}else{
    			JOptionPane.showMessageDialog(null, "Hubo un error al ingresar datos\nasegurese de ingersar usuario y contraseña correctos");
    		}
    	}
    }
    
    //setter and getter
    public void setCoordinador(Coordinador coordinador) {
    	this.coordinador = coordinador;
    }

}
