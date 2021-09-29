import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Actividad0133Test
{
    @Test
    public void test1()
    {
        Persona enrique = new Persona("Enrique Iglesias", "71456456H");
        Persona juan = new Persona("Juan Magan", "76233233K");
        Persona romeo = new Persona("Romeo Santos", "72544544L");
        Persona jennifer = new Persona("Jennifer Lopez", "9865865T");
        Persona marc = new Persona("Marc Anthony", "9666777C");

        Barco veleroEnrique = new Velero("DFT444", 23.5, 1996, enrique, 4);
        Barco embarcacionAMotorJuan = new EmbarcacionAMotor("HJJ987", 45.2, 2002, juan, 1200);
        Barco yateRomeo = new Yate("KIO123", 70.0, 2010, romeo, 1500, 15);

        Barco veleroJennifer = new Velero("LLL890", 12.8, 1997, jennifer, 5);
        Barco yateMarc = new Yate("HOL332", 45.5, 2001, marc, 200, 21);

        Puerto miPuerto = new Puerto();

        miPuerto.verEstadoAmarres();

        //Primeros amarres
        assertEquals(3550, miPuerto.alquilarAmarre(10, veleroEnrique),  0.0F);
        assertEquals(362260, miPuerto.alquilarAmarre(5, embarcacionAMotorJuan),  0.0F);
        assertEquals(455900, miPuerto.alquilarAmarre(2, yateRomeo), 0.0F);
        miPuerto.verEstadoAmarres();

        //Se llena el puerto con el siguiente amarre
        assertEquals(2780, miPuerto.alquilarAmarre(10, veleroJennifer), 0.0F);
        miPuerto.verEstadoAmarres();

        //Se intenta alquilar un amarre pero no hay libres
        assertEquals(-1, miPuerto.alquilarAmarre(3, yateMarc), 0.0F);
        miPuerto.verEstadoAmarres();

        //Se intenta terminar un alquiler de un amarre inexistente
        assertEquals(-1, miPuerto.liquidarAlquilerAmarre(10), 0.0F);

        //Se terminan los alquileres
        assertEquals(3550, miPuerto.liquidarAlquilerAmarre(0), 0.0F);
        assertEquals(362260, miPuerto.liquidarAlquilerAmarre(1), 0.0F);

        //Se intenta liquidar un alquiler que ya no existe
        assertEquals(-1, miPuerto.liquidarAlquilerAmarre(0), 0.0F);

        //Marc alquila un amarre ahora que hay disponibles
        assertEquals(67665, miPuerto.alquilarAmarre(3, yateMarc), 0.0F);

        miPuerto.verEstadoAmarres();
    }

}