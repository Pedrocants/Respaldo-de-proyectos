package com.DAOConnection;
import com.Entidades.Factura;
public interface DaoFactura {
    public void Agregar(Factura f);
    public void Borrar(int id);
    public Factura [] Mostrar(int nro);
    public Factura [] ListarTodo();
}
