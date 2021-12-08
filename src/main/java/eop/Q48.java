package eop;

// 숫자 뒤집기
// 숫자를 뒤집기 위해서는 10로 나누면 된다.
public class Q48 {

    public static void main(String[] args) {
        System.out.println(reverse(379));
    }

    public static long reverse(int x){
        long result = 0;
        long remain = Math.abs(x);

        while (remain != 0){
            result = result * 10 + remain % 10;
            remain = remain / 10;
        }

        return x<0? -result:result;
    }
}
