
/**
 * PantallaHoraYFecha es una clase que representa la fecha
 * y las horas en un solo mensaje.
 */
public class PantallaHoraYFecha{
    private PantallaDosDigitos pantallaDia;
    private PantallaDosDigitos pantallaMes;
    private PantallaDosDigitos pantallaAno;
    private PantallaDosDigitos pantallaHoras;
    private PantallaDosDigitos pantallaMinutos;

    /**
     * Constructor de la clase PantallaHoraYFecha con valores predefinidos
     */
    public PantallaHoraYFecha(){
        pantallaDia = new PantallaDosDigitos(1,31);
        pantallaMes = new PantallaDosDigitos(1,13);
        pantallaAno = new PantallaDosDigitos(1, 100);
        pantallaHoras = new PantallaDosDigitos(0, 24);
        pantallaMinutos = new PantallaDosDigitos(0, 60);
    }

    
    /**
     * Muestra por pantalla el valor de la fecha y la hora
     */
    public String getFechaYHora(){
        return pantallaHoras.getTextoDeLaPantalla() + ":" + pantallaMinutos.getTextoDeLaPantalla() + " "+ pantallaDia.getTextoDeLaPantalla()
        + "-" + pantallaMes.getTextoDeLaPantalla() + "-" + pantallaAno.getTextoDeLaPantalla();
    }

    
    /**
     * Permite avanzar un minuto la fecha y hora
     */
    public void avanzarMinuto(){
        pantallaMinutos.incrementaValorAlmacenado();
        if (pantallaMinutos.getValorAlmacenado() == 0){
            pantallaHoras.incrementaValorAlmacenado();
            if (pantallaHoras.getValorAlmacenado() == 0){
                pantallaDia.incrementaValorAlmacenado();
                if (pantallaDia.getValorAlmacenado() == 1){
                    pantallaMes.incrementaValorAlmacenado();
                    if (pantallaMes.getValorAlmacenado() == 1){
                        pantallaAno.incrementaValorAlmacenado();
                    }
                }
            }
        }
    }

    
    /**
     * Permite fijar la fecha y la hora mediante parámetros
     */    
    public void fijarFechaYHora(int hora, int minuto, int dia, int mes, int ano){
        pantallaHoras.setValorAlmacenado(hora);
        pantallaMinutos.setValorAlmacenado(minuto);
        pantallaDia.setValorAlmacenado(dia);
        pantallaMes.setValorAlmacenado(mes);
        pantallaAno.setValorAlmacenado(ano);
    }
}
