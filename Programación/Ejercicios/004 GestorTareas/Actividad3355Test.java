import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;

public class Actividad3355Test {

    @Test
    public void testMetodo06y07() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.devolverTareas());
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("Hacer la cama\n", gestorTa1.devolverTareas());
        gestorTa1.agregarTarea("Estudiar programación");
        assertEquals("Hacer la cama\nEstudiar programación\n", gestorTa1.devolverTareas());
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("Hacer la cama\nEstudiar programación\nComprar el pan\n", gestorTa1.devolverTareas());
    }

    @Test
    public void testMetodo10() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals(0, gestorTa1.getNumeroTareas());
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals(1, gestorTa1.getNumeroTareas());
        gestorTa1.agregarTarea("Estudiar programaci??n");
        assertEquals(2, gestorTa1.getNumeroTareas());
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals(3, gestorTa1.getNumeroTareas());
    }

    @Test
    public void testMetodo11() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals(0, gestorTa1.getNumeroTareas2());
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals(1, gestorTa1.getNumeroTareas2());
        gestorTa1.agregarTarea("Estudiar programaci??n");
        assertEquals(2, gestorTa1.getNumeroTareas2());
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals(3, gestorTa1.getNumeroTareas2());
    }

    @Test
    public void testMetodo12() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getTareaMasAntigua());
        gestorTa1.agregarTarea("Dormir la siesta");
        gestorTa1.agregarTarea("Comprar pan");
        gestorTa1.agregarTarea("Hacer la colada");
        assertEquals("Dormir la siesta", gestorTa1.getTareaMasAntigua());
    }

    @Test
    public void testMetodo14() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getListadoTareas());
        gestorTa1.agregarTarea("Hablar");
        assertEquals("1. Hablar\n", gestorTa1.getListadoTareas());
        gestorTa1.agregarTarea("Jugar");
        gestorTa1.agregarTarea("Comer");
        assertEquals("1. Hablar\n2. Jugar\n3. Comer\n", gestorTa1.getListadoTareas());
    }

    @Test
    public void testMetodo16() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("[]", gestorTa1.getTareasEnUnaSolaLinea());
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("[Hacer la cama]", gestorTa1.getTareasEnUnaSolaLinea());
        gestorTa1.agregarTarea("Estudiar programación");
        assertEquals("[Hacer la cama, Estudiar programación]", gestorTa1.getTareasEnUnaSolaLinea());
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("[Hacer la cama, Estudiar programación, Comprar el pan]", gestorTa1.getTareasEnUnaSolaLinea());
    }

    @Test
    public void testMetodo18() {
        GestorTareas gestorTa2 = new GestorTareas();
        assertEquals(false, gestorTa2.existeTareaConElTexto("cama"));
        assertEquals(false, gestorTa2.existeTareaConElTexto("pan"));
        assertEquals(false, gestorTa2.existeTareaConElTexto("moto"));
        gestorTa2.agregarTarea("Hacer la cama");
        assertEquals(true, gestorTa2.existeTareaConElTexto("cama"));
        assertEquals(false, gestorTa2.existeTareaConElTexto("pan"));
        assertEquals(false, gestorTa2.existeTareaConElTexto("moto"));
        gestorTa2.agregarTarea("Estudiar programacion");
        assertEquals(true, gestorTa2.existeTareaConElTexto("cama"));
        assertEquals(false, gestorTa2.existeTareaConElTexto("pan"));
        assertEquals(false, gestorTa2.existeTareaConElTexto("moto"));
        gestorTa2.agregarTarea("Comprar el pan");
        assertEquals(true, gestorTa2.existeTareaConElTexto("cama"));
        assertEquals(true, gestorTa2.existeTareaConElTexto("pan"));
        assertEquals(false, gestorTa2.existeTareaConElTexto("moto"));
    }

    @Test
    public void testMetodo19() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getTareasImportantes());
        gestorTa1.agregarTarea("Hacer la cama importante");
        assertEquals("1. Hacer la cama importante\n", gestorTa1.getTareasImportantes());
        gestorTa1.agregarTarea("Estudiar");
        assertEquals("1. Hacer la cama importante\n", gestorTa1.getTareasImportantes());
        gestorTa1.agregarTarea("Comprar el pan Importante");
        assertEquals("1. Hacer la cama importante\n3. Comprar el pan Importante\n", gestorTa1.getTareasImportantes());
        gestorTa1.agregarTarea("Comprar entradas IMPORTANTE");
        assertEquals("1. Hacer la cama importante\n3. Comprar el pan Importante\n4. Comprar entradas IMPORTANTE\n",
            gestorTa1.getTareasImportantes());
        gestorTa1.agregarTarea("Contestar emails ImPortantE");
        assertEquals(
            "1. Hacer la cama importante\n3. Comprar el pan Importante\n4. Comprar entradas IMPORTANTE\n5. Contestar emails ImPortantE\n",
            gestorTa1.getTareasImportantes());
    }

    @Test
    public void testMetodo21() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getTareasImpares());
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("1. Hacer la cama\n", gestorTa1.getTareasImpares());
        gestorTa1.agregarTarea("Estudiar");
        assertEquals("1. Hacer la cama\n", gestorTa1.getTareasImpares());
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("1. Hacer la cama\n3. Comprar el pan\n", gestorTa1.getTareasImpares());
        gestorTa1.agregarTarea("Comprar entradas");
        assertEquals("1. Hacer la cama\n3. Comprar el pan\n", gestorTa1.getTareasImpares());
        gestorTa1.agregarTarea("Contestar emails");
        assertEquals("1. Hacer la cama\n3. Comprar el pan\n5. Contestar emails\n", gestorTa1.getTareasImpares());
    }

    @Test
    public void testMetodo23() {
        GestorTareas gestorTa1 = new GestorTareas();

        assertEquals(false, gestorTa1.eliminarTarea(1));

        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("1. Hacer la cama\n", gestorTa1.getListadoTareas());
        assertEquals(false, gestorTa1.eliminarTarea(2));
        assertEquals(true, gestorTa1.eliminarTarea(1));
        assertEquals("", gestorTa1.getListadoTareas());

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Estudiar programación");
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n", gestorTa1.getListadoTareas());
        assertEquals(false, gestorTa1.eliminarTarea(3));
        assertEquals(true, gestorTa1.eliminarTarea(1));
        assertEquals("1. Estudiar programación\n", gestorTa1.getListadoTareas());
        assertEquals(false, gestorTa1.eliminarTarea(2));
        assertEquals(true, gestorTa1.eliminarTarea(1));
        assertEquals("", gestorTa1.getListadoTareas());

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Estudiar programación");
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n3. Comprar el pan\n", gestorTa1.getListadoTareas());
        assertEquals(true, gestorTa1.eliminarTarea(2));
        assertEquals("1. Hacer la cama\n2. Comprar el pan\n", gestorTa1.getListadoTareas());
        assertEquals(false, gestorTa1.eliminarTarea(3));
        assertEquals(true, gestorTa1.eliminarTarea(1));
        assertEquals("1. Comprar el pan\n", gestorTa1.getListadoTareas());
        assertEquals(false, gestorTa1.eliminarTarea(3));
        assertEquals(true, gestorTa1.eliminarTarea(1));
        assertEquals("", gestorTa1.getListadoTareas());
    }

    @Test
    public void testMetodo24() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getPrimeraTareaConElTexto("pan"));

        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("", gestorTa1.getPrimeraTareaConElTexto("pan"));
        assertEquals("Hacer la cama", gestorTa1.getPrimeraTareaConElTexto("cama"));

        gestorTa1.agregarTarea("Estudiar programación");
        assertEquals("", gestorTa1.getPrimeraTareaConElTexto("pan"));
        assertEquals("Hacer la cama", gestorTa1.getPrimeraTareaConElTexto("cama"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTexto("programación"));

        gestorTa1.agregarTarea("Estudiar bases de datos");
        assertEquals("", gestorTa1.getPrimeraTareaConElTexto("pan"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTexto("Estudiar"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTexto("programación"));

        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("Comprar el pan", gestorTa1.getPrimeraTareaConElTexto("pan"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTexto("Estudiar"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTexto("programación"));
    }

    @Test
    public void testMetodo26() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getListadoTareasWhile());
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("1. Hacer la cama\n", gestorTa1.getListadoTareasWhile());
        gestorTa1.agregarTarea("Estudiar programación");
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n", gestorTa1.getListadoTareasWhile());
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n3. Comprar el pan\n",
            gestorTa1.getListadoTareasWhile());
    }

    @Test
    public void testMetodo28() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getPrimeraTareaConElTextoWhile("pan"));

        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("", gestorTa1.getPrimeraTareaConElTexto("pan"));
        assertEquals("Hacer la cama", gestorTa1.getPrimeraTareaConElTextoWhile("cama"));

        gestorTa1.agregarTarea("Estudiar programación");
        assertEquals("", gestorTa1.getPrimeraTareaConElTextoWhile("pan"));
        assertEquals("Hacer la cama", gestorTa1.getPrimeraTareaConElTextoWhile("cama"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTextoWhile("programación"));

        gestorTa1.agregarTarea("Estudiar bases de datos");
        assertEquals("", gestorTa1.getPrimeraTareaConElTextoWhile("pan"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTextoWhile("Estudiar"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTextoWhile("programación"));

        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("Comprar el pan", gestorTa1.getPrimeraTareaConElTextoWhile("pan"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTextoWhile("Estudiar"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTextoWhile("programación"));
    }

    @Test
    public void testMetodo30() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getPrimerasTareas(0));
        assertEquals("", gestorTa1.getPrimerasTareas(1));
        assertEquals("", gestorTa1.getPrimerasTareas(2));

        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("", gestorTa1.getPrimerasTareas(0));
        assertEquals("1. Hacer la cama\n", gestorTa1.getPrimerasTareas(1));
        assertEquals("1. Hacer la cama\n", gestorTa1.getPrimerasTareas(2));

        gestorTa1.agregarTarea("Estudiar programación");
        assertEquals("", gestorTa1.getPrimerasTareas(0));
        assertEquals("1. Hacer la cama\n", gestorTa1.getPrimerasTareas(1));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n", gestorTa1.getPrimerasTareas(2));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n", gestorTa1.getPrimerasTareas(3));

        gestorTa1.agregarTarea("Estudiar bases de datos");
        assertEquals("", gestorTa1.getPrimerasTareas(0));
        assertEquals("1. Hacer la cama\n", gestorTa1.getPrimerasTareas(1));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n", gestorTa1.getPrimerasTareas(2));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n3. Estudiar bases de datos\n",
            gestorTa1.getPrimerasTareas(3));

        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("", gestorTa1.getPrimerasTareas(0));
        assertEquals("1. Hacer la cama\n", gestorTa1.getPrimerasTareas(1));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n", gestorTa1.getPrimerasTareas(2));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n3. Estudiar bases de datos\n",
            gestorTa1.getPrimerasTareas(3));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n3. Estudiar bases de datos\n4. Comprar el pan\n",
            gestorTa1.getPrimerasTareas(4));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n3. Estudiar bases de datos\n4. Comprar el pan\n",
            gestorTa1.getPrimerasTareas(5));

    }

    @Test
    public void testMetodo32() {
        GestorTareas gestorTa2 = new GestorTareas();
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("cama"));
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("pan"));
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("moto"));
        gestorTa2.agregarTarea("Hacer la cama");
        assertEquals(true, gestorTa2.hayTareaConElTextoEficiente("cama"));
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("pan"));
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("moto"));
        gestorTa2.agregarTarea("Estudiar programacion");
        assertEquals(true, gestorTa2.hayTareaConElTextoEficiente("cama"));
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("pan"));
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("moto"));
        gestorTa2.agregarTarea("Comprar el pan");
        assertEquals(true, gestorTa2.hayTareaConElTextoEficiente("cama"));
        assertEquals(true, gestorTa2.hayTareaConElTextoEficiente("pan"));
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("moto"));
    }

    @Test
    public void testMetodo33() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("No se encontraron coincidencias", gestorTa1.getTareasConElTexto("estudiar"));
        assertEquals("No se encontraron coincidencias", gestorTa1.getTareasConElTexto("comprar"));
        assertEquals("No se encontraron coincidencias", gestorTa1.getTareasConElTexto("ar"));
        assertEquals("No se encontraron coincidencias", gestorTa1.getTareasConElTexto("jugar"));

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Comprar el pan");
        gestorTa1.agregarTarea("Comprar las entradas del festival");
        gestorTa1.agregarTarea("Estudiar programacion");

        assertEquals("Estudiar programacion\n1", gestorTa1.getTareasConElTexto("Estudiar"));
        assertEquals("Comprar el pan\nComprar las entradas del festival\n2", gestorTa1.getTareasConElTexto("Comprar"));
        assertEquals("Comprar el pan\nComprar las entradas del festival\nEstudiar programacion\n3",
            gestorTa1.getTareasConElTexto("ar"));
        assertEquals("No se encontraron coincidencias", gestorTa1.getTareasConElTexto("jugar"));
    }

    @Test
    public void testMetodo35() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals(false, gestorTa1.eliminaPrimeraTareaConElTexto("Jugar"));

        gestorTa1.agregarTarea("Jugar al futbol");
        gestorTa1.agregarTarea("Estudiar programacion");
        gestorTa1.agregarTarea("Hacer la cama");

        assertEquals("1. Jugar al futbol\n2. Estudiar programacion\n3. Hacer la cama\n", gestorTa1.getListadoTareas());
        assertEquals(true, gestorTa1.eliminaPrimeraTareaConElTexto("Jugar"));
        assertEquals("1. Estudiar programacion\n2. Hacer la cama\n", gestorTa1.getListadoTareas());

        assertEquals(false, gestorTa1.eliminaPrimeraTareaConElTexto("doblar"));
        assertEquals("1. Estudiar programacion\n2. Hacer la cama\n", gestorTa1.getListadoTareas());

        assertEquals(true, gestorTa1.eliminaPrimeraTareaConElTexto("la"));
        assertEquals("1. Estudiar programacion\n", gestorTa1.getListadoTareas());

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Recoger la habitacion");

        assertEquals(true, gestorTa1.eliminaPrimeraTareaConElTexto("la"));
        assertEquals("1. Estudiar programacion\n2. Recoger la habitacion\n", gestorTa1.getListadoTareas());

        assertEquals(true, gestorTa1.eliminaPrimeraTareaConElTexto("programacion"));
        assertEquals("1. Recoger la habitacion\n", gestorTa1.getListadoTareas());        

        assertEquals(false, gestorTa1.eliminaPrimeraTareaConElTexto("programacion"));
        assertEquals("1. Recoger la habitacion\n", gestorTa1.getListadoTareas());           

        assertEquals(true, gestorTa1.eliminaPrimeraTareaConElTexto("coger"));
        assertEquals("", gestorTa1.getListadoTareas());            

        assertEquals(false, gestorTa1.eliminaPrimeraTareaConElTexto("programacion"));
        assertEquals("", gestorTa1.getListadoTareas());            
    }

    @Test
    public void testMetodo36() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals(0, gestorTa1.eliminaTodasLasTareasConElTexto("Jugar"));

        gestorTa1.agregarTarea("Jugar al futbol");
        gestorTa1.agregarTarea("Estudiar programacion");
        gestorTa1.agregarTarea("Hacer la cama");

        assertEquals(1, gestorTa1.eliminaTodasLasTareasConElTexto("Jugar"));
        assertEquals("1. Estudiar programacion\n2. Hacer la cama\n" , gestorTa1.getListadoTareas());

        assertEquals(0, gestorTa1.eliminaTodasLasTareasConElTexto("doblar"));
        assertEquals("1. Estudiar programacion\n2. Hacer la cama\n" , gestorTa1.getListadoTareas());        

        assertEquals(1, gestorTa1.eliminaTodasLasTareasConElTexto("Hacer"));
        assertEquals("1. Estudiar programacion\n" , gestorTa1.getListadoTareas());        

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Hacer la cena");
        assertEquals(2, gestorTa1.eliminaTodasLasTareasConElTexto("Hacer"));        
        assertEquals("1. Estudiar programacion\n" , gestorTa1.getListadoTareas());     

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Hacer la cena");
        gestorTa1.agregarTarea("Hacer el desayuno");        
        gestorTa1.agregarTarea("Llamar a mi amigo");
        gestorTa1.agregarTarea("Hacer la comida");        
        assertEquals(4, gestorTa1.eliminaTodasLasTareasConElTexto("Hacer"));
        assertEquals("1. Estudiar programacion\n2. Llamar a mi amigo\n" , gestorTa1.getListadoTareas());          
    }            

    /*
    @Test
    public void testMetodo37() {
    GestorTareas gestorTa1 = new GestorTareas();
    assertEquals(0, gestorTa1.eliminaTodasLasTareasConElTextoFoEach("Jugar"));

    gestorTa1.agregarTarea("Jugar al futbol");
    gestorTa1.agregarTarea("Estudiar programacion");
    gestorTa1.agregarTarea("Hacer la cama");

    assertEquals(1, gestorTa1.eliminaTodasLasTareasConElTextoFoEach("Jugar"));
    assertEquals("1. Estudiar programacion\n2. Hacer la cama\n" , gestorTa1.getListadoTareas());

    assertEquals(0, gestorTa1.eliminaTodasLasTareasConElTextoFoEach("doblar"));
    assertEquals("1. Estudiar programacion\n2. Hacer la cama\n" , gestorTa1.getListadoTareas());        

    assertEquals(1, gestorTa1.eliminaTodasLasTareasConElTextoFoEach("Hacer"));
    assertEquals("1. Estudiar programacion\n" , gestorTa1.getListadoTareas());        

    gestorTa1.agregarTarea("Hacer la cama");
    gestorTa1.agregarTarea("Hacer la cena");
    assertEquals(2, gestorTa1.eliminaTodasLasTareasConElTextoFoEach("Hacer"));        
    assertEquals("1. Estudiar programacion\n" , gestorTa1.getListadoTareas());     

    gestorTa1.agregarTarea("Hacer la cama");
    gestorTa1.agregarTarea("Hacer la cena");
    gestorTa1.agregarTarea("Hacer el desayuno");        
    gestorTa1.agregarTarea("Llamar a mi amigo");
    gestorTa1.agregarTarea("Hacer la comida");        
    assertEquals(4, gestorTa1.eliminaTodasLasTareasConElTextoFoEach("Hacer"));
    assertEquals("1. Estudiar programacion\n2. Llamar a mi amigo\n" , gestorTa1.getListadoTareas());          
    } */  

    @Test
    public void testMetodo38() {
        GestorTareas gestorTa1 = new GestorTareas();

        assertEquals(false, gestorTa1.editarTarea(0, "Comprar un ordenador"));

        gestorTa1.agregarTarea("Jugar al furbol");
        gestorTa1.agregarTarea("Estudiar prog");
        gestorTa1.agregarTarea("Hacer la cma");
        assertEquals("1. Jugar al furbol\n2. Estudiar prog\n3. Hacer la cma\n" , gestorTa1.getListadoTareas());

        assertEquals(true, gestorTa1.editarTarea(2, "Estudiar programación"));
        assertEquals("1. Jugar al furbol\n2. Estudiar programación\n3. Hacer la cma\n" , gestorTa1.getListadoTareas());

        assertEquals(false, gestorTa1.editarTarea(-5, "Jugar al fútbol"));        
        assertEquals(false, gestorTa1.editarTarea(5, "Jugar al fútbol"));       
        assertEquals(false, gestorTa1.editarTarea(0, "Jugar al fútbol"));         
        assertEquals(false, gestorTa1.editarTarea(4, "Jugar al fútbol"));  

        assertEquals(true, gestorTa1.editarTarea(1, "Jugar al fútbol"));
        assertEquals("1. Jugar al fútbol\n2. Estudiar programación\n3. Hacer la cma\n" , gestorTa1.getListadoTareas());        

        assertEquals(true, gestorTa1.editarTarea(3, "Hacer la cama"));
        assertEquals("1. Jugar al fútbol\n2. Estudiar programación\n3. Hacer la cama\n" , gestorTa1.getListadoTareas());        
    }             

    @Test
    public void testMetodo39y40() {
        GestorTareas gestorTa1 = new GestorTareas();

        gestorTa1.agregarTarea("Jugar al futbol");
        gestorTa1.agregarTarea("Estudiar programacion");
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("1. Jugar al futbol\n2. Estudiar programacion\n3. Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());

        assertEquals(true, gestorTa1.marcarComoCompletada(1));
        assertEquals("1. [x] Jugar al futbol\n2. Estudiar programacion\n3. Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());

        assertEquals(false, gestorTa1.marcarComoCompletada(10));
        assertEquals("1. [x] Jugar al futbol\n2. Estudiar programacion\n3. Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());

        assertEquals(true, gestorTa1.marcarComoCompletada(3));
        assertEquals("1. [x] Jugar al futbol\n2. Estudiar programacion\n3. [x] Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());

        assertEquals(false, gestorTa1.marcarComoCompletada(10));
        assertEquals("1. [x] Jugar al futbol\n2. Estudiar programacion\n3. [x] Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());

        assertEquals(true, gestorTa1.marcarComoCompletada(2));
        assertEquals("1. [x] Jugar al futbol\n2. [x] Estudiar programacion\n3. [x] Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());

        assertEquals(false, gestorTa1.marcarComoCompletada(10));
        assertEquals("1. [x] Jugar al futbol\n2. [x] Estudiar programacion\n3. [x] Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());

        assertEquals(false, gestorTa1.marcarComoCompletada(2));
        assertEquals("1. [x] Jugar al futbol\n2. [x] Estudiar programacion\n3. [x] Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());
    }  

    @Test
    public void testMetodo41() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getListaTareasConPrioridad());
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals(false, gestorTa1.marcarComoCompletada(10));
        assertEquals("1. [ ] hacer la cama 5\n2. [ ] comprar el pan 5\n" , gestorTa1.getListaTareasConPrioridad());
        assertEquals(true, gestorTa1.marcarComoCompletada(1));
        assertEquals("1. [x] hacer la cama 5\n2. [ ] comprar el pan 5\n" , gestorTa1.getListaTareasConPrioridad());
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        assertEquals(true, gestorTa1.marcarComoCompletada(2));
        assertEquals("1. [x] hacer la cama 5\n2. [x] comprar el pan 5\n3. [ ] comprar entradas festival 5\n4. [ ] estudiar programacion 5\n" , gestorTa1.getListaTareasConPrioridad());
    }  

    @Test
    public void testMetodo42() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getListaTareasConPrioridad());
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals(false, gestorTa1.marcarComoCompletada(10));
        gestorTa1.setPrioridad(1, 1);
        assertEquals("1. [ ] hacer la cama 1\n2. [ ] comprar el pan 5\n" , gestorTa1.getListaTareasConPrioridad());
        gestorTa1.setPrioridad(1, 3);
        assertEquals("1. [ ] hacer la cama 3\n2. [ ] comprar el pan 5\n" , gestorTa1.getListaTareasConPrioridad());
        gestorTa1.setPrioridad(1, 7);   
        assertEquals("1. [ ] hacer la cama 3\n2. [ ] comprar el pan 5\n" , gestorTa1.getListaTareasConPrioridad()); 
        gestorTa1.setPrioridad(3, 3);        
        assertEquals("1. [ ] hacer la cama 3\n2. [ ] comprar el pan 5\n" , gestorTa1.getListaTareasConPrioridad());        
        assertEquals(true, gestorTa1.marcarComoCompletada(1));
        assertEquals("1. [x] hacer la cama 3\n2. [ ] comprar el pan 5\n" , gestorTa1.getListaTareasConPrioridad());
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        gestorTa1.setPrioridad(3, 3);  
        gestorTa1.setPrioridad(4, 2);  
        assertEquals(true, gestorTa1.marcarComoCompletada(2));
        assertEquals("1. [x] hacer la cama 3\n2. [x] comprar el pan 5\n3. [ ] comprar entradas festival 3\n4. [ ] estudiar programacion 2\n" , gestorTa1.getListaTareasConPrioridad());
    }

    @Test
    public void testMetodo43() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getTareaMasPrioritaria());  
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals("2. [ ] comprar el pan 5" , gestorTa1.getTareaMasPrioritaria());        
        gestorTa1.setPrioridad(1, 2);
        assertEquals("1. [ ] hacer la cama 2" , gestorTa1.getTareaMasPrioritaria());        
        gestorTa1.setPrioridad(1, 3);
        assertEquals("1. [ ] hacer la cama 3" , gestorTa1.getTareaMasPrioritaria());
        gestorTa1.setPrioridad(1, 7);   
        assertEquals("1. [ ] hacer la cama 3" , gestorTa1.getTareaMasPrioritaria());
        gestorTa1.setPrioridad(3, 3);        
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        assertEquals("1. [ ] hacer la cama 3" , gestorTa1.getTareaMasPrioritaria());
        gestorTa1.setPrioridad(3, 3);  
        assertEquals("3. [ ] comprar entradas festival 3" , gestorTa1.getTareaMasPrioritaria());
        gestorTa1.setPrioridad(4, 2);  
        assertEquals("4. [ ] estudiar programacion 2" , gestorTa1.getTareaMasPrioritaria());
    }    

    @Test
    public void testMetodo44() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getTareaMenosPrioritaria());
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals("2. [ ] comprar el pan 5" , gestorTa1.getTareaMenosPrioritaria());        
        gestorTa1.setPrioridad(2, 4);
        assertEquals("1. [ ] hacer la cama 5" , gestorTa1.getTareaMenosPrioritaria());        
        gestorTa1.setPrioridad(2, 3);
        assertEquals("1. [ ] hacer la cama 5" , gestorTa1.getTareaMenosPrioritaria());
        gestorTa1.setPrioridad(1, 7);   
        assertEquals("1. [ ] hacer la cama 5" , gestorTa1.getTareaMenosPrioritaria());    
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        assertEquals("4. [ ] estudiar programacion 5" , gestorTa1.getTareaMenosPrioritaria());
        gestorTa1.setPrioridad(4, 3);  
        assertEquals("3. [ ] comprar entradas festival 5" , gestorTa1.getTareaMenosPrioritaria());
        gestorTa1.setPrioridad(3, 1);  
        assertEquals("1. [ ] hacer la cama 5" , gestorTa1.getTareaMenosPrioritaria());
        gestorTa1.setPrioridad(1, 1);          
        gestorTa1.setPrioridad(2, 1);        
        gestorTa1.setPrioridad(3, 1);        
        gestorTa1.setPrioridad(4, 1);        
        assertEquals("4. [ ] estudiar programacion 1" , gestorTa1.getTareaMenosPrioritaria());
    }

    @Test
    public void testMetodo45() {
        GestorTareas gestorTa1 = new GestorTareas();  
        assertEquals("", gestorTa1.getTareasPorPrioridad());
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("Hacer la cama 5\n", gestorTa1.getTareasPorPrioridad());
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("Comprar el pan 5\nHacer la cama 5\n", gestorTa1.getTareasPorPrioridad());      
        gestorTa1.setPrioridad(1, 1); 
        gestorTa1.setPrioridad(2, 3);     
        assertEquals("Hacer la cama 1\nComprar el pan 3\n", gestorTa1.getTareasPorPrioridad());   
        gestorTa1.setPrioridad(1, 4); 
        gestorTa1.setPrioridad(2, 3);     
        assertEquals("Comprar el pan 3\nHacer la cama 4\n", gestorTa1.getTareasPorPrioridad());         
        gestorTa1.agregarTarea("Comprar entradas festival");
        gestorTa1.agregarTarea("Estudiar programacion");
        assertEquals("Comprar el pan 3\nHacer la cama 4\nEstudiar programacion 5\nComprar entradas festival 5\n", gestorTa1.getTareasPorPrioridad());    
        gestorTa1.setPrioridad(3, 3);  
        gestorTa1.setPrioridad(4, 2);  
        assertEquals("Estudiar programacion 2\nComprar entradas festival 3\nComprar el pan 3\nHacer la cama 4\n", gestorTa1.getTareasPorPrioridad());                
        gestorTa1.setPrioridad(3, 2);  
        assertEquals("Estudiar programacion 2\nComprar entradas festival 2\nComprar el pan 3\nHacer la cama 4\n", gestorTa1.getTareasPorPrioridad());                

    }

    @Test
    public void testMetodo46() {
        GestorTareas gestorTa1 = new GestorTareas();  
        assertEquals("", gestorTa1.getTareasPorPrioridadSeleccion());
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("Hacer la cama 5\n", gestorTa1.getTareasPorPrioridadSeleccion());
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("Comprar el pan 5\nHacer la cama 5\n", gestorTa1.getTareasPorPrioridadSeleccion());      
        gestorTa1.setPrioridad(1, 1); 
        gestorTa1.setPrioridad(2, 3);     
        assertEquals("Hacer la cama 1\nComprar el pan 3\n", gestorTa1.getTareasPorPrioridadSeleccion());   
        gestorTa1.setPrioridad(1, 4); 
        gestorTa1.setPrioridad(2, 3);     
        assertEquals("Comprar el pan 3\nHacer la cama 4\n", gestorTa1.getTareasPorPrioridadSeleccion());         
        gestorTa1.agregarTarea("Comprar entradas festival");
        gestorTa1.agregarTarea("Estudiar programacion");
        assertEquals("Comprar el pan 3\nHacer la cama 4\nEstudiar programacion 5\nComprar entradas festival 5\n", gestorTa1.getTareasPorPrioridadSeleccion());    
        gestorTa1.setPrioridad(3, 3);  
        gestorTa1.setPrioridad(4, 2);  
        assertEquals("Estudiar programacion 2\nComprar entradas festival 3\nComprar el pan 3\nHacer la cama 4\n", gestorTa1.getTareasPorPrioridadSeleccion());                
        gestorTa1.setPrioridad(3, 2);  
        assertEquals("Estudiar programacion 2\nComprar entradas festival 2\nComprar el pan 3\nHacer la cama 4\n", gestorTa1.getTareasPorPrioridadSeleccion());                

    }

    @Test
    public void testMetodo47y48() {
        GestorTareas gestorTa1 = new GestorTareas();  
        assertEquals("", gestorTa1.getListaTareasConFechaVencimiento());
        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("1. Hacer la cama\n2. Comprar el pan\n", gestorTa1.getListaTareasConFechaVencimiento());      
        gestorTa1.fijarFechaTope(1, 21, 1, 2019);
        assertEquals("1. Hacer la cama - 21/01/2019\n2. Comprar el pan\n", gestorTa1.getListaTareasConFechaVencimiento());  
        gestorTa1.fijarFechaTope(2, 23, 2, 2019);
        assertEquals("1. Hacer la cama - 21/01/2019\n2. Comprar el pan - 23/02/2019\n", gestorTa1.getListaTareasConFechaVencimiento()); 
        gestorTa1.fijarFechaTope(2, 5, 12, 2019);  
        assertEquals("1. Hacer la cama - 21/01/2019\n2. Comprar el pan - 05/12/2019\n", gestorTa1.getListaTareasConFechaVencimiento());               
    }

    @Test
    public void testMetodo49() {
        GestorTareas gestorTa1 = new GestorTareas();  
        assertEquals("", gestorTa1.getTareasQueVencenEl(1, 2, 2020));
        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("", gestorTa1.getTareasQueVencenEl(1, 2, 2020));
        assertEquals("", gestorTa1.getTareasQueVencenEl(2, 2, 2020));      
        gestorTa1.fijarFechaTope(1, 25, 2, 2020);
        assertEquals("Hacer la cama\n", gestorTa1.getTareasQueVencenEl(25, 2, 2020));  
        gestorTa1.fijarFechaTope(2, 27, 2, 2020);
        assertEquals("Hacer la cama\n", gestorTa1.getTareasQueVencenEl(25, 2, 2020)); 
        assertEquals("Comprar el pan\n", gestorTa1.getTareasQueVencenEl(27, 2, 2020)); 
        gestorTa1.agregarTarea("Comprar entradas festival");
        assertEquals("Hacer la cama\n", gestorTa1.getTareasQueVencenEl(25, 2, 2020));        
        gestorTa1.agregarTarea("Estudiar programacion");        
        gestorTa1.fijarFechaTope(4, 25, 2, 2020);  
        assertEquals("Hacer la cama\nEstudiar programacion\n", gestorTa1.getTareasQueVencenEl(25, 2, 2020));               
    }

    @Test
    public void testMetodo50() {
        GestorTareas gestorTa1 = new GestorTareas();  
        assertEquals("", gestorTa1.getTareaVencimientoMasInminente());
        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("", gestorTa1.getTareaVencimientoMasInminente());   
        gestorTa1.fijarFechaTope(1, 1, 1, 2019);
        assertEquals("", gestorTa1.getTareaVencimientoMasInminente());    
        gestorTa1.fijarFechaTope(1, 3, 7, 2020);
        assertEquals("Hacer la cama\n", gestorTa1.getTareaVencimientoMasInminente());  

        int diaHoy = LocalDate.now().getDayOfMonth();
        int mesHoy = LocalDate.now().getMonthValue();
        int anoHoy = LocalDate.now().getYear();
        gestorTa1.fijarFechaTope(2, diaHoy, mesHoy, anoHoy);
        assertEquals("Comprar el pan\n", gestorTa1.getTareaVencimientoMasInminente()); 
        gestorTa1.agregarTarea("Comprar entradas festival");
        assertEquals("Comprar el pan\n", gestorTa1.getTareaVencimientoMasInminente());        
        gestorTa1.agregarTarea("Estudiar programacion");        
        gestorTa1.fijarFechaTope(4, 4, 7, 2020);  
        assertEquals("Comprar el pan\n", gestorTa1.getTareaVencimientoMasInminente());    
        gestorTa1.fijarFechaTope(4, diaHoy, mesHoy, anoHoy);  
        assertEquals("Comprar el pan\nEstudiar programacion\n", gestorTa1.getTareaVencimientoMasInminente());   
        gestorTa1.fijarFechaTope(4, 1, 1, 2020);  
        assertEquals("Comprar el pan\n", gestorTa1.getTareaVencimientoMasInminente());
    } 

    @Test
    public void testMetodo51() {
        GestorTareas gestorTa1 = new GestorTareas();  
        assertEquals("", gestorTa1.getTareaVencimientoMasLejano());

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("", gestorTa1.getTareaVencimientoMasLejano()); 

        gestorTa1.fijarFechaTope(1, 1, 1, 2019);
        assertEquals("", gestorTa1.getTareaVencimientoMasLejano());   

        int diaHoy = LocalDate.now().getDayOfMonth();
        int mesHoy = LocalDate.now().getMonthValue();
        int anoHoy = LocalDate.now().getYear();
        gestorTa1.fijarFechaTope(1, diaHoy, mesHoy, anoHoy);
        assertEquals("Hacer la cama\n", gestorTa1.getTareaVencimientoMasLejano()); 

        int diaManana = LocalDate.now().plusDays(1).getDayOfMonth();
        int mesManana = LocalDate.now().plusDays(1).getMonthValue();
        int anoManana = LocalDate.now().plusDays(1).getYear();
        gestorTa1.fijarFechaTope(2, diaManana, mesManana, anoManana);
        assertEquals("Comprar el pan\n", gestorTa1.getTareaVencimientoMasLejano()); 

        gestorTa1.agregarTarea("Comprar entradas festival");
        assertEquals("Comprar el pan\n", gestorTa1.getTareaVencimientoMasLejano()); 

        gestorTa1.agregarTarea("Estudiar programacion");        
        gestorTa1.fijarFechaTope(4, diaManana, mesManana, anoManana);  
        assertEquals("Comprar el pan\nEstudiar programacion\n", gestorTa1.getTareaVencimientoMasLejano()); 

        gestorTa1.fijarFechaTope(4, diaManana, mesManana, anoManana + 1); 
        assertEquals("Estudiar programacion\n", gestorTa1.getTareaVencimientoMasLejano()); 

        gestorTa1.fijarFechaTope(1, diaManana, mesManana, anoManana + 1); 
        assertEquals("Hacer la cama\nEstudiar programacion\n", gestorTa1.getTareaVencimientoMasLejano());  

        gestorTa1.fijarFechaTope(1, 1, 1, anoHoy);
        gestorTa1.fijarFechaTope(2, 1, 1, anoHoy);
        gestorTa1.fijarFechaTope(3, 1, 1, anoHoy);
        gestorTa1.fijarFechaTope(4, 1, 1, anoHoy);        
        assertEquals("", gestorTa1.getTareaVencimientoMasLejano());          
    }    

    @Test
    public void testMetodo52() {
        GestorTareas gestorTa1 = new GestorTareas();  
        assertEquals("", gestorTa1.getTareasVencidas());

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("", gestorTa1.getTareasVencidas()); 

        gestorTa1.fijarFechaTope(1, 1, 1, 2019);
        assertEquals("1. Hacer la cama\n", gestorTa1.getTareasVencidas());   

        int diaHoy = LocalDate.now().getDayOfMonth();
        int mesHoy = LocalDate.now().getMonthValue();
        int anoHoy = LocalDate.now().getYear();
        gestorTa1.fijarFechaTope(1, diaHoy, mesHoy, anoHoy);
        assertEquals("", gestorTa1.getTareasVencidas()); 

        gestorTa1.fijarFechaTope(2, diaHoy, mesHoy, anoHoy - 1);
        assertEquals("2. Comprar el pan\n", gestorTa1.getTareasVencidas()); 

        gestorTa1.agregarTarea("Comprar entradas festival");
        assertEquals("2. Comprar el pan\n", gestorTa1.getTareasVencidas()); 

        gestorTa1.agregarTarea("Estudiar programacion");        

        gestorTa1.fijarFechaTope(4, diaHoy, mesHoy, anoHoy);  
        assertEquals("2. Comprar el pan\n", gestorTa1.getTareasVencidas()); 

        int diaAyer = LocalDate.now().minusDays(1).getDayOfMonth();
        int mesAyer = LocalDate.now().minusDays(1).getMonthValue();
        int anoAyer = LocalDate.now().minusDays(1).getYear();
        gestorTa1.fijarFechaTope(4, diaAyer, mesAyer, anoAyer);  
        assertEquals("2. Comprar el pan\n4. Estudiar programacion\n", gestorTa1.getTareasVencidas()); 

        gestorTa1.fijarFechaTope(3, diaHoy, mesHoy, anoHoy - 1);  
        assertEquals("2. Comprar el pan\n3. Comprar entradas festival\n4. Estudiar programacion\n", gestorTa1.getTareasVencidas());  

        gestorTa1.fijarFechaTope(1, 1, 1, anoHoy);
        gestorTa1.fijarFechaTope(2, 1, 1, anoHoy);
        gestorTa1.fijarFechaTope(3, 1, 1, anoHoy);
        gestorTa1.fijarFechaTope(4, 1, 1, anoHoy);        
        assertEquals("1. Hacer la cama\n2. Comprar el pan\n3. Comprar entradas festival\n4. Estudiar programacion\n", gestorTa1.getTareasVencidas());          
    }

    @Test
    public void testMetodo53() {
        int diaHoy = LocalDate.now().getDayOfMonth();
        int mesHoy = LocalDate.now().getMonthValue();
        int anoHoy = LocalDate.now().getYear();

        GestorTareas gestorTa1 = new GestorTareas();  
        assertEquals("", gestorTa1.getTareasPorFechaVencimiento());

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("", gestorTa1.getTareasPorFechaVencimiento()); 

        gestorTa1.fijarFechaTope(1, 1, 1, 2019);
        assertEquals("", gestorTa1.getTareasPorFechaVencimiento());   

        gestorTa1.fijarFechaTope(1, 8, 6, anoHoy);
        assertEquals("Hacer la cama\n", gestorTa1.getTareasPorFechaVencimiento()); 

        gestorTa1.fijarFechaTope(2, 10, 6, anoHoy);
        assertEquals("Hacer la cama\nComprar el pan\n", gestorTa1.getTareasPorFechaVencimiento()); 

        gestorTa1.fijarFechaTope(2, 7, 6, anoHoy);
        assertEquals("Comprar el pan\nHacer la cama\n", gestorTa1.getTareasPorFechaVencimiento());         

        gestorTa1.agregarTarea("Comprar entradas festival");
        assertEquals("Comprar el pan\nHacer la cama\n", gestorTa1.getTareasPorFechaVencimiento()); 

        gestorTa1.agregarTarea("Estudiar programacion");        
        assertEquals("Comprar el pan\nHacer la cama\n", gestorTa1.getTareasPorFechaVencimiento()); 

        gestorTa1.fijarFechaTope(4, 5, 5, anoHoy);  
        assertEquals("Estudiar programacion\nComprar el pan\nHacer la cama\n", gestorTa1.getTareasPorFechaVencimiento()); 

        gestorTa1.fijarFechaTope(4, 1, 5, anoHoy);  
        assertEquals("Estudiar programacion\nComprar el pan\nHacer la cama\n", gestorTa1.getTareasPorFechaVencimiento()); 

        gestorTa1.fijarFechaTope(3, 1, 5, anoHoy);  
        assertEquals("Comprar entradas festival\nEstudiar programacion\nComprar el pan\nHacer la cama\n", gestorTa1.getTareasPorFechaVencimiento());  

        gestorTa1.fijarFechaTope(1, 1, 1, anoHoy);
        assertEquals("Comprar entradas festival\nEstudiar programacion\nComprar el pan\n", gestorTa1.getTareasPorFechaVencimiento());         
        gestorTa1.fijarFechaTope(2, 1, 1, anoHoy);
        assertEquals("Comprar entradas festival\nEstudiar programacion\n", gestorTa1.getTareasPorFechaVencimiento());         
        gestorTa1.fijarFechaTope(3, 1, 1, anoHoy);
        assertEquals("Estudiar programacion\n", gestorTa1.getTareasPorFechaVencimiento());         
        gestorTa1.fijarFechaTope(4, 1, 1, anoHoy);        
        assertEquals("", gestorTa1.getTareasPorFechaVencimiento());  

        gestorTa1 = new GestorTareas();
        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Comprar el pan");   
        gestorTa1.agregarTarea("Comprar entradas festival");  
        gestorTa1.agregarTarea("Estudiar programacion");     
        gestorTa1.agregarTarea("Leer un libro");
        gestorTa1.agregarTarea("Jugar a la consola");
        gestorTa1.fijarFechaTope(1, 1, 6, anoHoy); 
        gestorTa1.fijarFechaTope(2, 2, 5, anoHoy); 
        gestorTa1.fijarFechaTope(3, 1, 5, anoHoy); 
        gestorTa1.fijarFechaTope(4, 3, 6, anoHoy); 
        gestorTa1.fijarFechaTope(5, 10, 6, anoHoy); 
        gestorTa1.fijarFechaTope(6, 11, 5, anoHoy);     
        assertEquals("Comprar entradas festival\nComprar el pan\nJugar a la consola\nHacer la cama\nEstudiar programacion\nLeer un libro\n", gestorTa1.getTareasPorFechaVencimiento());    
    }

    @Test
    public void testMetodo54() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getListadoTareasConIterador());
        gestorTa1.agregarTarea("Hablar");
        assertEquals("1. Hablar\n", gestorTa1.getListadoTareasConIterador());
        gestorTa1.agregarTarea("Jugar");
        gestorTa1.agregarTarea("Comer");
        assertEquals("1. Hablar\n2. Jugar\n3. Comer\n", gestorTa1.getListadoTareasConIterador());
    }

    @Test
    public void testMetodo55() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getListaTareasConPrioridadIterador());
        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("1. Hacer la cama 5\n2. Comprar el pan 5\n" , gestorTa1.getListaTareasConPrioridadIterador());
        gestorTa1.agregarTarea("Comprar entradas festival");
        gestorTa1.agregarTarea("Estudiar programacion");        
        gestorTa1.setPrioridad(1, 3);
        assertEquals("1. Hacer la cama 3\n2. Comprar el pan 5\n3. Comprar entradas festival 5\n4. Estudiar programacion 5\n" , gestorTa1.getListaTareasConPrioridadIterador());
    }

    @Test
    public void testMetodo56() {
        int diaHoy = LocalDate.now().getDayOfMonth();
        int mesHoy = LocalDate.now().getMonthValue();        
        int anoHoy = LocalDate.now().getYear();
        GestorTareas gestorTa1 = new GestorTareas();  
        assertEquals(false, gestorTa1.olvidaTareasYaPasadas());

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals(false, gestorTa1.olvidaTareasYaPasadas()); 

        gestorTa1.fijarFechaTope(1, 1, 1, anoHoy);
        assertEquals(true, gestorTa1.olvidaTareasYaPasadas()); 

        gestorTa1.fijarFechaTope(1, diaHoy, mesHoy, anoHoy);
        assertEquals(false, gestorTa1.olvidaTareasYaPasadas());      

        gestorTa1.agregarTarea("Comprar entradas festival");
        assertEquals(false, gestorTa1.olvidaTareasYaPasadas()); 

        gestorTa1.agregarTarea("Estudiar programacion");        
        gestorTa1.fijarFechaTope(3, diaHoy, mesHoy + 1, anoHoy);  
        assertEquals(false, gestorTa1.olvidaTareasYaPasadas()); 

        gestorTa1.fijarFechaTope(3, 1, 1, anoHoy);  
        assertEquals(true, gestorTa1.olvidaTareasYaPasadas()); 

        gestorTa1.fijarFechaTope(2, 1, 1, anoHoy);  
        assertEquals(true, gestorTa1.olvidaTareasYaPasadas());  

        gestorTa1.fijarFechaTope(1, 10, 5, anoHoy);
        assertEquals(false, gestorTa1.olvidaTareasYaPasadas());       

        gestorTa1.agregarTarea("Leer un libro");      
        assertEquals(false, gestorTa1.olvidaTareasYaPasadas());     

        gestorTa1.agregarTarea("Jugar a la consola");   
        assertEquals(false, gestorTa1.olvidaTareasYaPasadas());  

        gestorTa1.fijarFechaTope(1, 1, 1, anoHoy);
        gestorTa1.fijarFechaTope(2, 1, 1, anoHoy);
        assertEquals(true, gestorTa1.olvidaTareasYaPasadas());  
        assertEquals(false, gestorTa1.olvidaTareasYaPasadas());         

        gestorTa1.fijarFechaTope(1, 1, 1, anoHoy);  
        assertEquals(true, gestorTa1.olvidaTareasYaPasadas());                  
    }

    @Test
    public void testMetodo57y58() {
        GestorTareas gestorTa1 = new GestorTareas();  
        assertEquals(false, gestorTa1.hayTareasDuplicadas());

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals(false, gestorTa1.hayTareasDuplicadas()); 

        gestorTa1.agregarTarea("Hacer la colada");        
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals(true, gestorTa1.hayTareasDuplicadas());   

        gestorTa1.eliminaTareaMasVieja();
        assertEquals(false, gestorTa1.hayTareasDuplicadas());   

        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals(true, gestorTa1.hayTareasDuplicadas());         

        gestorTa1.agregarTarea("Comprar entradas festival");
        assertEquals(true, gestorTa1.hayTareasDuplicadas()); 

        gestorTa1.eliminaTareaMasVieja();        
        assertEquals(false, gestorTa1.hayTareasDuplicadas());   

        gestorTa1.agregarTarea("Estudiar programacion");        
        assertEquals(false, gestorTa1.hayTareasDuplicadas());  

        gestorTa1.agregarTarea("Leer un libro");
        assertEquals(false, gestorTa1.hayTareasDuplicadas());         

        gestorTa1.agregarTarea("Jugar a la consola");
        assertEquals(false, gestorTa1.hayTareasDuplicadas());    

        gestorTa1.agregarTarea("Jugar a la consola");
        assertEquals(true, gestorTa1.hayTareasDuplicadas());   

        gestorTa1.agregarTarea("Hacer la colada"); 
        assertEquals(true, gestorTa1.hayTareasDuplicadas());   
    }
}