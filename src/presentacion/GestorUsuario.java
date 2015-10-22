package presentacion;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.Toolkit;
import javax.swing.BoxLayout;
import javax.swing.JList;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.Box;
import java.awt.Component;

public class GestorUsuario extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panelDatos;
	private JPanel panelBotones;
	private JPanel panelTabla;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblDireccion;
	private JLabel lblCorreo;
	private JLabel lblTelefono;
	private JTextField tftNombre;
	private JTextField tftApellidos;
	private JTextField tftDireccion;
	private JTextField tftCorreo;
	private JTextField tftTelefono;
	private JButton btnAadirContacto;
	private JButton btnModificarContacto;
	private JButton btnEliminarContacto;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorUsuario frame = new GestorUsuario();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GestorUsuario() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(GestorUsuario.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-more-details.png")));
		setTitle("Agenda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			panel = new JPanel();
			panel.setBounds(12, 13, 705, 474);
			contentPane.add(panel);
			panel.setLayout(null);
			{
				panelDatos = new JPanel();
				panelDatos.setBounds(400, 24, 275, 355);
				panel.add(panelDatos);
				panelDatos.setLayout(null);
				{
					lblNombre = new JLabel("Nombre");
					lblNombre.setBounds(12, 16, 56, 16);
					panelDatos.add(lblNombre);
				}
				{
					lblApellidos = new JLabel("Apellidos");
					lblApellidos.setBounds(12, 97, 56, 16);
					panelDatos.add(lblApellidos);
				}
				{
					lblDireccion = new JLabel("Direccion");
					lblDireccion.setBounds(12, 174, 56, 16);
					panelDatos.add(lblDireccion);
				}
				{
					lblCorreo = new JLabel("Correo");
					lblCorreo.setBounds(12, 257, 56, 16);
					panelDatos.add(lblCorreo);
				}
				{
					lblTelefono = new JLabel("Telefono");
					lblTelefono.setBounds(12, 326, 56, 16);
					panelDatos.add(lblTelefono);
				}
				{
					tftNombre = new JTextField();
					tftNombre.setBounds(78, 13, 185, 22);
					panelDatos.add(tftNombre);
					tftNombre.setColumns(10);
				}
				{
					tftApellidos = new JTextField();
					tftApellidos.setBounds(78, 91, 185, 22);
					panelDatos.add(tftApellidos);
					tftApellidos.setColumns(10);
				}
				{
					tftDireccion = new JTextField();
					tftDireccion.setBounds(78, 171, 185, 22);
					panelDatos.add(tftDireccion);
					tftDireccion.setColumns(10);
				}
				{
					tftCorreo = new JTextField();
					tftCorreo.setBounds(78, 250, 185, 22);
					panelDatos.add(tftCorreo);
					tftCorreo.setColumns(10);
				}
				{
					tftTelefono = new JTextField();
					tftTelefono.setBounds(78, 320, 134, 22);
					panelDatos.add(tftTelefono);
					tftTelefono.setColumns(10);
				}
			}
			{
				panelBotones = new JPanel();
				panelBotones.setBounds(26, 427, 649, 35);
				panel.add(panelBotones);
				panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				{
					btnAadirContacto = new JButton("A\u00D1ADIR CONTACTO");
					panelBotones.add(btnAadirContacto);
				}
				{
					btnModificarContacto = new JButton("MODIFICAR CONTACTO");
					panelBotones.add(btnModificarContacto);
				}
				{
					btnEliminarContacto = new JButton("ELIMINAR CONTACTO");
					panelBotones.add(btnEliminarContacto);
				}
			}
			{
				panelTabla = new JPanel();
				panelTabla.setBounds(27, 24, 361, 355);
				panel.add(panelTabla);
				panelTabla.setLayout(new BorderLayout(0, 0));
				{
					String[] nombreColumnas = {"Nombre","Apellidos","Direccion","Correo","Telefono"};
					 Object[][] data = {
							 {"Mary", "Campifrfrfrfrrfone",
							 "Esquiar", new Integer(5), new Boolean(false)},
							 {"Lhucas", "Hudedededdeeddeeml",
							 "Patinar", new Integer(3), new Boolean(true)},
							 {"Kathya", "Walrath",
							 "Escalar", new Integer(2), new Boolean(false)},
							 {"Marcus", "Andrews",
							 "Correr", new Integer(7), new Boolean(true)},
							 {"Angela", "Lalth",
							 "Nadar", new Integer(4), new Boolean(false)}
							 };
					DefaultTableModel modeloTabla= new DefaultTableModel(nombreColumnas,0);					
					table = new JTable(modeloTabla);
					modeloTabla.addRow(data[1]);
					
					JScrollPane scrollPane = new JScrollPane(table);
					panelTabla.add(scrollPane, BorderLayout.CENTER);
					
				}
			}
		}
	}
}
