import java.util.HashMap;

public class Itemslist {

    // hashmap for items and prices
    private HashMap<String, Integer> items = new HashMap<>();

    // method to get the items and there prices.
    public HashMap<String, Integer> getItems() {
        return items;
    }

    // method to set the items and there prices.
    public void setItems(String item, int price) {
        items.put(item, price);
    }

}
