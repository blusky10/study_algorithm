package references;

// 최소 개수 동전 구하기
public class Coin {

    static int N=10;
    static int[] ready = new int[N+1];
    static int[] value = new int[N+1];
    static int[] first = new int[N+1];
    static int[] data = {1, 3, 4};

    public static void main(String[] args) {

        value[0] = 0;
        for (int x=1; x<=N; x++){
            value[x] = 100;

            for (int c : data){
                if (x-c >=0){
                    value[x] = Math.min(value[x], value[x-c]+1);
                }
            }
        }

        System.out.println(value[8]);
    }
}
