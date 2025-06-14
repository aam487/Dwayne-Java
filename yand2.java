public class yand {
    public static <subA> void main(String[] args){
        
    for (int y = 65; y < y + 24; y++){

        //System.out.print(y);
        char character = (char) y;
        System.out.print(character + " ");
        if (y == 90){
            break;      
      }
    }

    System.out.println();

    for (int y = 97; y < y + 24; y++){

        //System.out.print(y);
        char character = (char) y;
        System.out.print(character + " ");
        if (y == 97+25){
            break;      
      }
    }

    System.out.println();
  }   
}


@aam487 ➜ /workspaces/Dwayne-Java (main) $  cd /workspaces/Dwayne-Java ; /usr/bin/env /usr/local/sdkman/candidates/java/21.0.6-ms/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /home/codespace/.vscode-remote/data/User/workspaceStorage/f97a03c/redhat.java/jdt_ws/Dwayne-Java_f5daeb/bin yand 
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
a b c d e f g h i j k l m n o p q r s t u v w x y z 
@aam487 ➜ /workspaces/Dwayne-Java (main) $ ^C
