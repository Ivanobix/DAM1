package com.actividad.proyecto;

public abstract class Producto {
    private int vecesVendido;

    public Producto() {
        vecesVendido = 0;
    }

    public void sumVenta() {
        vecesVendido++;
    }

    public int getVecesVendido() {
        return vecesVendido;
    }

    public abstract String getIdentificador();

    public abstract double getPrecio();
}
