import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
    //     String name = "Urvah";
    // int age = 20;
    // double height = 6.5;
    //     char bloodgroup = 'A';
    //     boolean isschoolboring = true; 
        
        Scanner sc = new Scanner (System.in);
        // String Nickname = sc.next();
        // System.out.println(Nickname);
        // sc.close();

        // Scanner bc = new Scanner (System.in);
        // int a = bc.nextInt();
        // int b = bc.nextInt();
        // int sum = a + b ;
        // System.out.println("Whats your number : " + sum);

        // bc.close();
;  // Create Scanner
        
        // }
        
            System.out.println("Enter your name :  ");
            String name = sc.nextLine(); //User input

            System.out.println("Enter your age :   ");
            int age = sc.nextInt(); //User input
            
            System.out.println("Enter your Height :   ");
            float height = sc.nextFloat() ; //User input
            
           System.out.println("Enter your Blood-Group :  ");
           String bloodgroup = sc.next(); 
            
            System.out.println("Enter your room number : ");
            boolean room = sc.nextBoolean(); //User input
            

            // user outputs
            System.out.println("Your name is " + name); 
            System.out.println("Your age is " + age);
            System.out.println("Your height is " + height);
            System.out.println("Your blood-group is " + bloodgroup  );
            System.out.println("Your room number is 119 " + room);

            sc.close();


            // int a = sc.nextInt() ;
            // int b = sc.nextInt() ;
             


        
        // System.out.println("Name: " + name);
        // System.out.println("Age: "+ age);
        // System.out.println("Height: "+height);
        // System.out.println("BloodGroup: "+ bloodgroup);
        // System.out.println("Isschoolboring: "+ isschoolboring);


    }
}
