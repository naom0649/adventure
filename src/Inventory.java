import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    
    public void addItems(Item item){
        this.items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
