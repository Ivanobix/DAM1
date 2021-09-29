public class EntradaFoto extends Entrada{
    private String urlImagen = "";
    private String titulo = "";
    public EntradaFoto (String autor, String texto, String titulo) {
        super(autor);
        urlImagen = texto;
        this.titulo = titulo;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public String getTituloImagen() {
        return titulo;
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += urlImagen + "\n";
        aDevolver += titulo + "\n";
        aDevolver += "Me gusta: " + getMeGusta() + "\n";
        aDevolver += getTiempoPasadoDesdeLaPublicacion() + "\n";

        if (getComentarios().isEmpty()) {
            aDevolver += "No hay comentarios\n";
        }
        else {
            aDevolver = "Comentarios: \n";
            for (String comentario : getComentarios()) {
                aDevolver += "-" + comentario + "\n" ;
            }
        }
        return aDevolver;
    }
    /**
    private String getTiempoPasadoDesdeLaPublicacion() {
    String aDevolver = "Hace ";
    LocalDateTime aComparar = LocalDateTime.now();
    long segundosTotalesPasados = momentoPublicacion.until(aComparar, ChronoUnit.SECONDS);
    if (segundosTotalesPasados > 59) {
    long minutos = segundosTotalesPasados / 60;
    if (minutos == 1) {
    aDevolver += minutos + " minuto";
    }
    else if (minutos < 59) {
    aDevolver += minutos + " minutos";
    }
    else {
    long horas = minutos / 60;
    if (horas == 1){
    aDevolver += horas + " hora";
    }
    else if (horas < 24) {
    aDevolver += horas + " horas";

    }
    else {
    long dias = horas / 24;
    aDevolver += dias + " dias";
    }
    }
    }
    else {
    aDevolver += segundosTotalesPasados + " segundos";
    }
    return aDevolver;
    }
     **/   
}
