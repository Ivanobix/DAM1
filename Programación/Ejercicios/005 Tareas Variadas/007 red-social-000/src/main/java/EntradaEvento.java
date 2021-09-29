import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Una entrada con texto
 *
 * Una entrada es un contenido que el usuario comparte en su muro con la comunidad.
 * Las entradas con imagenes se crean a partir de un autor y un contenido.
 *
 *  @author DAM
 *  @version 1.0
 */

public class EntradaEvento extends Entrada
{
    // Contenido de la entrada.
    private String evento;

    /**
     * Constructor - Construye entradas a partir de un autor y un contenido.
     * Las entradas se crean sin ningun ' me gusta'.
     * La fecha de publicacion coincide con el momento en el que se crea la entrada.
     * @param autor Autor de la entrada.
     * @param texto Contenido de la entrada.
     */
    public EntradaEvento (String autor, String texto) {
        super(autor);
        evento = texto;
    }

    /**
     * Devuelve el evento.
     * @return Devuelve el evento.
     */
    public String getEvento() {
        return evento;
    }
    
    @Override
    public void mostrarDetallesPorPantalla() {
        System.out.println(getEvento());
    }
    
    /**
     * Devuelve una cadena con toda la informacion de la entrada.
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver = super.toString();
        aDevolver += evento + "\n";
        return aDevolver;
    }
}