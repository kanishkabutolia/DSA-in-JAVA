import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        //enter the percentage as input and give grades accordingly!

        Scanner sc =  new Scanner (System.in);

        System.out.print("Enter your percentage: ");
        double per = sc.nextDouble();

        if(per>=91 && per<=100){
            System.out.println("Excellent!");
        }
        else if(per>=81 && per<=90){
            System.out.println("Vey Good!");
        }
        else if(per>=71 && per<=80){
            System.out.println("Good!");
        }
        else if(per>=61 && per<=70){
            System.out.println("Can do Better!");
        }
        else if(per>=51 && per<=60){
            System.out.println("Average!");
        }
        else if(per>=41 && per<=50){
            System.out.println("Below Average!");
        }
        else{
            System.out.println("Fail!");
        }




    }
}
