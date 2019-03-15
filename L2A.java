import java.util.Scanner;
import java.text.DecimalFormat;

public class CostCalculator {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int total_case = sc.nextInt(); // Get the number of test cases from user
    	
      while (total_case > 0) {
         int type = sc.nextInt();
         int width = sc.nextInt();
         int length = sc.nextInt();
         double costPSF = 0.0;
            
         if (type == 1)
             costPSF = 2.99;
         else if (type == 2)
             costPSF = 1.99;
         else if (type == 3)
             costPSF = 1.99;
         else if (type == 4)
             costPSF = 4.20;
         else if (type == 5)
             costPSF = 4.99;
           
         DecimalFormat f2 = new DecimalFormat("0.00");                           
         System.out.println(f2.format(width * length * costPSF));
            
         total_case--;
      }
    	
      sc.close();
   }
}
