public class Alumno {

    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;
    // nombre del usuario
    private String nUsuario;
    // numero matricula usuario
    private String mUsuario;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (nombre.length() < 3) {
            System.out.println("El nombre tiene menos de 3 caracteres.");
            nUsuario = nombre;
        }
        else {
            nUsuario = nombre.substring(0, 3);
        }
        
        if (numeroMatricula.length() < 4) {
            System.out.println("El número de matrícula tiene menos de 4 caracteres.");
            mUsuario = numeroMatricula;
        }
        
        else {
         mUsuario = numeroMatricula.substring(0, 4);  
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " aÃ±os");
    }

    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        return nUsuario + mUsuario;
    }
}
