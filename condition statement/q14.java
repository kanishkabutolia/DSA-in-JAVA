import  java.util.Scanner;

public class q14 {
    public static void main(String[] args){
        //Take 3 integer input and print the greatest one

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        System.out.print("Enter number 3: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.printf("%d is the greatest number of all 3 num", a);
        }
        else if(b>a && b>c){
            System.out.printf("%d is the greatest number of all 3 num", b);
        }
        else{
            System.out.printf("%d is the greatest number of all 3 num", c);
        }
        
    }
}
