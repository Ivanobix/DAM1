import java.util.ArrayList;

public class Actividad2007
{
    public String devolverEnOrden(ArrayList<String> palabras)  {
        String aDevolver = "";
        String palabraAAñadir = "";
        int cont = 0;
        ArrayList<String> copiaPalabras = new ArrayList<String>();
        for (String palabra: palabras) {
            copiaPalabras.add(palabra);
        }
        while (cont < palabras.size()) {
            int letrasPalabraMasLarga = 0;
            for (String palabra: copiaPalabras) {
                if (palabra.length() >= letrasPalabraMasLarga) {
                    letrasPalabraMasLarga = palabra.length();
                    palabraAAñadir = palabra;
                }
            }
            copiaPalabras.remove(palabraAAñadir);
            cont++;
            aDevolver += palabraAAñadir;
            aDevolver += (cont < palabras.size())?",":"";
        }
        return aDevolver;
    }
}
