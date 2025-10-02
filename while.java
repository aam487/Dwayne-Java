import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random; 
public class dotry { 
   public static void main(String[] args) { 
   int high = 10;
   int low = 1; 
   int number1 = 0;
   int number2 = 0; 
   int answer = 0; 
   int canswer = 0;   
   int choice = 0;
   boolean tfSwitch = false;
   boolean tswitch = true; 
   Scanner keyboard = new Scanner(System.in);
   Random rand = new Random(); 
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
       System.out.print("\rPlease enter a choice between 1 and 5 ");
       choice = keyboard.nextInt();  

    switch (choice) {

        case 1: {
        while (choice == 1 && tswitch) {
         System.out.print("\033[H\033[2J");
         System.out.println("Welcome to addition");
         number1 = rand.nextInt(high - low + 1) + low; 
         number2 = rand.nextInt(high - low + 1) + low;
         canswer = number1 + number2;  
         System.out.print("\r" + number1 + "+" + number2 + "=");
         answer = keyboard.nextInt(); 
         if (answer == canswer) {

            System.out.println("Correct!"); 
            System.out.println(); 
         } else if (answer != canswer) {

            System.out.println("Incorrect "+ "the answer is " + canswer); 
            System.out.println(); 
         }
           char cont = 'q'; 
           char cont2 = 'Q'; 
           char cont3 = 'C'; 
           char cont4 = 'c'; 
           System.out.println("Press q to quit or c to continue"); 
         cont = keyboard.next().charAt(0);
         cont2 = keyboard.next().charAt(0);
         cont3 = keyboard.next().charAt(0); 
         cont4 = keyboard.next().charAt(0); 

         System.out.print("\033[H\033[2J");
         System.out.println("Welcome to addition");
         number1 = rand.nextInt(high - low + 1) + low; 
         number2 = rand.nextInt(high - low + 1) + low;
         canswer = number1 + number2;  
         System.out.print("\r" + number1 + "+" + number2 + "=");
         answer = keyboard.nextInt(); 
         if (Character.toUpperCase(cont) == Character.toUpperCase(cont2)); { 
            System.out.println("GoodBye!!");           
        
          // if (Character.toUpperCase(cont3) == Character.toUpperCase(cont4)); { 
            break; 
           }    
        }
        }  
        break;
      }


        case 2:
        while (choice == 2 && tswitch) {
         System.out.print("\033[H\033[2J");
         System.out.println("Welcome to subtraction");
         number1 = rand.nextInt(high - low + 1) + low; 
         number2 = rand.nextInt(high - low + 1) + low;
         canswer = number1 - number2;  
         System.out.print("\r" + number1 + "-" + number2 + "=");
         answer = keyboard.nextInt(); 
         if (answer == canswer) {

            System.out.println("Correct!"); 
            System.out.println(); 
         } else if (answer != canswer) {

            System.out.println("Incorrect "+ "the answer is " + canswer); 
            System.out.println(); 
         }
           char cont = 'q'; 
           char cont2 = 'Q'; 
           System.out.println("Press q to quit or c to continue"); 
           cont = keyboard.next().charAt(0); 
           if (Character.toUpperCase(cont) == Character.toUpperCase(cont2)); { 
            System.out.println("GoodBye!!");  

            break; 
           }          



        }  
           
           
           break; 
        case 3:
        while (choice == 3 && tswitch) {
         System.out.print("\033[H\033[2J");
         System.out.println("Welcome to Multiplication");
         number1 = rand.nextInt(high - low + 1) + low; 
         number2 = rand.nextInt(high - low + 1) + low;
         canswer = number1 * number2;  
         System.out.print("\r" + number1 + "x" + number2 + "=");
         answer = keyboard.nextInt(); 
         if (answer == canswer) {

            System.out.println("Correct!"); 
            System.out.println(); 
         } else if (answer != canswer) {

            System.out.println("Incorrect "+ "the answer is " + canswer); 
            System.out.println(); 
         }
           char cont = 'q'; 
           char cont2 = 'Q'; 
           System.out.println("Press q to quit or c to continue"); 
           cont = keyboard.next().charAt(0); 
           if (Character.toUpperCase(cont) == Character.toUpperCase(cont2)); { 
            System.out.println("GoodBye!!");  

            break; 
           }          



        }  
           
           break;  
        case 4: 
        while (choice == 4 && tswitch) {
         System.out.print("\033[H\033[2J");
         System.out.println("Welcome to Division");
         number1 = rand.nextInt(high - low + 1) + low; 
         number2 = rand.nextInt(high - low + 1) + low;
         canswer = number1 / number2;  
         System.out.print("\r" + number1 + "/" + number2 + "=");
         answer = keyboard.nextInt(); 
         if (answer == canswer) {

            System.out.println("Correct!"); 
            System.out.println(); 
         } else if (answer != canswer) {

            System.out.println("Incorrect "+ "the answer is " + canswer); 
            System.out.println(); 
         }
           char cont = 'q'; 
           char cont2 = 'Q'; 
           System.out.println("Press q to quit or c to continue"); 
           cont = keyboard.next().charAt(0); 
           if (Character.toUpperCase(cont) == Character.toUpperCase(cont2)); { 
            System.out.println("GoodBye!!");  

            break; 
           }          



        }  
           

           break; 
        case 5:
           System.out.print("\033[H\033[2J"); 
           System.out.println("GoodBye!!"); 
           break; 
    }	
        
  tfSwitch = true;
} catch (InputMismatchException e) {
         //System.out.println("Invalid input!!!");
         keyboard.next();
} catch (IllegalArgumentException e) {
         //System.out.println("Invalid input!!!");

         //Any time you use a catch statement. a keyboard.next(); is required
         // for each catch. 


 }
      
   }
} 
}    



        
