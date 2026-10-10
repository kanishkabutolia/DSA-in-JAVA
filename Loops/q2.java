import java.util.Scanner;

public class q2 {
    public static void main (String[] args){
        //print number 1 to n;

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println(i);
        }

    }
}
