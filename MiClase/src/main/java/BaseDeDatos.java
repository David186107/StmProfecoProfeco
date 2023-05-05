import java.sql.*;

public class BaseDeDatos {
    //Configuración de la conexión a la base de datos
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=miBaseDeDatos";
    private static final String USUARIO = "Usuario";
    private static final String CONTRASENA = "ContrasenaAFK";

    //Método para obtener el valor de "nombre" de la base de datos
    public static String obtenerNombre() {
        String nombre = null;
        try {
            //Conexión a la base de datos
            Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);

            //Consulta SQL para obtener el valor de "nombre"
            String consulta = "SELECT nombre FROM miTabla WHERE id = 1";

            //Ejecución de la consulta
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(consulta);

            //Obtención del valor de "nombre" del resultado de la consulta
            if (resultado.next()) {
                nombre = resultado.getString("nombre");
            }

            //Cierre de la conexión y el resultado de la consulta
            resultado.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nombre;
    }
}