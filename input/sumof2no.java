import java.util.Scanner;

public class sumof2no {
    //Sum of 2 no by taking input
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the value of a: ");
        int a =  sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b =  sc.nextInt();

        int Sum = a+b;
        System.out.printf("The sum of %d and %d is: %d", a,b,Sum);
    }
}
