import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de test para el muro de la red social
 *
 *  @author DAM
 *  @version 1.0
 */
public class MuroTest {
    @Test
    public void test01() {

        Muro muro = new Muro();

        EntradaTexto entrada01 = new EntradaTexto("Nacho", "Recién llegado de mis vacaciones en Hawai!");
        entrada01.addComentario("¡Qué suerte tienes!");
        EntradaFoto entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
        EntradaTexto entrada03 = new EntradaTexto("Begoña", "Está lloviendo ahí fuera...");
        EntradaFoto entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");
        muro.addEntrada(entrada01);
        muro.addEntrada(entrada02);
        muro.addEntrada(entrada03);
        muro.addEntrada(entrada04);
        EntradaEvento entrada05 = new EntradaEvento("Pedro", "Se ha unido");
        muro.addEntrada(entrada05);
        System.out.println(muro);
        assertEquals("Usuario: Nacho\nLikes: 0\nEscrito hace 10 segundos\nComentarios: \n-¡Qué suerte tienes!\nRecién llegado de mis vacaciones en Hawai!\n\n\nUsuario: Luis\nLikes: 0\nEscrito hace 10 segundos\nNo hay comentarios\nUrl: https://bit.ly/2W1dO09\nTitulo: Gracias\n\n\nUsuario: Begoña\nLikes: 0\nEscrito hace 10 segundos\nNo hay comentarios\nEstá lloviendo ahí fuera...\n\n\nUsuario: Cristina\nLikes: 0\nEscrito hace 10 segundos\nNo hay comentarios\nUrl: https://bit.ly/3cY9vtD\nTitulo: Una foto de mi nevera\n\n\nUsuario: Pedro\nLikes: 0\nEscrito hace 10 segundos\nSe ha unido\n\n\n", muro.toString());
        
    }

}
