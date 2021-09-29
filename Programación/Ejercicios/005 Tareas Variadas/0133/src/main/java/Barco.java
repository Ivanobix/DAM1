public abstract class Barco {
    private String matricula;
    private double eslora;
    private int anoFabricacion;
    private Persona persona;

    public Barco(String matricula, double eslora, int anoFabricacion, Persona persona) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
        this.persona = persona;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public Persona getPropietario() {
        return persona;
    }

    public abstract int getBernua();

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += "Propietario: " + persona.toString() +"\n";
        aDevolver += "Matricula: " + matricula +"\n";
        aDevolver += "Eslora: " + eslora +"\n";
        aDevolver += "Ano de fabricacion: " + anoFabricacion +"\n";
        return aDevolver;
    }
}
