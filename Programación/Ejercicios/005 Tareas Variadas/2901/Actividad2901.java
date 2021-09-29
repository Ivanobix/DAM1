import java.util.ArrayList;

public class Actividad2901
{
    public int sumaDeMultiplos(int numero, int valorTope)  {
        int aDevolver = -1;
        int contador = 0;
        int valorSuma = 0;
        if (numero > 0 && valorTope%numero == 0) {
            aDevolver = 0;
            while (contador < valorTope - numero) {
                valorSuma += numero;
                aDevolver += valorSuma;
                contador += numero;
            }
        }
        return aDevolver;
    }
}  
