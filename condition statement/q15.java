import java.util.Scanner;

public class q15 {
    public static void main (String[] args){
        //If the ages of Ram, Shyam and Ajay are input, WAP to determine the youngest fo three

        Scanner sc =  new Scanner (System.in);

        System.out.print("Enter the age of Ram: ");
        int ram = sc.nextInt();

        System.out.print("Enter the age of Ajay: ");
        int ajay = sc.nextInt();

        System.out.print("Enter the age of Shyam: ");
        int shyam = sc.nextInt();

        if(ram<ajay && ram<shyam){
            System.out.println("Ram is the youngest of three");
        }

        else if(ram>ajay && ajay<shyam){
            System.out.println("Ajay is the youngest of three");
        }

        else{
            System.out.println("Shyam is the youngest of three");
        }
    }
}
