/**
 * A class to model a simple email client. The client is run by a
 * particular user, and sends and retrieves mail via a particular server.
 * 
 * @author David J. Barnes and Michael KÃ¶lling
 * @version 2011.07.31
 */
public class MailClient
{
    // The server used for sending and receiving.
    private MailServer server;
    // The user running this client.
    private String user;
    // Atributo que guarda el último email      //Fun.3
    private MailItem guardarMensaje;
    //Mensajes enviados
    private int enviados; //6
    //Mensajes recibidos
    private int leidos;//6
    //Caracteres del mensaje más largo
    private int caracteresLargo;
    //Autor del mensaje más largo
    private String autorLargo;
    /**
     * Create a mail client run by user and attached to the given server.
     */
    public MailClient(MailServer server, String user)
    {
        this.server = server;
        this.user = user;
        autorLargo = "";
    }

    /**
     * Return the next mail item (if any) for this user.
     */
    public MailItem getNextMailItem()
    {
        MailItem correo = server.getNextMailItem(user);
        String nombre = user;
        if (correo != null){

            if(correo.getSubject().contains(nombre)){
                guardarMensaje = correo;
            }
            else if(correo.getMessage().contains("viagra")||correo.getMessage().contains("loteria")){
                correo = null;
            }
            else{
                guardarMensaje = correo;
            }
        }
        if (correo != null){ //6
            leidos += 1; //6
            int longitudMensaje = correo.getMessage().length(); //6
            String nombreAutor = correo.getFrom(); //6
            if ( longitudMensaje > caracteresLargo){ //6
                caracteresLargo = longitudMensaje; //6
                autorLargo = nombreAutor; //6
            } //6
        } //6
        return correo;
    }

    /**
     * Print the next mail item (if any) for this user to the text 
     * terminal.
     */
    public void printNextMailItem()
    {
        MailItem item = server.getNextMailItem(user);
        String nombreImp = user;
        if(item == null) {
            System.out.println("No new mail.");
        }
        else {
            if(item.getSubject().contains(nombreImp)){
                item.print();
                guardarMensaje = item;
                leidos  += 1;
                int longitudMensaje = item.getMessage().length();
                String nombreAutor = item.getFrom();

                if ( longitudMensaje > caracteresLargo){ //6
                    caracteresLargo = longitudMensaje; //6
                    autorLargo = nombreAutor; //6
                } 
            }
            else if(item.getMessage().contains("viagra")||item.getMessage().contains("loteria")){
                System.out.println("Mensaje recibido con spam");
            }
            else{
                item.print();
                guardarMensaje = item;
                leidos  += 1;
                int longitudMensaje = item.getMessage().length();
                String nombreAutor = item.getFrom();

                if ( longitudMensaje > caracteresLargo){ //6
                    caracteresLargo = longitudMensaje; //6
                    autorLargo = nombreAutor; //6
                } 
            }
        }
    }

    /**
     * Send the given message to the given recipient via
     * the attached mail server.
     * @param to The intended recipient.
     * @param message The text of the message to be sent.
     */
    public void sendMailItem(String to, String subject,String message) //fun.1
    {
        MailItem item = new MailItem(user, to, subject, message);
        server.post(item);
        enviados += 1;
    }

    /**
     * Metodo que no requiere parámetros y devuelve el número de correos electrónicos
     * que el usuario de ese cliente tiene pendientes de descarga en el servidor.
     */
    public int getNumberOfMessageInServer() //fun.2
    {
        return server.howManyMailItems(user);
    }

    /**
     * Return the next mail item (if any) for this user.
     */
    public MailItem getLastReceivedMail() //fun.3
    {
        return guardarMensaje;
    }

    /**
     * Funcionalidad 4
     */
    public void receiveAndAutorespond(){
        MailItem mensajeDescargado;
        mensajeDescargado = server.getNextMailItem(user);
        if (mensajeDescargado != null){
            sendMailItem (mensajeDescargado.getFrom(), "RE: " 
                + mensajeDescargado.getSubject(),
                "Gracias por su mensaje. Le contestaré lo antes posible. " 
                + mensajeDescargado.getMessage());
        }
        leidos  += 1;
        enviados +=1;
    }

    public String getStatus() //6
    { //6
        int pendientes = server.howManyMailItems(user); //6
        int recibidos = leidos + pendientes; //6
        String mensajeLargo = "";
        if (caracteresLargo != 0) {
            mensajeLargo = ""+caracteresLargo;
        }

        return ""+recibidos+","+enviados+","+autorLargo+","+mensajeLargo; //6
    } //6
}

