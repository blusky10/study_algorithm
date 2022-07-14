package hackerrank;

import java.io.*;
import java.util.stream.IntStream;

class HackerRankinaString1 {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
        // Write your code here
        char[] base = {'h','a','c','k','e','r','r','a','n','k'};
        int baseN = 0;

        if (s.length() < 10){
            return "NO";
        }
        int index=0;
        while(index < s.length()){
            char c = s.charAt(index);
            if (c == base[baseN]){
                baseN++;
            }

            if (baseN == 10) return "YES";

            index++;

        }

        return "NO";
    }

}

public class HackerRankinaString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = HackerRankinaString1.hackerrankInString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
