import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class box {
    // creating hash map to store boxes
    private static HashMap<Integer, ArrayList<String>> boxes = new HashMap<Integer, ArrayList<String>>();
    // creating method to create box
    public static void createBox(){
        // creating array list to store items
        ArrayList<String> items = new ArrayList<String>();
        // adding array list to hash map
        boxes.put(boxes.size(), items);
        // printing out box number
        System.out.println("Box " + (boxes.size() - 1) + " created");
    }
    // creating method to remove box
    public static void removeBox(){
        // getting box number from user
        System.out.println("What box would you like to remove?");
        // scanning for user input
        Scanner scan = new Scanner(System.in);
        int boxNumber = scan.nextInt();
        // removing box from hash map
        boxes.remove(boxNumber);
    }
    // creating method to get box
    public static void getBox(int boxIndex){
        // printing out box number
        System.out.println("Box " + boxIndex + " contains: " + boxes.get(boxIndex));
    }

    public static void getBoxCount() {
        // printing out box count
        System.out.println("There are " + boxes.size() + " boxes");
    }
    // displaying ALL box with their index first and then the items in each box
    public static void displayAllBoxes() {
        // printing out box count
        System.out.println("There are " + boxes.size() + " boxes");
        // printing out box number
        for (int i = 0; i < boxes.size(); i++) {
            System.out.println("Box " + i);
        }
    }
    // adding an item to a box
    public static void addItemToBox() {
        // getting box number from user
        System.out.println("What box would you like to add an item to?");
        // scanning for user input
        Scanner scan = new Scanner(System.in);
        int boxNumber = scan.nextInt();
        // using object class to get item name
        String itemName = object.getItemName();
        // adding item to box
        boxes.get(boxNumber).add(itemName);
    }
    // removing an item from a box
    public static void removeItemFromBox() {
        // getting box number from user
        System.out.println("What box would you like to remove an item from?");
        // scanning for user input
        Scanner scan = new Scanner(System.in);
        int boxNumber = scan.nextInt();
        // getting item name from user
        System.out.println("What item would you like to remove?");
        // taking user input as a string
        String itemName = scan.next();
        // removing item from box
        boxes.get(boxNumber).remove(itemName);
    }
}
