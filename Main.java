import java.util.Scanner;

public class Main {

    //initialising the name variable.
    static String name;

    public static void main(String a[]) {
        
        // object for generateBill class.
        GenerateBill bill = new GenerateBill();

        // object for Scanner class.
        Scanner scan = new Scanner(System.in);

        // object for Itemslist class.
        Itemslist items = new Itemslist();

        // object for ChoosedItems class.
        ChoosedItems chooseditem = new ChoosedItems();

        // object for AddingItems class.
        AddingItems add = new AddingItems();

        // calling the additems method that will add the items.
        add.additems(items);

        //printing the dashboard .
        System.out.println("");
        System.out.println("---------------Welcome to the jioMart---------------");

        //take name from the user.
        System.out.println("enter your name: ");
        name = scan.nextLine();
        System.out.println("");

        //method for controltheflow class
        controlTheflow control = new controlTheflow();
        control.controlTheShopping(bill, scan, items, chooseditem);
    }
     
}