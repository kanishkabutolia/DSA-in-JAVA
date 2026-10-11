import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        //print AP- 4,7,10,13,16...to n 

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=4; i<=(3*n+1); i+=3){
            System.out.println(i);
        }
    }
}
