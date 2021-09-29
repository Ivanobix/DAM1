/**
 * Class Item - a item in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Item" An item represents an object that can be used by the player and that has its own characteristics.
 * The items are in certain rooms.
 * 
 * @author  Iván García Prieto
 * @version 2020.04.22
 */
public class Item {
    private String itemDescription;
    private int itemWeight;
    private String itemId;
    private boolean equippable;

    public Item(String itemDescription, int itemWeight, String itemId, boolean equippable) {
        this.itemDescription = itemDescription;
        this.itemWeight = itemWeight;
        this.itemId = itemId;
        this.equippable = equippable;
    }

    public void setItemDescription(String description) {
        itemDescription = description;
    }

    public void setItemWeight(int weight) {
        itemWeight = weight;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public int getItemWeight() {
        return itemWeight;
    }

    public String getId() {
        return itemId;
    }

    public boolean getEquippable() {
        return equippable;
    }
}
