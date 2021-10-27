public class Item {
    private String itemName;
    private String itemDescription;
    private int damage;
    private int health;
    private double weight;

    public Item(){}

    public Item(String itemName, String itemDescription, double weight) { //normal item
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.weight = weight;
    }

    //Constructor, så man kan oprette et item, som normalt, men angive om den skal gøre skade eller ej
    public Item(String itemName, String itemDescription, double weight, int amount, boolean isLethal){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.weight = weight;
        if(!isLethal){
            this.health = amount;
        }else{
            this.damage = amount;
        }
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemName() {
        return itemName;
    }

    public String toString(){
        return itemName;
    }


}
