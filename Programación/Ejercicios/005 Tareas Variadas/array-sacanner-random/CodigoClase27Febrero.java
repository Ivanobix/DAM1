import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class CodigoClase27Febrero {
    public int metodo01() {
        int[] numeros = {1,2,3,4,5};
        /*         for(int i = 0; i < numeros.length; i++){
        System.out.println(numeros[i]);
        }
        for (int i = 0; i < numeros.length; i++){
        numeros[i] = 0;
        }
        for(int i = 0; i < numeros.length; i++){
        System.out.println(numeros[i]);
        } */

        int[] enteros = new int[5]; 
        System.out.println(enteros[0]);
        enteros[1] = 20;    
        System.out.println(enteros[1]);
        return -1;

    }

    public void metodo02() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("¿" + nombre + "?");
        entrada.close();

    }

    public void metodo03(){
        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt(11));
        System.out.println(aleatorio.nextInt(101)+100);

    }

    /** 
     * Metodo que crea un array con el numero de elementos indicado
     * y lo llena de los numeros pares empezando por 2. El metodo
     * debe devolver el array creado. En caso de que cantidad de pares
     * sea negativo o cero el metodo devuelve null.
     */
    public int[] obtenerNumerosPares(int cantidadDePares) {
        int[] numeros = null;
        if (cantidadDePares > 0) {
            numeros = new int[cantidadDePares];
            int par = 2;
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = par;
                par += 2;
            }
        }
        return numeros;
    }

    /**
     * Metodo que crea un array con el numero de elementos especificado como
     * parametro y lo llena con la sucesión de Fibonacci desde el 0 in. El metodo
     * debe devolver el array creado. Si cantidad de numeros es negativo o cero el
     * metodo devuelve un array vacio.
     */
    public int[] obtenerSucesionFibonacci(int cantidadNumeros) {
        int[] aDevolver = new int[0];
        if (cantidadNumeros > 0) {
            aDevolver = new int[cantidadNumeros];
            aDevolver[0] = 0;
            if (cantidadNumeros > 1) {
                aDevolver[1] = 1;
                for (int i = 2; i < cantidadNumeros; i++) {
                    aDevolver[i] = aDevolver[i - 1] + aDevolver[i - 2];
                }
            }
        }
        return aDevolver;
    }

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
        int numeroAleatorio = aleatorio.nextInt(fin)+inicio;

        int intentos = fin - inicio; //Define el numero de intentos
        int eleccion = numeroAleatorio + 1;
        int puntuacion = 0; //Define la puntuacion actual
        while (eleccion != numeroAleatorio && intentos > 0) {
            Scanner entradaEleccion = new Scanner(System.in); //Pide un numero
            System.out.println("Introduce un numero: ");
            eleccion = Integer.parseInt(entradaEleccion.nextLine());
            puntuacion = intentos * 10;
            intentos--;
        }
        if (intentos == 0) { //Informa de que no te quedan intentos
            System.out.println("Te has quedado sin intentos.");
            puntuacion = 0;
        }
        System.out.println("Puntuacion de " + nombre +": " + puntuacion + " puntos.");
    }

    /**
     * Metodo que a partir de una cadena de caracteres del tipo 
     * "7, 5, 2, 1, 3, 2, 7, 1, 7" crea internamente un array con tantos 
     * elementos como numeros contenga dicha cadena y devuelve cuantas veces esta 
     * repetido el número que mas veces esta repetido. Los numeros solo son del 0 al 9.
     * Se asume que uno al menos esta repetido. Si un numero aparece dos veces, el 
     * metodo debe devolver 2, si esta tres veces, el metodo debe devolver 3, etc.
     */
    public int obtenerRepeticionesNumeroMasRepetido(String numeros) {
        String[] numerosSeguidos = numeros.split(", ");      
        int masRepetido = 0;
        for (int i = 0; i < numerosSeguidos.length; i++) {
            int vecesActual = 0;
            for (int j = i; j < numerosSeguidos.length; j++) {
                if (numerosSeguidos[i].equals(numerosSeguidos[j])) {
                    vecesActual++;
                }
            }
            if (vecesActual > masRepetido) {
                masRepetido = vecesActual;
            }
        }
        return masRepetido;
    }

    /**
     * Metodo que lee el archivo especificado como parámetro, que contiene un número
     * en cada línea, y muestra dichos numeros por pantalla, uno por línea
     */
    public static void leeArchivo(String nombreArchivo) {
        try {
            Scanner sc = new Scanner(new File(nombreArchivo + ".txt"));
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch (Exception ex) {
            System.out.println("Archivo no encontrado.");
        }
    }

    /**
     * Método que escribe los numeros contenidos en un array en un archivo de texto, uno
     * en cada línea
     */
    public void escribeAArchivo(int[] numeros, String nombreArchivo) {
        try {
            FileWriter fw = new FileWriter(nombreArchivo);
            for (int i = 0; i < numeros.length; i++) {
                fw.write(numeros[i] + "\n");
            }
            fw.close();
        } 
        catch (Exception e) {
            System.out.println("Algo salió mal");
            System.out.println(e);
        }
    }
}
