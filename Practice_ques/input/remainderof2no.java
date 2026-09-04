import java.util.Scanner;

public class remainderof2no {
    public static void main (String[] args){
        // Take input of 2 number where the first number will be bigger than second no and find the remainder of them when divided

        Scanner sc =  new Scanner (System.in);

        System.out.println("\nEnter the first number bigger than second number!");
        System.out.print("Enter the first number: ");
        int firstnum =  sc.nextInt();

        System.out.print("Enter the second number: ");
        int secondnum = sc.nextInt();

        int remainder = firstnum%secondnum;
        System.out.printf("The remainder of %d and %d is: %d", firstnum, secondnum, remainder);
    }
}
