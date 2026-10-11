import java.util.Scanner;

public class q9{
    public static void main(String[] args) {
        //Display GP 1,2,4,8,16,32... upto n terms

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();


        int a=1, r=2;

        for(int i=1; i<=n; i++){
            System.out.println(a);
            a*=r;
        }

    }
}