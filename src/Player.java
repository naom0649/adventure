import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private String name;
    private ArrayList<Item> inventory = new ArrayList<>();

    Map map = new Map(1);

    public Player(String name, Room room1) {
        this.name = name;
        currentRoom = map.room1;
        map.map1();
    }

    public Room getRoom() {
        return currentRoom;
    }

    public void setRoom(Room room) {
        this.currentRoom = room;
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

    public String getName() {
        return name;
    }

    /*public void help() {
        switch (input.toLowerCase(Locale.ROOT)) {
            case "exit":
                System.out.println("Bye");
                gameIsRunning = false;
                break;
            case "help":
                System.out.println("""
                        - go north
                        - go south
                        - go east
                        - go west
                        - exit: You can exit the game at any moment by typing "exit".
                        - look: When you type "look" you will get a description of the room.
                        - help: When you are typing "help" this list will come.
                        - take
                        - drop
                        - inventory/inv
                        """);
                break;
            case "look":
                System.out.println(player.getCurrentRoom().getName());
                System.out.println(player.getCurrentRoom().getInventory());
                break;
        }
    }*/

}
