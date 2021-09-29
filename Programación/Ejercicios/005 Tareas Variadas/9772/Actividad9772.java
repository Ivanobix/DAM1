import java.util.ArrayList;

public class Actividad9772
{
    public int cuantasPalabrasHayDeNLetras(ArrayList<String> coleccionPalabras, int numeroDeLetras) 
    {
        int valorADevolver = 0;
        for (String palabra : coleccionPalabras) {
            if (palabra.length() == numeroDeLetras) {
                valorADevolver ++;
            }
        }
        return valorADevolver;
    }
}