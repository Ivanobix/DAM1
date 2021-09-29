public class Velero extends Barco {
    private int numeroMastiles;

    public Velero(String matricula, double eslora, int anoFabricacion, Persona persona, int mastiles) {
        super(matricula, eslora, anoFabricacion, persona);
        numeroMastiles = mastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    @Override
    public int getBernua() {
        return numeroMastiles;
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver = super.toString();
        aDevolver += "Numero mastiles: " + numeroMastiles +"\n";
        return aDevolver;
    }
}
