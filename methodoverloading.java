import java.util.Scanner;
public class methodoverloading {

public static void  intValue(int value) {

    System.out.println("Your Int value is  : "+value);
}

public static void doubleNum(double number) {
    System.out.println("Your double value is  : "+number);
}







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your int value : ");
        int a = sc.nextInt();

        System.out.println("Enter your double value : ");
        double b =  sc.nextDouble();


        intValue(a);
        doubleNum(b);
        

        sc.close();
    }
    }

