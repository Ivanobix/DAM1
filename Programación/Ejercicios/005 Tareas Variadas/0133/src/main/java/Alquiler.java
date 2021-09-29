public class Alquiler {
    private int numDias;
    private Barco barco;
    private final int MULTI_ESLORA = 10;
    private final int MULTI_BERNUA = 300;

    public Alquiler(int num, Persona persona, Barco barco, int numDias) {
        this.barco = barco;
        this.numDias = numDias;
    }

    public double getPrecio() {
        double aDevolver = 0;
        aDevolver = numDias * (barco.getEslora() * MULTI_ESLORA);
        aDevolver += (MULTI_BERNUA * barco.getBernua());
        return aDevolver;
    }

    public Barco getBarco() {
        return barco;
    }

    public int getNumeroDias() {
        return numDias;
    }

    @Override
    public String toString() {
        String aDevolver = "--------------------\n";
        aDevolver += barco.toString() +"\n";
        aDevolver += "Numero de dias: " + numDias + "\n";
        aDevolver += "--------------------\n\n";
        return aDevolver;
    }
}
