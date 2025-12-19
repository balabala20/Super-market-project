import java.util.Scanner;

public class controlTheflow {

    public void controlTheShopping(GenerateBill bill, Scanner scan, Itemslist items, ChoosedItems chooseditem) {

        // defining the exit variable, to exit from market.
        boolean exit = true;
        // asking the user for shopping.
        while (exit) {

            boolean item_in_the_list = false;

            // Displaying the Items and there prices.
            System.out.println("Items list: ");
            System.out.println("         ------------------------");
            for (int i = 0; i < items.getItems().size(); i++) {
                System.out.println("            " + items.getItems().keySet().toArray()[i] + " - $"
                        + items.getItems().values().toArray()[i] + "/-");
            }
            System.out.println("         ------------------------");
            System.out.println("");

            // displaying the selected items - quantity - there total prices of the user.
            System.out.println("Selected Items: ");
            for (int j = 0; j < chooseditem.getChoosedItems().keySet().size(); j++) {
                System.out
                        .println("    " + chooseditem.getChoosedItems().keySet().toArray()[j] + " - "
                                + chooseditem.getChoosedItems().values().toArray()[j] + " -  $"
                                + chooseditem.getItemTotalPrice().values().toArray()[j]);
            }
            System.out.println("");

            // asking the user to buy or generate bill or exit.
            System.out.println("-Select from the list and enter the item to buy.");
            if (!(chooseditem.getChoosedItems().isEmpty())) {
                System.out.println("-buy - to buy the seleccted items.");
            }
            System.out.println("-0 for exit.");
            System.out.println("");
            System.out.println("Enter your result: ");
            String userChoose = scan.nextLine();

            // if user type 0 its exit.
            if (userChoose.equals("0")) {
                exit = false;
                break;
                // if user type buy, its generate the bill.
            } else if (userChoose.equals("buy")) {

                bill.generateBill(chooseditem);
                break;
                // if user type the item name, the item will store in the choosed items.
            } else {
                for (String item : items.getItems().keySet()) {
                    if (userChoose.equals(item)) {

                        // store the current item price.
                        int currentItemPrice = items.getItems().get(item);

                        // ask for the number of quantity.
                        System.out.println("enter the quantity: ");
                        String quantity = scan.nextLine();

                        // change string value to integer.
                        int quantity1 = Integer.parseInt(quantity);

                        // setting the choosed item and quantity to the hashmap.
                        chooseditem.setChoosedItems(userChoose, quantity1);

                        // calculate the total price of the current choosed item.
                        int currentItemPriceTotal = currentItemPrice * quantity1;

                        // setting choosed item and total price of that item in hashmap.
                        chooseditem.setItemTotalPrice(userChoose, currentItemPriceTotal);

                        System.out.println("x--------------------------------------------------x");
                        System.out.println("");
                        item_in_the_list = true;
                        break;
                    }
                }
                // if the entered item is not in the items list, then its show this.
                if (!item_in_the_list) {
                    System.out.println("Entered item not in the  items list, Enter correct item: ");
                    System.out.println("x--------------------------------------------------x");
                    System.out.println("");
                    continue;
                }
            }
        }
    }
}
