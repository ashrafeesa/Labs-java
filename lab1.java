
package N_1;

import java.util.Scanner;

public class N_1 {

    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        double weight=in.nextDouble();
        System.out.println("Enter your height in inch: ");        
        double height=in.nextDouble();
        
        double kg=weight*0.45359237;
        double m =height*0.0254;
        
        double BMI=kg/(Math.pow(m, 2));
        
        if (BMI<18.5)
        System.out.println("Underweight");
        else if (BMI>=18.5&&BMI<25)
            System.out.println("Normal");
        else if (BMI>=25&&BMI<30)
            System.out.println("OverWeight");
        else
            System.out.println("Obese");
                
       
    }
    
}
