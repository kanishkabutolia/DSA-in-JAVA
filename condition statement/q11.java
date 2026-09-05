import java.util.Scanner;

public class q11 {
    public static void main (String[] args){
        // take positive integer as input and tell whether the number is divisible by 5 and 3 or not!

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the integer: ");
        double num = sc.nextDouble();

        if(num%5==0 && num%3==0){
            System.out.println("The integer is divisible by 3 and 5");
        }
        else{
            System.out.println("The number is not divisible by 3 and 5");
        }
    }
}
