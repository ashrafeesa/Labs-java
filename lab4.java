import java.util.Scanner;
public class N_4 {    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        int yourmoney= 5000;
                
            System.out.println("1: withdraw the money");
            System.out.println("2: Deposit the money");
            System.out.println("3: check the balance");
            System.out.println("4: Exit");
             System.out.println();
            System.out.println("choose an option");
         int option = input.nextInt();
            do{
           
            switch(option){
            case 1:
                System.out.println("ENTER THE NUMBER OF MONEY");
                int thenumber = input.nextInt();
              if(thenumber<5000){
                  yourmoney=5000-thenumber;
                  System.out.println("collect your money");
                  System.out.println("your money became: "+yourmoney);
                }
              break;
              
            case 2:
                System.out.println("enter the number you need:");
                int moneyneed =input.nextInt();
                yourmoney = yourmoney+moneyneed;  
                System.out.println("your money became :"+yourmoney);
                System.out.println("your money has been deposited successfully");
                break; 
                
            case 3 :
                System.out.println("your money is :"+yourmoney);
            case 4 :
                break;
            default :
                System.out.println("not successful process");
            }
                System.out.println();
                         
                 System.out.println();
            System.out.println("1: withdraw the money");
            System.out.println("2: Deposit the money");
            System.out.println("3: check the balance");
            System.out.println("4: Exit");
             System.out.println();
                System.out.println("enter an optin");     
             option=input.nextInt();
               }while(option!=4);
            }
            
          }
       