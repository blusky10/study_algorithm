package references;

// 최대 부분합
public class SubsetSum {

    public static void main(String[] args) {
        int[] data = {-1, 2, 4, -3, 5, 2, -5, 2};

        int best = 0;
        int sum = 0;

        for (int i=0; i<data.length; i++){
            sum = Math.max(data[i], sum+data[i]);
            best = Math.max(best, sum);
        }

        System.out.println("최대 합 : " + best);
    }
}
