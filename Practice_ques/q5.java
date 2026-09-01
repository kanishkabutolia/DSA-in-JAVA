public class q5{
    public static void main (String[] args){
        //Calculate the simple interest

        double p = 1.15;
        double r = 44;
        double t = 7.75;

        double si =  (p*r*t)/100;

        System.out.printf("Simple Interest of Principal = %.2f , Rate = %.2f  & Time = %.2f is: %.4f \n",p,r,t,si);
    }
}