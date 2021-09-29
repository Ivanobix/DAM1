import java.util.ArrayList;
public class Actividad4009
{
    public String encontrarPalabraRepetida(ArrayList<String> palabras) {
        String aDevolver = null;
        int contadorExterno = 0;
        while (contadorExterno < palabras.size() && aDevolver == null) {
            int contadorInterno = contadorExterno + 1;
            String palabraABuscar = palabras.get(contadorExterno);
            while (contadorInterno < palabras.size() && aDevolver == null) {
                String palabraAComparar = palabras.get(contadorInterno);
                if (contadorExterno != contadorInterno && palabraABuscar.equals(palabraAComparar)) {
                    aDevolver = palabras.get(contadorExterno);  
                }
                contadorInterno++;
            }
            contadorExterno++;
        }
        return aDevolver;
    }
}