import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Actividad4678Test
{
    private Persona persona1;
    private Persona persona2;    
    private Persona persona3; 
    private Comida comida1;
    private Comida comida2;
    private Comida comida3;
    private Comida comida4;
    private Comida comida5;
    private Comida comida6;
    

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        persona1 = new Persona("Ana", false, 55, 160, 24);
        persona2 = new Persona("Luis", true, 92, 193, 37);
        persona3 = new Persona("Pepe", true, 80, 180, 45);
        comida1 = new Comida("Paella", 800);
        comida2 = new Comida("Pizza", 1200);
        comida3 = new Comida("Lentejas", 600);
        comida4 = new Comida("Cocido", 2000);
        comida5 = new Comida("Ensalada", 269);
        comida6 = new Comida("Macarrones", 600);
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
    public void TestCommit02()
    {
        // Ana...
        assertEquals(0, persona1.getCaloriasIngeridas());        
        // Come una pizza
        assertEquals(1200, persona1.comer(comida2));            
        assertEquals(1200, persona1.getCaloriasIngeridas());
        // Come una ensalada
        assertEquals(269, persona1.comer(comida5));              
        assertEquals(1469, persona1.getCaloriasIngeridas());    
        // Come una paella
        assertEquals(800, persona1.comer(comida1));             
        assertEquals(2269, persona1.getCaloriasIngeridas()); 
        // Come una ensalada
        assertEquals(-1, persona1.comer(comida5));             
        assertEquals(2269, persona1.getCaloriasIngeridas()); 
        
        
        // Luis...
        assertEquals(0, persona2.getCaloriasIngeridas());
        // Come un cocido
        assertEquals(2000, persona2.comer(comida4));
        assertEquals(2000, persona2.getCaloriasIngeridas());
        // Come una ensalada
        assertEquals(269, persona2.comer(comida5));
        assertEquals(2269, persona2.getCaloriasIngeridas());
        // Come una pizza
        assertEquals(-1, persona2.comer(comida2));
        assertEquals(2269, persona2.getCaloriasIngeridas());
    }

    @Test
    public void TestCommit03()
    {
        assertEquals(0, persona1.getCaloriasIngeridas());
        assertEquals("NO", persona1.contestar("¿Te sientes bien?"));
        assertEquals("SI", persona1.contestar("¿Quieres comer?"));
        assertEquals("SI", persona1.contestar("¿Todo ok?"));  
        assertEquals("¿TE LLAMAS ANA?", persona1.contestar("¿Te llamas Ana?")); 
        assertEquals("NO", persona1.contestar("¿Te llamas Luis?"));         
        assertEquals(800, persona1.comer(comida1));
        assertEquals(800, persona1.getCaloriasIngeridas());        
        assertEquals("NO", persona1.contestar("¿Te sientes bien?"));
        assertEquals("SI", persona1.contestar("¿Quieres comer?"));  
        assertEquals("SI", persona1.contestar("¿Todo ok?"));   
        assertEquals("¿TE LLAMAS ANA?", persona1.contestar("¿Te llamas Ana?"));   
        assertEquals("NO", persona1.contestar("¿Te llamas Luis?"));          
        assertEquals(600, persona1.comer(comida3)); 
        assertEquals(1400, persona1.getCaloriasIngeridas());        
        assertEquals("NO", persona1.contestar("¿Te sientes bien?"));
        assertEquals("SI", persona1.contestar("¿Quieres comer?"));  
        assertEquals("SI", persona1.contestar("¿Todo ok?"));  
        assertEquals("¿TE LLAMAS ANA?", persona1.contestar("¿Te llamas Ana?"));         
        assertEquals("NO", persona1.contestar("¿Te llamas Luis?"));          
        assertEquals(1200, persona1.comer(comida2));  
        assertEquals(2600, persona1.getCaloriasIngeridas());        
        assertEquals("¿TE SIENTES BIEN?", persona1.contestar("¿Te sientes bien?"));
        assertEquals("¿QUIERES COMER?", persona1.contestar("¿Quieres comer?"));  
        assertEquals("¿TODO OK?", persona1.contestar("¿Todo ok?")); 
        assertEquals("¿TE LLAMAS ANA?", persona1.contestar("¿Te llamas Ana?"));        
        assertEquals("¿TE LLAMAS LUIS?", persona1.contestar("¿Te llamas Luis?"));          
        
        assertEquals(0, persona2.getCaloriasIngeridas());
        assertEquals("NO", persona2.contestar("¿Te sientes bien?"));
        assertEquals("SI", persona2.contestar("¿Quieres comer?"));
        assertEquals("SI", persona2.contestar("¿Todo ok?"));    
        assertEquals("NO", persona2.contestar("¿Te llamas Maria?")); 
        assertEquals("¿TE LLAMAS LUIS?", persona2.contestar("¿Te llamas Luis?"));           
        assertEquals(800, persona2.comer(comida1));
        assertEquals(800, persona2.getCaloriasIngeridas());        
        assertEquals("NO", persona2.contestar("¿Te sientes bien?"));
        assertEquals("SI", persona2.contestar("¿Quieres comer?"));  
        assertEquals("SI", persona2.contestar("¿Todo ok?"));  
        assertEquals("NO", persona2.contestar("¿Te llamas Maria?"));   
        assertEquals("¿TE LLAMAS LUIS?", persona2.contestar("¿Te llamas Luis?"));          
        assertEquals(600, persona2.comer(comida3)); 
        assertEquals(1400, persona2.getCaloriasIngeridas());        
        assertEquals("NO", persona2.contestar("¿Te sientes bien?"));
        assertEquals("SI", persona2.contestar("¿Quieres comer?"));  
        assertEquals("SI", persona2.contestar("¿Todo ok?"));  
        assertEquals("NO", persona2.contestar("¿Te llamas Maria?"));   
        assertEquals("¿TE LLAMAS LUIS?", persona2.contestar("¿Te llamas Luis?"));          
        assertEquals(600, persona2.comer(comida3));  
        assertEquals(2000, persona2.getCaloriasIngeridas());        
        assertEquals("NO", persona2.contestar("¿Te sientes bien?"));
        assertEquals("SI", persona2.contestar("¿Quieres comer?"));  
        assertEquals("SI", persona2.contestar("¿Todo ok?"));  
        assertEquals("NO", persona2.contestar("¿Te llamas Maria?"));   
        assertEquals("¿TE LLAMAS LUIS?", persona2.contestar("¿Te llamas Luis?"));          
        
    }

    @Test
    public void TestCommit04()
    {
        assertEquals(null, persona1.getAlimentoMasCaloricoConsumido());
        assertEquals(600, persona1.comer(comida3));
        assertEquals("Lentejas", persona1.getAlimentoMasCaloricoConsumido());
        assertEquals(269, persona1.comer(comida5));
        assertEquals("Lentejas", persona1.getAlimentoMasCaloricoConsumido());
        assertEquals(600, persona1.comer(comida6));
        assertEquals("Macarrones", persona1.getAlimentoMasCaloricoConsumido());
        assertEquals(2000, persona1.comer(comida4));
        assertEquals("Cocido", persona1.getAlimentoMasCaloricoConsumido());
    }
}