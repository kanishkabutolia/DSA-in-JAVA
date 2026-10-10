import java.util.Scanner;

public class q3 {
    public static void main (String[] args){
        //print all the even number from 1 to 100

        Scanner sc = new Scanner (System.in);

        for(int i=1; i<=100; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}
