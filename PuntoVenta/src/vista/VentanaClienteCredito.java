package vista;

import javax.swing.JDialog;

import controlador.Coordinador;

public class VentanaClienteCredito extends JDialog{
	//atributos
	private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnPagar;
    private javax.swing.JPanel panelClienteCreditos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAbonoCliente;
    private javax.swing.JLabel lbInstruccionCliente;
    private javax.swing.JLabel lbNombreCliente;
    private javax.swing.JLabel lbSaldoCliente;
    private javax.swing.JLabel lbTelefonoCliente;
    private javax.swing.JLabel lbTituloCliente;
    private javax.swing.JTable tablaCreditosCliente;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtPrecioDescuentoM;
    private javax.swing.JTextField txtPrecioMayo;
    private javax.swing.JTextField txtTelefonoCliente;
    private Coordinador miCoordinador;
    
    //constructor
    public VentanaClienteCredito(java.awt.Frame parent, boolean modal) {
    	super(parent,modal);
    	inicializacionComponentes();
    	setSize(950,500);
    	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    //metodos
    public void inicializacionComponentes(){
    	panelClienteCreditos = new javax.swing.JPanel();
        lbTituloCliente = new javax.swing.JLabel();
        lbInstruccionCliente = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        lbTelefonoCliente = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbNombreCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        lbAbonoCliente = new javax.swing.JLabel();
        txtPrecioMayo = new javax.swing.JTextField();
        lbSaldoCliente = new javax.swing.JLabel();
        txtPrecioDescuentoM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCreditosCliente = new javax.swing.JTable();
        btnPagar = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cuenta - Cliente");
        setMinimumSize(new java.awt.Dimension(450, 400));
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        panelClienteCreditos.setBackground(java.awt.Color.lightGray);
        panelClienteCreditos.setLayout(null);

        lbTituloCliente.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        lbTituloCliente.setForeground(new java.awt.Color(1, 1, 1));
        lbTituloCliente.setText("Cuenta Cliente");
        panelClienteCreditos.add(lbTituloCliente);
        lbTituloCliente.setBounds(10, 10, 250, 60);

        lbInstruccionCliente.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lbInstruccionCliente.setForeground(java.awt.Color.black);
        lbInstruccionCliente.setText("Ingrese la clave del cliente a buscar");
        panelClienteCreditos.add(lbInstruccionCliente);
        lbInstruccionCliente.setBounds(10, 60, 390, 50);

        txtBuscarCliente.setBackground(java.awt.Color.white);
        txtBuscarCliente.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        txtBuscarCliente.setForeground(java.awt.Color.black);
        panelClienteCreditos.add(txtBuscarCliente);
        txtBuscarCliente.setBounds(10, 110, 180, 30);

        btnBuscarCliente.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnBuscarCliente.setText("Buscar");
        panelClienteCreditos.add(btnBuscarCliente);
        btnBuscarCliente.setBounds(210, 110, 180, 30);

        lbTelefonoCliente.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        lbTelefonoCliente.setForeground(java.awt.Color.black);
        lbTelefonoCliente.setText("Telefono");
        panelClienteCreditos.add(lbTelefonoCliente);
        lbTelefonoCliente.setBounds(280, 190, 80, 19);

        txtTelefonoCliente.setBackground(java.awt.Color.white);
        txtTelefonoCliente.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        txtTelefonoCliente.setForeground(java.awt.Color.black);
        txtTelefonoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelClienteCreditos.add(txtTelefonoCliente);
        txtTelefonoCliente.setBounds(355, 185, 150, 31);
        panelClienteCreditos.add(jSeparator1);
        jSeparator1.setBounds(30, 155, 710, 10);

        lbNombreCliente.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        lbNombreCliente.setForeground(java.awt.Color.black);
        lbNombreCliente.setText("Nombre");
        panelClienteCreditos.add(lbNombreCliente);
        lbNombreCliente.setBounds(40, 190, 60, 19);

        txtNombreCliente.setBackground(java.awt.Color.white);
        txtNombreCliente.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        txtNombreCliente.setForeground(java.awt.Color.black);
        txtNombreCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelClienteCreditos.add(txtNombreCliente);
        txtNombreCliente.setBounds(105, 185, 150, 31);

        lbAbonoCliente.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        lbAbonoCliente.setForeground(java.awt.Color.black);
        lbAbonoCliente.setText("Abono");
        panelClienteCreditos.add(lbAbonoCliente);
        lbAbonoCliente.setBounds(40, 240, 60, 19);

        txtPrecioMayo.setBackground(java.awt.Color.white);
        txtPrecioMayo.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        txtPrecioMayo.setForeground(java.awt.Color.black);
        panelClienteCreditos.add(txtPrecioMayo);
        txtPrecioMayo.setBounds(105, 235, 150, 30);

        lbSaldoCliente.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        lbSaldoCliente.setForeground(java.awt.Color.black);
        lbSaldoCliente.setText("Saldo");
        panelClienteCreditos.add(lbSaldoCliente);
        lbSaldoCliente.setBounds(280, 245, 50, 19);

        txtPrecioDescuentoM.setBackground(java.awt.Color.white);
        txtPrecioDescuentoM.setForeground(java.awt.Color.black);
        panelClienteCreditos.add(txtPrecioDescuentoM);
        txtPrecioDescuentoM.setBounds(355, 235, 150, 30);

        tablaCreditosCliente.setBackground(java.awt.Color.white);
        tablaCreditosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Credito", "Total", "Status", "Abono", "Saldo"
            }
        ));
        jScrollPane1.setViewportView(tablaCreditosCliente);

        panelClienteCreditos.add(jScrollPane1);
        jScrollPane1.setBounds(40, 290, 690, 180);

        btnPagar.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnPagar.setText("Pagar");
        panelClienteCreditos.add(btnPagar);
        btnPagar.setBounds(540, 210, 170, 30);

        getContentPane().add(panelClienteCreditos);
        panelClienteCreditos.setBounds(0, 0, 970, 500);

        pack();
    }
    //metodos getter and setter
    public void setCoordinador(Coordinador miCoordinador) {
    	this.miCoordinador = miCoordinador;
    }
}
