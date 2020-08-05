package codewars;

import java.util.Formatter;

public class NthSeries {
    public static String seriesSum(int n) {
        // Happy Coding ^_^
        double increment = 1.0;
        double sum = 0;

        for (int i=1; i<=n; i++){
            double v = 1 / increment;
            sum += v;
            increment += 3.00;
        }

        return String.format("%.2f", sum);
    }
}
