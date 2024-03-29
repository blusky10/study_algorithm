package codility;

import java.util.Arrays;

public class PermCheck {

    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
        int[] input = {4,1,3,2};

        System.out.println(permCheck.solution(input));
    }

    public int solution(int[] A){
        Arrays.sort(A);

        if (A[0] != 1){
            return 0;
        }

        for (int i=0; i<A.length-1; i++){
            if (A[i] +1 != A[i+1]) return 0;
        }

        return 1;
    }
}
