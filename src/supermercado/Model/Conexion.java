/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.Model;
import java.sql.*;
/**
 *
 * @author bdani
 */
public class Conexion {

    public  void conectar ()  {
        try {
            
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("error no se pudo encontrar el driver mysql"+ex);
        }
        Connection connection = null;
        
        connection = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/supermercado","root", "");
        boolean valid = connection.isValid(50000);
        System.out.println(valid ?"tes ok":"tes fallido");
          } catch (java.sql.SQLException sqle) {
              System.out.println("error chala head chala: " + sqle);
        }
     }
    public void conectar(String host, String port, String database,
        String user, String password) {
    String url = null;
    try {
        // We register the MySQL driver
        // Registramos el driver de MySQL
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar el driver de MySQL: " + ex);
        }
        Connection connection = null;
        url ="jdbc:mysql://" + host + ":" + port + "/" + database;
        // Database connect
        // Conectamos con la base de datos
        connection = DriverManager.getConnection(
                url,
                user, password);           
        boolean valid = connection.isValid(50000);
        System.out.println(valid ? "TEST OK" : "TEST FAIL");
    } catch (java.sql.SQLException sqle) {
        System.out.println("Error al conectar con la base de datos de MySQL (" + url + "): " + sqle);
    }
}    
    
      }
    

