import java.util.Scanner;
public class arrays {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    int size =  sc.nextInt();

    /*  There are three main Ways to create array in java
    (1) Declaration and memory allocation 
     int [] Marks = new int [5] ;
    */

    /*  (2) Declaration and then memory allocation
      int [] Marks ;
      Marks = new int [5] ;  */
        // Initialization
        //  Marks [0] = 98;
        //  Marks [1] = 88;  
        //  Marks [2] = 58;  
        //  Marks [3] = 32;  
        //  Marks [4] = 44;  

        // /* (3) Declaration memory allocation and then initialization 
            // int [] Marks = {98,45,32,68,34} ;
            // System.out.println(Marks[3]);

    // with loops 
            
    int [] number = new int[size] ;

   // input loop
    for (int i = 0; i<size;i++) {
        number [i] = sc.nextInt();
    }
    int x = sc.nextInt();
    // output loop
    for (int i = 0;i<size;i++) {
        if (number[i]==x) {
            System.out.println("x found on index : "+i);
        }
    }
    
    sc.close();
}
  
}