import java.util.Scanner;

public class sumof2no {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int a,b;
        System.out.print("Enter the value of a: ");
        a =  sc.nextInt();

        System.out.print("Enter the value of b: ");
        b =  sc.nextInt();

        int Sum = a+b;
        System.out.printf("The sum of %d and %d is: %d", a,b,Sum);
    }
}
