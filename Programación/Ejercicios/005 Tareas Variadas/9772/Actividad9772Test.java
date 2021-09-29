import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Actividad9772Test
{
    @Test
    public void testColeccionCuatroPalabras() {
        Actividad9772 objetoBase = new Actividad9772();
        ArrayList<String> origen = new ArrayList<>(Arrays.asList("Madrid", "Roma", "Pekin", "Leon"));
        assertEquals(2, objetoBase.cuantasPalabrasHayDeNLetras(origen, 4));
        assertEquals(1, objetoBase.cuantasPalabrasHayDeNLetras(origen, 5));
        assertEquals(1, objetoBase.cuantasPalabrasHayDeNLetras(origen, 6));
        assertEquals(0, objetoBase.cuantasPalabrasHayDeNLetras(origen, 7));
    }    
    
    @Test
    public void testColeccionVacia() {
        Actividad9772 objetoBase = new Actividad9772();
        ArrayList<String> origen = new ArrayList<>();
        assertEquals(0, objetoBase.cuantasPalabrasHayDeNLetras(origen, 4));
        assertEquals(0, objetoBase.cuantasPalabrasHayDeNLetras(origen, 5));
        assertEquals(0, objetoBase.cuantasPalabrasHayDeNLetras(origen, 6));
        assertEquals(0, objetoBase.cuantasPalabrasHayDeNLetras(origen, 7));
    }      
}
