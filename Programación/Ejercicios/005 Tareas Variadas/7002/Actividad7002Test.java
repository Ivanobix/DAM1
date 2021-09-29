import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class Actividad7002Test {

    @Test
    public void test01() 
    {
        Actividad7002 objetoBase = new Actividad7002();
        
        assertEquals(false, objetoBase.esReversible("Esta frase no es reversible"));
        assertEquals(false, objetoBase.esReversible("Esta otra frase tampoco es reversible"));
        
        assertEquals(true, objetoBase.esReversible("Se es o no se es"));
        assertEquals(true, objetoBase.esReversible("No deseo yo ese don"));
        assertEquals(true, objetoBase.esReversible("Dabale arroz a la zorra el abad"));
        
        assertEquals(false, objetoBase.esReversible(""));
    }
}
