/*
    Esta ventana será donde se visualice todo el trabajo que el Punto de venta debe de hacer
    -Ver precios, productos, reportes
*/
package vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controlador.Coordinador;

public class VentanaPrincipal extends javax.swing.JFrame implements ActionListener{
    //atributos
	private javax.swing.JMenu menuOpArchivo;
    private javax.swing.JMenu menuOpEditar;
    private javax.swing.JMenu menuOpOpciones;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenuItem opGuardar;
    private javax.swing.JMenuItem opCambiarPersonal;
    private javax.swing.JMenuItem opAltaProducto;
    private javax.swing.JMenuItem opAltaEmpleado;
    private javax.swing.JMenuItem opBajaEmpleado;
    private javax.swing.JMenuItem opBajaProducto;
    private javax.swing.JMenuItem opModificarProducto;
    private javax.swing.JPanel panelPrincipal;
    private Dimension tamañoPantalla;
    private Rectangle pantalla;
    private Coordinador coordinador;
    //panelRegistro
    private javax.swing.JButton btnRegistroEmp;
    private javax.swing.JButton btnRegistroProd;
    private javax.swing.JComboBox<String> cmbDepartamentoProd;
    private javax.swing.JLabel lbAppMaterno;
    private javax.swing.JLabel lbAppParteno;
    private javax.swing.JLabel lbDatosEmp;
    private javax.swing.JLabel lbDatosProd;
    private javax.swing.JLabel lbDepartamentoProd;
    private javax.swing.JLabel lbDescripcionProd;
    private javax.swing.JLabel lbDescuentoProd;
    private javax.swing.JLabel lbNombreEmp;
    private javax.swing.JLabel lbPasswordEmp;
    private javax.swing.JLabel lbPrecioProd1;
    private javax.swing.JLabel lbPrecioProd2;
    private javax.swing.JLabel lbTelefonoEmp;
    private javax.swing.JLabel lbTituloRegistro;
    private javax.swing.JLabel lbUnidadProd;
    private javax.swing.JPanel panelEmpleadoRe;
    private javax.swing.JPanel panelProductosRe;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JRadioButton rbActivoProd;
    private javax.swing.JRadioButton rbInactivoProd;
    private javax.swing.JRadioButton rbVerPassword;
    private javax.swing.JTextField txtAppMaterno;
    private javax.swing.JTextField txtAppPaterno;
    private javax.swing.JTextField txtDescripcionProd;
    private javax.swing.JTextField txtDescuentoProd;
    private javax.swing.JTextField txtNombreEmp;
    private javax.swing.JPasswordField txtPasswordEmp;
    private javax.swing.JTextField txtPrecioProd;
    private javax.swing.JTextField txtPrecioProd2;
    private javax.swing.JTextField txtTelefonoEmp;
    private javax.swing.JTextField txtUnidadProd;
    //final panel de registro
    //inicio de nuestros componentes de venta
    private javax.swing.JButton btnAgregarPeso;
    private javax.swing.JButton btnBuscarProdVentas;
    private javax.swing.JButton btnCuentaNueva;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbIndicacionBusqueda;
    private javax.swing.JLabel lbIngresarPeso;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JPanel panelPedidoVenta;
    private javax.swing.JPanel panelProductosBusq;
    private javax.swing.JPanel panelProductosVisual;
    private javax.swing.JPanel panelVentas;
    private javax.swing.JSeparator sepSeparador;
    private javax.swing.JTable tablaProdPedido;
    private javax.swing.JTextField txtBuscarProd;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTotal;
    //fin de componentes de venta
    //inicio de componentes de modificacion de productos
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarProd;
    private javax.swing.JPanel jPanelUpdate;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbIdentificador;
    private javax.swing.JLabel lbInstruccion;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JRadioButton rbInactivo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdentificador1;
    private javax.swing.JTextField txtIdentificador2;
    private javax.swing.JTextField txtPrecio;
    //fin de componentnes de modificacion de productos
    
    
	//constructor
    public VentanaPrincipal() {
        initComponents();
        tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        pantalla = new Rectangle(tamañoPantalla);
        setBounds(pantalla);
    }

    private void initComponents() {
    	//creacion de los componentes
        panelPrincipal = new javax.swing.JPanel();
        menuPrincipal = new javax.swing.JMenuBar();
        menuOpArchivo = new javax.swing.JMenu();
        opGuardar = new javax.swing.JMenuItem();
        opCambiarPersonal = new javax.swing.JMenuItem();
        opAltaProducto = new javax.swing.JMenuItem();
        opAltaEmpleado = new javax.swing.JMenuItem();
        opBajaProducto = new javax.swing.JMenuItem();
        opBajaEmpleado = new javax.swing.JMenuItem();
        opModificarProducto = new javax.swing.JMenuItem();
        menuOpEditar = new javax.swing.JMenu();
        menuOpOpciones = new javax.swing.JMenu();
        //creacion de los componentes de mi registro
        panelRegistro = new javax.swing.JPanel();
        lbTituloRegistro = new javax.swing.JLabel();
        panelProductosRe = new javax.swing.JPanel();
        txtDescripcionProd = new javax.swing.JTextField();
        lbDescripcionProd = new javax.swing.JLabel();
        lbPrecioProd1 = new javax.swing.JLabel();
        lbPrecioProd2 = new javax.swing.JLabel();
        txtPrecioProd = new javax.swing.JTextField();
        txtPrecioProd2 = new javax.swing.JTextField();
        lbUnidadProd = new javax.swing.JLabel();
        txtUnidadProd = new javax.swing.JTextField();
        cmbDepartamentoProd = new javax.swing.JComboBox<>();
        lbDepartamentoProd = new javax.swing.JLabel();
        lbDescuentoProd = new javax.swing.JLabel();
        txtDescuentoProd = new javax.swing.JTextField();
        rbActivoProd = new javax.swing.JRadioButton();
        rbInactivoProd = new javax.swing.JRadioButton();
        btnRegistroProd = new javax.swing.JButton();
        lbDatosProd = new javax.swing.JLabel();
        panelEmpleadoRe = new javax.swing.JPanel();
        lbNombreEmp = new javax.swing.JLabel();
        lbAppParteno = new javax.swing.JLabel();
        lbAppMaterno = new javax.swing.JLabel();
        lbTelefonoEmp = new javax.swing.JLabel();
        lbPasswordEmp = new javax.swing.JLabel();
        txtNombreEmp = new javax.swing.JTextField();
        txtAppPaterno = new javax.swing.JTextField();
        txtAppMaterno = new javax.swing.JTextField();
        txtTelefonoEmp = new javax.swing.JTextField();
        txtPasswordEmp = new javax.swing.JPasswordField();
        rbVerPassword = new javax.swing.JRadioButton();
        btnRegistroEmp = new javax.swing.JButton();
        lbDatosEmp = new javax.swing.JLabel();
        /*componentes de mi ventas **************************************************/
        panelVentas = new javax.swing.JPanel();
        panelProductosBusq = new javax.swing.JPanel();
        btnBuscarProdVentas = new javax.swing.JButton();
        txtBuscarProd = new javax.swing.JTextField();
        lbIndicacionBusqueda = new javax.swing.JLabel();
        lbIngresarPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        btnAgregarPeso = new javax.swing.JButton();
        sepSeparador = new javax.swing.JSeparator();
        panelPedidoVenta = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        lbTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnCuentaNueva = new javax.swing.JButton();
        panelProductosVisual = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProdPedido = new javax.swing.JTable();
        //****************************fin de componentes de la venta
        
        /*Componentes de mi modificacion de productos*/
        jPanelUpdate = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbInstruccion = new javax.swing.JLabel();
        txtIdentificador1 = new javax.swing.JTextField();
        btnBuscarProd = new javax.swing.JButton();
        lbDescripcion = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        rbActivo = new javax.swing.JRadioButton();
        rbInactivo = new javax.swing.JRadioButton();
        lbIdentificador = new javax.swing.JLabel();
        txtIdentificador2 = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        //fin de componentes de modificacion de productos
        
        //Cosas de mis ventana y del panel principal*******************************
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Punto Venta");
        setMinimumSize(new java.awt.Dimension(946, 489));
        setSize(new java.awt.Dimension(946, 489));
        
        panelPrincipal.setBackground(java.awt.Color.white);
        panelPrincipal.setLayout(null);
        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(0, 0, 950, 490);
        //Fin de cosas de la ventana principal y de mi panel principal ******************************
        
        //Registro de Empleados y de Productos *****************************
        panelRegistro.setBackground(java.awt.Color.lightGray);
        panelRegistro.setLayout(null);

        lbTituloRegistro.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lbTituloRegistro.setForeground(java.awt.Color.black);
        lbTituloRegistro.setText("Formulario de registro");
        panelRegistro.add(lbTituloRegistro);
        lbTituloRegistro.setBounds(250, 10, 250, 30);

        panelProductosRe.setBackground(java.awt.Color.white);
        panelProductosRe.setLayout(null);

        txtDescripcionProd.setFont(new java.awt.Font("Ubuntu", 0, 18));
        txtDescripcionProd.setBackground(java.awt.Color.white);
        txtDescripcionProd.setForeground(java.awt.Color.black);
        panelProductosRe.add(txtDescripcionProd);
        txtDescripcionProd.setBounds(250, 70, 200, 30);

        lbDescripcionProd.setFont(new java.awt.Font("Ubuntu", 1, 18));
        lbDescripcionProd.setForeground(java.awt.Color.black);
        lbDescripcionProd.setText("Descripcion");
        panelProductosRe.add(lbDescripcionProd);
        lbDescripcionProd.setBounds(20, 70, 120, 30);

        lbPrecioProd1.setFont(new java.awt.Font("Ubuntu", 1, 18));
        lbPrecioProd1.setForeground(java.awt.Color.black);
        lbPrecioProd1.setText("Precio menudeo");
        panelProductosRe.add(lbPrecioProd1);
        lbPrecioProd1.setBounds(20, 150, 150, 30);
        
        lbPrecioProd2.setFont(new java.awt.Font("Ubuntu",1,18));
        lbPrecioProd2.setForeground(java.awt.Color.black);
        lbPrecioProd2.setText("Precio mayoreo");
        panelProductosRe.add(lbPrecioProd2);
        lbPrecioProd2.setBounds(20, 200, 150, 30);
        

        txtPrecioProd.setFont(new java.awt.Font("Ubuntu", 0, 18));
        txtPrecioProd.setBackground(java.awt.Color.white);
        txtPrecioProd.setForeground(java.awt.Color.black);
        panelProductosRe.add(txtPrecioProd);
        txtPrecioProd.setBounds(250, 150, 200, 30);
        
        txtPrecioProd2.setFont(new java.awt.Font("Ubuntu", 0, 18));
        txtPrecioProd2.setBackground(java.awt.Color.white);
        txtPrecioProd2.setForeground(java.awt.Color.black);
        panelProductosRe.add(txtPrecioProd2);
        txtPrecioProd2.setBounds(250, 200, 200, 30);

        lbUnidadProd.setFont(new java.awt.Font("Ubuntu", 1, 18));
        lbUnidadProd.setForeground(java.awt.Color.black);
        lbUnidadProd.setText("Unidad");
        panelProductosRe.add(lbUnidadProd);
        lbUnidadProd.setBounds(20, 270, 100, 30);

        txtUnidadProd.setFont(new java.awt.Font("Ubuntu", 0, 18));
        txtUnidadProd.setBackground(java.awt.Color.white);
        txtUnidadProd.setForeground(java.awt.Color.black);
        panelProductosRe.add(txtUnidadProd);
        txtUnidadProd.setBounds(250, 270, 200, 30);

        cmbDepartamentoProd.setBackground(java.awt.Color.black);
        cmbDepartamentoProd.setEditable(true);
        cmbDepartamentoProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Frutas", "Verduras", "Carnes", "Abarratores","Quesos" }));
        panelProductosRe.add(cmbDepartamentoProd);
        cmbDepartamentoProd.setBounds(250, 370, 200, 30);

        lbDepartamentoProd.setFont(new java.awt.Font("Ubuntu", 1, 18));
        lbDepartamentoProd.setForeground(java.awt.Color.black);
        lbDepartamentoProd.setText("Departamento");
        panelProductosRe.add(lbDepartamentoProd);
        lbDepartamentoProd.setBounds(20, 370, 130, 30);

        lbDescuentoProd.setFont(new java.awt.Font("Ubuntu", 1, 18));
        lbDescuentoProd.setForeground(java.awt.Color.black);
        lbDescuentoProd.setText("Descuento");
        panelProductosRe.add(lbDescuentoProd);
        lbDescuentoProd.setBounds(20, 470, 120, 30);

        txtDescuentoProd.setFont(new java.awt.Font("Ubuntu", 0, 18));
        txtDescuentoProd.setBackground(java.awt.Color.white);
        txtDescuentoProd.setForeground(java.awt.Color.black);
        panelProductosRe.add(txtDescuentoProd);
        txtDescuentoProd.setBounds(250, 470, 200, 30);

        rbActivoProd.setFont(new java.awt.Font("Ubuntu", 0, 18));
        rbActivoProd.setForeground(java.awt.Color.black);
        rbActivoProd.setText("Activo");
        panelProductosRe.add(rbActivoProd);
        rbActivoProd.setBounds(20, 525, 110, 30);

        rbInactivoProd.setFont(new java.awt.Font("Ubuntu", 0, 18));
        rbInactivoProd.setForeground(java.awt.Color.black);
        rbInactivoProd.setText("Inactivo");
        panelProductosRe.add(rbInactivoProd);
        rbInactivoProd.setBounds(200, 525, 110, 30);

        btnRegistroProd.setFont(new java.awt.Font("Ubuntu", 0, 18));
        btnRegistroProd.setText("Registrar");
        btnRegistroProd.addActionListener(this);
        panelProductosRe.add(btnRegistroProd);
        btnRegistroProd.setBounds(20, 565, 120, 30);

        lbDatosProd.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lbDatosProd.setForeground(java.awt.Color.black);
        lbDatosProd.setText("Datos Producto");
        panelProductosRe.add(lbDatosProd);
        lbDatosProd.setBounds(250, 10, 250, 30);

        panelRegistro.add(panelProductosRe);
        panelProductosRe.setBounds(50, 50, 600, 600);

        panelEmpleadoRe.setBackground(java.awt.Color.white);
        panelEmpleadoRe.setLayout(null);

        lbNombreEmp.setFont(new java.awt.Font("Ubuntu", 1, 18));
        lbNombreEmp.setForeground(java.awt.Color.black);
        lbNombreEmp.setText("Nombre");
        panelEmpleadoRe.add(lbNombreEmp);
        lbNombreEmp.setBounds(20, 70, 110, 30);
        
        lbAppParteno.setFont(new java.awt.Font("Ubuntu", 1, 18));
        lbAppParteno.setForeground(java.awt.Color.black);
        lbAppParteno.setText("Apellido Paterno");
        panelEmpleadoRe.add(lbAppParteno);
        lbAppParteno.setBounds(20, 170, 160, 30);

        lbAppMaterno.setFont(new java.awt.Font("Ubuntu", 1, 18));
        lbAppMaterno.setForeground(java.awt.Color.black);
        lbAppMaterno.setText("Apellido Materno");
        panelEmpleadoRe.add(lbAppMaterno);
        lbAppMaterno.setBounds(20, 270, 163, 30);

        lbTelefonoEmp.setFont(new java.awt.Font("Ubuntu", 1, 18));
        lbTelefonoEmp.setForeground(java.awt.Color.black);
        lbTelefonoEmp.setText("Telefono");
        panelEmpleadoRe.add(lbTelefonoEmp);
        lbTelefonoEmp.setBounds(20, 370, 110, 30);

        lbPasswordEmp.setFont(new java.awt.Font("Ubuntu", 1, 18));
        lbPasswordEmp.setForeground(java.awt.Color.black);
        lbPasswordEmp.setText("Contraseña");
        panelEmpleadoRe.add(lbPasswordEmp);
        lbPasswordEmp.setBounds(20, 470, 110, 30);

        txtNombreEmp.setFont(new java.awt.Font("Ubuntu", 0, 18));
        txtNombreEmp.setBackground(java.awt.Color.white);
        txtNombreEmp.setForeground(java.awt.Color.black);
        panelEmpleadoRe.add(txtNombreEmp);
        txtNombreEmp.setBounds(250, 70, 200, 30);

        txtAppPaterno.setFont(new java.awt.Font("Ubuntu", 0, 18));
        txtAppPaterno.setBackground(java.awt.Color.white);
        txtAppPaterno.setForeground(java.awt.Color.black);
        panelEmpleadoRe.add(txtAppPaterno);
        txtAppPaterno.setBounds(250, 170, 200, 30);

        txtAppMaterno.setFont(new java.awt.Font("Ubuntu", 0, 18));
        txtAppMaterno.setBackground(java.awt.Color.white);
        txtAppMaterno.setForeground(java.awt.Color.black);
        panelEmpleadoRe.add(txtAppMaterno);
        txtAppMaterno.setBounds(250, 270, 200, 30);

        txtTelefonoEmp.setFont(new java.awt.Font("Ubuntu", 0, 18));
        txtTelefonoEmp.setBackground(java.awt.Color.white);
        txtTelefonoEmp.setForeground(java.awt.Color.black);
        panelEmpleadoRe.add(txtTelefonoEmp);
        txtTelefonoEmp.setBounds(250, 370, 200, 30);

        txtPasswordEmp.setFont(new java.awt.Font("Ubuntu", 0, 18));
        txtPasswordEmp.setBackground(java.awt.Color.white);
        txtPasswordEmp.setForeground(java.awt.Color.black);
        panelEmpleadoRe.add(txtPasswordEmp);
        txtPasswordEmp.setBounds(250, 470, 200, 30);

        rbVerPassword.setFont(new java.awt.Font("Ubuntu", 0, 16));
        rbVerPassword.setForeground(java.awt.Color.black);
        rbVerPassword.setText("Ver contraseña");
        panelEmpleadoRe.add(rbVerPassword);
        rbVerPassword.setBounds(207, 550, 160, 30);

        btnRegistroEmp.setFont(new java.awt.Font("Ubuntu", 0, 16));
        btnRegistroEmp.setText("Registrar");
        btnRegistroEmp.addActionListener(this);
        panelEmpleadoRe.add(btnRegistroEmp);
        btnRegistroEmp.setBounds(20, 550, 135, 30);

        lbDatosEmp.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lbDatosEmp.setForeground(java.awt.Color.black);
        lbDatosEmp.setText("Datos del empleado");
        panelEmpleadoRe.add(lbDatosEmp);
        lbDatosEmp.setBounds(200, 10, 250, 30);

        panelRegistro.add(panelEmpleadoRe);
        panelEmpleadoRe.setBounds(50, 50, 600, 600);

        panelPrincipal.add(panelRegistro);
        panelRegistro.setBounds(400, 50, 700, 700);
        //con esto lo hacemos visible
        panelRegistro.setVisible(false);
        panelEmpleadoRe.setVisible(false);
        panelProductosRe.setVisible(false);
        
        //fin de registro de empleados y de productos **********************************
        
        /*Inicio de componentes de modificacion*/
        jPanelUpdate.setBackground(java.awt.Color.lightGray);
        jPanelUpdate.setLayout(null);

        lbTitulo.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(1, 1, 1));
        lbTitulo.setText("Modificacion de producto");
        jPanelUpdate.add(lbTitulo);
        lbTitulo.setBounds(10, 10, 420, 60);

        lbInstruccion.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lbInstruccion.setForeground(java.awt.Color.black);
        lbInstruccion.setText("Ingrese la clave del producto a modificar");
        jPanelUpdate.add(lbInstruccion);
        lbInstruccion.setBounds(100, 70, 450, 50);

        txtIdentificador1.setBackground(java.awt.Color.white);
        txtIdentificador1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        txtIdentificador1.setForeground(java.awt.Color.black);
        jPanelUpdate.add(txtIdentificador1);
        txtIdentificador1.setBounds(110, 130, 180, 30);

        btnBuscarProd.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnBuscarProd.setText("Buscar");
        jPanelUpdate.add(btnBuscarProd);
        btnBuscarProd.setBounds(320, 130, 220, 30);

        lbDescripcion.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        lbDescripcion.setForeground(java.awt.Color.black);
        lbDescripcion.setText("Descripcion");
        jPanelUpdate.add(lbDescripcion);
        lbDescripcion.setBounds(160, 230, 110, 19);

        lbPrecio.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        lbPrecio.setForeground(java.awt.Color.black);
        lbPrecio.setText("Precio");
        jPanelUpdate.add(lbPrecio);
        lbPrecio.setBounds(160, 270, 80, 19);

        txtDescripcion.setBackground(java.awt.Color.white);
        txtDescripcion.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        txtDescripcion.setForeground(java.awt.Color.black);
        txtDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelUpdate.add(txtDescripcion);
        txtDescripcion.setBounds(290, 230, 200, 31);

        txtPrecio.setBackground(java.awt.Color.white);
        txtPrecio.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        txtPrecio.setForeground(java.awt.Color.black);
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelUpdate.add(txtPrecio);
        txtPrecio.setBounds(290, 270, 200, 31);
        jPanelUpdate.add(jSeparator1);
        jSeparator1.setBounds(30, 170, 610, 10);

        rbActivo.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        rbActivo.setForeground(java.awt.Color.black);
        rbActivo.setText("Activo");
        jPanelUpdate.add(rbActivo);
        rbActivo.setBounds(160, 330, 80, 23);

        rbInactivo.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        rbInactivo.setForeground(java.awt.Color.black);
        rbInactivo.setText("Inactivo");
        jPanelUpdate.add(rbInactivo);
        rbInactivo.setBounds(380, 330, 90, 23);

        lbIdentificador.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        lbIdentificador.setForeground(java.awt.Color.black);
        lbIdentificador.setText("ID");
        jPanelUpdate.add(lbIdentificador);
        lbIdentificador.setBounds(160, 195, 90, 19);

        txtIdentificador2.setBackground(java.awt.Color.white);
        txtIdentificador2.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        txtIdentificador2.setForeground(java.awt.Color.black);
        txtIdentificador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelUpdate.add(txtIdentificador2);
        txtIdentificador2.setBounds(290, 190, 200, 31);

        btnActualizar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        jPanelUpdate.add(btnActualizar);
        btnActualizar.setBounds(220, 380, 180, 35);
        btnActualizar.addActionListener(this);
        
        this.panelPrincipal.add(this.jPanelUpdate);
        this.jPanelUpdate.setBounds(200,200,660,440);
        this.jPanelUpdate.setVisible(false);
        
        /*Fin de componentes de modificacion*/
        
        //ventas***************************************
        panelVentas.setBackground(java.awt.Color.lightGray);
        panelVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        panelVentas.setLayout(null);

        panelProductosBusq.setBackground(java.awt.Color.lightGray);
        panelProductosBusq.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), java.awt.Color.black)); // NOI18N
        panelProductosBusq.setLayout(null);

        btnBuscarProdVentas.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnBuscarProdVentas.setText("Buscar");
        panelProductosBusq.add(btnBuscarProdVentas);
        btnBuscarProdVentas.setBounds(154, 90, 120, 30);

        txtBuscarProd.setBackground(java.awt.Color.white);
        txtBuscarProd.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        txtBuscarProd.setForeground(java.awt.Color.black);
        panelProductosBusq.add(txtBuscarProd);
        txtBuscarProd.setBounds(10, 90, 140, 30);

        lbIndicacionBusqueda.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        lbIndicacionBusqueda.setForeground(java.awt.Color.black);
        lbIndicacionBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIndicacionBusqueda.setText("<html>Ingrese el identificador (ID)<br>del producto a buscar</html>");
        panelProductosBusq.add(lbIndicacionBusqueda);
        lbIndicacionBusqueda.setBounds(30, 20, 230, 60);

        lbIngresarPeso.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        lbIngresarPeso.setForeground(java.awt.Color.black);
        lbIngresarPeso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIngresarPeso.setText("<html>Ingrese el peso del producto</html>");
        panelProductosBusq.add(lbIngresarPeso);
        lbIngresarPeso.setBounds(30, 130, 230, 60);

        txtPeso.setBackground(java.awt.Color.white);
        txtPeso.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        txtPeso.setForeground(java.awt.Color.black);
        panelProductosBusq.add(txtPeso);
        txtPeso.setBounds(70, 180, 140, 30);

        btnAgregarPeso.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnAgregarPeso.setText("Agregar");
        panelProductosBusq.add(btnAgregarPeso);
        btnAgregarPeso.setBounds(70, 220, 140, 30);
        panelProductosBusq.add(sepSeparador);
        sepSeparador.setBounds(10, 130, 260, 10);

        panelVentas.add(panelProductosBusq);
        panelProductosBusq.setBounds(10, 10, 280, 260);

        panelPedidoVenta.setBackground(java.awt.Color.lightGray);
        panelPedidoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedido", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), java.awt.Color.black)); // NOI18N
        panelPedidoVenta.setLayout(null);

        btnImprimir.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnImprimir.setText("Imprimir");
        panelPedidoVenta.add(btnImprimir);
        btnImprimir.setBounds(70, 80, 130, 30);

        lbTotal.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lbTotal.setForeground(java.awt.Color.black);
        lbTotal.setText("Total");
        panelPedidoVenta.add(lbTotal);
        lbTotal.setBounds(30, 20, 50, 30);

        txtTotal.setBackground(java.awt.Color.white);
        txtTotal.setForeground(java.awt.Color.black);
        panelPedidoVenta.add(txtTotal);
        txtTotal.setBounds(100, 20, 160, 30);

        panelVentas.add(panelPedidoVenta);
        panelPedidoVenta.setBounds(10, 415, 280, 130);

        btnCuentaNueva.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnCuentaNueva.setText("Cuenta nueva");
        btnCuentaNueva.setToolTipText("");
        panelVentas.add(btnCuentaNueva);
        btnCuentaNueva.setBounds(800, 510, 150, 30);

        panelProductosVisual.setBackground(java.awt.Color.lightGray);
        panelProductosVisual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelProductosVisual.setLayout(null);

        tablaProdPedido.setBackground(java.awt.Color.white);
        tablaProdPedido.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        tablaProdPedido.setForeground(java.awt.Color.black);
        tablaProdPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Descripcion", "Precio", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProdPedido);
        if (tablaProdPedido.getColumnModel().getColumnCount() > 0) {
            tablaProdPedido.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaProdPedido.getColumnModel().getColumn(1).setPreferredWidth(50);
            tablaProdPedido.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        panelProductosVisual.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 610, 440);

        panelVentas.add(panelProductosVisual);
        panelProductosVisual.setBounds(330, 20, 630, 460);

        panelPrincipal.add(panelVentas);
        panelVentas.setBounds(0, 0, 970, 600);
        //fin de ventas ************************************
        
        //***********************************************************
        //todo esto es del menu del programa
        menuOpArchivo.setText("Archivo");
        menuOpArchivo.setToolTipText("");

        opGuardar.setText("Guardar");
        
        menuOpArchivo.add(opGuardar);

        menuPrincipal.add(menuOpArchivo);

        menuOpEditar.setText("Editar");
        menuPrincipal.add(menuOpEditar);
        
        menuOpOpciones.setText("Opciones");
        opCambiarPersonal.setText("Cambiar usuario ...");
        opCambiarPersonal.addActionListener(this);
        
        opAltaEmpleado.setText("Alta de empleado ...");
        opAltaEmpleado.addActionListener(this);
        opAltaProducto.setText("Registro de productos ...");
        opAltaProducto.addActionListener(this);
        
        opBajaEmpleado.setText("Baja de empleado ...");
        opBajaEmpleado.addActionListener(this);
        opBajaProducto.setText("Baja de producto ...");
        opBajaProducto.addActionListener(this);
        opModificarProducto.setText("Modificar producto ...");
        opModificarProducto.addActionListener(this);
        
        menuOpOpciones.add(opCambiarPersonal);
        menuOpOpciones.add(opAltaEmpleado);
        menuOpOpciones.add(opBajaEmpleado);
        menuOpOpciones.add(opAltaProducto);
        menuOpOpciones.add(opModificarProducto);
        menuOpOpciones.add(opBajaProducto);
        
        menuPrincipal.add(menuOpOpciones);
        
        setJMenuBar(menuPrincipal);
        //aqui termina la parte del menu del programa
        //**************************************************

        
        pack();
    }
    //otros metodos que estarán dentro de nuestra ventana principal
    //metodo action performed
    public void actionPerformed(ActionEvent evento) {
    	if(evento.getSource()==opCambiarPersonal) {
    		//debera de aparecer la ventana de login otra vez para que la persona cambie de turno
    		coordinador.mostrarLogin();
    	}
    	//si queremos dar de alta un empleado esto pasara
    	if(evento.getSource()==opAltaEmpleado) {
    		panelVentas.setVisible(false);
    		panelRegistro.setVisible(true);
    		panelEmpleadoRe.setVisible(true);
    		panelProductosRe.setVisible(false);
    		this.jPanelUpdate.setVisible(false);
    	}
    	//si queremos registrar un producto esto pasa
    	if(evento.getSource()==opAltaProducto) {
    		panelVentas.setVisible(false);
    		panelRegistro.setVisible(true);
    		panelProductosRe.setVisible(true);
    		panelEmpleadoRe.setVisible(false);
    		this.jPanelUpdate.setVisible(false);
    	}
    	//si queremos modificar un producto esto pasa
    	if(evento.getSource()==opModificarProducto) {
    		panelVentas.setVisible(false);
    		panelRegistro.setVisible(false);
    		panelProductosRe.setVisible(false);
    		panelEmpleadoRe.setVisible(false);
    		this.jPanelUpdate.setVisible(true);
    	}
    	// cuando registramos un empleado o producto debemos de esconder el formulario de registro
    	// y aparecer el formulario de ventas
    	if(evento.getSource() == this.btnRegistroEmp || evento.getSource() == this.btnRegistroProd || evento.getSource() == this.btnActualizar){
    		this.panelRegistro.setVisible(false);
    		this.jPanelUpdate.setVisible(false);
    		this.panelVentas.setVisible(true);
    	}
    }
    
    //setter and getter
    public void setCoordinador(Coordinador coordinador) {
    	this.coordinador=coordinador;
    }
    
    public void asignarPrivilegios(int rol) {
    	//validamos el rol
    	//el rol si es 1 entonces es administrador y tiene todos los privilegios y puede hacer de todas las opciones
    	if(rol == 1) {
    		opGuardar.setEnabled(true);
    		opAltaEmpleado.setEnabled(true);
    		opAltaProducto.setEnabled(true);
    		opBajaEmpleado.setEnabled(true);
    		opBajaProducto.setEnabled(true);
    	}else {
    		opGuardar.setEnabled(false);
    		opAltaEmpleado.setEnabled(false);
    		opAltaProducto.setEnabled(false);
    		opBajaEmpleado.setEnabled(false);
    		opBajaProducto.setEnabled(false);
    	}
    }

}
