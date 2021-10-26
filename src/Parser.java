import java.util.ArrayList;

public class Parser {

    public void runGame(){

        boolean gameIsRunning = true;

        while (gameIsRunning) {

            }
        }
    private void move(String command, Player player) {
        if (command.equalsIgnoreCase("go north") || command.equalsIgnoreCase("go east")
                || command.equalsIgnoreCase("go south") || command.equalsIgnoreCase("go west")) {
            if (!player.moving(command)) {
                System.out.println("You can't go that way.");
            } else {
                player.getCurrentRoom().enteredRoom();
                System.out.println("You move to the " + player.getCurrentRoom().getName() + ". ");
                if (player.getCurrentRoom().getRoomCounter() <= 1) {
                    System.out.println(player.getCurrentRoom().getDescription() + ".");
                }

                ArrayList<Item> itemsRoom = player.getCurrentRoom().getInventory();
                printItems(itemsRoom);

            }
        }
    }

    private void printItems(ArrayList<Item> roomItems) {

        String result = "You see ";
        for (int i = 0; i < roomItems.size(); i++) {

            if (i == roomItems.size() - 1) {
                result += roomItems.get(i).getItemDescription() + ".";
            } else if (i == roomItems.size() - 2) {
                result += roomItems.get(i).getItemDescription() + " and ";
            } else {
                result += roomItems.get(i).getItemDescription() + ", ";
            }
        }
        if (result.equals("You see ")) {
            result += "nothing of interest.";
        }
        System.out.println(result);
    }


}
