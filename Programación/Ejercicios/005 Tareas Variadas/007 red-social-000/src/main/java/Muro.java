import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 * El muro de nuestra red social.
 *
 * El muro es el lugar donde los usuarios publicaran sus entradas.
 *
 * @author DAM
 * @version 1.0
 */
public class Muro
{
    private ArrayList <Entrada> entradas;

    /**
     * Constructor - Construye e inicializa un muro vacio.
     */
    public Muro() {
        entradas = new ArrayList<>();
    }

    /**
     * Anade una entrada de texto al muro.
     * @param entrada La entrada de texto a anadir.
     */
    public void addEntrada(Entrada entrada) {
        entradas.add(entrada);
    }

    public void mostrarDetallesTodasLasEntradas() {
        for (Entrada entrada : entradas) {
            entrada.mostrarDetallesPorPantalla();
        }
    }
    
    public String[] getUrlsFotos() {
        int cont = 0;
        ArrayList <String> encontradas = new ArrayList<String>();
        for (Entrada entrada : entradas) {
            if (entrada instanceof EntradaFoto) {
                cont++;
                EntradaFoto enlace = (EntradaFoto)entrada;
                encontradas.add(enlace.getUrlImagen());
            }
        }
        String listaUrls[] = new String[cont];
        int contDos = 0;
        for (String url : encontradas) {
            listaUrls[contDos] = url;
            contDos++;
        }
        return listaUrls;
    }
    
    /**
     * Devuelve una cadena con toda la informacion del muro.
     * @return Devuelve una cadena con toda la informacion del muro.
     */
    @Override
    public String toString() {
        String aDevolver = "";
        for (Entrada entrada : entradas) {
            aDevolver += entrada + "\n\n";
        }
        return aDevolver;
    }
}

