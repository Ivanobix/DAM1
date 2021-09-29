/**
 * La clase PantallaDosDigitos representa una pantalla que muestra valores numéricos enteros 
 * desde un valor inicial a un valor limite. El valor de la pantalla se muestra siempre con dos dígitos. 
 * Los valores iniciales y limite se especifican cuando se crea el objeto. Se puede hacer avanzar el valor 
 * mostrado por la pantalla a traves de un método, de tal manera que si el valor llega el limite vuelve al
 * valor inicial.
 * 
 * @author Miguel Bayon
 * @version 1.0
 */
public class PantallaDosDigitos
{
    // El valor inicial de la pantalla
    private int valorInicial;
    // El valor limite que nunca alcanza la pantalla. Al llegar a el, el valor almacenado vuelve a tomar el valor inicial,
    private int valorLimite;
    // El valor actual que tiene almacenado la pantalla
    private int valorAlmacenado;

    /**
     * Constructor de la clase PantallaDosDigitos
     *
     * @param valorDeInicio El valor de inicio del display
     * @param limitePantalla El valor máximo que no puede mostrar la pantalla
     */
    public PantallaDosDigitos(int valorDeInicio, int limitePantalla) {
        valorInicial = valorDeInicio;
        valorAlmacenado = valorInicial;
        valorLimite = limitePantalla;
    }

    /**
     * Devuelve el valor actual como número entero
     */
    public int getValorAlmacenado() {
        return valorAlmacenado;
    }

    /**
     * Devuelve el valor que muestra la pantalla como cadena de caracteres de longitud 2
     */
    public String getTextoDeLaPantalla() {
        String valorADevolver = valorAlmacenado + "";
        if(valorAlmacenado < 10) {
            valorADevolver = "0" + valorAlmacenado;
        }
        return valorADevolver;
    }

    /**
     * Fija un nuevo valor para la pantalla. Si el nuevo valor no es legal, 
     * entonces no hace nada.
     */
    public void setValorAlmacenado(int nuevoValor) {
        if((nuevoValor >= valorInicial) && (nuevoValor < valorLimite)) {
            valorAlmacenado = nuevoValor;
        }
    }

    /**
     * Incrementa el valor de la pantalla. Si llega al limite cambia a uno.
     */
    public void incrementaValorAlmacenado() {
        int tamanoIntervalo = valorLimite - valorInicial;
        int valorIncrementado = valorAlmacenado + 1;
        int valorIncrementadoReajustado = valorIncrementado - valorInicial;
        int valorIncrementadoEnElIntervalo = valorIncrementadoReajustado % tamanoIntervalo;
        valorAlmacenado =  valorIncrementadoEnElIntervalo + valorInicial;
    }
}