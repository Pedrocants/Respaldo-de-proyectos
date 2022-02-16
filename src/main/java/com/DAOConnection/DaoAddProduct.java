package com.DAOConnection;
import com.Entidades.producto;
import java.util.ArrayList;
public interface DaoAddProduct {
    
    public void Agregar(producto P);
    public void AgregarStock(int id, float stock);
    public producto buscarPorId(int id);
    public void quitar(int id); 
    public ArrayList<producto> Mostrar();
        
    
}
