package com.DAOConnection;
import com.Entidades.producto;
public interface DaoAddProduct {
    
    public void Agregar(producto P);
    public void quitar(int id);
    public producto [] Mostrar();
        
    
}
