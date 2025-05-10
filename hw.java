// import java.util.Scanner;
// public class hw {
//     public static void main  (String[]args) {

//         Scanner sc = new Scanner (System.in) ;


//             System.out.println("Enter your name and press button for subject (1-4)");

//             String name = sc.nextLine();
//         int mrks = sc.nextInt();
//         System.out.println("Your name is "+name);

//           while (mrks<=0) {  
            
//     switch (mrks) {
//         case 1: System.out.println("In Maths you score "+90); break;
//         case 2 : System.out.println("In History you score "+85); break;
//         case 3 : System.out.println("In Science you score "+75); break;
//         case 4 : System.out.println("In English you score "+66); break;
//         default:
//             break;       
//     }
//            if (mrks==1) {
//             System.out.println(" This is so good ");
//            } else if (mrks==2) {
//             System.out.println("This is also good");
//            } else if (mrks==3) { 
//             System.out.println("This is good but you can do well ");
//            } else if (mrks== 4) {
//             System.out.println("Average do hardwork");
//            } else {
//             System.out.println("Invalid button");
//            }

// sc.close();
//         }




//     }
// }




import java.util.Scanner;

public class hw {
public static void main (String[]args) {

    Scanner sc = new Scanner (System.in) ;
    
    System.out.println("Press any number  to start your program and Press 0 to stop your program ");
     int input = sc.nextInt() ;
     
     

     
    do { 
        
        System.out.println("Enter your number");
         input = sc.nextInt();

        if (input ==0) {
            System.out.println("Program Stopped");
            break;
        }
         
         if (input %2 == 0 ) {
             System.out.println("Even number");
            } else {
                System.out.println("Odd Number");
            }
            
            System.out.println("Press any number to start again");
            

    
}   while  (input!=0); // close program  

{
    
}
sc.close();

}

}