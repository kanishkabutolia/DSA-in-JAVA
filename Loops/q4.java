import java.util.Scanner; 

public class q4 {
    public static void main(String[] args){
        //print all the numbers from 1 to 100 which are divisible by 3

        Scanner sc = new Scanner (System.in);

        for(int i=1; i<=100; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }

    }
}
