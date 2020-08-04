package hackerrank;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] split = s.substring(0, 8).split(":");
        String h = split[0];
        String hh = "";

        if (s.contains("PM")){
            hh = h.equals("12")?h:Integer.toString(Integer.parseInt(h) + 12);
        }else{
            hh = h.equals("12")?"00":h;
        }

        return hh+":"+split[1]+":"+split[2];

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
