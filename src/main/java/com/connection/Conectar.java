
package com.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 
public class Conectar {
    private static Connection con;
    
    private Conectar(){
        
    }
    public static Connection getInstance(){
        if(con==null){
            try{
                con=DriverManager.getConnection("jdbc:mysql://localhost/pna_gestion", "root", "");
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error de conexion "+e.getMessage());
        }
        }
     return con;
     } 
    public static void cerrar() throws SQLException{
        if(con!=null){
            con.close();
            con=null;
        }
    }

}
