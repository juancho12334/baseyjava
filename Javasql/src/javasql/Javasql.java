/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javasql;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OBMTRADING
 */
public class Javasql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/javabase";
        Connection conexion;
        Statement statement;
        ResultSet rs;
                
                
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Javasql.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conexion = DriverManager.getConnection(url,usuario,password);
            statement = conexion.createStatement();
            statement.executeUpdate("INSERT INTO USUARIOS(NOMBRE,CEDULA) VALUES('jhon','117343552')");
            rs = statement.executeQuery("SELECT * FROM USUARIOS");
            rs.next();
            do{
                System.out.print(rs.getInt("id_usuario")+" : "+rs.getString("nombre"));
            }while(rs.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(Javasql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

        
    
    

