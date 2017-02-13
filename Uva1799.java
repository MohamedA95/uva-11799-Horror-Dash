/*
 * :) :)
 */
package uva1799;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author habi
 */
public class Uva1799 {

    /**
     * @param args the command line argumnts
     */
    public static void main(String[] args) {
      Scanner input =null;
try { input =new Scanner(Paths.get("hia.in"));}
        catch (IOException io){System.out.println("io");}

int t = input.nextInt();

for (int i =0; i<t ; i++){
    int n = input.nextInt();
           int big=0;

    for(int j=0 ; j<n ; j++){
        int a = input.nextInt() ;
        big=Math.max(big, a);
    }
    System.out.println("Case "+(i+1)+": "+big);
            big=0;

        }
        }
    
}
