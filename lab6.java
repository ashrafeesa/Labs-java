
package number9;

import java.util.Scanner;


public class Number9 {

   
    public static void main(String[] args) {
        
        
      
       Scanner scanner = new Scanner(System.in);

        int numberOfValues = 10;
        int[] values = new int[numberOfValues];

       
        for (int i = 0; i < numberOfValues; i++) {
            System.out.print("Enter a value: ");
            values[i] = scanner.nextInt();
        }

       
        int min = values[0];
        int max = values[0];

        for (int i = 1; i < numberOfValues; i++) {
            if (values[i] < min) {
                min = values[i];
            }

            if (values[i] > max) {
                max = values[i];
            }
        }

        // Output the result
        System.out.println("The Lowest value is: " + min);
        System.out.println("The Highest value is: " + max);

        scanner.close();
    }
    
}
