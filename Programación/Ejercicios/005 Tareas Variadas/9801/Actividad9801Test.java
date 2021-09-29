import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Actividad9801Test
{

    @Test
    public void testDiferentesPalabras() {
        Actividad9801 a = new Actividad9801();
        assertEquals(-1, a.puntuacionPalabra(""));
        assertEquals(1, a.puntuacionPalabra("a"));
        assertEquals(1, a.puntuacionPalabra("A"));
        assertEquals(4, a.puntuacionPalabra("f"));
        assertEquals(1, a.puntuacionPalabra("a"));
        assertEquals(2, a.puntuacionPalabra("at"));
        assertEquals(12, a.puntuacionPalabra("zoo"));
        assertEquals(6, a.puntuacionPalabra("street"));
        assertEquals(22, a.puntuacionPalabra("quirky"));
        assertEquals(41, a.puntuacionPalabra("OxyphenButazone"));
        assertEquals(8, a.puntuacionPalabra("pinata"));
        assertEquals(-1, a.puntuacionPalabra(""));
        assertEquals(87, a.puntuacionPalabra("abCdefghijklMnopqrstuvWxyz"));
    }
}