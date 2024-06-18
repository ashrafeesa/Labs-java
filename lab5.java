
package num8;
import java.util.Scanner;

public class Num8 {

    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int random_number =(int)((Math.random()*10)-1);
        
        
        for (int attempt=3;attempt>0;){
           
            System.out.println("I am thinking about a number between 0 and 9. Can you guess it? "+("("+attempt+" " +"attempt(s) left):"));
            int guess_number=in.nextInt();
          
            if(guess_number==random_number){
                System.out.println("Congratulations! That was the correct number.");
                System.out.println("The correct number is  "+guess_number);
              break;  
            }
            else{
                System.out.println("Sorry. Wrong number.");
            }
            
            
            if(guess_number>random_number){
                System.out.println("Try to guess a number less than  "+guess_number);
               
           }
            else{
                System.out.println("Try to guess a number more than"+guess_number);
            }
            attempt--;
            
        }
    }
    
}
