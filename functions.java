import java.util.Scanner;
public class functions {

    // function created 

    public static  void primeNumber(int a  ) {
       boolean isPrime = true;

       if ( a <= 1) {
        isPrime = false;
       } else {
        for (int i = 2 ; i <= a / 2 ; i++) {  
            

            if ( a % i == 0) {
                isPrime = false;
                break;
            } 
        } 

        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        

    }
        
    }

    public static  void main (String[]args) {
        Scanner sc =  new Scanner(System.in); 
        System.out.println("Enter your number");
        int a = sc.nextInt();
    
        if ( a % 2 == 0 ) {
            System.out.println(" even ");
        } else {
            System.out.println("not both");
        }

        
        primeNumber(a);


        sc.close();
    }




}   