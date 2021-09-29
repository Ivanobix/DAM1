import java.util.Stack;
/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael KÃ¶lling and David J. Barnes
 * @version 2011.07.31
 */

public class Game 
{
    private Parser parser;
    private Player player;

    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        parser = new Parser();
        player = new Player(createRooms(), 5);
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private Room createRooms() {
        Room indiferencia, miedo, tristeza, felicidad, odio, amor, ira;

        // create rooms
        indiferencia = new Room("en la indiferencia");
        miedo = new Room("en el miedo");
        tristeza = new Room("en la tristeza");        
        felicidad = new Room("en la felicidad");
        odio = new Room("en el odio");
        amor = new Room("en el amor");   
        ira = new Room("en la ira");

        // initialise room exits
        indiferencia.setExit("east", felicidad);
        indiferencia.setExit("south", miedo);
        indiferencia.setExit("southEast", odio);
        felicidad.setExit("west", indiferencia);
        miedo.setExit("north", indiferencia);
        miedo.setExit("east",odio);
        miedo.setExit("west", tristeza);
        tristeza.setExit("east", miedo);
        tristeza.setExit("south", amor);
        odio.setExit("west", miedo);
        odio.setExit("down", ira);
        amor.setExit("north", tristeza);
        ira.setExit("top", odio);

        // Creación de objetos en cada sala
        Item shield = new Item("Shield of Aggramar", 3, "shield", true);
        Item food = new Item("Meat", 1, "food", false);
        Item sword = new Item("Sword of Sargeras", 2, "sword", true);
        Item potion = new Item ("Magic potion", 1, "potion", true);

        felicidad.addItem(shield);
        amor.addItem(food);
        ira.addItem(sword);

        for (int i = 0; i < 3; ++i) {
            miedo.addItem(potion); 
        }

        return indiferencia;
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        player.look();
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            player.goRoom(command);
        }
        else if (commandWord.equals("look")) {
            player.look();
        }
        else if (commandWord.equals("eat")) {
            player.eat();
        }
        else if (commandWord.equals("back")) {
            player.back();
        }
        else if (commandWord.equals("take")) {
            player.take(command);
        }
        else if (commandWord.equals("items")) {
            player.items();
        }
        else if (commandWord.equals("drop")) {
            player.drop(command);
        }
        else if (commandWord.equals("drink")) {
            player.drinkPotion(command);
        }
        else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }

        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        System.out.println(parser.showCommands());
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }

}
