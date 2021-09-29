/**
 * La clase PantallaReloj implementa una pantalla de reloj digital para un reloj
 * de 24 horas al estilo europeo. El reloj muestra las horas y los minutos. El rango del
 * reloj es de 00:00 (medianoche) a 23:59 (un minuto antes de medianoche).
 * 
 * La pantalla del reloj recibe "pulsos" a traves del metodo "pulso" a cada minuto y
 * reacciona incrementando la pantalla. Evidentemente, cuando los minutos pasan de nuevo 
 * a cero se incrementan las horas.
 *
 * @author Michael Kolling
 * @version 1.0
 */
public class PantallaReloj
{
    //La pantalla de las horas
    private PantallaDosDigitos pantallaHoras;
    //La pantalla de los minutos
    private PantallaDosDigitos pantallaMinutos;
    

    /**
     * Constructor de la clase PantallaReloj. Este constructor crea un nuevo reloj
     * con hora 00:00.
     */
    public PantallaReloj() {
        pantallaHoras = new PantallaDosDigitos(0, 24);
        pantallaMinutos = new PantallaDosDigitos(0, 60);
    }
    
    /**
     * Constructor de la clase PantallaReloj. Este constructor crea un nuevo reloj
     * con la hora especificada en los parametros.
     */
    public PantallaReloj(int horas, int minutos) {
        pantallaHoras = new PantallaDosDigitos(0, 24);
        pantallaMinutos = new PantallaDosDigitos(0, 60);
        setTiempo(horas, minutos);
    }
    
    /**
     * Este metodo debe invocarse una vez cada minuto. Provoca que la
     * pantalla del reloj avance un minuto.
     */
    public void pulso() {
        pantallaMinutos.incrementaValorAlmacenado();
        if (pantallaMinutos.getValorAlmacenado() == 0) {
            pantallaHoras.incrementaValorAlmacenado();
        }
    }
    
    /**
     * Fija la hora de la pantalla con la hora y los minutos especificados.
     */
    public void setTiempo(int horas, int minutos) {
        pantallaHoras.setValorAlmacenado(horas);
        pantallaMinutos.setValorAlmacenado(minutos);
    }
    
    /**
     * Devuelve la hora actual de esta pantalla en el formao HH:MM.
     */
    public String getTextoDeLaPantalla() {
        return pantallaHoras.getTextoDeLaPantalla() + ":" + pantallaMinutos.getTextoDeLaPantalla();
    }       

}
