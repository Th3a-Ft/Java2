public class demenagement {
    public static void main(String[] args) {
        int boxToMove=34;
        int truckCapacity=9;
        int boxMoving;

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
