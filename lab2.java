
package N_2;

public class N_2{

    public static void main(String[] args) {
       
        long seconds=365*24*60*60;
        long birth=seconds/7;
        long death=seconds/13;
        long immigrant=seconds/45;
        long current = 312032486;
        
        
        for (int i=1 ;i<=5;i++){
          
        current= current+birth-death+immigrant;
            System.out.println("Year "+i+" population:"+current);
        }
        
            
    }
}
