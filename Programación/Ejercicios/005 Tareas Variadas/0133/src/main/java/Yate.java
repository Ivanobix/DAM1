public class Yate extends EmbarcacionAMotor {
    private int camarotes;

    public Yate(String matricula, double eslora, int anoFabricacion, Persona persona, int cv, int camarotes) {
        super(matricula, eslora, anoFabricacion, persona, cv);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    @Override
    public int getBernua() {
        return getPotencia() + camarotes;
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver = super.toString();
        aDevolver += "Camarotes: " + camarotes +"\n";
        return aDevolver;
    }
}
