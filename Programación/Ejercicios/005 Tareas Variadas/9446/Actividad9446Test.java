import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class Actividad9446Test
{
    @Test
    public void testColeccion3Elementos() {
        Actividad9446 objetoBase = new Actividad9446();
        ArrayList<String> origen = new ArrayList<>(Arrays.asList("Madrid", "Roma", "Pekin"));
        ArrayList<String> resultadoEsperado = new ArrayList<>(Arrays.asList("Pekin", "Roma", "Madrid"));
        ArrayList<String> resultadoObtenido = objetoBase.devolverAlReves(origen);
        assertArrayEquals(resultadoObtenido.toArray(), resultadoEsperado.toArray());
    }    

    @Test
    public void testColeccion4Elementos() {
        Actividad9446 objetoBase = new Actividad9446();
        ArrayList<String> origen = new ArrayList<>(Arrays.asList("Madrid", "Roma", "Pekin", "La luna"));
        ArrayList<String> resultadoEsperado = new ArrayList<>(Arrays.asList("La luna", "Pekin", "Roma", "Madrid"));
        ArrayList<String> resultadoObtenido = objetoBase.devolverAlReves(origen);
        assertArrayEquals(resultadoObtenido.toArray(), resultadoEsperado.toArray());
    }

    @Test
    public void testColeccionVacia() {
        Actividad9446 objetoBase = new Actividad9446();
        ArrayList<String> origen = new ArrayList<>();
        ArrayList<String> resultadoEsperado = new ArrayList<>();
        ArrayList<String> resultadoObtenido = objetoBase.devolverAlReves(origen);
        assertArrayEquals(resultadoObtenido.toArray(), resultadoEsperado.toArray());
    }    
}