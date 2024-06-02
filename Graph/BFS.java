import java.util.*;
class BFS{
    public ArrayList<Integer> bfs(int V,
    ArrayList<ArrayList<Integer>> adjList){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);
            for(int it: adjList.get(node)){
                if(!visited[it]){
                    visited[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args) {
        int n = 7;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<Integer>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(5);
        graph.get(2).add(6);
        BFS obj = new BFS();
        ArrayList<Integer> BFSGraph= obj.bfs(n, graph);
        for(int i=0; i<BFSGraph.size(); i++){
            System.out.print(BFSGraph.get(i) + " ");
        }

    }
}