

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PantallaHoraYFechaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PantallaHoraYFechaTest
{
    /**
     * Default constructor for test class PantallaHoraYFechaTest
     */
    public PantallaHoraYFechaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test01()
    {
        PantallaHoraYFecha pantalla1 = new PantallaHoraYFecha();
        assertEquals("00:00 01-01-01", pantalla1.getFechaYHora());
        pantalla1.avanzarMinuto();
        assertEquals("00:01 01-01-01", pantalla1.getFechaYHora());
        pantalla1.fijarFechaYHora(1, 58, 1, 1, 1);
        assertEquals("01:58 01-01-01", pantalla1.getFechaYHora());
        pantalla1.avanzarMinuto();
        assertEquals("01:59 01-01-01", pantalla1.getFechaYHora());
    }
}

