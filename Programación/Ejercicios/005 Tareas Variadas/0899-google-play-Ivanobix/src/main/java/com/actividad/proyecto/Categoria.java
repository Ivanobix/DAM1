package com.actividad.proyecto;

public enum Categoria {
    JUEGOS("Juegos",5), COMUNICACIONES("Comunicaciones",2), PRODUCTIVIDAD("Productividad", 10), MULTIMEDIA("Multimedia", 2);

    private String nombre;
    private int precio;

    private Categoria (String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }

    public int getPrecioCategoria() {
        return precio;
    }
}
