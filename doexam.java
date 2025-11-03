import java.util.Scanner;
public class doexam2 {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
      char choice = ' ';
      boolean tfSwitch;

      Scanner keyboard = new Scanner(System.in);
      do {
          System.out.println("Do you want to continue (y/n)?");
          choice = keyboard.next().charAt(0);

          if (choice == 'y' || choice == 'n') {
            tfSwitch = true;
            if (choice == 'y') {
                System.out.println("You typed in y for your choice...");
                System.out.println("Goodbye!!!");
                break;
            } else if 
               (choice == 'n') {
                System.out.println("You typed in n for your choice...");
                System.out.println("Goodbye!!!");
                break;
            }
          } else 
          do {
             tfSwitch = false;
             System.out.print("Invalid Keystroke!!!");
          } while (tfSwitch = false);
      } while (tfSwitch = true); {        
      }
      keyboard.close();
    }
}
