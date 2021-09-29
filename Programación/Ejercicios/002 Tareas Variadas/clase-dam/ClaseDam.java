import java.util.*;

public class ClaseDam {
    
    private String tutor;
    private String aula;
    private String centro;
    private ArrayList<Alumno> alumnos;
    private int capacidad;
    
    /**
     * Crea una clase
     */
    public ClaseDam(int maximoNumeroALumnos) {
        tutor = "desconocido";
        aula = "desconocida";
        centro = "desconocido";
        alumnos = new ArrayList<Alumno>();
        capacidad = maximoNumeroALumnos;
    }

    /**
     * Agrega un estudiante a la clase
     */
    public void matricularAlumno(Alumno nuevoAlumno) {
        if(alumnos.size() == capacidad) {
            System.out.println("La clase ya esta llena, no caben mas alumnos.");
        }
        else {
            alumnos.add(nuevoAlumno);
        }
    }
    
    /**
     * Devuelve el numero de alumnos matriculados
     */
    public int getNumeroDeAlumnos() {
        return alumnos.size();
    }
    
    /**
     * Fija el aula donde se da la clase
     */
    public void setAula(String aulaClase) {
        aula = aulaClase;
    }
    
    /**
     * Fija el centro (el instituto) al que pertenece la clase
     */
    public void setCentro(String centroClase) {
        centro = centroClase;
    }
    
    /**
     * Fija el tutor de la clase
     */
    public void setTutor(String nombreTutor) {
        tutor = nombreTutor;
    }
    
    /**
     * Imprime por pantalla los detalles de la clase
     */
    public void imprimeDetalles() {
        System.out.println("Centro " + centro);
        System.out.println("Tutor: " + tutor + "   Aula: " + aula);
        System.out.println("Alumnos:");
        System.out.println();
        for(Alumno alumno : alumnos) {
            alumno.imprimeDetalles();
        }
        System.out.println("Numero de alumnos: " + getNumeroDeAlumnos());
    }
}