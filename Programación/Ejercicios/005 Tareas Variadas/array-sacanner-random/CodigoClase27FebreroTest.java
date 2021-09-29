import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;

public class CodigoClase27FebreroTest {

    @Test
    public void testMetodo01() {
        CodigoClase27Febrero objeto = new CodigoClase27Febrero();
        objeto.metodo01();
    }

    
    public void testMetodo02() {
        CodigoClase27Febrero objeto = new CodigoClase27Febrero();
        objeto.metodo02();

    }

    @Test
    public void testMetodo03() {
        CodigoClase27Febrero objeto = new CodigoClase27Febrero();
        objeto.metodo03();
        objeto.metodo03();
        objeto.metodo03();
        objeto.metodo03();

    }

    @Test
    public void testMetodo04() {
        CodigoClase27Febrero objeto = new CodigoClase27Febrero();
        int[] esperadoA = { 2, 4, 6 };
        assertArrayEquals(esperadoA, objeto.obtenerNumerosPares(3));

        int[] esperadoB = { 2, 4, 6, 8 };
        assertArrayEquals(esperadoB, objeto.obtenerNumerosPares(4));

        int[] esperadoC = { 2 };
        assertArrayEquals(esperadoC, objeto.obtenerNumerosPares(1));

        int[] esperadoD = { 2, 4, 6, 8, 10, 12 };
        assertArrayEquals(esperadoD, objeto.obtenerNumerosPares(6));

        assertNull(objeto.obtenerNumerosPares(0));
        assertNull(objeto.obtenerNumerosPares(-3));
        assertNull(objeto.obtenerNumerosPares(-6));

    }
    
    @Test
    public void testMetodo05() {
        CodigoClase27Febrero objeto = new CodigoClase27Febrero();
        int[] esperadoA = { 0, 1, 1 };
        assertArrayEquals(esperadoA, objeto.obtenerSucesionFibonacci(3));

        int[] esperadoB = { 0, 1, 1, 2 };
        assertArrayEquals(esperadoB, objeto.obtenerSucesionFibonacci(4));

        int[] esperadoC = { 0 };
        assertArrayEquals(esperadoC, objeto.obtenerSucesionFibonacci(1));

        int[] esperadoD = { 0, 1, 1, 2, 3, 5 };
        assertArrayEquals(esperadoD, objeto.obtenerSucesionFibonacci(6));

        int[] esperadoE = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
        assertArrayEquals(esperadoE, objeto.obtenerSucesionFibonacci(12));        

        int[] esperadoF = {};
        assertArrayEquals(esperadoF, objeto.obtenerSucesionFibonacci(0));
        assertArrayEquals(esperadoF, objeto.obtenerSucesionFibonacci(-3));
        assertArrayEquals(esperadoF, objeto.obtenerSucesionFibonacci(-6));

    }
    
    @Test
    public void testMetodo07() {
        CodigoClase27Febrero objeto = new CodigoClase27Febrero();

        assertEquals(2, objeto.obtenerRepeticionesNumeroMasRepetido("0, 3, 4, 3"));
        assertEquals(2, objeto.obtenerRepeticionesNumeroMasRepetido("4, 3, 4, 3"));
        assertEquals(3, objeto.obtenerRepeticionesNumeroMasRepetido("0, 3, 0, 0"));
        assertEquals(2, objeto.obtenerRepeticionesNumeroMasRepetido("0, 3, 4, 3"));
        assertEquals(4, objeto.obtenerRepeticionesNumeroMasRepetido("5, 5, 4, 3, 5, 5"));
        assertEquals(3, objeto.obtenerRepeticionesNumeroMasRepetido("5, 5, 4, 3, 2, 5"));
        assertEquals(5, objeto.obtenerRepeticionesNumeroMasRepetido("5, 5, 4, 3, 2, 5, 9, 2, 9, 5, 9, 9, 9"));
        assertEquals(2, objeto.obtenerRepeticionesNumeroMasRepetido("5, 3, 4, 3, 2, 5"));                
        assertEquals(5, objeto.obtenerRepeticionesNumeroMasRepetido("5, 5, 4, 3, 5, 5, 9, 2, 9, 5, 9, 9, 9"));
        assertEquals(6, objeto.obtenerRepeticionesNumeroMasRepetido("5, 5, 5, 3, 5, 5, 9, 2, 9, 5, 9, 9, 9"));        
    }
    
    
    public void testMetodo08() {
        CodigoClase27Febrero objeto = new CodigoClase27Febrero();
        objeto.leeArchivo("numeros.txt");
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
    }
    
    @Test
    public void test09() {
        CodigoClase27Febrero objeto = new CodigoClase27Febrero();
        int[] numeros = {3, 4, 5};
        objeto.escribeAArchivo(numeros, "Test09.txt");      
    }
}
