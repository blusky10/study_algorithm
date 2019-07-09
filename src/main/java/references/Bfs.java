package references;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


//첫 번째 줄에 그래프의 정점의 개수 V, 간선의 개수 E, 그리고 시작 정점의 번호 S가 공백으로 분리되어 주어진다. (1 ≤ S ≤ V ≤ 20,000, 1 ≤ E ≤ 100,000)
//두 번째 줄부터 E개의 줄에 걸쳐 각 간선의 정보인 x, y가 공백으로 분리되어 주어진다. 이는 x와 y를 잇는 간선이 존재한다는 것을 의미한다. (1 ≤ x, y ≤ V, x ≠ y)
//정점 S에서 시작한 너비 우선 탐색의 결과 중 오름차순으로 가장 빠른 것을 출력한다.
//
//5 6 2
//1 2
//1 3
//2 4
//3 4
//3 5
//4 5
//
//2 1 4 3 5
public class Bfs {

    static int V, E, S;
    static ArrayList<Integer>[] graph;
    static Queue<Integer> Q = new LinkedList<>();
    static boolean[] visite;
    static BufferedReader br;
    static BufferedWriter bw;
    static ArrayList<Integer>result = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        graph = new ArrayList[E+1];

        for (int i=0; i<E; i++){
            graph[i] = new ArrayList<>();
        }

        for (int i=0; i<E; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        bfs(S);

        for(Integer i : result){
            System.out.println(i);
        }
    }

    private static void bfs(int s) {
        visite = new boolean[V+1];
        Q.add(s);
        visite[s] = true;

        while (!Q.isEmpty()){
            int v = Q.poll();
            result.add(v);
            for (Integer n : graph[v]){
                if(!visite[n]){
                    Q.add(n);
                    visite[n] = true;
                }
            }
        }
    }
}
