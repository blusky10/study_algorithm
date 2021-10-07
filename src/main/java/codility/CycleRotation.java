package codility;

public class CycleRotation {
    public static void main(String[] args) {
        CycleRotation cycleRotation = new CycleRotation();
        int[] input = {-1000, 5};
        int[] solution = cycleRotation.solution(input, 1);

        for (int i=0; i<solution.length; i++){
            System.out.print(solution[i]);
        }
    }


    public int[] solution(int[] A, int K){

        int size = A.length;
        if (size == 0) return A;

        int m = K % size;
        if (size == K || m == 0) return A;

        int[] result = new int[size];

        for (int i=0; i<size; i++){

            if (i+m >= size){
                result[i+m-size] = A[i];
            }else{
                result[i+m] = A[i];
            }
        }

        return result;
    }
}
