import java.util.Scanner;
public class prc {
    
 public static void main (String[]args) {
 Scanner sc = new Scanner (System.in);
 
 System.out.println(" Enter your 3 number");
 
 int a = sc.nextInt();
 int x = sc.nextInt();
 int y = sc.nextInt();


 if (a > x ) {
    System.out.println(" Large Number is "+a);
}  else if (x > y) {
    System.out.println("Large Number is"+x);
}  
 else if (y > a) {
    System.out.println("Large Number is"+y);
 }



 

sc.close();

    
 }   
}
