import java.util.Scanner;

public class CoinCounter {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int total_case = sc.nextInt();
      int count = 0;

      while (total_case > 0) {
         count++;
         int amount = sc.nextInt();
                
         int fifty = amount / 50;
         amount = amount % 50;
            
         int twenty = amount / 20;
         amount = amount % 20;
        
         int ten = amount / 10;
         amount = amount % 10;

         int five = amount / 5;
         amount = amount % 5;

         int one = amount;
            
         System.out.println("Case #"+count+": "+fifty+" "+twenty+" "+ten+" "+five+" "+one);

         total_case--;
      }
              
      sc.close();
   }
}

