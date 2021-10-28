public class Food extends Item {
    private int healthBack;


    public Food(String itemName, String itemDescription,double weight,int healthBack){
        super(itemName, itemDescription, weight);
        this.healthBack = healthBack;
    }

    public String getName(){return itemName;}

    public void setName(String name){
        this.itemName = name;
    }

    public String getDescription() {
        return itemDescription;
    }

    public void setDescription(String description) {
        this.itemDescription = description;
    }

    public int getHealthBack() {

        return healthBack;
    }

    public void setHealthBack(int healthBack) {
        this.healthBack = healthBack;
    }
}
