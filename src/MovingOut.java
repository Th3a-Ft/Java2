import java.util.Scanner;

/**
 * This class displays the number of boxes per trip based on the total number of boxes entered and the truck's capacity.
 */
public class MovingOut {
    /**
     * This function displays the various messages in the class.
     * @param message string
     */
    protected static void showMessage(String message){
        System.out.println(message);
    }

    /**
     * Display for each trip the number of boxes moved
     * Condition that controls that the number of boxes & truck Capacity are positive
     * Loop so that messages are displayed on each trip until boxToMove=0
     * @param args array of strings
     */
    public static void main(String[] args) {
        int boxToMove;
        int truckCapacity;
        int boxMoving;

        Scanner keyboard = new Scanner(System.in);
        showMessage("Enter the total number of boxes: ");
        boxToMove = keyboard.nextInt();
        showMessage("Enter the truck's capacity: ");
        truckCapacity = keyboard.nextInt();

        showMessage("Recap : Number of boxes to move (" + boxToMove + ") / Truck's capacity : (" + truckCapacity + ")");
        if (boxToMove > 0 || truckCapacity > 0) {
            while (boxToMove > 0) {
                if (boxToMove >= truckCapacity) {
                    boxMoving = truckCapacity;
                    boxToMove = boxToMove - truckCapacity;
                } else {
                    boxMoving = boxToMove;
                    boxToMove = 0;
                }
                showMessage("A trip of " + boxMoving + " boxes. You moved all your boxes, well done!");
            }
        }else{
            showMessage("Invalid input: boxToMove & truckCapacity have to be positive");
        }
    }
}
