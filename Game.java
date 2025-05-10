// // 
// // public class Game {
// //     public static void main (String[]args) {



// //     }
    
// // }
 
// import java.util.Scanner;
// public class Game {
//     public static void main (String[]args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter your 1 for Addition :");
//         System.out.println("Enter your 2  for Substraction : ");
//         System.out.println("Enter your 3 for Multiply: ");
//         System.out.println("Enter your 4 for Division : ");
//         System.out.println("Enter your 5 for Reminder : ");
//         System.out.println("Enter your choise");
//         int button = sc.nextInt();

//         System.out.println("Enter your first number : ");
//         int x = sc.nextInt();    
//         System.out.println("Enter your second number :");
//         int y = sc.nextInt();    

        
//         if (1== button) {
            
//             int add = x + y ;
//             System.out.println("Calculation of your values :  "+add); // Addition
            
            
//         } else if (2==button) {
//             int sub = x-y ;
//             System.out.println("Calculation of your values"+sub); // Substraction
//         } else if ( 3== button) {
//             int multi = x*y ;
//             System.out.println("Calculation of your values"+multi); // Multiplication
//         } else if (4== button) {
//             int div = x/y ;
//             System.out.println("Calculation of your values : "+div); // division
//         } else if (5 == button) {
//             int mod = x % y ;
//             System.out.println("Calculation of your values"+mod); // reminder
            
//         } else {
//             System.out.println("Error");
//         }



//         sc.close();
//     }
// }



import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main (String[]args) {
       
        Random Z = new Random();
        Scanner sc = new Scanner (System.in);
        int guessnum = Z.nextInt(1+10)+1;

        System.out.println("Guess Any number between 1 to 10");
        int guess = sc.nextInt();

        if ( guess == guessnum) {
            System.out.println("Congratulation you are winner") ;
        } else if (guess < guessnum) {
            System.out.println("Your thinking is to  low ") ;
        } else if ( guess > guessnum) {
            System.out.println("Your thinking is to high");
            
        } else {
            System.out.println("Error");
        }
        ;
        sc.close();
        }
        
         





    }

    
