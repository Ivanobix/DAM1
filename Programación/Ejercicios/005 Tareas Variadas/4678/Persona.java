public class Persona
{   
    private String nombre = "";
    private boolean genero = true;
    private int peso = 0;
    private int altura = 0;
    private int edad = 0;
    private int caloriasIngeridas = 0;
    private Comida alimentoMasCaloricoConsumido = null;

    public Persona(String nombreP, boolean generoP, int pesoP, int alturaP, int edadP ) {
        nombre = nombreP;
        genero = generoP;
        peso = pesoP;
        altura = alturaP;
        edad = edadP;
    }

    public int comer(Comida comida) {
        int aDevolver = -1;
        if ((genero && caloriasIngeridas <= ((10 * peso) + (6 * altura) + (5 * edad) + 5)) || (!genero && caloriasIngeridas <= ((10 * peso) + (6 * altura) + (5 * edad) - 161))) {
            aDevolver = comida.getCalorias();
            caloriasIngeridas += aDevolver;
            if (alimentoMasCaloricoConsumido == null || comida.getCalorias() >= alimentoMasCaloricoConsumido.getCalorias()) {
                alimentoMasCaloricoConsumido = comida;
            }
        }
        return aDevolver;
    }

    public int getCaloriasIngeridas() {
        return caloriasIngeridas;
    }

    public String contestar(String frase) {
        String aDevolver = "NO";
        if (frase.contains(nombre)) {
            aDevolver = frase.toUpperCase();
        }
        else if ((genero && caloriasIngeridas <= ((10 * peso) + (6 * altura) + (5 * edad) + 5)) || (!genero && caloriasIngeridas <= ((10 * peso) + (6 * altura) + (5 * edad) - 161))) {
            if (frase.length()%3 == 0) {
                aDevolver = "SI";
            }
        }
        else {
            aDevolver = frase.toUpperCase();
        }
        return aDevolver;
    }

    public String getAlimentoMasCaloricoConsumido() {
        String aDevolver = null;
        if (alimentoMasCaloricoConsumido != null) {
            aDevolver = alimentoMasCaloricoConsumido.getNombreComida();
        }
        return aDevolver;
    }
}