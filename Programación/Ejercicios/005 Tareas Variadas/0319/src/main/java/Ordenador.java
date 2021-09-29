import java.time.LocalDate;
/**
 * Esta clase permite almacenar un conjunto de datos relativos a ordenadores con el fin de ser utilizados en su conjunto por la clase principal
 * (Tienda). 
 * @author  Iv�n Garc�a Prieto
 * @version 12.0 (19/03/2020)
 */
public class Ordenador {
    private String identificador = "";
    private String marca = "";
    private int modelo = 0;
    private LocalDate fechaFabricacion = null;
    private boolean tactil = false;
    /**
     * M�todo constructor de la clase Ordenador. Otorga el valor del d�a actual a la fecha de fabricaci�n y solicita el resto de atributos que 
     * componen un ordenador. Este m�todo no devuelve nada.
     * @param   marca   Marca del ordenador.
     * @param   modelo  Modelo del ordenador.
     * @param   tactil  Capacidad t�ctil del ordenador.
     * @param   identificador  Identificador �nico del ordenador.
     */
    public Ordenador(String marca, int modelo, boolean tactil, String identificador) {
        this.marca = marca;
        this.modelo = modelo;
        fechaFabricacion = LocalDate.now();
        this.tactil = tactil;
        this.identificador = identificador;
    }
    
    /**
     * Este m�todo establece la marca del ordenador en funci�n de lo introducido por el usuario. No devuelve nada.
     * @param  marca    Marca del ordenador. 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * Este m�todo devuelve la marca del ordenador. No requiere par�metros.
     * @return  Devuelve un String con la marca del ordenador.
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Este m�todo establece el modelo del ordenador en funci�n de lo introducido por el usuario. No devuelve nada.
     * @param   modelo  Modelo del ordenador.
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    /**
     * Este m�todo devuelve el modelo del ordenador. No requiere par�metros.
     * @return  Devuelve un int con el modelo del ordenador.
     */
    public int getModelo() {
        return modelo;
    }
    
    /**
     * Este m�todo establece la fecha de fabricaci�n del ordenador en funci�n de lo introducido por el usuario. No devuelve nada.
     * @param   dia Dia de fabricaci�n.
     * @param   mes Mes de fabricaci�n.
     * @param   ano A�o de fabricaci�n.
     */
    public void setFechaFabricacion(int dia, int mes, int ano) {
        fechaFabricacion = LocalDate.of(ano, mes, dia);
    }
    
    /**
     * Este m�todo devuelve la fecha de fabricacion del ordenador. No requiere par�metros.
     * @return  Devuelve un LocalDate con la fecha de fabricaci�n del ordenador.
     */
    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }
    
    /**
     * Este m�todo establece la capacidad t�ctil del ordenador en funci�n de lo introducido por el usuario. No devuelve nada.
     * @param   tactil  Capacidad t�ctil del ordenador.
     */
    public void setTactil(boolean tactil) {
        this.tactil = tactil;
    }
    
    /**
     * Este m�todo devuelve si el ordenador tiena capacidad t�ctil o no la del ordenador. No requiere par�metros.
     * @return  Devuelve un boolean con la capacidad t�ctil del ordenador.
     */
    public boolean getTactil() {
        return tactil;
    }
    
    /**
     * Este m�todo devuelve el identificador del ordenador. No requiere par�metros.
     * @return  Devuelve un String con el identificador del ordenador.
     */
    public String getIdentificador() {
        return identificador;
    }
    
    /**
     * Este m�todo devuelve toda la informaci�n almacenada del ordenador en una l�nea. No requiere par�metros.
     * @return  Devuelve un String con toda la informaci�n del ordenador.
     */
    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver = "Marca: " + marca + " // Modelo: " + modelo + " // Fabricaci�n: " + fechaFabricacion.toString() + " // T�ctil: ";
        aDevolver += (tactil)? "S� ":"No ";
        aDevolver += "// Identificador: " + identificador;
        return aDevolver;
    }
}
