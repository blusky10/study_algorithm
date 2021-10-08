package codility;

public class PermMissingElem {

    public static void main(String[] args) {
        PermMissingElem permMissingElem = new PermMissingElem();
        int[] data = {1};
        System.out.println(permMissingElem.solution(data));
    }

    public int solution(int[] A){
        int size = A.length;
        long N = size + 1;
        long sum = N * (N + 1)/2;

        for (int i=0; i<size; i++){
            sum -= A[i];
        }

        return (int)sum;
    }
}
