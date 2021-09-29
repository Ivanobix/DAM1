import java.util.Scanner;
import java.util.Random;
/**
El metodo jugar elige una palabra aleatoria de una lista de posibles
palabras y permite al usuario o bien ir indicando letras o bien
intentar averiguar la palabra. Si la letra indicada por el usuario no esta
en la palabra el jugador va perdiendo vida. Si si esta, se muestra la palabra
con las letras que el usuario haya indicado. Si la palabra que el usuario
introduce es incorrecta pierde uno de vida y sigue el juego.
Si el jugador pierde toda su vida se acaba el juego. Si acierta la palabra
antes de que se le acabe la vida se le concede un bonus de vida y
se vuelve a empezar con una nueva palabra. Eres libre de crear más clases
si así lo deseas.Se pide también crear una clase de test que inicie el juego.
 */
public class JuegoAhorcado {
    private String  [] palabraDividida = null;
    private String palabraAleatoria = null;
    public void jugar(boolean modoDios) {
        String [] listaPalabras = {"AngelSuares", "DiegoFernandes", "IvanGarsia", "OscarBarragan", "DaniPuente", "MiguelBaion"};
        int vidas = 5;
        int letrasCorrectas = 0;
        Random aleatorio = new Random();
        Scanner entrada = null;
        palabraAleatoria = listaPalabras[aleatorio.nextInt(6)];
        palabraDividida = new String [palabraAleatoria.length()];
        generarPalabraVacia();
        while (vidas > 0) {
            System.out.println("Introduce una letra: ");
            entrada = new Scanner(System.in);
            String letra = entrada.nextLine();
            String textoAMostrar = "Prueba otra vez";
            if (modoDios) {
                System.out.println("La palabra aleatoria es: "+ palabraAleatoria);
            } 
            if (palabraAleatoria.toUpperCase().contains(letra.toUpperCase())) {
                for (int i = 0; i < palabraAleatoria.length(); i++) {
                    if (palabraAleatoria.substring(i, i + 1).toUpperCase().equals(letra.toUpperCase())) {
                        palabraDividida[i] = letra.toUpperCase();
                        letrasCorrectas++;
                    }
                }
                String palabraHastaElMomento = "";
                for (String letraActual: palabraDividida) {
                    palabraHastaElMomento += letraActual;
                }
                if (palabraHastaElMomento.contains("_")) {
                    textoAMostrar = palabraHastaElMomento;
                }
                else {
                    System.out.println("¡Has ganado!, la palabra era: "+ palabraAleatoria);
                    System.out.println("----- NUEVO JUEGO -----");
                    palabraAleatoria = listaPalabras[aleatorio.nextInt(6)];
                    palabraDividida = new String [palabraAleatoria.length()];
                    letrasCorrectas = 0;
                    generarPalabraVacia();
                    vidas += 1;
                    textoAMostrar = "";
                }
            }
            else {
                vidas--;
            }
            System.out.println(textoAMostrar);
        }
        System.out.println("¡Has perdido!, la palabra era: "+ palabraAleatoria);
        entrada.close();
    }

    public void generarPalabraVacia() {
        for (int i = 0; i < palabraAleatoria.length(); i++) {
            palabraDividida[i] = "_";
        }
    }
}