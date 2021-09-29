package com.actividad.proyecto;

public class Pelicula extends ProductoMultimedia{
    private int duracion;
    private int calidad;
    private static final int FULLHD = 1080;

    public Pelicula(String titulo, int anoCreacion, int duracion, int calidad) {
        super(titulo, anoCreacion);
        this.duracion = duracion;
        this.calidad = calidad;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getCalidad() {
        String aDevolver = "HD";
        if (calidad >= FULLHD) {
            aDevolver = "FullHD";
        }
        return aDevolver;
    }
    @Override
    public double getPrecio() {
        double aDevolver = 0;
        if (calidad == 1080) {
            aDevolver = 10;
        }
        else {
            aDevolver = 5;
        }
        if (super.getAno() < 2000) {
            aDevolver = aDevolver/2;
        }
        return aDevolver;
    }
}
