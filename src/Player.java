import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private Room currentRoom;
    private final String name;
    private final ArrayList<Item> inventory = new ArrayList<>();
    private final Colors color = new Colors();
    private final Scanner user = new Scanner(System.in);


    private int health = 100;
    private final int maxHealth = 100;
    private double carryCapacity = 15; //15kg

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

    public int cleanIt() {
    int count = 1;
    for (Item clean : inventory) {
        System.out.print(count + ". Item ");
        System.out.println(color.yellow()+clean+color.resetText());
        count++;
    }
    return count-1;
    }

    public void eat(){
        System.out.println("What would you like to eat?");
        String input = user.nextLine();
        for (int i = 0; i < getCurrentRoom().getInventory().size(); i++) {
            if (input.equalsIgnoreCase((getCurrentRoom().getInventory().get(i)).getItemName())){
            addItem(getCurrentRoom().getInventory().get(i));
            System.out.println("You have eaten " + color.green() + input + color.resetText());
            Food food = (Food) getCurrentRoom().getInventory().get(i);
            adjustHealth(food.getHealthBack());
            getCurrentRoom().removeItem(getCurrentRoom().getInventory().get(i));
            removeItem(getInventory().get(i));
            }

        }
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

    public void setCarryCapacity(double carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    public void setHealth(int health) {

        if (health >= 100){
            this.health = maxHealth;
        } else {
            this.health = health;
        }
        if (health < 100 && health > 80){
            System.out.println("You are in great health");
        } else if (health < 80 && health > 50){
            System.out.println("You are in pretty decent health");
        } else if (health < 50 && health > 30){
            System.out.println("You are in poor health");
        } else if (health < 30 && health > 10){
            System.out.println("You are in critical health");
        } else {
            System.out.println("You are dying");
        }

    }

    public int getHealth() {
        return health;
    }

    public void adjustHealth(int changeHealth){
        setHealth(getHealth()+changeHealth);
    }

    public double getCarryCapacity() {
        return carryCapacity;
    }

}
