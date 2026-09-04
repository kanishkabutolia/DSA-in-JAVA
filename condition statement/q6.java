import java.util.Scanner;
public class q6{
    public static void main(String[] args){
        //Take length and breadth of rectange as input from user and find the area and perimeter also compare whether the area is greater than the perimeter or not

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the length: ");
        double l =  sc.nextDouble();

        System.out.print("Enter the breadth: ");
        double b = sc.nextDouble();

        double area = l*b;
        System.out.println("Area of rectange is: "+area);

        double perimeter = 2*(l+b);
        System.out.println("Perimeter of rectangle is: "+ perimeter);

        if(area>perimeter){
            System.out.println("Area is greater than its perimeter!");
        }
        else if(area==perimeter){
            System.out.println("Both area and perimeter are equal!");
        }
        else{
            System.out.println("Area is not greater than its perimeter!");
        }
    }
}
