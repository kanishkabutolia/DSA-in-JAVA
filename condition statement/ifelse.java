import java.util.Scanner;
public class ifelse{
    public static void main (String[] args){
        //Find whether the number is odd or even!!

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Your entered number is even!");
        }
        else{
            System.out.println("Your entered number is odd!");
        }
    }
}
