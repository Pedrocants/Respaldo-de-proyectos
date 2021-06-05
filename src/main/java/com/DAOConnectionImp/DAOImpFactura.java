package com.DAOConnectionImp;
import com.DAOConnection.DaoFactura;
import com.Entidades.Factura;
public class DAOImpFactura implements DaoFactura {

    @Override
    public void Agregar(Factura f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Borrar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Factura[] Mostrar(int nro) {
        Factura f[]=new Factura[0];
        return f;
    }

    @Override
    public Factura[] ListarTodo() {

        Factura f[]=new Factura[1];
    return f;
    }
    
}
