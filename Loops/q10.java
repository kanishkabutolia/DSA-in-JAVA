import java.util.Scanner;

public class q10 {
    public static void main(String[] args){
        //Display GP 3,12,48... upto n terms

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a=3, r=4;
        for(int i=1; i<=n; i++){
            System.out.println(a);
            a*=r;
        }

    }
}
