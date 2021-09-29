import java.util.UUID;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Iterator;
/**
 * Esta clase permite gestionar una tienda de ordenadores. Es la clase principal de nuestro programa.
 * Es capaz de almacenar un conjunto de ordenadores (clase Ordenador), con el prop�sito de mostrarlos en conjunto, ya sea en el orden que han sido
 * introducidos en el sistema o en un orden espec�fico mediante los diferentes tipos de ordenaci�n existentes.
 * 
 * @author  Iv�n Garc�a Prieto
 * @version 12.0 (19/03/2020)
 */
public class Tienda {
    private ArrayList<Ordenador> ordenadores;
    private int contIdentificador = 0;
    
    /**
     * M�todo constructor de la clase Tienda. Crea un ArrayList vac�o donde posteriormente se almacenar�n los objetos de la clase Ordenador.
     * No requiere de par�metros ni devuelve nada.
     */
    public Tienda() { 
        ordenadores = new ArrayList<Ordenador>();
    }

    /**
     * M�todo que nos permite a�adir un objeto de la clase Ordenador al ArrayList previamente creado, solicitando los par�metros necesarios y 
     * generando un identificador �nico para el ordenador.
     * @param   marca   La marca del ordenador a a�adir.
     * @param   modelo  El modelo del ordenador a a�adir.
     * @param   tactil  Capacidad t�ctil de la pantalla.
     * @return  Este m�todo no devuelve nada.
     */
    public void addOrdenador(String marca, int modelo, boolean tactil) {
        String identificador = Integer.toString(contIdentificador);
        ordenadores.add(new Ordenador(marca, modelo, tactil, identificador));
        contIdentificador++;
    }

    /**
     * M�todo que nos permite ordenar el ArrayList de ordenadores por si fecha de fabricaci�n de m�s reciente a m�s antigua uno por cada l�nea.
     * Este m�todo no requiere par�metros.
     * @return  Devuelve un String con el ArrayList ordenado.
     */
    public String ordenarPorFechaFabricacion() {
        String aDevolver = "";
        Ordenador ordenadorAA�adir = null;
        LocalDate fechaMasProxima = LocalDate.MIN;
        int cont = 0;
        ArrayList<Ordenador> copiaOrdenadores = new ArrayList<Ordenador>();
        for (Ordenador ordenador: ordenadores) {
            copiaOrdenadores.add(ordenador);
        }
        while (cont < ordenadores.size()) {
            for (Ordenador ordenador : copiaOrdenadores) {
                if (ordenador.getFechaFabricacion().isAfter(fechaMasProxima) || ordenador.getFechaFabricacion().equals(fechaMasProxima)) {
                    fechaMasProxima = ordenador.getFechaFabricacion();
                    ordenadorAA�adir = ordenador;
                }
            }
            copiaOrdenadores.remove(ordenadorAA�adir);
            fechaMasProxima = LocalDate.MIN;
            cont++;
            aDevolver += ordenadorAA�adir.toString() + "\n";
        }
        return aDevolver;
    }

    /**
     * M�todo que nos permite ordenar el ArrayList de ordenadores por si fecha de fabricaci�n de m�s reciente a m�s antigua siempre y cuando
     * pertenezca a una marca espec�fica introducida como par�metro, uno por cada l�nea.
     * @param   marca   Marca de ordenador que queremos ordenar.
     * @return  Devuelve un String con el ArrayList ordenado.
     */
    public String ordenarPorFechaFabricacionConCondicion(String marca) {
        String aDevolver = "";
        Ordenador ordenadorAA�adir = null;
        LocalDate fechaMasProxima = LocalDate.MIN;
        int cont = 0;
        int ordenadoresAOrdenar = 0;
        ArrayList<Ordenador> copiaOrdenadores = new ArrayList<Ordenador>();
        for (Ordenador ordenador: ordenadores) {
            if (ordenador.getMarca().equals(marca)) {
                copiaOrdenadores.add(ordenador);
                ordenadoresAOrdenar++;
            }
        }
        while (cont < ordenadoresAOrdenar) {
            for (Ordenador ordenador : copiaOrdenadores) {
                if (ordenador.getFechaFabricacion().isAfter(fechaMasProxima) || ordenador.getFechaFabricacion().equals(fechaMasProxima)) {
                    fechaMasProxima = ordenador.getFechaFabricacion();
                    ordenadorAA�adir = ordenador;
                }
            }
            copiaOrdenadores.remove(ordenadorAA�adir);
            fechaMasProxima = LocalDate.MIN;
            cont++;
            aDevolver += ordenadorAA�adir.toString() + "\n";
        }
        return aDevolver;
    }

    /**
     * M�todo que permite modificar el modelo de un ordenador dado su identificador.
     * @param   identificador   Identificador del ordenador a modificar.
     * @param   modelo  Modelo a establecer en el ordenador.
     * @return  Este m�todo no devuelve nada.
     */
    public void modificarModeloOrdenador(String identificador, int modelo) {
        for (Ordenador ordenador: ordenadores) {
            if (ordenador.getIdentificador().equals(identificador)) {
                ordenador.setModelo(modelo);
            }
        }
    }
    
    /**
     * M�todo que permite eliminar todos los ordenadores de una determinada marca.
     * @param   marca   Marca de ordenadores a eliminar.
     * @return  Este m�todo no devuelve nada.
     */
    public void eliminarOrdenadoresDeMarca(String marca) {
        Iterator<Ordenador> it = ordenadores.iterator();
        while (it.hasNext()) {
            Ordenador ordenador = it.next();
            if (ordenador.getMarca().equals(marca)){
                it.remove();
            }
        }
    }

    /**
     * M�todo que permite ordenar un ArrayList en funci�n de su fecha (m�s recientes primero) y en caso de empate en funci�n de su modelo 
     * (menor a mayor), cada ordenador en una l�nea. Este m�todo no requiere de par�metros
     * @return Devulve un String con el ArrayList ordenado.
     */
    public String dobleOrdenacion() {
        String aDevolver = "";
        Ordenador ordenadorAA�adir = null;
        LocalDate fechaMasProxima = LocalDate.MIN;
        int cont = 0;
        ArrayList<Ordenador> copiaOrdenadores = new ArrayList<Ordenador>();
        for (Ordenador ordenador: ordenadores) {
            copiaOrdenadores.add(ordenador);
        }
        while (cont < ordenadores.size()) {
            for (Ordenador ordenador : copiaOrdenadores) {
                if (ordenador.getFechaFabricacion().isAfter(fechaMasProxima)) {
                    fechaMasProxima = ordenador.getFechaFabricacion();
                    ordenadorAA�adir = ordenador;
                }
                else if (ordenador.getFechaFabricacion().equals(fechaMasProxima)) {
                    if (ordenador.getModelo() < ordenadorAA�adir.getModelo()) {
                        ordenadorAA�adir = ordenador;
                    }
                }
            }
            copiaOrdenadores.remove(ordenadorAA�adir);
            fechaMasProxima = LocalDate.MIN;
            cont++;
            aDevolver += ordenadorAA�adir.toString() + "\n";
        }
        return aDevolver;
    }

    /**
     * M�todo que convierte a String todos los elementos del ArrayList, uno por cada l�nea en el orden que fueron a�adidos.
     * No requiere de par�metros.
     * @return  Devulve un String con toda la informaci�n incluida en el ArrayList.
     */
    @Override
    public String toString() {
        String aDevolver = "";
        for (Ordenador ordenador : ordenadores) {
            aDevolver += ordenador.toString() + "\n";
        }
        return aDevolver;
    }
}
