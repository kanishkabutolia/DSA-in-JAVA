import java.util.Scanner;

public class squareofano {
    //Square of no by takinh input
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int Sqr = num*num;
        System.out.printf("The square of a number %d is: %d\n", num, Sqr);
    }
    
}
