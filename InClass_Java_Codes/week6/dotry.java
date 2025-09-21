import java.util.InputMismatchException;
import java.util.Scanner;
public class dotry {

      public static void main(String[] args) throws Exception {
        
    int choice = 0;
    boolean tfSwitch = false;
    Scanner keyboard = new Scanner(System.in);

    System.out.println();
    System.out.println("                                             Welcome To The Math Calculator");
    System.out.println();
    System.out.println("                                             1. Addition");
    System.out.println("                                             2. Subtraction");
    System.out.println("                                             3. Multiplication");
    System.out.println("                                             4. Division");
    System.out.println("                                             5. Exit");
    System.out.println();

  while (!tfSwitch || choice <= 0 || choice > 5) {
    try {
       System.out.println("Please enter a choice between 1 and 5");
       choice = keyboard.nextInt();       
        if (choice == 1) {
        System.out.println("Welcome to Addition");
      } else if (choice == 2) {
        System.out.println("Welcome to Subtraction");
      } else if (choice == 3) {
        System.out.println("Welcome to Multiplication");
      } else if (choice == 4) {
        System.out.println("Welcome to Division");
      } else if (choice == 5) {
        System.out.println("Goodbye!!!");
      }
  tfSwitch = true;
} catch (InputMismatchException e) {
         //System.out.println("Invalid input!!!");
         keyboard.next();
} catch (IllegalArgumentException e) {
         //System.out.println("Invalid input!!!");
         keyboard.next();
   }   
  }   
  keyboard.close(); 
 }
}
