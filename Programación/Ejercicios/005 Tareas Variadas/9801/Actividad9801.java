import java.util.ArrayList;

public class Actividad9801 {
    public int puntuacionPalabra (String palabra) {
        int puntuacion= 0;
        ArrayList<String> bloquesLetras = new ArrayList<>();
        bloquesLetras.add("aeioulnrst"); //1
        bloquesLetras.add("dg"); //2
        bloquesLetras.add("bcmp"); //3
        bloquesLetras.add("fhvwy"); //4
        bloquesLetras.add("k"); //5
        bloquesLetras.add(""); //6
        bloquesLetras.add(""); //7
        bloquesLetras.add("jx");  //8
        bloquesLetras.add(""); //9
        bloquesLetras.add("qz"); //10
        int contador = 0;

        while(contador < palabra.length()) {
            String letra = palabra.substring(contador, contador + 1).toLowerCase();
            int contadorInterno = 0;
            while (contadorInterno < bloquesLetras.size()) {
                if (bloquesLetras.get(contadorInterno).contains(letra)) {
                    puntuacion = puntuacion + contadorInterno +1;
                }
                contadorInterno++;
            }   
            contador++;
        }
        if (palabra.equals("")) {
            puntuacion = -1;
        }
        
        return puntuacion;
    }
}