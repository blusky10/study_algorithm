package references;

public class UnionFind {

    static int getParent(int[] parent, int x){
        if (parent[x] == x) return x;

        return parent[x] = getParent(parent, parent[x]);
    }

    static void unionParent(int[] parent, int a, int b){
        int x = getParent(parent, a);
        int y = getParent(parent, b);

        if (x < y){
            parent[b] = x;
        }else{
            parent[a] = y;
        }
    }

    static int findParent(int[] parent, int a, int b){
        int pA = getParent(parent, a);
        int pB = getParent(parent, b);

        if (pA == pB) return 1;

        return 0;
    }

    public static void main(String[] args) {

        int[] data = new int[11];

        for(int i=1; i<=10; i++){
            data[i] = i;
        }

        unionParent(data, 1,2);
        unionParent(data, 2,3);
        unionParent(data, 3,4);
        unionParent(data, 5,6);
        unionParent(data, 6,7);
        unionParent(data, 7,8);
        unionParent(data, 8, 9);

        System.out.println("1, 5 Connect?: " +  findParent(data, 1, 5));

        System.out.println("7, 8 Connect?: " +  findParent(data, 7, 8));

    }
}
