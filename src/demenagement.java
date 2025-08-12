import java.util.Scanner;

public class demenagement {
    public static void main(String[] args) {
        int boxToMove;
        int truckCapacity;
        int boxMoving;

        Scanner clavier=new Scanner(System.in);
        System.out.println("Saisissez le nombre total de cartons : ");
        boxToMove=clavier.nextInt();
        System.out.println("Saisissez la capacité du camion : ");
        truckCapacity=clavier.nextInt();

        System.out.println("Récap : nbre de cartons ("+boxToMove+") / Capacité du camion : ("+truckCapacity+")");
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
