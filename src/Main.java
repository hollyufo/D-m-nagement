import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        do{
            // menu to ask user what they want to do
            System.out.println("What would you like to do?");
            System.out.println("1. Create box");
            System.out.println("2. Remove box");
            System.out.println("3. Get box");
            System.out.println("4. Get box count");
            System.out.println("5. Add item to box");
            System.out.println("6. Remove item from box");
            System.out.println("7. Search for item");
            System.out.println("8. Get item count");
            System.out.println("9. Update item in  box");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            // Scanning for user input
            Scanner scan = new Scanner(System.in);
            input = scan.nextInt();

            // creating a switch statement to run the methods
            switch(input){
                case 1:
                    // creating instance of box class
                    // creating box
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Creating box...");
                    box.createBox();
                    System.out.println("-------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------------------------------------");
                    box.displayAllBoxes();
                    // removing box
                    box.removeBox();
                    System.out.println("-------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------------------------------------");
                    box.displayAllBoxes();
                    // getting box
                    System.out.println("What box would you like to get?");
                    int boxIndex = scan.nextInt();
                    box.getBox(boxIndex);
                    System.out.println("-------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Getting box count...");
                    // getting box count
                    box.getBoxCount();
                    System.out.println("-------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("-------------------------------------------------------");
                    box.displayAllBoxes();
                    // adding item to box
                    box.addItemToBox();
                    System.out.println("-------------------------------------------------------");
                    break;
                case 6:
                    System.out.println("-------------------------------------------------------");
                    box.displayAllBoxes();
                    // removing item from box
                    box.removeItemFromBox();
                    System.out.println("-------------------------------------------------------");
                    break;
                default:
                    // if user enters invalid input
                    System.out.println("Invalid input");
                    break;
            }

        }while (input != 10);
    }
}