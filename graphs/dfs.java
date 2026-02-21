package coding.graphs;
import java.util.*;
public class dfs {
    public static void main(String[] args){
        int[][] ans={{0,2},{0,3},{0,1},{2,4}};//{{1,0},{1,2},{0,2},{2,3},{2,4}};
        int V=5;
        System.out.println(dfs(V,ans));
    }
    public static ArrayList<Integer> dfs(int V,int[][] edges){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0],v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int[] vis=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                fn(i,adj,vis,ans);
            }
        }
        return ans;
    }
    public static void fn(int i,ArrayList<ArrayList<Integer>> adj,int[] vis,ArrayList<Integer> ans){
        vis[i]=1;
        ans.add(i);
        for(int j:adj.get(i)){
            if(vis[j]==0) fn(j,adj,vis,ans); 
        }
    }
}
