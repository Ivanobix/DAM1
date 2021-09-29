import java.time.LocalDate;
/**
 * Esta clase permite almacenar un conjunto de datos relativos a ordenadores con el fin de ser utilizados en su conjunto por la clase principal
 * (Tienda). 
 * @author  Iván García Prieto
 * @version 12.0 (19/03/2020)
 */
public class Ordenador {
    private String identificador = "";
    private String marca = "";
    private int modelo = 0;
    private LocalDate fechaFabricacion = null;
    private boolean tactil = false;
    /**
     * Método constructor de la clase Ordenador. Otorga el valor del día actual a la fecha de fabricación y solicita el resto de atributos que 
     * componen un ordenador. Este método no devuelve nada.
     * @param   marca   Marca del ordenador.
     * @param   modelo  Modelo del ordenador.
     * @param   tactil  Capacidad táctil del ordenador.
     * @param   identificador  Identificador único del ordenador.
     */
    public Ordenador(String marca, int modelo, boolean tactil, String identificador) {
        this.marca = marca;
        this.modelo = modelo;
        fechaFabricacion = LocalDate.now();
        this.tactil = tactil;
        this.identificador = identificador;
    }
    
    /**
     * Este método establece la marca del ordenador en función de lo introducido por el usuario. No devuelve nada.
     * @param  marca    Marca del ordenador. 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * Este método devuelve la marca del ordenador. No requiere parámetros.
     * @return  Devuelve un String con la marca del ordenador.
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Este método establece el modelo del ordenador en función de lo introducido por el usuario. No devuelve nada.
     * @param   modelo  Modelo del ordenador.
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    /**
     * Este método devuelve el modelo del ordenador. No requiere parámetros.
     * @return  Devuelve un int con el modelo del ordenador.
     */
    public int getModelo() {
        return modelo;
    }
    
    /**
     * Este método establece la fecha de fabricación del ordenador en función de lo introducido por el usuario. No devuelve nada.
     * @param   dia Dia de fabricación.
     * @param   mes Mes de fabricación.
     * @param   ano Año de fabricación.
     */
    public void setFechaFabricacion(int dia, int mes, int ano) {
        fechaFabricacion = LocalDate.of(ano, mes, dia);
    }
    
    /**
     * Este método devuelve la fecha de fabricacion del ordenador. No requiere parámetros.
     * @return  Devuelve un LocalDate con la fecha de fabricación del ordenador.
     */
    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }
    
    /**
     * Este método establece la capacidad táctil del ordenador en función de lo introducido por el usuario. No devuelve nada.
     * @param   tactil  Capacidad táctil del ordenador.
     */
    public void setTactil(boolean tactil) {
        this.tactil = tactil;
    }
    
    /**
     * Este método devuelve si el ordenador tiena capacidad táctil o no la del ordenador. No requiere parámetros.
     * @return  Devuelve un boolean con la capacidad táctil del ordenador.
     */
    public boolean getTactil() {
        return tactil;
    }
    
    /**
     * Este método devuelve el identificador del ordenador. No requiere parámetros.
     * @return  Devuelve un String con el identificador del ordenador.
     */
    public String getIdentificador() {
        return identificador;
    }
    
    /**
     * Este método devuelve toda la información almacenada del ordenador en una línea. No requiere parámetros.
     * @return  Devuelve un String con toda la información del ordenador.
     */
    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver = "Marca: " + marca + " // Modelo: " + modelo + " // Fabricación: " + fechaFabricacion.toString() + " // Táctil: ";
        aDevolver += (tactil)? "Sí ":"No ";
        aDevolver += "// Identificador: " + identificador;
        return aDevolver;
    }
}
