import java.util.Scanner;
public class loops {
public static void main (String[]args) {
Scanner sc = new Scanner (System.in) ;
String password = "Darky1234";
String input;
int attempts = 3;
do {
    System.out.println("Enter your password for access gain");
    input = sc.nextLine();

    if (input.equals(password)) {
        System.out.println("Correct Password.System access gain✅ ");
        break;
    } else {
        attempts --; 
    } if (attempts > 0 ) {
        System.out.println("Try agian later. Attempts left "+attempts);
    } else {
        System.out.println("No attempts left. Try again later  ");
    }
}

while(attempts > 0) ;
sc.close();
        
    //    int i = 2 ;
        
    //    while (i<=n) {
    //     System.out.println(i);
    //     i=i +2;
        
    //    }
         
    // FOR LOOP Start
    // normal loop 
    // for (int a = 0 ; a <= 10;++a )  { 
        
    // System.out.println(a);
    // } 
    
    
    // reverse loop
    // for (int s = 10; s >=0;--s) {
        //     System.out.println(s);
        // } 
        
        
        // even number loop 
        // for (int b = 0;b<=12; b=b+2)  {
            //     System.out.println(b);
            // } 
            
            
            // // odd number loop 
            // for (int c = 1;c <=  11; c=c+2 ) {
                //     System.out.println(c); 
                // }
                
                
                // // Reverse odd number
                //     for (int f =  11; f >= 1 ;f=f-2) {
                    //         System.out.println(f);
                    //     }
                    
                    
                    // Reverse even number 
                    // for(int d  = 12;d>= 2 ;d=d-2){
                        //     System.out.println(d);
                        // }  
                        // END FOR LOOP
                        
                        
                        // While Loop Start
                        // Normal Loop
                        // int i = 20 ;
                        // while (i < 5 ) {
                            
                        //     i = i+1;
                        //     System.out.println("Darky is the Beast");
                        //     System.out.println(i);
                        // }

                        // Reverse  loop
                        //    int s = 20;
    //         while ( s >  0 )  {
        //             System.out.println(s);
    //             System.out.println("Darky is the Slayer");
    //             s = s - 1; 
    //         }
    

    // even numbers
    // int c = 2 ;
    // while ( c <= 10) {
        //     System.out.println(c);
        //     c = c + 2 ;
        
        // }
        
        
        // odd numbers 
        // int d = 1 ;
        // while (d < 11) {
            //     System.out.println(d);
            //     d = d + 2 ;
            
            // }
            
            // reverse even number
            
            //     int g = 12 ;
            //  while (g >= 2 ) {
                //     System.out.println(g);
                //     g = g - 2 ;
                //  }
                
                
                
                
                // reverse odd number 
                
                //  int n = 21 ; 
                //  while (n >= 1) {
                    //     System.out.println(n);
                    //     n = n - 2 ;
                    //  }     
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                     

}     
}