import java.util.Locale;
import java.util.Scanner;

public class TheGame {
    private Scanner user = new Scanner(System.in);
    private Map map;
    private Player player;
    private boolean running;

    public void play(){
        map = new Map(1);
        running = true;

        String name = getStringInput("Name of player: ");
        player = new Player(name);
        System.out.println("Welcome " + player.getName());
        welcomeScreen();
    }


    public String getStringInput(String toUser) {
        System.out.println(toUser);
        return user.nextLine();
    }

    public void run() {
        do {
            movement(getStringInput("Choose a direction"));
        } while (running);
    }

    public void movement (String input) {
        String doNext;
        do {
            doNext = helpCommands(input);
            if (doNext == null) {
                doNext = player.setCurrentRoom(input);
                }
            if (doNext == null) {
                System.out.println("Wrong input");
                input = getStringInput("Choose the right direction");
            }
            input = getStringInput("Choose the right direction");
        } while (doNext == null);
        System.out.println(doNext);
    }

    public String helpCommands(String input){

        switch (input.toLowerCase(Locale.ROOT)) {
            case "exit":
                System.out.println("Bye");
                running = false;
                System.exit(1);
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
    return null;
    }

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
        System.out.println("For information type " + '"' + "help" + '"');
        System.out.println("Lets begin ;) ");
    }

}
