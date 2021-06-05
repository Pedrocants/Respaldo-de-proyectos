package com.DAOConnectionImp;

import com.DAOConnection.DaoAddProduct;
import com.Entidades.producto;
import com.connection.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DAOImpProduct implements DaoAddProduct {

    public DAOImpProduct() {
    }
    //Agregar a la base de datos.
    public void Agregar(producto P){
        String query="INSERT INTO producto VALUES(?,?,?,?)";
        
        Connection c=Conectar.getInstance();
        try {
            PreparedStatement pst=c.prepareStatement(query);
            pst.setInt(1, P.getID());
            pst.setString(2, P.getNombre());
            pst.setString(3, P.getEstado());
            pst.setInt(4, P.getStoc());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Operacion realizada con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error operacion fallida "+ex);
        }
    }  //quitar de la base de datos.
    public void quitar(int id){
        String query="DELETE FROM producto WHERE ID=?";
    }
    public producto [] Mostrar(){
        producto p[]=new producto[0];
        return p;
    }
        
    
    
}
