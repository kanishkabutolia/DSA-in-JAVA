import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        //print the table of n

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }   
}
