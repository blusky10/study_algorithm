package codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static void main(String[] args) {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        int[] input = {1,3,1,4,2,3,5,4};

        System.out.println(frogRiverOne.solution(5, input));
    }

    public int solution(int X, int[] A){
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<A.length; i++){

            set.add(A[i]);
            if (set.size() == X){
                return i;
            }
        }
        return -1;
    }
}
