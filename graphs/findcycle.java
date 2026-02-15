package graphs;
import java.util.*;
public class findcycle {
    public static void main(String[] args){
        int[][] ans={{0,1},{0,2},{1,2}};//{{0,2},{0,3},{2,1},{3,2}};
        int V=7;
        System.out.println(bipartite(V,ans));
        //System,out.println(bipartite2(V,ans));
    }

    //dfs
    public static boolean bipartite(int V,int[][] edges){
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0],v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] vis=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(!fn(i,-1,adj,vis)) return false;
            }
        }
        return true;
    }
    public static boolean fn(int i,int par,List<List<Integer>> adj,int[] vis){
        vis[i]=1;
        for(int j:adj.get(i)){
            if(vis[j]==0){
                if(!fn(j,i,adj,vis)) return false;
            }
            else if(j!=par) return false;
        }
        return true;
    }

   
}
