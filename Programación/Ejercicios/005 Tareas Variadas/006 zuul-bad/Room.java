import java.util.HashMap;
import java.util.ArrayList;
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael KÃ¶lling and David J. Barnes
 * @version 2011.07.31
 */
public class Room 
{
    private String description;
    private HashMap <String, Room> mapa;
    private ArrayList<Item> items;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        mapa = new HashMap <String,Room> ();
        items = new ArrayList<Item>();
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Devuelve la sala vecina a la actual que esta ubicada en la direccion indicada como parametro.
     *
     * @param salida Un String indicando la direccion por la que saldriamos de la sala actual
     * @return La sala ubicada en la direccion especificada o null si no hay ninguna salida en esa direccion
     */
    public Room getExit(String salida) {
        return mapa.get(salida);
    }

    /**
     * Devuelve la información de las salidas existentes
     * Por ejemplo: "Exits: north east west" o "Exits: south" 
     * o "Exits: " si no hay salidas disponibles
     *
     * @return Una descripción de las salidas existentes.
     */
    public String getExitString() {
        String aDevolver = "Exits: ";
        for (String key : mapa.keySet()) {
            aDevolver += key + " ";
        }
        return aDevolver;
    }

    /**
     * Define una salida para esta sala
     * 
     * @param direccion La direccion de la salida (por ejemplo "north" o "southEast")
     * @param sala La sala que se encuentra en la direccion indicada
     */
    public void setExit(String direccion, Room sala) {        
        mapa.put(direccion, sala);
    }

    /**
     * Devuelve un texto con la descripcion completa de la habitacion, que 
     * incluye la descripcion corta de la sala y las salidas de la misma. Por ejemplo:
     *     You are in the lab
     *     Exits: north west southwest
     * @return Una descripcion completa de la habitacion incluyendo sus salidas
     */
    public String getLongDescription() {
        String aDevolver = "You are " + getDescription() + "\n";
        if (!items.isEmpty()) {
            aDevolver += "Esta sala contiene:\n";
            for (Item item : items) {
                aDevolver += "(" + item.getId() + ") " + item.getItemDescription() + ". Peso: " + item.getItemWeight() + " Kg.\n";
            }
        }
        else {
            aDevolver += "Esta sala no contiene objetos.\n";
        }
        aDevolver += getExitString();
        return aDevolver;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String id) {
        boolean itemEliminado = false;
        int cont = 0;
        while (!itemEliminado) {
            if (items.get(cont).getId().equals(id)) {
                items.remove(cont);
                itemEliminado = true;
            }
            cont++;
        }
    }

    public ArrayList<Item> getItemsSala() {
        return items;
    }

    public Item getItem(String idItem) {
        Item aDevolver = null;
        boolean itemEncontrado = false;
        int cont = 0;
        while (!itemEncontrado && cont < items.size()) {
            if (items.get(cont).getId().equals(idItem)) {
                aDevolver = items.get(cont);
                itemEncontrado = true;
            }
            cont++;
        }
        return aDevolver;
    }
}
