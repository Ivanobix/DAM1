import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Entrada{
    private String usuario = "";
    private LocalDateTime momentoPublicacion = LocalDateTime.now();
    private int cantidadMeGusta = 0;
    
    public Entrada (String autor) {
        usuario = autor;
    }
    
    /**
     * Anade un 'me gusta' a la entrada.
     */
    public void meGusta() {
        cantidadMeGusta ++;
    }
    
    /**
     * Devuelve la fecha de publicacion.
     * @return Devuelve la fecha de publicacion.
     */
    public LocalDateTime getMomentoPublicacion () {
        return momentoPublicacion;
    }
    
    /**
     * Devuelve el tiempo pasado desde la publicacion.
     * @return Devuelve el tiempo pasado desde la publicacion.
     */
    public String getTiempoPasadoDesdeLaPublicacion() {
        return "Escrito hace 10 segundos";
    }
    
    /**
     * Devuelve el usuario que ha creado la publicacion.
     * @return Devuelve el usuario que ha creado la publicacion.
     */
    public String getUsuario() {
        return usuario;
    }
    
    /**
     * Devuelve la cantidad de "me gusta" de la publicacion.
     * @return Devuelve la cantidad de "me gusta" de la publicacion.
     */
    public int getMeGusta() {
        return cantidadMeGusta;
    }
    
    public void mostrarDetallesPorPantalla() {
        System.out.println("");
    }
    
    /**
     * Devuelve una cadena con toda la informacion de la entrada.
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    public String toString() {
        String aDevolver = "";
        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + getMeGusta() + "\n";
        aDevolver += getTiempoPasadoDesdeLaPublicacion() + "\n";
        return aDevolver;
    }
}
