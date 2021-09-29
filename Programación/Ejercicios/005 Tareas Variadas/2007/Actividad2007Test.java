import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Actividad2007Test {

    @Test
    public void test01ColeccionEjemplo() {
        Actividad2007 ejercici1 = new Actividad2007();

        ArrayList<String> origen = new ArrayList<>(Arrays.asList("Mesa","Silla","Ordenador","Futbolin","Libros","Berenjenas"));
        String resultadoEsperado = "Berenjenas,Ordenador,Futbolin,Libros,Silla,Mesa";
        assertEquals(resultadoEsperado, ejercici1.devolverEnOrden(origen));
    }

    @Test
    public void test02ColeccionNormal() {
        Actividad2007 ejercici1 = new Actividad2007();

        ArrayList<String> origen = new ArrayList<>(Arrays.asList("Mesas","Silla","Ordenador","Esquinera","Libros","Berenjenas"));
        String resultadoEsperado = "Berenjenas,Esquinera,Ordenador,Libros,Silla,Mesas";
        assertEquals(resultadoEsperado, ejercici1.devolverEnOrden(origen));
    }

    @Test
    public void test03ColeccionNumerica() {
        Actividad2007 ejercici1 = new Actividad2007();

        ArrayList<String> origen = new ArrayList<>(Arrays.asList("1234a","12","1234b","1","1234567","1234c"));
        String resultadoEsperado = "1234567,1234c,1234b,1234a,12,1";
        assertEquals(resultadoEsperado, ejercici1.devolverEnOrden(origen));
    }
    
    @Test
    public void test04ColeccionGrande() {
        Actividad2007 ejercici1 = new Actividad2007();

        ArrayList<String> origen = new ArrayList<>(Arrays.asList("gente","esposo","mujer","matrimonio","amigo","pareja","colega","conocido","hombre","persona","familia","amor","humano"));
        String resultadoEsperado = "matrimonio,conocido,familia,persona,humano,hombre,colega,pareja,esposo,amigo,mujer,gente,amor";
        assertEquals(resultadoEsperado, ejercici1.devolverEnOrden(origen));
    }    
    
    @Test
    public void test05ColeccionVacia() {
        Actividad2007 ejercici1 = new Actividad2007();    

        ArrayList<String> origen = new ArrayList<>();
        String resultadoEsperado = "";
        assertEquals(resultadoEsperado, ejercici1.devolverEnOrden(origen));        
    }
}