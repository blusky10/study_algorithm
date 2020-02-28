package hashcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Pizza {

    static int M, N;
    static int[] S;
    static Stack<Integer> subset = new Stack<>();
    static int sum = 0;
    static int max = 0;
    static List<Integer> results;
    static boolean find = false;

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

        System.out.println(results.size());

        for (int i=0; i<results.size(); i++){
            System.out.print(Arrays.binarySearch(S, results.get(i)));
            System.out.print(" ");
        }
    }
    public void search(int k){
        if (k == S.length ){
            if (!find) {
                if (sum == M){
                    results = subset.stream().collect(Collectors.toList());
                    max = sum;
                    find = true;
                }else {
                    if (sum < M) {
                        if (sum > max){
                            results = subset.stream().collect(Collectors.toList());
                            max = sum;
                        }
                    }
                }
            }
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