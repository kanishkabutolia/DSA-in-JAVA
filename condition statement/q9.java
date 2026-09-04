import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        // Take positive integer input and check whther the number is of 3 digit or not

        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(num>99 && num<1000){
            System.out.println("You enter number is of 3 digit!");
        }
        else{
            System.out.println("It is not of 3 digit!");
        }
    }
}
