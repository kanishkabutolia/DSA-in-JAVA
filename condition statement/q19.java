import java.util.Scanner;

public class q19 {
    public static void main (String[] args){
        //If the ages of Ram, Shyam and Ajay are input, WAP to determine the youngest fo three

        Scanner sc =  new Scanner (System.in);

        System.out.print("Enter the age of Ram: ");
        int ram = sc.nextInt();

        System.out.print("Enter the age of Ajay: ");
        int ajay = sc.nextInt();

        System.out.print("Enter the age of Shyam: ");
        int shyam = sc.nextInt();

        if(ram<ajay){
            if(ram<shyam){
                System.out.println("Ram is the youngest");
            }
            else{
                System.out.println("Shyam is the youngest");
            }
        }
        else{ //ajay<ram
            if(ajay<shyam){
                System.out.println("Ajay is the youngest");
            }
            else{
                System.out.println("Shyam is the youngest");
            }
        }
    }
}
