import java.util.Scanner;

public class MovingOut {
    public static void main(String[] args) {
        int boxToMove;
        int truckCapacity;
        int boxMoving;

        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the total number of boxes: ");
        boxToMove=keyboard.nextInt();
        System.out.println("Enter the truck's capacity: ");
        truckCapacity=keyboard.nextInt();

        System.out.println("Recap : Number of boxes to move ("+boxToMove+") / Truck's capacity : ("+truckCapacity+")");
        while(boxToMove>0){
            if(boxToMove>=truckCapacity){
                boxMoving=truckCapacity;
                boxToMove=boxToMove-truckCapacity;
                System.out.println("A trip of "+boxMoving+" boxes.");
            } else{
                boxMoving=truckCapacity-(truckCapacity-boxToMove);
                boxToMove=boxToMove-boxMoving;
                System.out.println("A trip of "+boxMoving+" boxes.");
            }
        }
    }
}
