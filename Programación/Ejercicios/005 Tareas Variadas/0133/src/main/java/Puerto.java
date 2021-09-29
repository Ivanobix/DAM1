public class Puerto {
    private Alquiler[] amarres;
    private final int NUM_AMARRES = 4;

    public Puerto() {
        amarres = new Alquiler[NUM_AMARRES];
        for (int i = 0; i < amarres.length; i++) {
            amarres[i] = null;
        }
    }

    public void verEstadoAmarres() {
        int cont = 0;
        String aDevolver = "";
        while (cont < amarres.length) {
            if(amarres[cont] != null) {
                aDevolver += amarres[cont].toString();
            }
            cont++;
        }
        System.out.println(aDevolver);
    }

    public double alquilarAmarre (int dias, Barco barco) {
        double aDevolver = -1;
        int cont = 0;
        while (aDevolver == -1 && cont < 4) {
            if (amarres[cont] == null) {
                aDevolver = 0;
            }
            else {
                cont ++;
            }

        }
        if (aDevolver == 0) {
            Persona persona = barco.getPropietario();
            Alquiler alquiler = new Alquiler(cont, persona, barco, dias);
            amarres[cont] = alquiler;
            aDevolver = alquiler.getPrecio();
        }
        return aDevolver;
    }

    public  double liquidarAlquilerAmarre(int numAmarre) {
        double aDevolver = -1;
        if(numAmarre >= 0 && numAmarre <= 3 && amarres[numAmarre] != null) {
            aDevolver = amarres[numAmarre].getPrecio();
            amarres[numAmarre] = null;
        }
        return aDevolver;
    }

    @Override
    public String toString() {
        String aDevolver = "";
        int cont = 0;
        while (cont < amarres.length) {
            if(amarres[cont] != null) {
                aDevolver += "Amarre: " + cont + " ocupado\n";
            }
            else {
                aDevolver += "Amarre: " + cont + " libre\n";
            }
            cont++;
        }
        return aDevolver;
    }
}
