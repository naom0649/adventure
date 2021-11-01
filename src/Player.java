import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Player {
    private Room currentRoom;
    private final String name;
    private final ArrayList<Item> inventory = new ArrayList<>();
    private final ArrayList<Item> equip = new ArrayList<>();
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

    public void combat(Player player, Enemy enemy){
        Random random = new Random();
    }

    public Room getCurrentRoom() {
        return this.currentRoom;
    }

    public String setCurrentRoom(String input) {
        if (input.equalsIgnoreCase("go north")) {
            if (currentRoom.getNorth() != null) {
                currentRoom = currentRoom.getNorth();
                System.out.println(currentRoom.toString());
                if(currentRoom.getEnemy() != null){
                    System.out.println("There is an enemy! It's: " + color.red() + currentRoom.getEnemyName() + color.resetText());
                }

            } else {
                return "You cant go that way";
            }

        }
        if (input.equalsIgnoreCase("go south")) {
            if (currentRoom.getSouth() != null) {
                currentRoom = currentRoom.getSouth();
                System.out.println(currentRoom.toString());
                if(currentRoom.getEnemy() != null){
                    System.out.println("There is an enemy! It's: " + color.red() + currentRoom.getEnemyName() + color.resetText());
                }
            } else {
                return "You cant go that way";
            }
        }
        if (input.equalsIgnoreCase("go east")) {
            if (currentRoom.getEast() != null) {
                currentRoom = currentRoom.getEast();
                System.out.println(currentRoom.toString());
                if(currentRoom.getEnemy() != null){
                    System.out.println("There is an enemy! It's: " + color.red() + currentRoom.getEnemyName() + color.resetText());
                }
            } else {
                return "You cant go that way";
            }
        }
        if (input.equalsIgnoreCase("go west")) {
            if (currentRoom.getWest() != null) {
                currentRoom = currentRoom.getWest();
                System.out.println(currentRoom.toString());
                if(currentRoom.getEnemy() != null){
                    System.out.println("There is an enemy! It's: " + color.red() + currentRoom.getEnemyName() + color.resetText());
                }
            } else {
                return "You cant go that way";
            }
        }
        return null;
    }

    public ArrayList<Item> getInventory() {

        return inventory;
    }

    public ArrayList<Item> getEquip(){
        return equip;
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
        for (int i = 0; i < getInventory().size(); i++) {
            if (input.equalsIgnoreCase((getInventory().get(i)).getItemName())){
            System.out.println("You have eaten " + color.green() + input + color.resetText());
            Food food = (Food) getInventory().get(i);
            adjustHealth(food.getHealthBack());

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
        if (this.health <= 100 && this.health > 80){
            System.out.println("You are in great health");
        } else if (this.health <= 80 && this.health > 50){
            System.out.println("You are in pretty decent health");
        } else if (this.health <= 50 && this.health > 30){
            System.out.println("You are in poor health");
        } else if (this.health <= 30 && this.health > 10){
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
