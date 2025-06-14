import java.util.Random;
public class hash {
    public static void main(String[] args) {
    
    int max = 122;
    int min = 97;
    int y = 0;
    int b = 0;
    
    Random ran = new Random();
   for (int i = 1; i < 6; i++) {
     System.out.print("Hash Code #" + i + " = ");
    for (y = 0; y < 10; y++){
       b = ran.nextInt(max - min + 1) + min;
       char character = (char) b; 
       System.out.print(character + "");
    }
    System.out.println();
}

System.out.println();
    }
}
@aam487 ➜ /workspaces/Dwayne-Java (main) $  cd /workspaces/Dwayne-Java ; /usr/bin/env /usr/local/sdkman/candidates/java/21.0.6-ms/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /home/codespace/.vscode-remote/data/User/workspaceStorage/f97a03c/redhat.java/jdt_ws/Dwayne-Java_f5daeb/bin hash 
Hash Code #1 = xhsrsuhvkj
Hash Code #2 = zjvhwgvlvs
Hash Code #3 = sdkqhwzvgc
Hash Code #4 = oizmoikcpg
Hash Code #5 = haxuqwdced
