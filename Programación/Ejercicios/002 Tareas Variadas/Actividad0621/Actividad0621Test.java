import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Actividad0621Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Actividad0621Test
{
    /**
     * Default constructor for test class Actividad0621Test
     */
    public Actividad0621Test()
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
    public void tes01()
    {
        Actividad0621 a = new Actividad0621();
        assertEquals(false, a.esPalindromo("primera"));
    }
    
    @Test
    public void comprobarCuatroLetras()
    {
        Actividad0621 activida1 = new Actividad0621();
        assertEquals(true, activida1.esPalindromo("ojjo"));
        assertEquals(true, activida1.esPalindromo("hssh"));
        assertEquals(true, activida1.esPalindromo("wwww"));
    }

    @Test
    public void comprobarCuatroLetrasNoPalindromo()
    {
        Actividad0621 activida1 = new Actividad0621();
        assertEquals(false, activida1.esPalindromo("pero"));
        assertEquals(false, activida1.esPalindromo("hola"));
        assertEquals(false, activida1.esPalindromo("cosa"));
    }

    @Test
    public void palabrasNoCuatroNoPalindromo()
    {
        Actividad0621 activida1 = new Actividad0621();
        assertEquals(false, activida1.esPalindromo("fwerfwe"));
        assertEquals(false, activida1.esPalindromo("de"));
        assertEquals(false, activida1.esPalindromo("re"));
    }

    @Test
    public void palindromoNoCuatroLetras()
    {
        Actividad0621 activida1 = new Actividad0621();
        assertEquals(false, activida1.esPalindromo("elenel"));
        assertEquals(false, activida1.esPalindromo("hereh"));
        assertEquals(false, activida1.esPalindromo("xyyyx"));
    }
}




