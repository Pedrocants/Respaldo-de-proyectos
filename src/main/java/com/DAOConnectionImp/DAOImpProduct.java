package com.DAOConnectionImp;

import com.DAOConnection.DaoAddProduct;
import com.Entidades.producto;
import com.connection.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
            pst.setFloat(4, P.getStock());
           pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Operacion realizada con exito");
            Conectar.cerrar();
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error operacion fallida "+ex);
        
        }catch (NullPointerException ex){
        
            System.err.println(" "+ex.getMessage());
        
        }catch (Exception e){
            
            System.err.println("Error: "+e.getMessage());
        
        }
    }  
    public void AgregarStock(int id, float stock){
        String query="UPDATE producto set Stock =? WHERE ID="+id;
        Connection c=Conectar.getInstance();
        
        try{
            PreparedStatement pst=c.prepareStatement(query);
            pst.setFloat(1, stock);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Operacion confirmada con exito.");
            Conectar.cerrar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public producto buscarPorId(int id){
        producto p;
        String query="SELECT * FROM producto WHERE ID="+id;
        Connection c=Conectar.getInstance();
        try{
            PreparedStatement pst=c.prepareCall(query);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                p=new producto();
                p.setID(id);
                p.setNombre(rs.getString(2));
                p.setEstado(rs.getString(3));
                p.setStock(rs.getFloat(4));
                Conectar.cerrar();
                return p;
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
//quitar de la base de datos.
    public void quitar(int id){
        String query="DELETE FROM producto WHERE ID="+id;
        try{
            Connection c=Conectar.getInstance();
             PreparedStatement pst=c.prepareStatement(query);
             pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Operacion confirmada con exito.");
            Conectar.cerrar();
        }catch(SQLException e){
            System.out.println("Error");
        }
    }
    public ArrayList<producto> Mostrar(){
        ArrayList<producto> p=new ArrayList<producto>();
        String query="SELECT * FROM producto";
        producto prs;
        try{
                Connection c=Conectar.getInstance();
                PreparedStatement pst=c.prepareStatement(query);
                ResultSet rs=pst.executeQuery();
                
                while (rs.next()){
                    prs=new producto();
                    prs.setID(rs.getInt("ID"));
                    prs.setNombre(rs.getString("Nombre"));
                    prs.setEstado(rs.getString("Tipo"));
                    prs.setStock((int)rs.getFloat("Stock"));
                    p.add(prs);
                }Conectar.cerrar();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch (NullPointerException ex){
            System.out.println("Objeto nullo "+ex.getMessage());
        }catch (Exception g){
            JOptionPane.showMessageDialog(null, g.getMessage());
        }
        
        return p;
    }
        
    
    
}
