import java.util.Scanner;

public class q7 {
    public static void main(String[] args){
        // Take length and breadth of rectange as input and check whether it form a square or not!

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the length: ");
        double l = sc.nextDouble();

        System.out.print("Enter the breadth: ");
        double b = sc.nextDouble();

        if(l==b){
            System.out.println("The given dimensions form a square!");
        }
        else{
            System.out.println("The given dimensions doesn't form a square!");
        }

    }
}
