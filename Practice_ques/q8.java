import java.util.Scanner;

public class q8{
    public static void main(String[] args){
        //Check the input year is a leap year or not!!

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if(year%4==0){
            System.out.println("It's a leap year!");
        }
        else{
            System.out.println("It's not a leap year");
        }
    }
}