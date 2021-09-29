import java.util.Stack;
import java.util.ArrayList;
import java.util.Random;
/**
 * Class Player - a player in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 * 
 * @author  Iván García Prieto
 * @version 2020.04.27
 */
public class Player
{
    private Room currentRoom;
    private Stack<Room> historialUbicaciones;
    private ArrayList<Item> itemsEquipados;
    private int pesoMaximo;
    private int pesoItems;
    private int fuerza;
    private int defensa;

    public Player(Room currentRoom, int pesoMaximo){
        historialUbicaciones = new Stack<Room>();
        this.currentRoom = currentRoom;
        itemsEquipados = new ArrayList<Item>();
        this.pesoMaximo = pesoMaximo;
        pesoItems = 0;
        fuerza = 1;
        defensa = 1;
    }

    /** 
     * Try to go in one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    public void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }
        String direction = command.getSecondWord();
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            historialUbicaciones.push(currentRoom);
            currentRoom = nextRoom;
            look();
        }
    }

    public void look() {
        System.out.println(currentRoom.getLongDescription());
        System.out.println();
    }

    public void eat() {
        System.out.println("You have eaten now and you are not hungry any more");
    }

    public void back() {
        if (!historialUbicaciones.isEmpty()) {
            currentRoom = historialUbicaciones.pop();
            look();
        }
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void take(Command command) {
        String idItem = command.getSecondWord();
        ArrayList<Item> itemsSalaActual = currentRoom.getItemsSala();
        boolean itemEquipado = false;
        int cont = 0;
        while(!itemEquipado && cont <= itemsSalaActual.size()){
            if (itemsSalaActual.size() == 0){
                System.out.println("Esta sala no contiene objetos.");
            }
            else if (itemsSalaActual.size() >= 1 && cont != itemsSalaActual.size()) {
                Item i = itemsSalaActual.get(cont);
                if ((i.getId().equals(idItem) && !itemEquipado)  && (!idItem.equals("food") && i.getEquippable()) && i.getItemWeight() <= (pesoMaximo - pesoItems)) {
                    itemsEquipados.add(i);
                    pesoItems += i.getItemWeight();
                    currentRoom.removeItem(idItem);
                    itemEquipado = true;
                    System.out.println("Has cogido " + i.getItemDescription() + ".");
                }
                else if (!itemEquipado && currentRoom.getItem(idItem) == null) {
                    System.out.println("No se encuentra el objeto.");
                }
                else if (!itemEquipado && !i.getEquippable()) {
                    System.out.println("No puedes coger ese item.");
                }
                else if (!itemEquipado && i.getItemWeight() > (pesoMaximo - pesoItems)) {
                    System.out.println("No puedes cargar más peso.");
                }
            }         
            cont++;
        }
    }

    public void items() {
        if (!itemsEquipados.isEmpty()) {
            int pesoTotal = 0;
            for (Item item : itemsEquipados) {
                System.out.println("(" + item.getId() + ") " + item.getItemDescription() + ".");
                pesoTotal += item.getItemWeight();
            }
            System.out.println("Peso total: " + pesoTotal + " Kg.");
        }
        else {
            System.out.println("No tienes objetos equipados.");
        }
    }

    public void drop(Command command) {
        String idItem = command.getSecondWord();
        boolean itemTirado = false;
        int cont = 0;
        Item itemAAñadir = null;
        while (!itemTirado && cont < itemsEquipados.size()) {
            if (itemsEquipados.get(cont).getId().equals(idItem)) {
                itemAAñadir = itemsEquipados.get(cont);
                pesoItems -= itemAAñadir.getItemWeight();
                itemsEquipados.remove(cont);
                itemTirado = true;
                System.out.println("Has tirado " + itemAAñadir.getItemDescription() + ".");
            }
            cont++;
        }
        if (!itemTirado) {
            System.out.println("No puedes tirar un objeto que no tienes.");
        }
        currentRoom.addItem(itemAAñadir);
    }

    public void drinkPotion(Command command) {
        String itemABeber = command.getSecondWord();
        if (!itemABeber.equals("potion")) {
            System.out.println("No puedes beber eso.");
        }
        else {
            boolean itemEncontrado = false;
            int cont = 0;
            while (!itemEncontrado && cont < itemsEquipados.size()) {
                if (itemsEquipados.get(cont).getId().equals("potion")) {
                    itemEncontrado = true;
                    itemsEquipados.remove(cont);
                    Random r = new Random();
                    int valor = r.nextInt(3);
                    if (valor == 0) {
                        fuerza ++;
                        System.out.println("Fuerza aumentada.");
                    }
                    else if (valor == 1) {
                        defensa ++;
                        System.out.println("Defensa aumentada.");
                    }
                    else {
                        pesoMaximo++;
                        System.out.println("Resistencia aumentada.");
                    }
                }
                cont++;
            }
            if (!itemEncontrado) {
                System.out.println("No te quedan pociones.");
            }
        }
    }
}
