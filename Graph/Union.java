public class Union {
    void union(int u, int v,rank,parent){
        int u_set = find(u,parent);
        int v_set = find(v,parent);
        if(rank[u_set] < rank[v_set]){
            parent[u_set] = v_set;
        }else if(rank[u_set] > rank[v_set]){
            parent[v_set] = u_set;
        }else{
            parent[v_set] = u_set;
            rank[u_set]++;
        }
    }
    
}
