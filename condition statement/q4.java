import java.util.Scanner;

public class q4 {
    public static void main (String[] args){
        // Take any integer as an input and if the integer is negative make its absolute value!

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the integer: ");
        int integer = sc.nextInt();

        if(integer<0){
            integer = integer * (-1);
            System.out.println(integer);
        }

    }
}
