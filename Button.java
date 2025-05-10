
import java.util.Random;
import java.util.Scanner;
public class Button {
    public static void main (String[]args) {
        
        Scanner sc = new Scanner (System.in);
        Random rm = new Random();
int enemyMove = rm.nextInt(4) + 1;  // Gives 1, 2 or 3

    int darkhealth = 100 ;
     int foehealth = 100;       
        
        System.out.println("lets Start the battle attack your enemy and  defeat him");
        
        
        while (darkhealth> 0&& foehealth > 0) {
            int attack = sc.nextInt();
            // int enenmyMove = rm.nextInt(3)+1;
            
            System.out.println("You  attack foe with   "+attack);

            switch (attack) {
            case 1 : System.out.println("Punch") ; 
                    foehealth=foehealth - 10 ; 
             break;    
            case 2 : System.out.println("kick"); 
                    foehealth=foehealth - 10; 
            break;    
            case 3 : System.out.println("mega-punch");
                    foehealth = foehealth - 20; break;  
              case 4 : System.out.println("Mega kick"); 
                        foehealth = foehealth - 50; break;      
                    
                }  
                
                if (attack>=5) {
                  System.out.println("wrong button selected press another button for attack");
                  break;
                }  else {
                    
                    System.out.println("Enemy get hurt by your attack ");
                } 
               
                System.out.println("Enemy health "+foehealth);
                 // Enemy attack back  
                if (enemyMove == 1) {
                    darkhealth  -= 10;
                    System.out.println("Enemy punches you! -10 health");
                    System.out.println("Your health  "+darkhealth);

                } else if (enemyMove == 2) {
                    darkhealth -= 20;
                    System.out.println("Enemy kicks you hard! -20 health");
                    System.out.println("Your health  "+darkhealth);

                } else if (enemyMove == 3) {
                    darkhealth -= 30;
                    System.out.println("Enemy uses super attack! -30 health");
                    System.out.println("Your health  "+darkhealth); 
                    
                }  else if (enemyMove == 4) {
                    darkhealth -= 100 ;
                    System.out.println("Enemy use ultimate attack - 100 health");
                    System.out.println("Your health "+darkhealth);
                    
                }   
                
                if (darkhealth<=0) {
                    darkhealth  = 0;
                    System.out.println("You fainted game over");
                }
                if (foehealth<=0 ) {
                    foehealth=  0 ;
                    System.out.println("Enemy fainted you win");
                  break;   
                }






}    

                    sc.close();
                
                    
                        }
                    }

