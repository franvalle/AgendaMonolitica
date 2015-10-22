package presentacion;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import javax.swing.JList;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;

public class GestorUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblDireccion;
	private JLabel lblCorreo;
	private JLabel lblTelfono;
	private JTable table;
	private JButton btnAñadir;
	private JButton btnModificar;
	private JButton btnEliminar;

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
		setBounds(100, 100, 735, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			textField = new JTextField();
			textField.setBounds(476, 72, 197, 22);
			contentPane.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(476, 135, 197, 22);
			contentPane.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(476, 208, 197, 22);
			contentPane.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(476, 288, 197, 22);
			contentPane.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			textField_4 = new JTextField();
			textField_4.setBounds(476, 368, 197, 22);
			contentPane.add(textField_4);
			textField_4.setColumns(10);
		}
		{
			lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(408, 75, 56, 16);
			contentPane.add(lblNombre);
		}
		{
			lblApellidos = new JLabel("Apellidos");
			lblApellidos.setBounds(408, 138, 56, 16);
			contentPane.add(lblApellidos);
		}
		{
			lblDireccion = new JLabel("Direccion");
			lblDireccion.setBounds(408, 211, 56, 16);
			contentPane.add(lblDireccion);
		}
		{
			lblCorreo = new JLabel("Correo ");
			lblCorreo.setBounds(408, 291, 107, 16);
			contentPane.add(lblCorreo);
		}
		{
			lblTelfono = new JLabel("Tel\u00E9fono");
			lblTelfono.setBounds(408, 371, 56, 16);
			contentPane.add(lblTelfono);
		}
		{
			table = new JTable();
			table.setBounds(26, 72, 331, 318);
			contentPane.add(table);
		}
		{
			btnAñadir = new JButton("A\u00D1ADIR CONTACTO");
			btnAñadir.setBounds(103, 458, 157, 25);
			contentPane.add(btnAñadir);
		}
		{
			btnModificar = new JButton("MODIFICAR CONTACTO");
			btnModificar.setBounds(290, 458, 174, 25);
			contentPane.add(btnModificar);
		}
		{
			btnEliminar = new JButton("ELIMINAR CONTACTO");
			btnEliminar.setBounds(499, 458, 157, 25);
			contentPane.add(btnEliminar);
		}
	}
}
