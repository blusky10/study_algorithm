package hackerrank;


import java.io.*;
import java.util.stream.IntStream;

class TheLoveLetterMystery1 {

    /*
     * Complete the 'theLoveLetterMystery' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int theLoveLetterMystery(String s) {
        int size = s.length();
        if (size == 1){
            return 1;
        }
        int sum = 0;
        int index = 0;

        while(index < size/2){
            sum += Math.abs(s.charAt(index) - s.charAt(size-index-1));
            System.out.println(sum);
            index++;
        }

        return sum;
    }

}

public class TheLoveLetterMystery {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = TheLoveLetterMystery1.theLoveLetterMystery(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}