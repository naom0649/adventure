public class Item {
    protected String itemName;
    protected String itemDescription;
    protected double weight;

    public Item(){}

    public Item(String itemName, String itemDescription, double weight) { //normal item
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.weight = weight;
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
