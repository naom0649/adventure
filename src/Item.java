public class Item {
    private String itemName;
    private String itemDescription;

    public Item(){}

    public Item(String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemName() {
        return itemName;
    }

    public String toString(){
        return itemDescription;
    }
}
