import java.util.ArrayList;

public class Actividad9102 {

    public String separarConGuiones(String palabra) {
        String aDevolver = "";
        int contadorLetras = 0;
        while (contadorLetras < palabra.length() && palabra.length() > 0) {
            aDevolver += palabra.charAt(contadorLetras);
            aDevolver += (contadorLetras < palabra.length() - 1)? "-" : "";
            contadorLetras++;
        }
        return aDevolver;
    }
}   