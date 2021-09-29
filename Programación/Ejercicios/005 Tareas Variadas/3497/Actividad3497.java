import java.util.ArrayList;

class Actividad3497
{
    public ArrayList<String> devolverPalabraMasLarga(ArrayList<String> palabras)
    {
        ArrayList<String> textoADevolver = new ArrayList<String>() ;
        String palabraMasLarga = "";
        for (String palabra : palabras) {
            if (palabra.length() == palabraMasLarga.length()) {
                textoADevolver.add(palabra);
            }
            else if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
                textoADevolver.clear();
                textoADevolver.add(palabra);
            }            
        }
        return textoADevolver;
    }
}
