import java.util.Scanner;

public class q20 {
    public static void main(String[] args){
        //Take input of the coordinates (x1,x1,x3) (y1,y2,y3)

        Scanner sc = new Scanner (System.in);

        double x1,x2,x3,y1,y2,y3;

        System.out.print("Enter x1: ");
        x1 = sc.nextInt();

        System.out.print("Enter x2: ");
        x2 = sc.nextInt();

        System.out.print("Enter x3: ");
        x3 = sc.nextInt();

        System.out.print("Enter y1: ");
        y1 = sc.nextInt();

        System.out.print("Enter y2: ");
        y2 = sc.nextInt();

        System.out.print("Enter y3: ");
        y3 = sc.nextInt();

        if((y2-y1)/(x2-x1)==(y3-y2)/(x3-x2)){
            System.out.println("Its is a Straight line!!\n****************************");
        }

        else{
            System.out.println("It's not a Straight line!!");
        }

    }
}
