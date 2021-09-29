import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Entrada{
    private String usuario = "";
    private LocalDateTime momentoPublicacion = LocalDateTime.now();
    private int cantidadMeGusta = 0;
    private ArrayList<String> comentarios;
    
    public Entrada (String autor) {
        usuario = autor;
        comentarios = new ArrayList<String>();
    }
    
    public void meGusta() {
        cantidadMeGusta ++;
    }
    
    public void addComentario(String texto) {
        comentarios.add(texto);
    }
    
    public LocalDateTime getMomentoPublicacion () {
        return momentoPublicacion;
    }
    
    public String getTiempoPasadoDesdeLaPublicacion() {
        return "Hace 10 segundos";
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public int getMeGusta() {
        return cantidadMeGusta;
    }
    
    public ArrayList<String> getComentarios() {
        return comentarios;
    }
}
