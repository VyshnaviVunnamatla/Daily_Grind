package graphs;
import java.util.*;
public class bfs {
    public static void main(String[] args){
        int[][] ans={{0,2},{0,3},{0,1},{2,4}};//{{1,0},{1,2},{0,2},{2,3},{2,4}};
        int V=7;
        System.out.println(bfs(V,ans));
    }
    public static List<Integer> bfs(int V,int[][] edges){
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0],v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int[] vis=new int[V];
        q.add(0);
        vis[0]=1;
        while(!q.isEmpty()){
            int curr=q.poll();
            ans.add(curr);
            for(int i:adj.get(curr)){
                if(vis[i]==0){
                    vis[i]=1;
                    q.add(i);
                }
            }
        }
        return ans;
    }
}