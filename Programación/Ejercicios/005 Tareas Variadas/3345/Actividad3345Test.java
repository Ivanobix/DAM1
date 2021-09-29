import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class Actividad3345Test {

    @Test
    public void testParametroPositivo() {
        Actividad3345 objeto = new Actividad3345();
        assertEquals("1 2 3 4 5", objeto.devolverNumerosHastaElDoble(3));
        assertEquals("1 2 3 4 5 6 7", objeto.devolverNumerosHastaElDoble(4));
        assertEquals("1 2 3 4 5 6 7 8 9", objeto.devolverNumerosHastaElDoble(5));
        assertEquals("1 2 3 4 5 6 7 8 9 10 11", objeto.devolverNumerosHastaElDoble(6));
    }

    @Test
    public void testParametroCeroONegativo() {
        Actividad3345 objeto = new Actividad3345();
        assertEquals("Negativo o cero", objeto.devolverNumerosHastaElDoble(-5));
        assertEquals("Negativo o cero", objeto.devolverNumerosHastaElDoble(-2));
        assertEquals("Negativo o cero", objeto.devolverNumerosHastaElDoble(0));
    }
}