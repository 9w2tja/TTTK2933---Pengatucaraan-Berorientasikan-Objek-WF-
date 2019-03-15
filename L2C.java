/* This is just one of the many ways to solve the problem */

import java.util.Scanner;

public class MessageEncoder {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		
      String ori_ltr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
      String shifted_ltr = "BCDEFGHIJKLMNOPQRSTUVWXYZAbcdefghijklmnopqrstuvwxyza1234567890";
        
      String plainText = ""; // To hold message to be encoded
      int count = 0; // To hold number of test cases
		
      // While input is not "#"
      while (!plainText.equals("#")) {
         plainText = sc.nextLine(); // Get message to be encoded from user
			
         count++;
         String secretText = "";
            
         // Traverse each letter in the plain text, one by one
         for (int i=0; i<plainText.length(); i++) {                         
            boolean is_others = true;
                
            // Traverse each letter in the original letters
            for (int j=0; j<ori_ltr.length(); j++) {
                	
               // Compare current letter of plain text with a letter in original letters
               if (plainText.charAt(i) == ori_ltr.charAt(j)) {
                    	
                  // If current letter of plain text (x) matches a letter in 
                  // original letters (y), replace the letter of plain text (x) 
                  // with a letter in shifted letters (z) 
                  // that has the same index as the letter in the original letters (y).
                  // Assign the encoded letter (z) to the secret text.
                  secretText = secretText + shifted_ltr.charAt(j);
                        
                  // Assign is_others (not letter or digit) as true, and terminate the loop
                  is_others = false;
                  break;
               }                                
            }
                
            // If current letter of plain text (x) is non letter or digit,
            // add the letter to secret text in its original form (not encoded)
            if (is_others)
               secretText = secretText + plainText.charAt(i);                                                  
         } 
            
         // Display output and get next message to be encoded from user
         System.out.println("Case #"+count+": "+secretText);
         plainText = sc.nextLine();
      }   	
		
      sc.close();
		
   }
}
