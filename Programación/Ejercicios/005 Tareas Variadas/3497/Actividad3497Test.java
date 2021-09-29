import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class Actividad3497Test
{
    @Test
    public void testColeccionPalabrasNormal() {
        Actividad3497 objetoBase = new Actividad3497();

        ArrayList<String> origen = new ArrayList<>(Arrays.asList("Hola", "Adios", "Hello", "Ciao", "Tungjatjeta", "Egun-on"));
        ArrayList<String> resultadoEsperado = new ArrayList<>(Arrays.asList("Tungjatjeta"));
        ArrayList<String> resultadoObtenido = null;
        resultadoObtenido = objetoBase.devolverPalabraMasLarga(origen);
        assertArrayEquals(resultadoObtenido.toArray(), resultadoEsperado.toArray());

        ArrayList<String> origen2 = new ArrayList<>(Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Noviembre"));
        ArrayList<String> resultadoEsperado2 = new ArrayList<>(Arrays.asList("Noviembre"));
        ArrayList<String> resultadoObtenido2 = null;
        resultadoObtenido2 = objetoBase.devolverPalabraMasLarga(origen2);
        assertArrayEquals(resultadoObtenido2.toArray(), resultadoEsperado2.toArray());
    }

    @Test
    public void testColeccionPalalabrasVacia() {
        Actividad3497 objetoBase = new Actividad3497();

        ArrayList<String> origen = new ArrayList<>();
        ArrayList<String> resultadoEsperado = new ArrayList<>();
        ArrayList<String> resultadoObtenido = null;
        resultadoObtenido = objetoBase.devolverPalabraMasLarga(origen);
        assertArrayEquals(resultadoObtenido.toArray(), resultadoEsperado.toArray());
    }

    @Test
    public void testColeccionConEmpate() {
        Actividad3497 objetoBase = new Actividad3497();

        ArrayList<String> origen = new ArrayList<>(Arrays.asList("Hola", "Adios", "Hello", "Ciao", "Gauon"));
        ArrayList<String> resultadoEsperado = new ArrayList<>(Arrays.asList("Adios", "Hello", "Gauon"));
        ArrayList<String> resultadoObtenido = null;
        resultadoObtenido = objetoBase.devolverPalabraMasLarga(origen);
        assertArrayEquals(resultadoObtenido.toArray(), resultadoEsperado.toArray());

        ArrayList<String> origen2 = new ArrayList<>(Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Noviembre", "Diciembre"));
        ArrayList<String> resultadoEsperado2 = new ArrayList<>(Arrays.asList("Noviembre", "Diciembre"));
        ArrayList<String> resultadoObtenido2 = null;
        resultadoObtenido2 = objetoBase.devolverPalabraMasLarga(origen2);
        assertArrayEquals(resultadoObtenido2.toArray(), resultadoEsperado2.toArray());
    }
}
