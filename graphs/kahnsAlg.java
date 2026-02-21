package coding.graphs;
import java.util.*;
public class kahnsAlg {
    public static void main(String[] args) {
        int[][] edges={{3,0},{1,0},{2,0}};
        int V=4;
        System.out.println(topo(V,edges));
    }
    public static ArrayList<Integer> topo(int V,int[][] edges){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int[] indeg=new int[V];
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            indeg[edges[i][1]]++;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++) if(indeg[i]==0) q.add(i); 
        while(!q.isEmpty()){
            int curr=q.poll();
            ans.add(curr);
            for(int j:adj.get(curr)){
                indeg[j]--;
                if(indeg[j]==0) q.add(j);
            }
        }
        return ans;
    }
}
