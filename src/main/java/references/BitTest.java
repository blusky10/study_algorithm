package references;

public class BitTest {
    public static void main(String[] args) {
        System.out.println(6&4);
        System.out.println(Integer.toBinaryString(6&4));
        System.out.println(1|2);
        System.out.println(8>>1);
        System.out.println(8>>>1);
        System.out.println(Integer.toBinaryString(8>>1));
        System.out.println(-16>>2);
        System.out.println("-16>>2" + Integer.toBinaryString(-16>>2));
        System.out.println(~0);

        System.out.println(Integer.toBinaryString(-16));
        System.out.println(Integer.toBinaryString(16));


        System.out.println(Integer.toBinaryString(8 >>> 1));

        System.out.println(parity(11111));
    }

    public static short parity(long x){
        short result = 0;
        while (x != 0){
            result ^=1;
            System.out.println(result);
            x &= (x-1);
        }

        return result;
    }
}
