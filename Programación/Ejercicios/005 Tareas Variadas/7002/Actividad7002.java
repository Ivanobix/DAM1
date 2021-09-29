import java.util.ArrayList;

class Actividad7002
{
    public boolean esReversible(String frase) {
        boolean aDevolver = false;
        String fraseAlReves = "";
        int letraACambiar = frase.length() -1;
        while (letraACambiar < frase.length() && letraACambiar > -1) {
            fraseAlReves += frase.charAt(letraACambiar);
            letraACambiar--;
        }
        if (frase.toLowerCase().replaceAll(" ", "").equals(fraseAlReves.toLowerCase().replaceAll(" ", "")) && !frase.equals("")) {
            aDevolver = true;
        }
        return aDevolver;
    }   
}