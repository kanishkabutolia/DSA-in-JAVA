import java.util.Scanner;

public class q7{
    public static void main (String[] args){
        //Checking whether the positive integer input is  divisible by 5 or not using conditional statement

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();

        if(num%5==0){
            System.out.println("The positive integer you entered is divisible by 5!");
        }
        else{
            System.out.println("The positive integer you entered is not divisible by 5!");
        }
    }
}