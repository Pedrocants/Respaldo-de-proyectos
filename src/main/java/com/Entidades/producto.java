package com.Entidades;

public class producto {
    private int ID;
    private String nombre="";
    private String estado;
    private float stock;

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    private int stoc;
    
   
    public producto() {
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
