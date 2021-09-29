package com.actividad.proyecto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Tests {

     @Test
     public void test01()
     {
          // Se crea la tienda
          GooglePlay googlePlay = new GooglePlay();

          // Se crean los usuarios de la tienda
          Usuario usuario1 = new Usuario("juan.fernandez@gmail.com");
          Usuario usuario2 = new Usuario("elena.perez@gmail.com");
          Usuario usuario3 = new Usuario("pedro.garcia@gmail.com");
          Usuario usuario4 = new Usuario("lorena.alonso@gmail.com");

          // Comprobaciones sobre los usuarios
          assertEquals("juan.fernandez@gmail.com", usuario1.getNombreCuenta());
          assertEquals("elena.perez@gmail.com", usuario2.getNombreCuenta());
          assertEquals("pedro.garcia@gmail.com", usuario3.getNombreCuenta());
          assertEquals("lorena.alonso@gmail.com", usuario4.getNombreCuenta());

          // Se añaden los usuarios a la tienda
          assertEquals(0, googlePlay.getNumeroUsuarios());
          googlePlay.addUsuario(usuario1);
          assertEquals(1, googlePlay.getNumeroUsuarios());
          googlePlay.addUsuario(usuario2);
          assertEquals(2, googlePlay.getNumeroUsuarios());
          googlePlay.addUsuario(usuario3);
          assertEquals(3, googlePlay.getNumeroUsuarios());
          googlePlay.addUsuario(usuario4);
          assertEquals(4, googlePlay.getNumeroUsuarios());

          // Se crean los productos
          Producto aplicaci1 = new Aplicacion("Spotify", 18.5, Categoria.MULTIMEDIA);
          Producto aplicaci2 = new Aplicacion("WhatsApp", 22.32, Categoria.COMUNICACIONES);
          Producto aplicaci3 = new Aplicacion("Pokemon GO", 32.5, Categoria.JUEGOS);
          Producto libro1 = new Libro("No culpes al karma", 2014, 329, true);
          Producto libro2 = new Libro("La chica del tren", 2015, 625, true);
          Producto libro3 = new Libro("El poder del ahora", 2011, 154, false);
          Producto pelicula1 = new Pelicula("El renacido", 2015, 156, 1080);
          Producto pelicula2 = new Pelicula("Casablanca", 1942, 102, 480);

          // Comprobaciones sobre las aplicaciones
          assertEquals("Spotify", ((Aplicacion)aplicaci1).getNombre());
          assertEquals("WhatsApp", ((Aplicacion)aplicaci2).getNombre());
          assertEquals("Pokemon GO", ((Aplicacion)aplicaci3).getNombre());
          assertEquals(18.5, ((Aplicacion)aplicaci1).getTamanoEnMB(), 0.001);
          assertEquals(22.32, ((Aplicacion)aplicaci2).getTamanoEnMB(), 0.001);
          assertEquals(32.5, ((Aplicacion)aplicaci3).getTamanoEnMB(), 0.001);
          assertEquals("Multimedia", ((Aplicacion)aplicaci1).getCategoria());
          assertEquals("Comunicaciones", ((Aplicacion)aplicaci2).getCategoria());
          assertEquals("Juegos", ((Aplicacion)aplicaci3).getCategoria());

          // Comprobaciones sobre los libros
          assertEquals("No culpes al karma",((ProductoMultimedia)libro1).getTitulo());
          assertEquals("La chica del tren",((ProductoMultimedia)libro2).getTitulo());
          assertEquals("El poder del ahora",((ProductoMultimedia)libro3).getTitulo());
          assertEquals(2014,((ProductoMultimedia)libro1).getAno());
          assertEquals(2015,((ProductoMultimedia)libro2).getAno());
          assertEquals(2011,((ProductoMultimedia)libro3).getAno());
          assertEquals(329,((Libro)libro1).getNumeroPaginas());
          assertEquals(625,((Libro)libro2).getNumeroPaginas());
          assertEquals(154,((Libro)libro3).getNumeroPaginas());
          assertEquals(true,((Libro)libro1).getFiccion());
          assertEquals(true,((Libro)libro2).getFiccion());
          assertEquals(false,((Libro)libro3).getFiccion());

          // Comprobaciones sobre las peliculas
          assertEquals("El renacido",((ProductoMultimedia)pelicula1).getTitulo());
          assertEquals("Casablanca",((ProductoMultimedia)pelicula2).getTitulo());
          assertEquals(2015,((ProductoMultimedia)pelicula1).getAno());
          assertEquals(1942,((ProductoMultimedia)pelicula2).getAno());
          assertEquals(156,((Pelicula)pelicula1).getDuracion());
          assertEquals(102,((Pelicula)pelicula2).getDuracion());
          assertEquals("FullHD",((Pelicula)pelicula1).getCalidad());
          assertEquals("HD",((Pelicula)pelicula2).getCalidad());

          // Se añaden los productos a la tienda
          assertEquals(0, googlePlay.getNumeroProductos());
          googlePlay.addProducto(aplicaci1);
          assertEquals(1, googlePlay.getNumeroProductos());
          googlePlay.addProducto(aplicaci2);
          assertEquals(2, googlePlay.getNumeroProductos());
          googlePlay.addProducto(aplicaci3);
          assertEquals(3, googlePlay.getNumeroProductos());
          googlePlay.addProducto(libro1);
          assertEquals(4, googlePlay.getNumeroProductos());
          googlePlay.addProducto(libro2);
          assertEquals(5, googlePlay.getNumeroProductos());
          googlePlay.addProducto(libro3);
          assertEquals(6, googlePlay.getNumeroProductos());
          googlePlay.addProducto(pelicula1);
          assertEquals(7, googlePlay.getNumeroProductos());
          googlePlay.addProducto(pelicula2);
          assertEquals(8, googlePlay.getNumeroProductos());
     }

     @Test
     public void test02()
     {
          // Se crea la tienda
          GooglePlay googlePlay = new GooglePlay();

          // Se crean los usuarios de la tienda
          Usuario usuario1 = new Usuario("juan.fernandez@gmail.com");
          Usuario usuario2 = new Usuario("elena.perez@gmail.com");
          Usuario usuario3 = new Usuario("pedro.garcia@gmail.com");
          Usuario usuario4 = new Usuario("lorena.alonso@gmail.com");

          // Se añaden los usuarios a la tienda
          googlePlay.addUsuario(usuario1);
          googlePlay.addUsuario(usuario2);
          googlePlay.addUsuario(usuario3);
          googlePlay.addUsuario(usuario4);

          // Se crean los productos
          Producto aplicaci1 = new Aplicacion("Spotify", 18.5, Categoria.MULTIMEDIA);
          Producto aplicaci2 = new Aplicacion("WhatsApp", 22.32, Categoria.COMUNICACIONES);
          Producto aplicaci3 = new Aplicacion("Pokemon GO", 32.5, Categoria.JUEGOS);
          Producto aplicaci4 = new Aplicacion("Gmail", 32.5, Categoria.PRODUCTIVIDAD);
          Producto libro1 = new Libro("No culpes al karma", 2014, 329, true);
          Producto libro2 = new Libro("La chica del tren", 2015, 625, true);
          Producto libro3 = new Libro("El poder del ahora", 2011, 154, false);
          Producto pelicula1 = new Pelicula("El renacido", 2015, 156, 1080);
          Producto pelicula2 = new Pelicula("Casablanca", 1942, 102, 480);

          // Se añaden los productos a la tienda
          googlePlay.addProducto(aplicaci1);
          googlePlay.addProducto(aplicaci2);
          googlePlay.addProducto(aplicaci3);
          googlePlay.addProducto(aplicaci4);
          googlePlay.addProducto(libro1);
          googlePlay.addProducto(libro2);
          googlePlay.addProducto(libro3);
          googlePlay.addProducto(pelicula1);
          googlePlay.addProducto(pelicula2);

          // Se realizan compras que no se pueden llevar a cabo
          assertEquals(-1, googlePlay.comprar("juan.fernandez@gmail.com", "Telegram"), 0.0001);
          assertEquals(-1, googlePlay.comprar("sonia@gmail.com", "Spotify"), 0.0001);

          // Se realizan compras correctas
          assertEquals(0.99, googlePlay.comprar("juan.fernandez@gmail.com", "Spotify"), 0.0001);
          assertEquals(0.99, googlePlay.comprar("elena.perez@gmail.com", "Spotify"), 0.0001);
          assertEquals(2.00, googlePlay.comprar("pedro.garcia@gmail.com", "Spotify"), 0.0001);
          assertEquals(0.99, googlePlay.comprar("juan.fernandez@gmail.com", "WhatsApp"), 0.0001);
          assertEquals(0.99, googlePlay.comprar("elena.perez@gmail.com", "WhatsApp"), 0.0001);
          assertEquals(2.00, googlePlay.comprar("pedro.garcia@gmail.com", "WhatsApp"), 0.0001);
          assertEquals(0.99, googlePlay.comprar("juan.fernandez@gmail.com", "Pokemon GO"), 0.0001);
          assertEquals(0.99, googlePlay.comprar("elena.perez@gmail.com", "Pokemon GO"), 0.0001);
          assertEquals(5.00, googlePlay.comprar("pedro.garcia@gmail.com", "Pokemon GO"), 0.0001);
          assertEquals(0.99, googlePlay.comprar("juan.fernandez@gmail.com", "Gmail"), 0.0001);
          assertEquals(0.99, googlePlay.comprar("elena.perez@gmail.com", "Gmail"), 0.0001);
          assertEquals(10.00, googlePlay.comprar("pedro.garcia@gmail.com", "Gmail"), 0.0001);
     }
}
