import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Clase de test para la clase Tienda.
 * @author  Iván García Prieto
 * @version 12.0 (19/03/2020)
 */
public class TiendaTest
{
    /**
     * Este método añade 6 ordenadores a una tienda con el fin de comprobar si el método "addOrdenador" funciona correctamente.
     */
    @Test
    public void Commit05() {
        Tienda tienda1 = new Tienda();
        tienda1.addOrdenador("HP", 1234, true);
        tienda1.addOrdenador("Lenovo", 5678, false);
        tienda1.addOrdenador("Asus", 4321, true);
        tienda1.addOrdenador("Acer", 8765, false);
        tienda1.addOrdenador("MSI", 0000, false);
        tienda1.addOrdenador("Apple", 9999, true);
    }
    
    /**
     * Este método añade 6 ordenadores a una tienda y comprueba que el método toString de la clase Tienda funciona correctamente.
     */
    @Test
    public void Commit06() {
        Tienda tienda1 = new Tienda();
        tienda1.addOrdenador("HP", 1234, true);
        tienda1.addOrdenador("Lenovo", 5678, false);
        tienda1.addOrdenador("Asus", 4321, true);
        tienda1.addOrdenador("Acer", 8765, false);
        tienda1.addOrdenador("MSI", 0000, false);
        tienda1.addOrdenador("Apple", 9999, true);
        assertEquals("Marca: HP // Modelo: 1234 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 0\nMarca: Lenovo // Modelo: 5678 // Fabricación: 2020-03-20 // Táctil: No // Identificador: 1\nMarca: Asus // Modelo: 4321 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 2\nMarca: Acer // Modelo: 8765 // Fabricación: 2020-03-20 // Táctil: No // Identificador: 3\nMarca: MSI // Modelo: 0 // Fabricación: 2020-03-20 // Táctil: No // Identificador: 4\nMarca: Apple // Modelo: 9999 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 5\n",tienda1.toString());
    }
    
    /**
     * Este método añade 6 ordenadores a una tienda y comprueba que el método ordenarPorFechaFabricacion de la clase Tienda funciona correctamente.
     */
    @Test
    public void Commit07() {
        Tienda tienda1 = new Tienda();
        tienda1.addOrdenador("HP", 1234, true);
        tienda1.addOrdenador("Lenovo", 5678, false);
        tienda1.addOrdenador("Asus", 4321, true);
        tienda1.addOrdenador("Acer", 8765, false);
        tienda1.addOrdenador("MSI", 0000, false);
        tienda1.addOrdenador("Apple", 9999, true);
        assertEquals("Marca: Apple // Modelo: 9999 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 5\nMarca: MSI // Modelo: 0 // Fabricación: 2020-03-20 // Táctil: No // Identificador: 4\nMarca: Acer // Modelo: 8765 // Fabricación: 2020-03-20 // Táctil: No // Identificador: 3\nMarca: Asus // Modelo: 4321 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 2\nMarca: Lenovo // Modelo: 5678 // Fabricación: 2020-03-20 // Táctil: No // Identificador: 1\nMarca: HP // Modelo: 1234 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 0\n",tienda1.ordenarPorFechaFabricacion());
    }

    /**
     * Este método añade 6 ordenadores a una tienda y comprueba que el método ordenarPorFechaFabricacionConCondicion de la clase Tienda funciona
     * correctamente.
     */
    @Test
    public void Commit08() {
        Tienda tienda1 = new Tienda();
        tienda1.addOrdenador("HP", 1234, true);
        tienda1.addOrdenador("Lenovo", 5678, false);
        tienda1.addOrdenador("Asus", 4321, true);
        tienda1.addOrdenador("Acer", 8765, false);
        tienda1.addOrdenador("MSI", 0000, false);
        tienda1.addOrdenador("HP", 9999, true);
        assertEquals("Marca: HP // Modelo: 9999 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 5\nMarca: HP // Modelo: 1234 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 0\n",tienda1.ordenarPorFechaFabricacionConCondicion("HP"));
        
    }
    
    /**
     * Este método añade 6 ordenadores a una tienda y comprueba que el método modificarModeloOrdenador de la clase Tienda funciona correctamente.
     */
    @Test
    public void Commit09() {
        Tienda tienda1 = new Tienda();
        tienda1.addOrdenador("HP", 1234, true);
        tienda1.addOrdenador("Lenovo", 5678, false);
        tienda1.addOrdenador("Asus", 4321, true);
        tienda1.addOrdenador("Acer", 8765, false);
        tienda1.addOrdenador("MSI", 0000, false);
        tienda1.addOrdenador("Apple", 9999, true);
        tienda1.modificarModeloOrdenador("2",5555);
        assertEquals("Marca: HP // Modelo: 1234 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 0\nMarca: Lenovo // Modelo: 5678 // Fabricación: 2020-03-20 // Táctil: No // Identificador: 1\nMarca: Asus // Modelo: 5555 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 2\nMarca: Acer // Modelo: 8765 // Fabricación: 2020-03-20 // Táctil: No // Identificador: 3\nMarca: MSI // Modelo: 0 // Fabricación: 2020-03-20 // Táctil: No // Identificador: 4\nMarca: Apple // Modelo: 9999 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 5\n",tienda1.toString());
    }
    
    /**
     * Este método añade 6 ordenadores a una tienda y comprueba que el método eliminarOrdenadoresDeMarca de la clase Tienda funciona correctamente.
     */
    @Test
    public void Commit10() {
        Tienda tienda1 = new Tienda();
        tienda1.addOrdenador("HP", 1234, true);
        tienda1.addOrdenador("Lenovo", 5678, false);
        tienda1.addOrdenador("Asus", 4321, true);
        tienda1.addOrdenador("Acer", 8765, false);
        tienda1.addOrdenador("MSI", 0000, false);
        tienda1.addOrdenador("Apple", 9999, true);
        tienda1.eliminarOrdenadoresDeMarca("MSI");
        tienda1.eliminarOrdenadoresDeMarca("HP");
        assertEquals("Marca: Lenovo // Modelo: 5678 // Fabricación: 2020-03-20 // Táctil: No // Identificador: 1\nMarca: Asus // Modelo: 4321 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 2\nMarca: Acer // Modelo: 8765 // Fabricación: 2020-03-20 // Táctil: No // Identificador: 3\nMarca: Apple // Modelo: 9999 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 5\n",tienda1.toString());
    }
    
    /**
     * Este método añade 6 ordenadores a una tienda y comprueba que el método dobleOrdenacion de la clase Tienda funciona correctamente.
     */
    @Test
    public void Commit11() {
        Tienda tienda1 = new Tienda();
        tienda1.addOrdenador("HP", 1234, true);
        tienda1.addOrdenador("Lenovo", 5678, false);
        tienda1.addOrdenador("Asus", 4321, true);
        tienda1.addOrdenador("Acer", 8765, false);
        tienda1.addOrdenador("MSI", 0000, false);
        tienda1.addOrdenador("Apple", 9999, true);
        assertEquals("Marca: MSI // Modelo: 0 // Fabricación: 2020-03-20 // Táctil: No // Identificador: 4\nMarca: HP // Modelo: 1234 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 0\nMarca: Asus // Modelo: 4321 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 2\nMarca: Lenovo // Modelo: 5678 // Fabricación: 2020-03-20 // Táctil: No // Identificador: 1\nMarca: Acer // Modelo: 8765 // Fabricación: 2020-03-20 // Táctil: No // Identificador: 3\nMarca: Apple // Modelo: 9999 // Fabricación: 2020-03-20 // Táctil: Sí // Identificador: 5\n",tienda1.dobleOrdenacion());
    }
}
