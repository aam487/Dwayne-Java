/*************************************************
 * hash.java
 * Uses nested for loop to create random hash tags
 * @author Anthony Mayes
 * @version 2.00
 *************************************************/
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
    for (y = 0; y < 5; y++){
       b = ran.nextInt(max - min + 1) + min;
       char character = (char) b; 
       System.out.print(character + "");
    }
    System.out.println();
}

System.out.println();
    }
}
OUTPUT:
Hash Code #1 = ehwvn
Hash Code #2 = xilwj
Hash Code #3 = ryfcz
Hash Code #4 = yvjml
Hash Code #5 = gdixn
