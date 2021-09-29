import java.util.ArrayList;

public class Actividad3345 {
    public String devolverNumerosHastaElDoble(int ultimo) 
    {
        String textoADevolver = "1 ";
        int contador = 2;
        if (ultimo <= 0) {
            textoADevolver = "Negativo o cero";
        }
        else {
            while (contador != (ultimo*2)) {
                textoADevolver += contador;
                if (contador < (ultimo*2) - 1) {
                    textoADevolver += " ";
                }
                contador ++;
            }
        }
        return textoADevolver;
    }
}