package coding.graphs;
import java.util.*;

class Pair{
    int n;
    int w;
    public Pair(int w,int n){
        this.w=w;
        this.n=n;
    }
}
public class dijk{
    public static void main(String[] args){
        int[][] edges={{0, 1, 4}, {0, 2, 8}, {1, 4, 6}, {2, 3, 2}, {3, 4, 10}};//{{0,1,1},{1,2,3},{0,2,6}};
        int V=5,src=0;
        int[] ans=dijk(V,edges,src);
        for(int i:ans) System.out.print(i+" ");
    }
    public static int[] dijk(int V,int[][] edges,int src){
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new Pair(edges[i][2],edges[i][1]));
            adj.get(edges[i][1]).add(new Pair(edges[i][2],edges[i][0]));
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.w-b.w);
        int[] dist=new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        pq.add(new Pair(0,src));
        dist[src]=0;
        while(!pq.isEmpty()){
            int n1=pq.poll().n;
            for(Pair j:adj.get(n1)){
                int n2=j.n,w2=j.w;
                if(dist[n1]+w2<dist[n2]){
                    dist[n2]=dist[n1]+w2;
                    pq.offer(new Pair(dist[n2],n2));
                }

            }
        }
        return dist;
    }
}
