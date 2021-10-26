import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private final String name;
    private final ArrayList<Item> inventory = new ArrayList<>();

    Map map = new Map(1);

    public Player(String name) {
        this.name = name;
        currentRoom = map.getStarterRoom();
    }

    public Room getCurrentRoom() {
        return this.currentRoom;
    }

    public String setCurrentRoom(String input) {
        if (input.equalsIgnoreCase("go north")) {
            if (currentRoom.getNorth() != null) {
                currentRoom = currentRoom.getNorth();
                return currentRoom.toString();
            } else {
                return "You cant go that way";
            }
        }
        if (input.equalsIgnoreCase("go south")) {
            if (currentRoom.getSouth() != null) {
                currentRoom = currentRoom.getSouth();
                return currentRoom.toString();
            } else {
                return "You cant go that way";
            }
        }
        if (input.equalsIgnoreCase("go east")) {
            if (currentRoom.getEast() != null) {
                currentRoom = currentRoom.getEast();
                return currentRoom.toString();
            } else {
                return "You cant go that way";
            }
        }
        if (input.equalsIgnoreCase("go west")) {
            if (currentRoom.getWest() != null) {
                currentRoom = currentRoom.getWest();
                return currentRoom.toString();
            } else {
                return "You cant go that way";
            }
        }
        return null;
    }

    public ArrayList<Item> getInventory() {

        return inventory;
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public String getName() {
        return name;
    }
}
