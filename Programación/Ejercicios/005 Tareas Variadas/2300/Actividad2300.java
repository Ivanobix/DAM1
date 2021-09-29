import java.util.Scanner;
import java.util.Random;

public class Actividad2300
{
    /**
     * El metodo pide al usuario su nombre. Luego pide al usuario el numero de
     * inicio y el de fin y elige un numero aleatorio entre ambos (ambos incluidos).
     * A continuación permite al usuario adivinar el numero en sucesivos intentos.
     * Cuando el usuario adivina el numero el programa le da una puntuacion en
     * funcion del tiempo (version dificil) o del numero de intentos (version
     * facil). Para obtener el numero aleatorio es obligatorio usar la clase Random
     */
    public void adivinarNumero(int inicio, int fin) {
        Scanner entradaNombre = new Scanner(System.in); //Pide  el nombre
        System.out.println("Introduce tu nombre: ");
        String nombre = entradaNombre.nextLine();
        
        Random aleatorio = new Random(); //Crea un numero aleatorio dentro de los limites
        int numeroAleatorio = aleatorio.nextInt(fin + 1 - inicio) + inicio;
        
        int intentos = fin - inicio; //Define el numero de intentos
        int eleccion = numeroAleatorio + 1;
        int puntuacion = 0; //Define la puntuacion actual
        while (eleccion != numeroAleatorio && intentos > 0) {
            Scanner entradaEleccion = new Scanner(System.in); //Pide un numero
            System.out.println("Introduce un numero: ");
            eleccion = Integer.parseInt(entradaEleccion.nextLine());
            puntuacion = intentos * 10;
            intentos--;
            entradaEleccion.close();
        }
        if (intentos == 0) { //Informa de que no te quedan intentos
                System.out.println("Te has quedado sin intentos.");
                puntuacion = 0;
            }
        System.out.println("Puntuacion de " + nombre +": " + puntuacion + " puntos.");
        entradaNombre.close();
    }
}