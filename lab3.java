import java.util.Scanner;
public class N_3 {

  
    public static void main(String[] args) {
   Scanner input =new Scanner(System.in);
        System.out.println("enter the number : ");
        int number = input.nextInt();
       
        int org_number = number;
        int reverse =0;
              
         while(number !=0){                        //                           first time      s time                  t time
             reverse=(reverse*10)+(number%10);     //rev-->0 in first time      123%10=3        3*10+(12%10=2)=32       32*10+(1%10=1)
                   number=number/10;               //                           120/10=12       12/10=1                 1/10=0-->end while
         }
                   
         
        if(org_number==reverse){
                System.out.println(org_number+" the number is palindrome");
        }
            else
            System.out.println(org_number+ " the number is not palindrome");
        }
    }