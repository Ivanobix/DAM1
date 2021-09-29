import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class Actividad2901Test {

    @Test
    public void testValoresNormales() {
        Actividad2901 objetoBase = new Actividad2901();
        assertEquals(90, objetoBase.sumaDeMultiplos(2, 20));
        assertEquals(9, objetoBase.sumaDeMultiplos(3, 9));
        assertEquals(4950, objetoBase.sumaDeMultiplos(1, 100));
        assertEquals(75, objetoBase.sumaDeMultiplos(5, 30));
    }
    
    @Test
    public void testValoresAnormales() {
        Actividad2901 objetoBase = new Actividad2901();
        assertEquals(-1, objetoBase.sumaDeMultiplos(-5, 32));
        assertEquals(-1, objetoBase.sumaDeMultiplos(0, 100));
        assertEquals(-1, objetoBase.sumaDeMultiplos(3, 100));
        assertEquals(-1, objetoBase.sumaDeMultiplos(8, 100));
    }    
}
