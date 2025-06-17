public class arrymult {
    public static void main(String[] args) {
    
     int [][] multable = new int[14][14];
     int t = 0;

    System.out.printf("\u001B[31mx");    
     for (int v = 1; v < 13;v++){
     System.out.printf("%4s",v);    
    }
     System.out.print("");
     System.out.println();
     System.out.printf("\u001B[0m");
     for (int x = 1; x < multable[x].length-1;x++){
        t++;
        System.out.printf("\u001B[31m");
        System.out.print(t);
       for (int s = 1; s < multable[s].length-1;s++){
         multable[s][x] = s*x;
         System.out.printf("\u001B[0m");
         System.out.printf("%4s", multable[s][x]);
       }
       System.out.println();
     }
    }
}
@aam487 ➜ /workspaces/Dwayne-Java (main) $  cd /workspaces/Dwayne-Java ; /usr/bin/env /usr/local/sdkman/candidates/java/21.0.6-ms/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /home/codespace/.vscode-remote/data/User/workspaceStorage/f97a03c/redhat.java/jdt_ws/Dwayne-Java_f5daeb/bin arrymult 
x   1   2   3   4   5   6   7   8   9  10  11  12
1   1   2   3   4   5   6   7   8   9  10  11  12
2   2   4   6   8  10  12  14  16  18  20  22  24
3   3   6   9  12  15  18  21  24  27  30  33  36
4   4   8  12  16  20  24  28  32  36  40  44  48
5   5  10  15  20  25  30  35  40  45  50  55  60
6   6  12  18  24  30  36  42  48  54  60  66  72
7   7  14  21  28  35  42  49  56  63  70  77  84
8   8  16  24  32  40  48  56  64  72  80  88  96
9   9  18  27  36  45  54  63  72  81  90  99 108
10  10  20  30  40  50  60  70  80  90 100 110 120
11  11  22  33  44  55  66  77  88  99 110 121 132
12  12  24  36  48  60  72  84  96 108 120 132 144
@aam487 ➜ /workspaces/Dwayne-Java (main) $ 
