public class Food extends Item {
    private double healthBack;

    public Food(String name, String description,double healthBack){
        super();
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
