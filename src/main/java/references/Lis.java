package references;

// Longest increasing subsequence
public class Lis {

    public static void main(String[] args) {
        int[] data = {6, 2, 5, 1, 7, 4, 8, 3};
        int[] length = new int[data.length];
        for (int k=0; k<data.length; k++){
            length[k] = 1;

            for (int i=0; i<k; i++){
                if (data[i] < data[k]){
                    length[k] = Math.max(length[k], length[i]+1);
                }
            }
        }

        System.out.println(length[6]);
    }
}
