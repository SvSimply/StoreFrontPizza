import java.util.Scanner;
public class PriceCalculator {
    /*
     * keeps track of the price of the order.
     * I made the GetMenu class co-exist with this class, so I already have the hashmap store everything in the menu
     * as cents so that the Price Calculator can just take the menu and the orders that the Customer makes and divide the
     * order by 100 and give an accurate price.
     *
     * what I have in this code is the Scanner and a few System Out Print lines with the commands of the order and if
     * the order is not on the menu I also have the price being printed out in dollars as well. This is a simple
     * Scanner class I do not have anything fancy in this code unless it is the toUpperCase function.
     *
     * I
     */
    public static double getOrder(){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR ORDER: ");
        String order = scan.nextLine().toUpperCase();
        double price = 0;
        while(!order.equals("DONE")){
            if(GetMenu.menu.containsKey(order)){
                price += GetMenu.menu.get(order);
            } else {
                System.out.println("THIS ITEM IS NOT ON THE MENU.");
            }
            System.out.println("ENTER YOUR ORDER: ");
            order = scan.nextLine().toUpperCase();
        }
        System.out.println("YOUR ORDER IS: " + order);
        System.out.println("YOUR PRICE IS: $" + price/100);
        return price/100;
    }
}
