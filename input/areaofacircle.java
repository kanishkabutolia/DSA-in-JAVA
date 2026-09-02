import java.util.Scanner;

public class areaofacircle {
    public static void main(String[] args) {
    // area of a circle by taking input

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Radius: ");
    int radius = sc.nextInt();
    double pi = 3.14;
    double area = pi*radius*radius;

    System.out.printf("The area of a circle with radius %.2f = %.2f", radius, area);
    }

}
