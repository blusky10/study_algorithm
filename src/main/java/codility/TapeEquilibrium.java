package codility;

public class TapeEquilibrium {

    public static void main(String[] args) {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int[] data = {3,1,2,4,3};
        // 3, 4, 6, 10, 13
        System.out.println(tapeEquilibrium.solution(data));
    }

    public int solution(int[] A){

        long sum = 0;
        long[] data = new long[A.length];
        long min = Integer.MAX_VALUE;

        for (int i=0; i<A.length; i++){
            sum += A[i];
            data[i] = sum;
        }

        for (int i=0; i<A.length-1; i++){
            long temp = Math.abs(sum - (data[i]*2));
            if (temp < min){
                min = temp;
            }
        }

        return (int)min;
    }
}
