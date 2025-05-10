import java.util.Scanner;
public class Swapping {
    public static void main (String []args) {
        // int a = 10 ;
        // int b = 20;
        // int c  =  30;

        // int temp = a ;
        // b = c;
        // c= a;
        // a= temp;

        // System.out.println("Swapping : a="+ a);
        // System.out.println("Swapping :b="+ b);
        // System.out.println("Swapping :c="+ c);

        Scanner sc = new Scanner (System.in);
        
        
         
             System.out.println("Enter your first name : ");
             String fname  = sc.nextLine();
       
             System.out.println("Enter your second name : ");
             String lname  = sc.nextLine(); 

              System.out.println(" Your First name : "+fname);
              System.out.println();

              System.out.println(" Your last name : "+lname);
              System.out.println();

             
             System.out.println("So Your Full name :"+fname+lname);


         sc.close();
}
 
} 