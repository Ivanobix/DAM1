import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;

public class Actividad4009Test {
  
  @Test 
  public void test01() {
    Actividad4009 objetoBase = new Actividad4009(); 

    ArrayList<String> origen = new ArrayList<>(Arrays.asList("Madrid", "Roma", "Pekin", "Roma", "Barcelona")); 
    assertEquals("Roma", objetoBase.encontrarPalabraRepetida(origen)); 
  }
    

  @Test 
  public void test02() {
    Actividad4009 objetoBase = new Actividad4009(); 
      
    ArrayList<String> origen = new ArrayList<>(Arrays.asList("Madrid", "Madrid", "Pekin", "Roma", "Barcelona")); 
    assertEquals("Madrid", objetoBase.encontrarPalabraRepetida(origen)); 
  }
  

  @Test 
  public void test03() {
    Actividad4009 objetoBase = new Actividad4009(); 

    ArrayList<String> origen = new ArrayList<>(Arrays.asList("Madrid", "madrid", "Pekin", "Roma", "Barcelona", "Munich", "Munich")); 
    assertEquals("Munich", objetoBase.encontrarPalabraRepetida(origen));    
  }
  

  @Test 
  public void test04SinPalabraRepetida() {
    Actividad4009 objetoBase = new Actividad4009(); 

    ArrayList<String> origen = new ArrayList<>(Arrays.asList("Madrid", "Roma", "Pekin", "Barcelona", "Sanghai")); 
    assertNull(objetoBase.encontrarPalabraRepetida(origen));
  }
  

  @Test 
  public void test05ColeccionVacia() {
    Actividad4009 objetoBase = new Actividad4009();     
    
    ArrayList<String> origen = new ArrayList<>(); 
    assertNull(objetoBase.encontrarPalabraRepetida(origen)); 
  }
}