package eop;

// 숫자의 자리수를 구할 경우 문자열로 바꾸지 않고 구하려면 밑이 10인 로그를 사용해서 구할수 있다.
public class Q49 {
    public static void main(String[] args) {
        isPalindromeNumber(4271);
    }
    public static boolean isPalindromeNumber(int x){
        if (x < 0){
            return false;
        }

        System.out.println(Math.log10(x));
        int n = (int)(Math.floor(Math.log10(x)))+1;

        System.out.println(n);
        return true;
    }
}
