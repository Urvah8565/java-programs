import java.util.Scanner;
public class methods {

    public static  int  addNumbers(int a , int b) {

        return a + b;
   
    }

    public static   int   subNumber ( int a , int  b ) {

        return a - b ;
    }


    public static int multiNumber(int a , int b ) {

        return a * b ;
    }

    public static double divNumber (double a , double b ) {
        return a / b ;
    }

    public static int modNumber (int a , int b  ) {

            return a % b    ;
    }

    public static void main (String[]args) {

        Scanner sc = new Scanner (System.in);
    
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();


        System.out.println("The add of two number is : " +addNumbers(a, b));
        System.out.println("The sub of two number is : "+subNumber(a, b));
        System.out.println("The multi of two number is : "+multiNumber(a, b));
        System.out.println("The div of two number is : "+divNumber(a, b));
        System.out.println("The modulo of two number is : "+modNumber(a,b));


     sc.close();
    }
    
} 