import java.util.ArrayList;

public class Muro {
    private ArrayList<EntradaTexto> mensajes;
    private ArrayList<EntradaFoto> fotos;

    public Muro() {
       mensajes = new ArrayList<EntradaTexto>();
       fotos = new ArrayList<EntradaFoto>();
    }

    public void addEntradaTexto(EntradaTexto entradaTexto) {
        mensajes.add(entradaTexto);
    }

    public void addEntradaFoto(EntradaFoto entradaFoto) {
        fotos.add(entradaFoto);
    }

    @Override
    public String toString () {
        String aDevolver = "";
        for (EntradaTexto publiTexto : mensajes) {
            aDevolver += publiTexto + "\n";
        }
        for (EntradaFoto publiFoto : fotos) {
            aDevolver += publiFoto + "\n";
        }
        return aDevolver;
    }
}
