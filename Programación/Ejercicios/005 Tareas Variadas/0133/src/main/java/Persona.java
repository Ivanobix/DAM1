public class Persona {
    private String nombre;
    private String dni;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += "Nombre: " + nombre + "\n";
        aDevolver += "DNI: " + dni + "\n";
        return aDevolver;
    }
}
