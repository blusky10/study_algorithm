package references;

import java.util.Stack;
import java.util.stream.Collectors;

// 부분집합
public class Subset {

    int N = 3;
    Stack<Integer> subset = new Stack<>();

    public static void main(String[] args) {
        Subset subset = new Subset();
        subset.search(1);
    }

    public void search(int k){

        if (k == N+1 ){
            System.out.println(subset.stream().collect(Collectors.toList()));
        }else{
            subset.push(k);
            search(k+1);
            subset.pop();
            search(k+1);
        }
    }

}
