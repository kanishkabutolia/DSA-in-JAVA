public class operator {
    public static void main(String[] args){
        int a=10;
        int b=3;

        //arithematic operator
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b + "\n");

        //assignment operator
        a+=2;
        System.out.println(a);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        int c=4;
        a=c+2;

        c+=b;
        System.out.println(a);
        System.out.println(c);
    }
}