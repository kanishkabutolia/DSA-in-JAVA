import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        //WAP to find the highest factor of n (rather than n itself)

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int hf=1;

        for(int i=1; i<n; i++){
            if(n%i==0){
                System.out.println(i);
                hf=i;
            }
        }
        System.out.println(n);
        System.out.printf("The highest factor of %d is: %d", n, hf);
    }
}
