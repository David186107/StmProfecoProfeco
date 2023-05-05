import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//esto fue sacado con chatgpt para luego ser implementado
public class ConexionBD {
    // URL de la base de datos
    static final String DB_URL = "jdbc:mysql://localhost/usuarios";
    
    // Credenciales de la base de datos
    static final String USER = "tu_usuario";
    static final String PASS = "tu_contraseña";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Paso 1: Registrar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Paso 2: Abrir la conexión
            System.out.println("Conectando a la base de datos...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Paso 3: Realizar operaciones en la base de datos
            // En este caso, no realizamos ninguna operación

            // Paso 4: Cerrar la conexión
            conn.close();
            System.out.println("Desconectado de la base de datos");
        } catch (SQLException se) {
            // Manejo de errores de JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Manejo de errores generales
            e.printStackTrace();
        } finally {
            // Bloque "finally" para asegurarnos de que se cierre la conexión
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}