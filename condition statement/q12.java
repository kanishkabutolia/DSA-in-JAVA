import java.util.Scanner;

public class q12 {
    public static void main(String[] args){
        // take positive integer as input and tell whether the number is divisible by 5 but not by 3!

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(num%5==0 && num%3!=0){
            System.out.println("The given number is divisible by 5 but not by 3");
        }
        else if(num%5==0 && num%3==0){
            System.out.println("The given number is divisible by both 3 and 5");
        }
        else if(num%5!=0 && num%3==0){
            System.out.println("The given number is divisible by 3 but not by 5");
        }
        else{
            System.out.println("The given number is not divisible by any number");
        }
    }
}
