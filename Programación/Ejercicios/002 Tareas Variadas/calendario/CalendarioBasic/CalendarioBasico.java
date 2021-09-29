
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private int diax;
    private int mesx;
    private int anox;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        // initialise instance variables
        diax = 1;
        mesx = 1;
        anox = 1;
    }

    public String obtenerFecha()
    {
        String sdia = "";
        String smes = "";
        String sano= "";
        if (diax <= 9) {
            sdia= "0"+diax;
        }
        else {
            sdia= ""+diax; 
        }
        if (mesx <= 9) {
            smes= "0"+mesx;
        }
        else {
            smes= ""+mesx; 
        }
        if (anox <= 9) {        
            sano= "0"+anox;
        }
        else {
            sano= ""+anox; 
        }

        return sdia +"-"+ smes + "-" + sano;
    }

    public void fijarFecha(int dia, int mes, int ano) {
        diax = dia;
        mesx = mes;
        anox = ano;
    }

    public void avanzarFecha() {
        diax += 1;
        if (diax > 30) {
            diax= 1;
            mesx +=1;
            if (mesx > 12) {
                mesx = 1;
                anox +=1;
            }
        }

    }
}
