package persistencia;
import java.sql.*;


public class Agente {

	//Instancia del agente
    protected static Agente mInstancia=null;
    
    //Conexion con la base de datos
    protected static Connection mBD;
    
    //Nombre del identificador de la base de datos (:agendaMono)
    private static String url="jdbc:mysql://localhost/agendaMono"; 			
    
	// Driver para conectar con bases de datos MySQL
	private static String driver = "com.mysql.jdbc.Driver";

	// Constructor
	private Agente() throws Exception {
		conectar();
	}
	
	// Implementacion del patron singleton
	// http://es.wikipedia.org/wiki/Singleton
	public static Agente getAgente() throws Exception {
		if (mInstancia == null) {
			mInstancia = new Agente();
		}
		return mInstancia;
	}

	// Metodo para realizar la conexion a la base de datos
	private static void conectar() throws Exception {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			System.out.println("ERROR DE PUENTE: " + e.toString());
		}
		try {
			mBD = DriverManager.getConnection(url);
		} catch (Exception e) {
			System.out.println("No se ha podido establecer conexion");
		}
	}

	// Metodo para desconectar de la base de datos
	public void desconectar() throws Exception {
		mBD.close();
	}

	// Metodo para realizar una insercion en la base de datos
	public int insert(String SQL) throws SQLException, Exception {
		conectar();
		PreparedStatement stmt = mBD.prepareStatement(SQL);
		int res = stmt.executeUpdate();
		stmt.close();
		desconectar();
		return res;
	}

	// Metodo para realizar una eliminacion en la base de datos
	public int delete(String SQL) throws SQLException, Exception {
		PreparedStatement stmt = mBD.prepareStatement(SQL);
		int res = stmt.executeUpdate();
		stmt.close();
		desconectar();
		return res;
	}

	// Metodo para realizar una eliminacion en la base de datos
	public int update(String SQL) throws SQLException, Exception {
		conectar();
		PreparedStatement stmt = mBD.prepareStatement(SQL);
		int res = stmt.executeUpdate();
		stmt.close();
		desconectar();
		return res;
	}

	public Vector<Object> select(String SQL) throws SQLException, Exception {

		conectar();
		PreparedStatement stmt = mBD.prepareStatement(SQL);

		Vector<Object> res = new Vector<Object>(); // Lo vamos a devolver como
													// resultado, almacena los
													// usuarios en un vector.
		Vector<Object> campos = new Vector<Object>(); // Este vector es
														// auxiliar, lo
														// agregaremos al otro
														// vector res. Almacena
														// el campo login y
														// password, que denota
														// un usuario.
		ResultSet auxiliar = stmt.executeQuery(); // Nos ayudara a introducir
													// los datos de la base de
													// datos en el vector
													// campos.

		while (auxiliar.next()) {
			campos.add(auxiliar.getObject("login"));
			campos.add(auxiliar.getObject("password"));
			res.add(campos); // Adherimos la matriz auxiliar a la que vamos a
								// devolver.
		}

		stmt.close();
		desconectar();

		return res;

		/*
		 * Metodo para realizar una busqueda o seleccion de informacion enla
		 * base de datos El método select develve un vector de vectores, donde
		 * cada uno de los vectores que contiene el vector principal representa
		 * los registros que se recuperan de la base de datos.
		 */
	}
}
