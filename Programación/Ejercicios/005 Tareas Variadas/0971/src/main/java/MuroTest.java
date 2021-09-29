
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MuroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MuroTest
{
    @Test
    public void Test01()
    {
        EntradaTexto entradaT1 = new EntradaTexto("Ivan", "Hola, soy Ivan");
        EntradaFoto entradaF1 = new EntradaFoto("Diego", "www.asd.com", "Hola, soy Diego");
        EntradaTexto entradaT2 = new EntradaTexto("Angel", "Hola, soy Angel");
        EntradaFoto entradaF2 = new EntradaFoto("Oscar", "www.dsa.com", "Hola, soy Oscar");
        Muro muro1 = new Muro();
        muro1.addEntradaTexto(entradaT1);
        muro1.addEntradaFoto(entradaF1);
        muro1.addEntradaTexto(entradaT2);
        muro1.addEntradaFoto(entradaF2);
        assertEquals("Usuario: Ivan\nHola, soy Ivan\nMe gusta: 0\nHace 10 segundos\nNo hay comentarios\n\nUsuario: Angel\nHola, soy Angel\nMe gusta: 0\nHace 10 segundos\nNo hay comentarios\n\nUsuario: Diego\nwww.asd.com\nHola, soy Diego\nMe gusta: 0\nHace 10 segundos\nNo hay comentarios\n\nUsuario: Oscar\nwww.dsa.com\nHola, soy Oscar\nMe gusta: 0\nHace 10 segundos\nNo hay comentarios\n\n", muro1.toString());
    }
}

