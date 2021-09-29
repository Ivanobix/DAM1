public class EmbarcacionAMotor extends Barco{
    private int cv;

    public EmbarcacionAMotor(String matricula, double eslora, int anoFabricacion, Persona persona, int cv) {
        super(matricula, eslora, anoFabricacion, persona);
        this.cv = cv;
    }

    public int getPotencia() {
        return cv;
    }

    @Override
    public int getBernua() {
        return cv;
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver = super.toString();
        aDevolver += "Potencia: " + cv +"\n";
        return aDevolver;
    }
}
