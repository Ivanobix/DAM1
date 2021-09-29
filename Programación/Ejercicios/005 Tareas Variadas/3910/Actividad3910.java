import java.util.ArrayList;

public class Actividad3910
{
    public String encontrarPalabraConMasAes(ArrayList<String> palabras) {
        String aDevolver = null;
        int puntuacionMasAlta = 1;
        for (String palabra : palabras) {
            int puntuacion = 0;
            int posicionLetra = 0;
            while (posicionLetra < palabra.length()) {
                if (palabra.toLowerCase().charAt(posicionLetra) == 'a') {
                    puntuacion++;
                }
                posicionLetra++;
            }
            if (puntuacion >= puntuacionMasAlta) {
                puntuacionMasAlta = puntuacion;
                aDevolver = palabra;
            }
        }
        return aDevolver;
    }
}
