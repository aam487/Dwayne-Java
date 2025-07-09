/**********************************
 * doFinal.java
 * nested do loop example
 * @author Anthony Mayes
 * @version 2.00
 *********************************/
import java.util.Scanner;
public class doFinal {
    public static void main(String[] args) {

    boolean restartout = true;
    Scanner keyboard = new Scanner(System.in);
    char choice;
    
    outerloop: 
     while(restartout){
      boolean restartinner = false;
        do {
            System.out.println("Do you want another try (y/n)");
            choice = keyboard.next().charAt(0);
  
           if (choice == 'y' && !restartinner){
             restartinner = true;
             continue outerloop;
           }
           if (choice == 'n'){
             restartout = false;
             break;
           }
        } while (choice == 'n');

          if (restartout) { 
               restartinner = false;
            }
     } 
      keyboard.close();
      System.out.println("goodbye");   
  }
}   
Do you want another try (y/n)
y
Do you want another try (y/n)
y
Do you want another try (y/n)
y
Do you want another try (y/n)
n
goodbye
@aam487 ➜ /workspaces/Dwayne-Java (main) $ 
