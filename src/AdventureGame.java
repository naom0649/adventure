import java.util.Locale;
import java.util.Scanner;

public class AdventureGame {


    public static void main(String[] args) {
        TheGame runit = new TheGame();

        runit.play();
        runit.run();

    }
    /*
        Player player = new Player("Mjor", map.room1);
        Scanner scan = new Scanner(System.in);
        boolean isWalid = true;
        boolean gameIsRunning = true;
        Map map = new Map(1);
        Colors color = new Colors();

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
                    System.out.println(color.red() + "ikke gyldigt svar" + color.resetText());
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
                    System.out.println(player.getCurrentRoom());
                    System.out.println(player.getCurrentRoom().getInventory());
                    break;

                case "go north":
                    if (player.getCurrentRoom().getNorth() != null) {
                        player.setCurrentRoom(input);
                        System.out.println(player.getCurrentRoom().getName());
                        break;
                    }
                    System.out.println(color.red() + "The northern gate is closed" + color.resetText());
                    break;

                case "go south":
                    if (player.getCurrentRoom().getSouth() != null) {
                        player.setCurrentRoom(input);
                        System.out.println(player.getCurrentRoom().getName());
                        break;
                    }
                        System.out.println(color.red() + "The southern gate is closed" + color.resetText());
                    break;

                case "go east":
                    if (currentRoom.getEast()!= null) {
                        currentRoom = player.getCurrentRoom().getEast();
                        System.out.println(player.getCurrentRoom().getName());
                        break;
                    } System.out.println(color.red() + "The eastern gate is closed" + color.resetText());

                    break;

                case "go west":
                    if (currentRoom.getWest()!= null) {
                        currentRoom = player.getCurrentRoom().getWest();
                        System.out.println(player.getCurrentRoom().getName());
                        break;
                    }
                    System.out.println(color.red() + "The western gate is closed" + color.resetText());
                    break;

                case "take":
                    //Tag item fra rum og lig til Player
                    break;
                case "drop":
                    //Tag item fra Player og lig til rum
                    break;
                case "inventory":
                case "inv":
                    //Vis liste med Player inventory
                    break;

            }
        }*/
    }

