import java.util.Scanner;

public class q7 {
    public static void main(String[] args){
        //display this AP-1,3,5,7.. upto n
        //we know nth term = 2n-1

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1; i<=(2*n-1); i+=2){
            System.out.println(i);
        }

    }
}
