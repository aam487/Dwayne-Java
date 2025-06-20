import java.util.Random;
import java.util.Scanner;
public class randomlett {
    public static void main(String[] args) {
        
      String choice;
        
        do {        

        int max = 95;
        int min = 65;
        int b = 0;
        Random ran = new Random();
        
        System.out.println();
        for (int y = 65; y < 95; y++){
            char character = (char) y;
            System.out.print(character + "   ");
            if (y == 69 || y == 74 || y == 79 || y == 84 || y == 89){
                
                System.out.println();
                System.out.println();
            }
        }
 System.out.println();
 System.out.println();
 System.out.println();

for (int y = 65; y < 95; y++){
            b = ran.nextInt(max - min + 1) + min;
            char character = (char) b;
            System.out.print(character + "   ");
            if (y == 69 || y == 74 || y == 79 || y == 84 || y == 89){ 
                System.out.println();
                System.out.println();
            }
        }
 System.out.println();
 System.out.println();
 System.out.println();
    
    System.out.println("Press any key and enter for another turn or press enter to Quit.....");
    Scanner keyboard = new Scanner(System.in);
    choice = keyboard.nextLine();

    if (choice == ""){
        System.out.println("Goodbye");
    } 

    } while (choice != "");   
 }
}


A   B   C   D   E   

F   G   H   I   J   

K   L   M   N   O   

P   Q   R   S   T   

U   V   W   X   Y   

Z   [   \   ]   ^   


]   T   L   _   A   

\   _   G   C   H   

G   U   L   ]   Y   

\   M   A   Z   S   

B   E   J   ^   P   

M   W   L   R   L   


Press any key and enter for another turn or press enter to Quit.....

Goodbye
@aam487 ➜ /workspaces/Dwayne-Java (main) $ 
