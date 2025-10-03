import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;
public class dotry {

    public static void main(String[] args) throws Exception {
        
    int choice = 0;
    boolean tfSwitch = false;
    Scanner keyboard = new Scanner(System.in);
    Random ran = new Random();
    int ranrangeHigh= 10;
    int ranrangeLow = 1;
    int num1 = 0;
    int num2 = 0;
    int answer = 0;
    int canswer = 0;
    boolean tSwitch = true;

    System.out.print("\033[H\033[2J");
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
       System.out.print("\bPlease enter a choice between 1 and 5:");
       choice = keyboard.nextInt();       
      /*  if (choice == 1) {
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
  tfSwitch = true; */

switch (choice) {
              case 1: {
              while (choice == 1 &&  tSwitch) {
                System.out.print("\033[H\033[2J");
                System.out.println("Welcome to Addition");
                num1 = ran.nextInt(ranrangeHigh - ranrangeLow + 1) + ranrangeLow;
                num2 = ran.nextInt(ranrangeHigh - ranrangeLow + 1) + ranrangeLow;
                System.out.println("  " + num1);
                System.out.println("  " + num2 + " +");
                System.out.println("-----");
                canswer = num1 + num2;
                try {
                answer = keyboard.nextInt();
                 } catch (InputMismatchException e) {
                 System.out.println("Invalid input!!!");
                 tSwitch = true;
                //System.out.println("Please enter a choice between 1 and 5");
                 keyboard.next();
                }
                if (answer == canswer) {
                    System.out.println("Correct!!!");
                    System.out.println();
                }else if (answer != canswer){
                    System.out.println("Incorrect!!!  " + "Answer is: " + canswer);
                    System.out.println();
                }
                char cont = 'q';
                char cont2 = 'Q';
                System.out.println("Press 'c' to continue or 'q' to exit");
                cont = keyboard.next().charAt(0);
                if (Character.toUpperCase(cont) == Character.toUpperCase(cont2)) {
                 break;
                 }
               }
               break;
              }
              case 2: {
               // System.out.println("Welcome to Subtraction");
                 while (choice == 2 &&  tSwitch) {
                System.out.print("\033[H\033[2J");
                System.out.println("Welcome to Subtraction");
                num1 = ran.nextInt(ranrangeHigh - ranrangeLow + 1) + ranrangeLow;
                num2 = ran.nextInt(ranrangeHigh - ranrangeLow + 1) + ranrangeLow;
                System.out.println("  " + num1);
                System.out.println("  " + num2 + " -");
                System.out.println("-----");
                canswer = num1 - num2;
                try {
                answer = keyboard.nextInt();
                 } catch (InputMismatchException e) {
                 System.out.println("Invalid input!!!");
                 tSwitch = true;
                //System.out.println("Please enter a choice between 1 and 5");
                 keyboard.next();
                }
                if (answer == canswer) {
                    System.out.println("Correct!!!");
                    System.out.println();
                }else if (answer != canswer){
                    System.out.println("Incorrect!!!  " + "Answer is: " + canswer);
                    System.out.println();
                }
                char cont = 'q';
                char cont2 = 'Q';
                System.out.println("Press 'c' to continue or 'q' to exit");
                cont = keyboard.next().charAt(0);
                if (Character.toUpperCase(cont) == Character.toUpperCase(cont2)) {
                 break;
                 }
               }
                break;
              }
              case 3: {
                // System.out.println("Welcome to Multiplication");
                  while (choice == 3 &&  tSwitch) {
                System.out.print("\033[H\033[2J");
                System.out.println("Welcome to Multiplication");
                num1 = ran.nextInt(ranrangeHigh - ranrangeLow + 1) + ranrangeLow;
                num2 = ran.nextInt(ranrangeHigh - ranrangeLow + 1) + ranrangeLow;
                System.out.println("  " + num1);
                System.out.println("  " + num2 + " x");
                System.out.println("-----");
                canswer = num1 * num2;
                try {
                answer = keyboard.nextInt();
                 } catch (InputMismatchException e) {
                 System.out.println("Invalid input!!!");
                 tSwitch = true;
                //System.out.println("Please enter a choice between 1 and 5");
                 keyboard.next();
                }
                if (answer == canswer) {
                    System.out.println("Correct!!!");
                    System.out.println();
                }else if (answer != canswer){
                    System.out.println("Incorrect!!!  " + "Answer is: " + canswer);
                    System.out.println();
                }
                char cont = 'q';
                char cont2 = 'Q';
                System.out.println("Press 'c' to continue or 'q' to exit");
                cont = keyboard.next().charAt(0);
                if (Character.toUpperCase(cont) == Character.toUpperCase(cont2)) {
                 break;
                 }
               }
                 break;
              }
              case 4:{
                //System.out.println("Welcome to Division");
                 while (choice == 4 &&  tSwitch) {
                System.out.print("\033[H\033[2J");
                System.out.println("Welcome to Division");
                num1 = ran.nextInt(ranrangeHigh - ranrangeLow + 1) + ranrangeLow;
                num2 = ran.nextInt(ranrangeHigh - ranrangeLow + 1) + ranrangeLow;
                System.out.println("  " + num1);
                System.out.println("  " + num2 + " /");
                System.out.println("-----");
                canswer = num1 / num2;
                try {
                answer = keyboard.nextInt();
                 } catch (InputMismatchException e) {
                 System.out.println("Invalid input!!!");
                 tSwitch = true;
                //System.out.println("Please enter a choice between 1 and 5");
                 keyboard.next();
                }
                if (answer == canswer) {
                    System.out.println("Correct!!!");
                    System.out.println();
                }else if (answer != canswer){
                    System.out.println("Incorrect!!!  " + "Answer is: " + canswer);
                    System.out.println();
                }
                char cont = 'q';
                char cont2 = 'Q';
                System.out.println("Press 'c' to continue or 'q' to exit");
                cont = keyboard.next().charAt(0);
                if (Character.toUpperCase(cont) == Character.toUpperCase(cont2)) {
                 break;
                 }
               }
                break;
              }
               case 5:{
                System.out.println("Goodbye!!!");
                break;
              }
            } 
  tfSwitch = true;
} catch (InputMismatchException e) {
         //System.out.println("Invalid input!!!");
         //System.out.println("Please enter a choice between 1 and 5");
         keyboard.next();
} catch (IllegalArgumentException e) {
         //System.out.println("Invalid input!!!");
         keyboard.next();
   }   
  }   
  keyboard.close(); 
 }
}
