/**********************************
 * str1.java
 * shows some methods of String Class
 * @author Anthony Mayes
 * @version 2.00
 *********************************/
//import java.lang.Package;
public class str1 {

    public static void main(String[] args) {
        
      String word = "Yesterday";
      String phrase = "Hello Dwayne, how are you?";
      String[] phrases = phrase.split("\\s+");
      int x;
      int y;
      System.out.println(); //can be placed in its own class
      System.out.println(word + " contains " + word.length() + " characters");
      System.out.println();
      System.out.println("The 5th character of " + word + " is " + word.charAt( 4));
      System.out.println();
      System.out.print("The word " + word + " reversed "); //end of class
      
      for (x = word.length(); x > 0 ; x--){ //can be placed in its own class
        System.out.print(word.substring(x-1,x)); 
    } //end of class

      System.out.println();

      System.out.println(); //can be placed in its own class
      System.out.println(phrase + " contains " + phrase.length() + " characters");
      System.out.println();
      System.out.println("The 5th character of " + phrase + " is " + phrase.charAt( 4));
      System.out.println();
      System.out.print("The phrase " + phrase + " reversed ");
      
      for (y = phrase.length(); y > 0 ; y--){
          System.out.print(phrase.substring(y-1,y));
      } //end of class
       System.out.println();
       System.out.println();
      
       StringBuilder reversedString = new StringBuilder(); //can be placed in its own class
       for (String p : phrases) {
            StringBuilder reversedWord = new StringBuilder(p);
            reversedWord.reverse(); // Reverse the current word
            reversedString.append(reversedWord).append(" "); // Append reversed word and a space
        } //end of class
        System.out.println("Each word in the phrase reversed: " + reversedString.toString().trim());
        System.out.println();
      }
}
Yesterday contains 9 characters

The 5th character of Yesterday is e

The word Yesterday reversed yadretseY

Hello Dwayne, how are you? contains 26 characters

The 5th character of Hello Dwayne, how are you? is o

The phrase Hello Dwayne, how are you? reversed ?uoy era woh ,enyawD olleH

Each word in the phrase reversed: olleH ,enyawD woh era ?uoy

@aam487 ➜ /workspaces/Dwayne-Java (main) $ 
