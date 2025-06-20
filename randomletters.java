import java.util.Random;
import java.util.Scanner;
public class letterscramble {
    public static void main(String[] args) {
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
 }
}

@aam487 ➜ /workspaces/Dwayne-Java (main) $  cd /workspaces/Dwayne-Java ; /usr/bin/env /usr/local/sdkman/candidates/java/21.0.6-ms/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /home/codespace/.vscode-remote/data/User/workspaceStorage/f97a03c/redhat.java/jdt_ws/Dwayne-Java_f5daeb/bin letterscramble 

A   B   C   D   E   

F   G   H   I   J   

K   L   M   N   O   

P   Q   R   S   T   

U   V   W   X   Y   

Z   [   \   ]   ^   


C   S   _   B   E   

W   [   M   \   D   

H   L   E   L   E   

B   ^   S   Z   [   

X   ^   \   L   E   

W   C   Z   L   V   


@aam487 ➜ /workspaces/Dwayne-Java (main) $ 
