import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Actividad0438Test
{
    @Test
    public void test01()
    {
        Actividad0438 a = new Actividad0438();
        assertEquals("aloh", a.invertirPalabrasDe4Letras("hola"));
        assertEquals("soir", a.invertirPalabrasDe4Letras("rios"));
        assertEquals("epep", a.invertirPalabrasDe4Letras("pepe"));
        assertEquals("adan", a.invertirPalabrasDe4Letras("nada"));
    }

    @Test
    public void test02()
    {
        Actividad0438 a = new Actividad0438();
        assertEquals("", a.invertirPalabrasDe4Letras("saludo"));
        assertEquals("", a.invertirPalabrasDe4Letras("sal"));
        assertEquals("", a.invertirPalabrasDe4Letras(""));
    }
}