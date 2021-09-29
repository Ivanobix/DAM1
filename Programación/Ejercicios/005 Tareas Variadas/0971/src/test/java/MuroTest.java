import org.junit.Test;

import static org.junit.Assert.*;

public class MuroTest {
    @Test
    public void metodo01() {

        Muro muro = new Muro();
        EntradaTexto entrada01 = new EntradaTexto("Ivan", "Soy Ivan");
        EntradaFoto entrada02 = new EntradaFoto("Diego", "www.diego.com", "Hola");
        EntradaTexto entrada03 = new EntradaTexto("Angel", "Soy Angel");
        EntradaFoto entrada04 = new EntradaFoto("Dani", "www.dani.com", "Adios");
        muro.addEntradaTexto(entrada01);
        muro.addEntradaFoto(entrada02);
        muro.addEntradaTexto(entrada03);
        muro.addEntradaFoto(entrada04);
        System.out.println(muro);

    }

}