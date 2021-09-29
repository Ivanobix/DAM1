package com.actividad.proyecto;

public class Libro extends ProductoMultimedia{

    private  int numPag;
    private boolean ficcion;

    public Libro(String titulo, int anoCreacion, int numPag, boolean ficcion) {
        super(titulo, anoCreacion);
        this.numPag = numPag;
        this.ficcion = ficcion;
    }

    public int getNumeroPaginas() {
        return numPag;
    }

    public boolean getFiccion() {
        return ficcion;
    }

    @Override
    public double getPrecio() {
        double aDevolver = 0;
        aDevolver = (numPag/100) - numPag%100;
        aDevolver = aDevolver * (getAno() - 2010);
        return aDevolver;
    }
}
