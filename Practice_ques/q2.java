public class q2 {
    public static void main(String[] args){
        // Calculate the average of 5 subjects

        double x1 = 45;
        double x2 = 33;
        double x3 = 55;
        double x4 = 45;
        double x5 = 45;
        double sum = x1+x2+x3+x4+x5;
        double average = (x1 + x2 + x3 + x4 + x5)/5;

        System.out.printf("Total Marks = %d \n", 60*5);
        System.out.printf("Obtained marks = %.1f \n", sum);
        System.out.println("Average of 5 subjects is: " + average);
        System.out.printf("Marks deducted: %.1f", 300-sum);
        

    }
}
