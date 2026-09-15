import java.util.Scanner;

public class q18{
    public static void main(String[] args){
        // Take 3 positive integer and print the greatest one!!

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter 1st num: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd num: ");
        int num2 = sc.nextInt();

        System.out.print("Enter 3rd num: ");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1);
        }

        if(num2>num1 && num2>num3){
            System.out.println(num2);
        }

        else{
            System.out.println(num3);
        }
    }
}