import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Actividad3910Test {

    @Test
    public void test01() 
    {
        Actividad3910 objetoBase = new Actividad3910(); 

        ArrayList<String> origen = new ArrayList<>(Arrays.asList("Madrid", "Roma", "Pekin", "Leon", "Barcelona")); 
        assertEquals("Barcelona", objetoBase.encontrarPalabraConMasAes(origen)); 

        origen = new ArrayList<>(Arrays.asList("Santander", "Roma", "Pekin", "Roma", "Barcelona", "Cuenca"));
        assertEquals("Barcelona", objetoBase.encontrarPalabraConMasAes(origen));

        origen = new ArrayList<>(Arrays.asList("Santander", "Roma", "Pekin", "Roma", "Barcelona")); 
        assertEquals("Barcelona", objetoBase.encontrarPalabraConMasAes(origen)); 

        origen = new ArrayList<>(Arrays.asList("Leon", "Jerez", "Oviedo")); 
        assertNull(objetoBase.encontrarPalabraConMasAes(origen)); 

        origen = new ArrayList<>(); 
        assertNull(objetoBase.encontrarPalabraConMasAes(origen)); 
    }
}