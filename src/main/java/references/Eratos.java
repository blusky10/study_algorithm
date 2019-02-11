package references;

import java.util.Arrays;

// 에라토스테네스의 체
public class Eratos {
    public static void main(String[] args) {
        System.out.println(prime(6));
        primeNumber(1000);
    }

    private static boolean prime(int n){
        // 루트 N 까지 나눠보면 된다.
        for (int i=2; i<Math.sqrt(n); i++){
            if(n %i == 0){
                return false;
            }
        }
        return true;
    }

    private static void primeNumber(int n){
        // 에라토스테네스의 체
        // N 보다 작은 소수를 구한다.
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);

        for (int i=2; i<=n; i++){
            if (arr[i]){

                for (int j=i*i; j<=n; j=j+i){
                    arr[j] = false;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            if (arr[i]){
                System.out.print(i + " " );
            }
        }
    }
}
