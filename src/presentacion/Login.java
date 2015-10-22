package presentacion;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tftUsuario;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lblUsuario;
	private JLabel lblContrasena;
	private JPasswordField tftContrasena;
	private final String password = "prueba";
	private JLabel lblInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Login.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-more-details.png")));
		setTitle("Login ");
		setResizable(false);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			tftUsuario = new JTextField();
			tftUsuario.addActionListener(new TftUsuarioActionListener());
			tftUsuario.setToolTipText("Introducir el usuario para acceder a la agenda.");
			tftUsuario.setBounds(230, 65, 163, 22);
			contentPane.add(tftUsuario);
			tftUsuario.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setToolTipText("Acceder a la agenda.");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (String.valueOf(tftContrasena.getPassword()).isEmpty()) {
						lblInfo.setText("Introduccir contraseña");
						lblInfo.setBackground(Color.RED);
					} else {
						if (String.valueOf(tftContrasena.getPassword()).toString().equals(password)) {

							lblInfo.setText("Dentro");
							lblInfo.setBackground(Color.GREEN);
							GestorUsuario gestor = new GestorUsuario();
							gestor.setVisible(true);
							gestor.setLocationRelativeTo(null);
						
						} else {
							lblInfo.setText("Contraseña incorrecta");
							lblInfo.setBackground(Color.RED);
						}
					}
				}
			});
			btnAceptar.setBounds(146, 195, 109, 37);
			contentPane.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setToolTipText("Salir del login.");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			btnCancelar.setBounds(282, 195, 109, 37);
			contentPane.add(btnCancelar);
		}
		{
			lblUsuario = new JLabel("Usuario");
			lblUsuario.setBounds(146, 68, 56, 16);
			contentPane.add(lblUsuario);
		}
		{
			lblContrasena = new JLabel("Contrase\u00F1a");
			lblContrasena.setBounds(146, 113, 72, 16);
			contentPane.add(lblContrasena);
		}
		{
			tftContrasena = new JPasswordField();
			tftContrasena.setToolTipText("Introducir la contrase\u00F1a para acceder a la agenda.");
			tftContrasena.setBounds(230, 110, 163, 22);
			contentPane.add(tftContrasena);
		}
		{
			lblInfo = new JLabel("");
			lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
			lblInfo.setOpaque(true);
			lblInfo.setBounds(146, 142, 247, 40);
			contentPane.add(lblInfo);
		}
	}

	private class TftUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			tftContrasena.enable();
			tftContrasena.requestFocus();
		}
	}
}
