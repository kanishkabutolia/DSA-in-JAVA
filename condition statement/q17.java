import java.util.Scanner;

public class q17 {
    public static void main (String[] args){
        // Take positive number as input and check whether the number is divisible by 5 or 3 but not by 15!

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // if(num%5==0 || num%3==0){
        //     if(num%15!=0){
        //         System.out.println("Number is divisible by 5 or 3 but not by 15!");
        //     } 
        //     else{
        //     System.out.println("The number is not divisible!!");
        //     }
        // }
        // else{
        //     System.out.println("The number is not divisible!!");
        // }

        if(num%15!=0 && (num%5==0 || num%3==0)){
                System.out.println("Number is divisible by 5 or 3 but not by 15!");
        }
        else{
            System.out.println("The number is not divisible!!");
        }
    }
}
