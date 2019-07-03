package references;

import java.util.LinkedList;

public class Dfs {

    private int numVertices;
    private boolean[] visited = new boolean[numVertices];
    private LinkedList<Integer> adj= new LinkedList<>();

    public void dfs(Integer s){
        if (visited[s]) return;

        visited[s] = true;

        for(Integer i : adj){
            dfs(i);
        }
    }
}
