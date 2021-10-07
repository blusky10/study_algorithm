package codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        int[] input = {9,3,9,3,9,7,9};
        System.out.println(oddOccurrencesInArray.solution(input));
    }

    public int solution(int[] A){
        int size = A.length;

        Map<Integer, Integer> tempMap = new HashMap<>();

        for (int i=0; i<size; i++){
            int value = A[i];

            Integer data = tempMap.get(value);

            if (data == null){
                tempMap.put(value, value);
            }else{
                tempMap.remove(value);
            }
        }

        int result = 0;
        for (int key : tempMap.keySet()){
            result = tempMap.get(key);
        }
        return result;
    }
}
