// import java.util.Scanner;
public class pattern {
 

 public static void main (String[]args) {

    // System.out.println("*\n*\n*\n*\n*");



        // int x = 4 ;
        // int y = 5 ;
        // // outer loop
        // for (int i=1; i<=x;i++) {
        //     // inner loop
        //     for (int p = 1;p<=y;p++) {
        //         System.out.print("*") ;  
        //     }
        //     System.out.println(); 
        // } 



    // int n = 4 ;
    // int m= 5 ;
    // for (int i = 1;i<=n;i++) {
    //     for (int j =1;j<=m;j++) {
        
    //         if ( i== 1 || j==1 || i==n || j==m   ) {
    //             System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println("");   
         
    // }



    // int n = 5 ;
    // for (int i = 1;i<=n;i++) {
    //     for (int j =1;j<=i;j++) {

    //         int sum = i+j ;
    //         if (sum %2 == 0 ) {
    //             System.out.print("1 ");
    //         } else {
    //             System.out.print("0 ");
    //         }
    //     } 
    //     System.out.println(" ");      

            // upper half
int n = 4 ;
int i ;
int spaces;

for ( i =1;i<=n;i++) {

    for (int j = 1;j<=i;j++) {
        System.out.print("*");
    }

    // spaces
    
    spaces = 2 * (n-i) ;
    for (int j=1;j<=spaces;j++) {
        System.out.print(" ");
    }

    for (int j = 1;j<=i;j++) {
        System.out.print("*");
        
    } 

    System.out.println();
} // upper loop end 

// lower 
for (i=n;i>=1;i--) {
    // System.out.print("*");
    for (int j=1;j<=i;j++) {
        System.out.print("*");
    }

// spaces
    
spaces = 2 * (n-i) ;
for (int j=1;j<=spaces;j++) {
    System.out.print(" ");
}

 for (int j = 1 ;j<=i;j++) {
    System.out.print("*");
 }

System.out.println();

}




       


                
    } 

}


