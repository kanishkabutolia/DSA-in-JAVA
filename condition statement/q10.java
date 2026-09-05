import java.util.Scanner;

public class q10{
    public static void main(String[] args){
        // Take integer as an input and tell whether it is a 2 digit number or not!

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the integer: ");
        int num = sc.nextInt();

        if(num>9 && num<100){
            System.out.println("The given integer is of 2 digit!");
        }
        else{
            System.out.println("The given number is not of 2 digits!");
        }

    }
}