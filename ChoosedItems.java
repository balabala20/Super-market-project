import java.util.HashMap;

public class ChoosedItems {

    //hashmap for choosed items of the user, it contains items and there quantities.
    HashMap<String, Integer> choosedItems = new HashMap<>();

    //hashmap for total price of that item user choosed.
    HashMap<String, Integer> itemTotalPrice = new HashMap<>();

    // method to get the choosed items and there quantities.
    public HashMap<String, Integer> getChoosedItems() {
        return choosedItems;
    }

    // method to set the choosed items and there quantities, it also update the quantity of the item  if its already exist.
    public void setChoosedItems(String userChoose, int quantity) {
        if (choosedItems.get(userChoose) != null)
            choosedItems.put(userChoose, choosedItems.get(userChoose) + quantity);
        else
            this.choosedItems.put(userChoose, quantity);

    }

    // method to get the choosed items and there total prices.
    public HashMap<String, Integer> getItemTotalPrice() {
        return itemTotalPrice;
    }

    // method to set the choosed items and there total price, it also update the total price of the item if it is already exist.
    public void setItemTotalPrice(String userChoose, int currentItemPriceTotal) {
        if (itemTotalPrice.get(userChoose) != null)
            itemTotalPrice.put(userChoose, itemTotalPrice.get(userChoose) + currentItemPriceTotal);
        else
            this.itemTotalPrice.put(userChoose, currentItemPriceTotal);

    }
}
