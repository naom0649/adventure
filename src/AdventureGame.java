import java.util.Locale;
import java.util.Scanner;

public class AdventureGame {


    public static void main(String[] args) {
        Player player = new Player("Mjor");
        Scanner scan = new Scanner(System.in);
        boolean isWalid = true;
        boolean gameIsRunning = true;
        Map map = new Map(1);
        Colors color = new Colors();
        player.getCurrentRoom().enteredRoom();
        Parser parser = new Parser();


        Room currentRoom = map.getStarterRoom();


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
        System.out.println(player.getCurrentRoom());


        while (gameIsRunning) {


            System.out.println("Choose a direction");

            String input = scan.nextLine();
            do {
                if (input.equalsIgnoreCase("Go south") ||
                        input.equalsIgnoreCase("Go east") ||
                        input.equalsIgnoreCase("Go west") ||
                        input.equalsIgnoreCase("Go north") ||
                        input.equalsIgnoreCase("Exit") ||
                        input.equalsIgnoreCase("Help") ||
                        input.equalsIgnoreCase("Look") ||
                        input.equalsIgnoreCase("Take") ||
                        input.equalsIgnoreCase("Drop")||
                        input.equalsIgnoreCase("Inventory/Inv")) {


                    isWalid = true;

                } else {
                    System.out.println("ikke gyldigt svar");
                }
            } while (!isWalid);

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

                case "go north":
                    if (currentRoom.getNorth() == null) {
                        System.out.println(color.red() + "The northern gate is closed" + color.resetText());
                        break;
                    }

                    currentRoom = player.getCurrentRoom().getNorth();
                    System.out.println(player.getCurrentRoom().getName());
                    break;

                case "go south":
                    if (currentRoom.getSouth() == null) {
                        System.out.println(color.red() + "The southern gate is closed" + color.resetText());
                    } else {
                        currentRoom = currentRoom.getSouth();
                        player.getCurrentRoom().enteredRoom();
                        System.out.println(player.getCurrentRoom().getName()+ ". ");
                    } if (player.getCurrentRoom().getRoomCounter() <= 1) {
                    System.out.println(player.getCurrentRoom().getDescription() + ".");
                }
                    break;

                case "go east":
                    if (player.getCurrentRoom().getEast() == null) {
                        System.out.println(color.red() + "The eastern gate is closed" + color.resetText());
                        break;
                    }
                    currentRoom = player.getCurrentRoom().getEast();
                    System.out.println(player.getCurrentRoom().getName());
                    break;

                case "go west":
                    if (player.getCurrentRoom().getWest() == null) {
                        System.out.println(color.red() + "The western gate is closed" + color.resetText());
                        break;
                    }
                    currentRoom = player.getCurrentRoom().getWest();
                    System.out.println(player.getCurrentRoom().getName());
                    break;


            }


        }


    }
}

