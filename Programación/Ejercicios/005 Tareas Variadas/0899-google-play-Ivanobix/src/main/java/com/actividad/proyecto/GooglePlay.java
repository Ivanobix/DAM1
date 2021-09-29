package com.actividad.proyecto;

import java.util.ArrayList;

public class GooglePlay {
    private ArrayList<Producto> productos;
    private ArrayList<Usuario> usuarios;

    public GooglePlay() {
        productos = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    public int getNumeroProductos() {
        return productos.size();
    }

    public int getNumeroUsuarios() {
        return usuarios.size();
    }

    public double comprar(String correo, String identificador) {
        double aDevolver = -1;
        boolean existeCorreo = false;
        int contador = 0;

        while (!existeCorreo && contador < usuarios.size()) {
            Usuario usuarioActual = usuarios.get(contador);
            if (usuarioActual.getNombreCuenta().equals(correo)) {
                existeCorreo = true;
            }
            contador++;
        }
        if (existeCorreo){
            Producto prod = null;
            boolean existeIdentificador = false;
            contador = 0;

            while (!existeIdentificador && contador < productos.size()) {
                if (productos.get(contador).getIdentificador().equals(identificador)) {
                    existeIdentificador = true;
                    prod = productos.get(contador);
                }
                contador++;
            }
            if (existeIdentificador) {
                aDevolver = prod.getPrecio();
                prod.sumVenta();
            }
        }
        return aDevolver;
    }
}

