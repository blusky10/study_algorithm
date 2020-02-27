package hashcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Pizza {

    static int M, N;
    static int[] S;
    static Stack<Integer> subset = new Stack<>();
    static int sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String fistLine = br.readLine();

        StringTokenizer st = new StringTokenizer(fistLine);
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        String secondLine = br.readLine();
        st = new StringTokenizer(secondLine);

        S = new int[N];

        for (int i=0; i<N; i++){
            S[i] = Integer.parseInt(st.nextToken());
        }

        Pizza pizza = new Pizza();
        pizza.search(0);
    }
    public void search(int k){



        if (k == S.length ){

            System.out.println(subset.stream().collect(Collectors.toList()));
            System.out.println(sum);
        }else{
            subset.push(S[k]);
            sum += S[k];
            search(k+1);
            subset.pop();
            sum -= S[k];
            search(k+1);
        }
    }


}