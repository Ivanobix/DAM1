package com.actividad.proyecto;

public class Aplicacion extends Producto{
    private String nombre;
    private double tamanoEnMB;
    private Categoria categoria;
    private static final double PRECIO_INICIAL = 0.99;
    private static final int UNIDADES_VENDIDAS_CAMBIO_PRECIO = 2;


    public Aplicacion(String nombre, double tamanoEnMB, Categoria categoria) {
        this.nombre = nombre;
        this.tamanoEnMB = tamanoEnMB;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria.getNombre();
    }

    public double getTamanoEnMB() {
        return tamanoEnMB;
     }

     @Override
     public String getIdentificador() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        double aDevolver = PRECIO_INICIAL;
        if (getVecesVendido() >= UNIDADES_VENDIDAS_CAMBIO_PRECIO) {
            aDevolver = categoria.getPrecioCategoria();
        }
        return aDevolver;
    }
}
