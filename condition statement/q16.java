import java.util.Scanner;

public class q16 {
    public static void main (String[] args){
        //Take 3 side input and check whether they can form a triangle or not

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        if((a+b)>c && (a+c)>b && (c+b)>a){
            System.out.println("Yes! the given side forms a triangle!");
        }
        else{
            System.out.println("No! the given side doesn't forms a triangle!");
        }


    }
}
