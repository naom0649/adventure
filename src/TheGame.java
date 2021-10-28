import java.util.Locale;
import java.util.Scanner;

public class TheGame {
    private final Scanner user = new Scanner(System.in);
    private Map map;
    private Player player;
    private boolean running;
    private final Colors color = new Colors();

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
            movement("What");
        } while (running);
    }

    public void movement (String input) {
        String doNext;

        do {
            input = getStringInput("What do you want?");
            doNext = helpCommands(input);
            if (doNext == null) {
                doNext = player.setCurrentRoom(input);
            }


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
                            - take/take all: to take a single item or all item in a room.
                            - drop
                            - inventory/inv
                            """);
                break;

            case "look":
                System.out.println(player.getCurrentRoom());
                if(player.getCurrentRoom().getInventory().size() == 0){
                    System.out.println(color.red() + "This place do not have any items" + color.resetText());
                    break;
                }
                System.out.println("This place offers these items");
                System.out.println(color.green() + player.getCurrentRoom().getInventory() + color.resetText());
                System.out.println("Your Health is "+player.getHealth());
                break;

            case "take all":
                if(player.getCurrentRoom().getInventory().size() == 0){
                    System.out.println(color.red() + "This place does not have any items" + color.resetText());
                    break;
                }

                for(int i = 0; i < player.getCurrentRoom().getInventory().size(); i++){
                    player.addItem(player.getCurrentRoom().getInventory().get(i));

                }
                player.getCurrentRoom().getInventory().removeAll(player.getCurrentRoom().getInventory());
                System.out.println(color.green() + "You have taken everything!" + color.resetText());
                break;

            case "take":
                    if (player.getCurrentRoom().getInventory().size() == 0){
                        System.out.println(color.red() + "This place does not have any items" + color.resetText());
                        break;
                    }
                System.out.println("What would you like to take?");
                input = user.nextLine();
                for(int i = 0; i < player.getCurrentRoom().getInventory().size(); i++){
                    if(input.equalsIgnoreCase(player.getCurrentRoom().getInventory().get(i).toString())){
                        player.addItem(player.getCurrentRoom().getInventory().get(i));
                        System.out.println("You have taken " + color.green() + input + color.resetText());
                        player.getCurrentRoom().removeItem(player.getCurrentRoom().getInventory().get(i));
                        //break;
                    }
                }
                break;

            case "drop":
                if(player.getInventory().size() == 0){
                    System.out.println(color.red() + "You dont have any items :(" + color.resetText());
                    break;
                }
                System.out.println("What would you like to drop?");
                input = user.nextLine();
                for(int i = 0; i < player.getInventory().size(); i++){
                    if(input.equalsIgnoreCase(player.getInventory().get(i).toString())){
                        System.out.println("You have dropped: " + color.red() + input + color.resetText());
                        player.getCurrentRoom().addItem(player.getInventory().get(i));
                        player.removeItem(player.getInventory().get(i));
                    }
                }
                break;

            case "inv","inventory":
                player.cleanIt();
                //System.out.println(color.yellow() + player.getInventory() + color.resetText());
            break;

            case "eat":
                player.eat();


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
