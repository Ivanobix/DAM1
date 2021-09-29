import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class Actividad9102Test {

    @Test
    public void testCadenasDePrueba() {
        Actividad9102 objetoBase = new Actividad9102();
        assertEquals("h-o-l-a", objetoBase.separarConGuiones("hola"));
        assertEquals("j-u-e-g-o", objetoBase.separarConGuiones("juego"));
        assertEquals("m-a-d-r-i-d", objetoBase.separarConGuiones("madrid"));
    }

    @Test
    public void testCadenaVacia() {
        Actividad9102 objetoBase = new Actividad9102();
        assertEquals("", objetoBase.separarConGuiones(""));
    }
}