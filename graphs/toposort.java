package graphs;
import java.util.*;
public class toposort {
    public static void main(String[] args) {
        int[][] edges={{3,0},{1,0},{2,0}};
        int V=4;
        System.out.println(topo(V,edges));
    }
    public static ArrayList<Integer> topo(int V,int[][] edges){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0],v=edges[i][1];
            adj.get(u).add(v);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int[] vis=new int[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfs(i,adj,vis,st);
            }
        }
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;
    }
    public static void dfs(int i,ArrayList<ArrayList<Integer>> adj,int[] vis,Stack<Integer> st){
        vis[i]=1;
        for(int j:adj.get(i)){
            if(vis[j]==0) dfs(j,adj,vis,st);
        }
        st.push(i);
    }
}
