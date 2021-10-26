import java.util.ArrayList;
import java.util.Locale;

public class Player {
    private Room currentRoom;
    private String name;
    private ArrayList<Item> inventory = new ArrayList<>();

    Map map = new Map(1);

    public Player(String name) {
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

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public boolean moving (String command) {
        boolean go = true;
        if (command.equalsIgnoreCase("go north")) {
            if (currentRoom.getNorth() != null) {
                currentRoom = currentRoom.getNorth();
                go = true;
            } else {
                go = false;
            }
        }
        if (command.equalsIgnoreCase("go south")) {
            if (currentRoom.getSouth() != null) {
                currentRoom = currentRoom.getNorth();
                go = true;
            } else {
                go = false;
            }
        }
        if (command.equalsIgnoreCase("go west")) {
            if (currentRoom.getWest() != null) {
                currentRoom = currentRoom.getNorth();
                go = true;
            } else {
                go = false;
            }
        }
        if (command.equalsIgnoreCase("go east")) {
            if (currentRoom.getEast() != null) {
                currentRoom = currentRoom.getNorth();
                go = true;
            } else {
                go = false;
            }
        }

        return go;
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

    public void welcomeScreen() {
        System.out.println("Welcome to KEA adventure game.");
        System.out.println("To move around the different room´s you have to type: ");
        System.out.println(""" 
                go north
                go south
                go east
                or go west
                take
                drop
                inventory/inv
                """);
        System.out.println("For informations type " + '"' + "help" + '"');
        System.out.println("Lets begin ;) ");
    }


}
