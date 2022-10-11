import java.util.ArrayList;
import java.util.Scanner;

public class object {
    // getting item name from user
    public static String getItemName() {
        // scanning for user input
        Scanner scan = new Scanner(System.in);
        // getting item name from user
        System.out.println("What is the item name?");
        String itemName = scan.nextLine();
        return itemName;
    }
}
