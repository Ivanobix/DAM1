import java.util.UUID;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Iterator;
/**
 * Esta clase permite gestionar una tienda de ordenadores. Es la clase principal de nuestro programa.
 * Es capaz de almacenar un conjunto de ordenadores (clase Ordenador), con el propósito de mostrarlos en conjunto, ya sea en el orden que han sido
 * introducidos en el sistema o en un orden específico mediante los diferentes tipos de ordenación existentes.
 * 
 * @author  Iván García Prieto
 * @version 12.0 (19/03/2020)
 */
public class Tienda {
    private ArrayList<Ordenador> ordenadores;
    private int contIdentificador = 0;
    
    /**
     * Método constructor de la clase Tienda. Crea un ArrayList vacío donde posteriormente se almacenarán los objetos de la clase Ordenador.
     * No requiere de parámetros ni devuelve nada.
     */
    public Tienda() { 
        ordenadores = new ArrayList<Ordenador>();
    }

    /**
     * Método que nos permite añadir un objeto de la clase Ordenador al ArrayList previamente creado, solicitando los parámetros necesarios y 
     * generando un identificador único para el ordenador.
     * @param   marca   La marca del ordenador a añadir.
     * @param   modelo  El modelo del ordenador a añadir.
     * @param   tactil  Capacidad táctil de la pantalla.
     * @return  Este método no devuelve nada.
     */
    public void addOrdenador(String marca, int modelo, boolean tactil) {
        String identificador = Integer.toString(contIdentificador);
        ordenadores.add(new Ordenador(marca, modelo, tactil, identificador));
        contIdentificador++;
    }

    /**
     * Método que nos permite ordenar el ArrayList de ordenadores por si fecha de fabricación de más reciente a más antigua uno por cada línea.
     * Este método no requiere parámetros.
     * @return  Devuelve un String con el ArrayList ordenado.
     */
    public String ordenarPorFechaFabricacion() {
        String aDevolver = "";
        Ordenador ordenadorAAñadir = null;
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
                    ordenadorAAñadir = ordenador;
                }
            }
            copiaOrdenadores.remove(ordenadorAAñadir);
            fechaMasProxima = LocalDate.MIN;
            cont++;
            aDevolver += ordenadorAAñadir.toString() + "\n";
        }
        return aDevolver;
    }

    /**
     * Método que nos permite ordenar el ArrayList de ordenadores por si fecha de fabricación de más reciente a más antigua siempre y cuando
     * pertenezca a una marca específica introducida como parámetro, uno por cada línea.
     * @param   marca   Marca de ordenador que queremos ordenar.
     * @return  Devuelve un String con el ArrayList ordenado.
     */
    public String ordenarPorFechaFabricacionConCondicion(String marca) {
        String aDevolver = "";
        Ordenador ordenadorAAñadir = null;
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
                    ordenadorAAñadir = ordenador;
                }
            }
            copiaOrdenadores.remove(ordenadorAAñadir);
            fechaMasProxima = LocalDate.MIN;
            cont++;
            aDevolver += ordenadorAAñadir.toString() + "\n";
        }
        return aDevolver;
    }

    /**
     * Método que permite modificar el modelo de un ordenador dado su identificador.
     * @param   identificador   Identificador del ordenador a modificar.
     * @param   modelo  Modelo a establecer en el ordenador.
     * @return  Este método no devuelve nada.
     */
    public void modificarModeloOrdenador(String identificador, int modelo) {
        for (Ordenador ordenador: ordenadores) {
            if (ordenador.getIdentificador().equals(identificador)) {
                ordenador.setModelo(modelo);
            }
        }
    }
    
    /**
     * Método que permite eliminar todos los ordenadores de una determinada marca.
     * @param   marca   Marca de ordenadores a eliminar.
     * @return  Este método no devuelve nada.
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
     * Método que permite ordenar un ArrayList en función de su fecha (más recientes primero) y en caso de empate en función de su modelo 
     * (menor a mayor), cada ordenador en una línea. Este método no requiere de parámetros
     * @return Devulve un String con el ArrayList ordenado.
     */
    public String dobleOrdenacion() {
        String aDevolver = "";
        Ordenador ordenadorAAñadir = null;
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
                    ordenadorAAñadir = ordenador;
                }
                else if (ordenador.getFechaFabricacion().equals(fechaMasProxima)) {
                    if (ordenador.getModelo() < ordenadorAAñadir.getModelo()) {
                        ordenadorAAñadir = ordenador;
                    }
                }
            }
            copiaOrdenadores.remove(ordenadorAAñadir);
            fechaMasProxima = LocalDate.MIN;
            cont++;
            aDevolver += ordenadorAAñadir.toString() + "\n";
        }
        return aDevolver;
    }

    /**
     * Método que convierte a String todos los elementos del ArrayList, uno por cada línea en el orden que fueron añadidos.
     * No requiere de parámetros.
     * @return  Devulve un String con toda la información incluida en el ArrayList.
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
