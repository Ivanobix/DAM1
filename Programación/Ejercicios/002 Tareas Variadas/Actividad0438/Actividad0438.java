/**
 * Una clase que permite devolver una cadena de caracteres invertida.
 */

public class Actividad0438
{
    public String invertirPalabrasDe4Letras(String palabra) {
        String palabraAInvertir = palabra;
        String palabraInvertida = "";
        if (palabraAInvertir.length() == 4){
            palabraInvertida = palabraAInvertir.substring(3) + palabraAInvertir.substring(2,3) + palabraAInvertir.substring(1,2)
            + palabraAInvertir.substring(0,1);
        }
        return palabraInvertida;
    } 
}     