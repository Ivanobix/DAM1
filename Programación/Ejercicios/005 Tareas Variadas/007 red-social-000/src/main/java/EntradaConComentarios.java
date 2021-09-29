import java.util.ArrayList;

public class EntradaConComentarios extends Entrada
{
    private ArrayList<String> comentarios;
    
    public EntradaConComentarios(String autor)
    {
        super(autor);
        comentarios = new ArrayList<String>();
    }

    /**
     * Anade un comentario a a la entrada.
     * @param text El comentario a anadir.
     */
    public void addComentario(String texto) {
        comentarios.add(texto);
    }

    /**
     * Devuelve los comentarios de la publicacion.
     * @return Devuelve los comentarios de la publicacion.
     */
    public ArrayList<String> getComentarios() {
        return comentarios;
    }
    
    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver = super.toString();
        if (getComentarios().isEmpty()) {
            aDevolver += "No hay comentarios\n";
        }
        else {
            aDevolver += "Comentarios: \n";
            for (String comentario : getComentarios()) {
                aDevolver += "-" + comentario + "\n" ;
            }
        }
        return aDevolver;
    }
}
