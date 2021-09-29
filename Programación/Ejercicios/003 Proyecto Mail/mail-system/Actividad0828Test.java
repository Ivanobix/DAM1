import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MailClientTest.
 *
 * @author  Miguel Bayon Alonso
 * @version 1.0
 */
public class Actividad0828Test
{
    /**
     * Test de la funcionalidad 01 (asunto)
     */
    @Test
    public void testFuncionalidad01()
    {
        MailServer gmailServer = new MailServer();
        MailClient clientePepe = new MailClient(gmailServer, "pepe@gmail.com");
        MailClient clienteMaria = new MailClient(gmailServer, "maria@gmail.com");
        clientePepe.sendMailItem("maria@gmail.com", "Hola", "Hola, Maria. Soy Pepe.");
        MailItem mail = clienteMaria.getNextMailItem();
        assertEquals("maria@gmail.com", mail.getTo());
        assertEquals("pepe@gmail.com", mail.getFrom());
        assertEquals("Hola, Maria. Soy Pepe.", mail.getMessage());
        assertEquals("Hola", mail.getSubject());

        clienteMaria.sendMailItem("pepe@gmail.com", "Hola de vuelta", "Hola, Pepe! Soy Maria.");
        MailItem secondMail = clientePepe.getNextMailItem();
        assertEquals("pepe@gmail.com", secondMail.getTo());
        assertEquals("maria@gmail.com", secondMail.getFrom());
        assertEquals("Hola, Pepe! Soy Maria.", secondMail.getMessage());
        assertEquals("Hola de vuelta", secondMail.getSubject());        
    }

    /**
     * Test de la funcionalidad 02 (obtener el numero de mensaje pendientes de descargar)
     */
    @Test
    public void testFuncionalidad02()
    {
        MailServer gmailServer = new MailServer();
        MailClient clientePepe = new MailClient(gmailServer, "pepe@gmail.com");
        MailClient clienteMaria = new MailClient(gmailServer, "maria@gmail.com");
        
        assertEquals(0, clienteMaria.getNumberOfMessageInServer());
        
        clientePepe.sendMailItem("maria@gmail.com", "Hola", "Hola, Maria. Soy Pepe.");
        assertEquals(1, clienteMaria.getNumberOfMessageInServer());
        
        clientePepe.sendMailItem("maria@gmail.com", "Hola otra vez", "Este es mi segundo mensaje a Maria");
        assertEquals(2, clienteMaria.getNumberOfMessageInServer());
        
        clientePepe.sendMailItem("maria@gmail.com", "Hola por ultima vez", "Este es mi tercer mensaje a Maria");
        assertEquals(3, clienteMaria.getNumberOfMessageInServer());
        
        clienteMaria.getNextMailItem();
        assertEquals(2, clienteMaria.getNumberOfMessageInServer());
    }   

    /**
     * Test de la funcionalidad 03 (recuperar el ultimo mensaje descargado)
     */
    @Test
    public void testFuncionalidad03()
    {
        MailServer gmailServer = new MailServer();
        MailClient clientePepe = new MailClient(gmailServer, "pepe@gmail.com");
        MailClient clienteMaria = new MailClient(gmailServer, "maria@gmail.com");
        assertEquals(null, clienteMaria.getLastReceivedMail());

        clientePepe.sendMailItem("maria@gmail.com", "Hola", "Hola, Maria. Soy Pepe.");
        assertEquals(null, clienteMaria.getLastReceivedMail());

        MailItem mail = clienteMaria.getNextMailItem();
        assertEquals("maria@gmail.com", mail.getTo());
        assertEquals("pepe@gmail.com", mail.getFrom());
        assertEquals("Hola, Maria. Soy Pepe.", mail.getMessage());
        assertEquals("Hola", mail.getSubject());

        MailItem lastMail = clienteMaria.getLastReceivedMail();
        assertEquals("maria@gmail.com", lastMail.getTo());
        assertEquals("pepe@gmail.com", lastMail.getFrom());
        assertEquals("Hola, Maria. Soy Pepe.", lastMail.getMessage());
        assertEquals("Hola", lastMail.getSubject());        

        lastMail = clienteMaria.getLastReceivedMail();
        assertEquals("maria@gmail.com", lastMail.getTo());
        assertEquals("pepe@gmail.com", lastMail.getFrom());
        assertEquals("Hola, Maria. Soy Pepe.", lastMail.getMessage());
        assertEquals("Hola", lastMail.getSubject());          
    }     

    /**
     * Test de la funcionalidad 04 (respuesta automatica)
     */
    @Test
    public void testFuncionalidad04()
    {
        MailServer gmailServer = new MailServer();
        MailClient clientePepe = new MailClient(gmailServer, "pepe@gmail.com");
        MailClient clienteMaria = new MailClient(gmailServer, "maria@gmail.com");

        clienteMaria.receiveAndAutorespond();

        clientePepe.sendMailItem("maria@gmail.com", "Hola", "Hola, Maria. Soy Pepe.");
        clienteMaria.receiveAndAutorespond();
        MailItem mail = clientePepe.getNextMailItem();
        assertEquals("pepe@gmail.com", mail.getTo());
        assertEquals("maria@gmail.com", mail.getFrom());
        assertEquals("Gracias por su mensaje. Le contestaré lo antes posible. Hola, Maria. Soy Pepe.", mail.getMessage());
        assertEquals("RE: Hola", mail.getSubject());    

        clientePepe.sendMailItem("maria@gmail.com", "Hola de nuevo", "Hola, de nuevo Maria. Soy Pepe.");
        clienteMaria.receiveAndAutorespond();
        mail = clientePepe.getNextMailItem();
        assertEquals("pepe@gmail.com", mail.getTo());
        assertEquals("maria@gmail.com", mail.getFrom());
        assertEquals("Gracias por su mensaje. Le contestaré lo antes posible. Hola, de nuevo Maria. Soy Pepe.", mail.getMessage());
        assertEquals("RE: Hola de nuevo", mail.getSubject());          
    }

    /**
     * Test de la funcionalidad 05 (spam)
     */
    @Test
    public void testFuncionalidad05()
    {
        MailServer gmailServer = new MailServer();
        MailClient clientePepe = new MailClient(gmailServer, "pepe@gmail.com");
        MailClient clienteMaria = new MailClient(gmailServer, "maria@gmail.com");

        clienteMaria.receiveAndAutorespond();
        assertEquals(null, clienteMaria.getLastReceivedMail());        

        clientePepe.sendMailItem("maria@gmail.com", "Hola", "Hola, Maria. Soy Pepe."); 
        MailItem mail = clienteMaria.getNextMailItem();
        assertEquals("maria@gmail.com", mail.getTo());
        assertEquals("pepe@gmail.com", mail.getFrom());
        assertEquals("Hola, Maria. Soy Pepe.", mail.getMessage());
        assertEquals("Hola", mail.getSubject());     

        MailItem lastMail = clienteMaria.getLastReceivedMail();
        assertEquals("maria@gmail.com", lastMail.getTo());
        assertEquals("pepe@gmail.com", lastMail.getFrom());
        assertEquals("Hola, Maria. Soy Pepe.", lastMail.getMessage());
        assertEquals("Hola", lastMail.getSubject()); 

        clientePepe.sendMailItem("maria@gmail.com", "Hola", "Hola, te envio loteria"); 
        mail = clienteMaria.getNextMailItem();
        assertNull(mail);  

        lastMail = clienteMaria.getLastReceivedMail();
        assertEquals("maria@gmail.com", lastMail.getTo());
        assertEquals("pepe@gmail.com", lastMail.getFrom());
        assertEquals("Hola, Maria. Soy Pepe.", lastMail.getMessage());
        assertEquals("Hola", lastMail.getSubject());        

        clientePepe.sendMailItem("maria@gmail.com", "Hola", "Hola, te envio un enlace para comprar viagra"); 
        mail = clienteMaria.getNextMailItem();
        assertNull(mail);  

        lastMail = clienteMaria.getLastReceivedMail();
        assertEquals("maria@gmail.com", lastMail.getTo());
        assertEquals("pepe@gmail.com", lastMail.getFrom());
        assertEquals("Hola, Maria. Soy Pepe.", lastMail.getMessage());
        assertEquals("Hola", lastMail.getSubject());           

        clientePepe.sendMailItem("maria@gmail.com", "Hola", "Hola, te envio loteria y un enlace para comprar viagra"); 
        mail = clienteMaria.getNextMailItem();
        assertNull(mail);    

        lastMail = clienteMaria.getLastReceivedMail();
        assertEquals("maria@gmail.com", lastMail.getTo());
        assertEquals("pepe@gmail.com", lastMail.getFrom());
        assertEquals("Hola, Maria. Soy Pepe.", lastMail.getMessage());
        assertEquals("Hola", lastMail.getSubject());           

        clientePepe.sendMailItem("maria@gmail.com", "Hola maria@gmail.com", "Hola, te envio loteria y un enlace para comprar viagra"); 
        mail = clienteMaria.getNextMailItem();
        assertEquals("maria@gmail.com", mail.getTo());
        assertEquals("pepe@gmail.com", mail.getFrom());
        assertEquals("Hola, te envio loteria y un enlace para comprar viagra", mail.getMessage());
        assertEquals("Hola maria@gmail.com", mail.getSubject());   

        lastMail = clienteMaria.getLastReceivedMail();
        assertEquals("maria@gmail.com", lastMail.getTo());
        assertEquals("pepe@gmail.com", lastMail.getFrom());
        assertEquals("Hola, te envio loteria y un enlace para comprar viagra", lastMail.getMessage());
        assertEquals("Hola maria@gmail.com", lastMail.getSubject());           

        clientePepe.sendMailItem("maria@gmail.com", "Hola", "Hola, Maria. Soy Pepe.");   
        mail = clienteMaria.getNextMailItem();
        assertEquals("maria@gmail.com", mail.getTo());
        assertEquals("pepe@gmail.com", mail.getFrom());
        assertEquals("Hola, Maria. Soy Pepe.", mail.getMessage());
        assertEquals("Hola", mail.getSubject());  

        lastMail = clienteMaria.getLastReceivedMail();
        assertEquals("maria@gmail.com", lastMail.getTo());
        assertEquals("pepe@gmail.com", lastMail.getFrom());
        assertEquals("Hola, Maria. Soy Pepe.", lastMail.getMessage());
        assertEquals("Hola", lastMail.getSubject());         
    }

    /**
     * Test de la funcionalidad 06 (estadisticas)
     */
    @Test
    public void testFuncionalidad06()
    {
        MailServer gmailServer = new MailServer();
        MailClient clientePepe = new MailClient(gmailServer, "pepe@gmail.com");
        MailClient clienteMaria = new MailClient(gmailServer, "maria@gmail.com");   
        MailClient clienteJuan = new MailClient(gmailServer, "juan@gmail.com");

        assertEquals("0,0,,", clienteMaria.getStatus());        

        clientePepe.sendMailItem("maria@gmail.com", "Hola", "Hola!"); 
        MailItem mail = clienteMaria.getNextMailItem();
        assertEquals("1,0,pepe@gmail.com,5", clienteMaria.getStatus());

        clientePepe.sendMailItem("maria@gmail.com", "Hola", "Hola!!!"); 
        mail = clienteMaria.getNextMailItem();
        assertEquals("2,0,pepe@gmail.com,7", clienteMaria.getStatus()); 

        clientePepe.sendMailItem("maria@gmail.com", "Hola", "Hola, te envio loteria y un enlace para comprar viagra"); 
        mail = clienteMaria.getNextMailItem();
        assertEquals("2,0,pepe@gmail.com,7", clienteMaria.getStatus());        

        clienteJuan.sendMailItem("maria@gmail.com", "Hola", "Hola!!!!!");
        mail = clienteMaria.getNextMailItem();
        assertEquals("3,0,juan@gmail.com,9", clienteMaria.getStatus());       

        clientePepe.sendMailItem("maria@gmail.com", "Hola", "Hola!"); 
        mail = clienteMaria.getNextMailItem();
        assertEquals("4,0,juan@gmail.com,9", clienteMaria.getStatus());          

        clienteMaria.sendMailItem("pepe@gmail.com", "Hola", "Hola Pepe"); 
        assertEquals("4,1,juan@gmail.com,9", clienteMaria.getStatus());  

        clienteMaria.sendMailItem("pepe@gmail.com", "Hola", "Hola Pepe otra vez"); 
        assertEquals("4,2,juan@gmail.com,9", clienteMaria.getStatus());    

    }
}
