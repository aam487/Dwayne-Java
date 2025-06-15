public class multiplytable {
    public static void main(String[] args) {
    int t = 0;
    int w = 0;
    System.out.print("x ");    
    for (int x = 0; x < 13;x++){
     System.out.print(x + " ");
    // System.out.print(t + " ");

    }
    System.out.println();

   for (int x = 0; x < 13;x++){
    System.out.print(t + " ");
    System.out.print("");
    t++;
     for (int s = 0; s < 13;s++){

      
      System.out.print("" + s*x + " ");
      

     }
     System.out.println();
     
    }

    }
 

}
@aam487 ➜ /workspaces/Dwayne-Java (main) $  cd /workspaces/Dwayne-Java ; /usr/bin/env /usr/local/sdkman/candidates/java/21.0.6-ms/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /home/codespace/.vscode-remote/data/User/workspaceStorage/f97a03c-1/redhat.java/jdt_ws/Dwayne-Java_f5daeb/bin multiplytable 
x 0 1 2 3 4 5 6 7 8 9 10 11 12 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 
1 0 1 2 3 4 5 6 7 8 9 10 11 12 
2 0 2 4 6 8 10 12 14 16 18 20 22 24 
3 0 3 6 9 12 15 18 21 24 27 30 33 36 
4 0 4 8 12 16 20 24 28 32 36 40 44 48 
5 0 5 10 15 20 25 30 35 40 45 50 55 60 
6 0 6 12 18 24 30 36 42 48 54 60 66 72 
7 0 7 14 21 28 35 42 49 56 63 70 77 84 
8 0 8 16 24 32 40 48 56 64 72 80 88 96 
9 0 9 18 27 36 45 54 63 72 81 90 99 108 
10 0 10 20 30 40 50 60 70 80 90 100 110 120 
11 0 11 22 33 44 55 66 77 88 99 110 121 132 
12 0 12 24 36 48 60 72 84 96 108 120 132 144 
