import java.util.Scanner;
import java.util.Random;
public class guessingGameFinal {

    public static void main(String[] args) {
     
    boolean restartout = true;
    Scanner keyboard = new Scanner(System.in);
    char choice;
    Random rangen = new Random();

    outerloop: 
     while(restartout){
        boolean restartinner = false;
        do {
           int max = 10;
           int min = 1;
           int ranum = 0;
           int usernum = 0;

           System.out.println();
           System.out.println("The random number that was generated is ????");
           System.out.println();
           System.out.println("Try and guess what number was generated between 1-10");
           System.out.println();
           ranum = rangen.nextInt(max - min + 1) + min;
           System.out.print("Please type in your value (between 1-10=====>");
           usernum = keyboard.nextInt();

            for (int c = 1; c < 3; c++){
             if (usernum == ranum){
               System.out.println("Correct Guess!!!");
                restartinner = true;
                continue outerloop;
             } else {
            System.out.println("Your answer is incorrect!!!");
            System.out.println();
            System.out.print("Please type in your value (between 1-10=====>");
            usernum = keyboard.nextInt();
         }
           if (c == 2){
           System.out.println("You loose!!!");
           System.out.println("The answer is " + ranum);
           System.out.println();
     }
  }
           System.out.println("Press 'c' to coninue or 'q' to Quit");
           choice = keyboard.next().charAt(0);

           if (choice == 'c' && !restartinner){
             restartinner = true;
             continue outerloop;
           }
           if (choice == 'q'){
             restartout = false;
             break;
           }
        } while (choice == 'q');

          if (restartout) { 
                restartinner = false;
            }
        }
          keyboard.close();
          System.out.println("goodbye");   
    }
}

The random number that was generated is ????

Try and guess what number was generated between 1-10

Please type in your value (between 1-10=====>1
Your answer is incorrect!!!

Please type in your value (between 1-10=====>2
Correct Guess!!!

The random number that was generated is ????

Try and guess what number was generated between 1-10

Please type in your value (between 1-10=====>1
Correct Guess!!!

The random number that was generated is ????

Try and guess what number was generated between 1-10

Please type in your value (between 1-10=====>2
Your answer is incorrect!!!

Please type in your value (between 1-10=====>3
Your answer is incorrect!!!

Please type in your value (between 1-10=====>3
You loose!!!
The answer is 10

Press 'c' to coninue or 'q' to Quit
q
goodbye
@aam487 ➜ /workspaces/Dwayne-Java (main) $ 
