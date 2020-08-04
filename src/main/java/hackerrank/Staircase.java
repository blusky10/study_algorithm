package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Staircase {
    // Complete the staircase function below.
    static void staircase(int n) {

        for (int i=1; i<=n; i++){
            StringBuffer sb = new StringBuffer();
            int j=1;
            while (j <=n){
                if (j <=n-i){
                    sb.append(" ");
                }else{
                    sb.append("#");
                }
                j++;
            }
            System.out.println(sb.toString());
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
