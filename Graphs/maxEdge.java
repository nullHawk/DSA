public class maxEdge {
    //Given a tree, find the maximum edge that can be added to the tree such that the resulting graph is bipartite.
dfs(int node, int parent, int color){
        for(int child: adj[node]){
            if(child == parent) continue;
            dfs(child, node, 1-color);
        }
    }

    
    public static void main(String[] args){
        
    }
}
