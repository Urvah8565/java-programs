import java.util.Scanner;
public class logic {

  public static boolean isPrime (int n ) {
      

      if (n < 2 ) {
        return false ;

      } 


      for (int i = 2;i<=n/2;i++)

      if ( n % i == 0 ) {
        return false;
      } 
      return true;
                   
  }
  public static void main (String[]args) {

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter your number ");
    int n =  sc.nextInt();

    boolean result = isPrime(n); 

    if (result) {
        System.out.println(n+ " is prime number ");
    } else {
      System.out.println(n+ " is not prime number ");
    }
    
    sc.close();
  }


}