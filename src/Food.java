public class Food extends Item {
    private double healthBack;

    public Food(String itemName, String itemDescription,double weight,double healthBack){
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

    public double getHealthBack() {

        return healthBack;
    }

    public void setHealthBack(double healthBack) {
        this.healthBack = healthBack;
    }
}
