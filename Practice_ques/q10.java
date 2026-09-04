import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        //Selling price and cost price will get entered by the user and you have to identify whether the shopkeeper has earned profit or loss and if profit then of how much amount and same for loss.

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the Cost price: ");
        double cost = sc.nextDouble();

        System.out.print("Enter the selling price: ");
        double sell = sc.nextDouble();

        if(sell>cost){
            double profit = sell - cost;
            System.out.printf("You made %.2f of profit!", profit);
        }
        else{
            double loss = cost - sell;
            System.out.printf("You made %.2f of loss!", loss);
        }
    }
}
