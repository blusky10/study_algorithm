package references;

import java.util.LinkedList;

/**
 * Created by Sanghyun KIM on 2019-07-03.
 */
public class Bfs {

    private int numVertices;
    private LinkedList<Integer> adjLists[];
    private boolean adjLists = new LinkedList[numVertices];

    public void bfs(int v){
        numVertices = v;

        for (int i=0; i i = adjLists[currVertex].listIterator();
        while (i.hasNext()){
            int adjVertex = i.next();
            if (!visited[adjVertex])
            {
                visited[adjVertex] = true;
                queue.add(adjVertex);
            }
        }
    }
}
