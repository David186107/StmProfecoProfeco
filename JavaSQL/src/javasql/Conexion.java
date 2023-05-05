/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ITSON NAVOJOA
 */
public class Conexion {

    public static Connection GeConnection() {
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database = UsProf;"
                + "user = Master;"
                + "password = Master;"
                + "loginTimeout = 30;";

        try {
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return null;
    }
}
