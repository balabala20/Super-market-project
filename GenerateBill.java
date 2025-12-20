public class GenerateBill {

    public void generateBill(ChoosedItems choosedItems) {

        //initialising the totalprice variable.
        int totalPrice = 0;

        // printing the bill formate including with name, item - quatntity - total price of the item and total price.
        System.out.println("");
        System.out.println(
                "------------------------------JioMart------------------------------");
        System.out.println("");
        System.out.println("                            ..Billing..                            ");
        System.out.println("");
        System.out.println("     Name: " + Main.name);
        System.out.println("");
        for (int j = 0; j < choosedItems.getChoosedItems().size(); j++) {
            System.out.println("                     " + choosedItems.getChoosedItems().keySet().toArray()[j] + " - "
                    + choosedItems.getChoosedItems().values().toArray()[j] + " -   $"
                    + choosedItems.getItemTotalPrice().values().toArray()[j]);
            totalPrice = totalPrice + (int) (choosedItems.getItemTotalPrice().values().toArray()[j]);
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("                     Total Price:    $" + totalPrice);
        System.out.println("");
        System.out.println("--------------------------Visit again----------------------");
        System.out.println("");
        System.out.println("");
    }

}
