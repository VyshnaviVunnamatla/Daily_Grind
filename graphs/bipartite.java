package coding.graphs;
import java.util.*;
public class bipartite {
    public static void main(String[] args){
        int[][] ans={{0,2},{0,3},{2,3}};//{{1,0},{1,2},{0,2},{2,3},{2,4}};
        int V=5;
        System.out.println(bipart(V,ans));
    }
    // bfs
    public static boolean bipart(int V,int[][] edges){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0],v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] clr=new int[V];
        Arrays.fill(clr,-1);
        for(int i=0;i<V;i++){
            if(clr[i]==-1){
                if(!fn(i,adj,clr)) return false;
            }
        }
        return true;
    }
    public static boolean fn(int i,ArrayList<ArrayList<Integer>> adj,int[] clr){
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        clr[i]=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int j:adj.get(curr)){
                if(clr[j]==-1){
                    clr[j]=1-clr[curr];
                    q.add(j);
                }
                else if(clr[j]==clr[curr]) return false;
            }

        }
        return true;
    }

}
