package codility;

public class FrogJmp {

    public static void main(String[] args) {
        FrogJmp frogJmp = new FrogJmp();
        System.out.println(frogJmp.solution(1, 5, 2));
        System.out.println(frogJmp.solution(10, 85, 30));
    }

    public int solution(int X, int Y, int D){
        int a = Y-X;
        int m = a / D;
        int n = a % D;

        if (n != 0){
            m++;
        }

        return m;
    }
}
