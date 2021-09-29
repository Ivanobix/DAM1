import java.util.ArrayList;

public class Actividad9446 {
    public ArrayList<String> devolverAlReves(ArrayList<String> coleccion) {
        ArrayList<String> textoADevolver = new ArrayList<String>();
        int posicion = coleccion.size()-1;
        for (String palabra : coleccion) {
            textoADevolver.add(coleccion.get(posicion));
            posicion --;
        }
        return textoADevolver;
    }
}
