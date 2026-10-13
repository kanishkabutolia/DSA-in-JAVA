import java.util.Scanner;

public class q12 {
    public static void main(String[] args){
        //WAP to check whether the number is prime or not 

        Scanner sc =  new Scanner (System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int count = 0;

        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
                System.out.printf("The %d is divisible by: %d\n", n,i);
            }
        }

        if(count==2){
            System.out.printf("The %d is prime!",n);
        }
        else{
            System.out.printf("The %d is composite",n);
        }

    }
}
