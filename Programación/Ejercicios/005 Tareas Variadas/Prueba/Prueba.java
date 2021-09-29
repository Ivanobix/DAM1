import java.util.HashSet;
import java.util. Iterator;
import java.util.HashMap;
public class Prueba
{
    public void mostrarNumeros() {
        for (int numero = 1; numero <= 10 ; numero++) {
            System.out.println(numero);
        }
    }

    public void muestraNumerosEntre(int a, int b) {
        for (int contador = a; contador <= b; contador++) {
            System.out.println(contador);
        }
    }

    public void muestraNumerosParesEntre(int a, int b) {
        for (int contador = a; contador <= b; contador += contador++) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
        }
    }

    public void muestraNavesEspaciales(int tamano, int numeroNaves) {
        String aDevolver = "";
        for (int i = 0; i < numeroNaves; i++) {
            for (int j = 0; j < tamano; j++) {
                aDevolver += "*";
            }
            aDevolver += "\n";
        }
        System.out.println(aDevolver);
    }

    /**
     * Método que muestra una pirámide de base "base". Se asume que base siempre es
     * impar y mayor que 0. La piramide esta formado por asteriscos.
     */
    public static void muestraPiramide(int base) {
        String piramide = "";
        int numeroDeLineasADibujar = (base +1)/2;
        for (int numeroLineaActual = 1; numeroLineaActual <= numeroDeLineasADibujar; numeroLineaActual++) {
            int numeroEspacios = numeroDeLineasADibujar - numeroLineaActual;
            for (int i = 0; i <= numeroEspacios; i++) {
                piramide += " ";
            }
            int numeroAsteriscos = (numeroLineaActual*2) -1;
            for (int i = 0; i < numeroAsteriscos; i++) {
                piramide += "*";
            }
            piramide += "\n";
        }
        System.out.println(piramide);
    }

    public static void conversionesStringAInt() {
        String numeroEnTexto = "5";
        int numero = Integer.parseInt(numeroEnTexto);
        System.out.println(numero);

    }

    public static void conversionesIntAString() {
        int numero = 28;
        String numeroEnTexto = String.valueOf(numero);
        System.out.println(numeroEnTexto);
    }

    public static void pruebaHashSet() {
        HashSet<String> coleccion = new HashSet<String>(); 
        coleccion.add("a"); 
        coleccion.add("b"); 
        coleccion.add("c"); 
        Iterator it = coleccion.iterator(); 
        while (it.hasNext()) { 
            System.out.println(it.next()); 
        } 
    } 
}