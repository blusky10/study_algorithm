package codility;

public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap b = new BinaryGap();

        System.out.println(b.solution(32));
    }

    public int solution(int N){

        String s = Integer.toBinaryString(N);
        int maxLength = 0;
        int index = -1;

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '1'){
                if (index != -1){
                    int length = i - index -1;
                    if (maxLength <= length) maxLength = length;
                }
                index = i;
            }
        }

        return maxLength;
    }
}
