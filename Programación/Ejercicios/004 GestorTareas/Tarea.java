import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarea {
    private String textoTarea;
    private boolean completa;
    private int prioridad;
    private LocalDate fechaVencimiento;

    /**
     * 01. Constructor de la clase
     */    
    public Tarea(String tareaInicial) {
        textoTarea = tareaInicial;
        completa = false;
        prioridad = 5;
        fechaVencimiento = null;
    }

    /**
     * 02. Obtener texto de la tarea
     */
    public String getTextoTarea() {
        return textoTarea;
    }

    /**
     * 03. Obtener tarea completa o no
     */
    public boolean getCompleta() {
        return completa;
    }

    /**
     * 04. Establecer texto de la tarea
     */
    public void setTextoTarea(String tarea) {
        textoTarea =  tarea;  
    }

    /**
     * 05. Establecer tarea como completada
     */
    public void setCompleta() {
        completa = true;
    }

    /**
     * 06. Establecer prioridad de la tarea
     */
    public void setPrioridad(int introducirPrioridad) {
        if (introducirPrioridad <= 5 && introducirPrioridad >= 1) {
            prioridad = introducirPrioridad;
        }
    }

    /**
     * 07. Mostrar prioridad de la tarea
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * 08. Establecer fecha vencimiento de la tarea
     */
    public void setFechaVencimiento(int diaVencimiento, int mesVencimiento, int anoVencimiento) {
        fechaVencimiento = LocalDate.of(anoVencimiento, mesVencimiento, diaVencimiento);
    }

    /**
     * 09. Mostrar fecha vencimiento de la tarea
     */
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
}