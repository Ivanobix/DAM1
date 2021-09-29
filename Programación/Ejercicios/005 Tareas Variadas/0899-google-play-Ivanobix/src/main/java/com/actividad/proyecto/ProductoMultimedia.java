package com.actividad.proyecto;

public abstract class ProductoMultimedia extends Producto{
    private String titulo;
    private int ano;

    public ProductoMultimedia(String titulo, int ano) {
        super();
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String getIdentificador() {
        return titulo;
    }
}
