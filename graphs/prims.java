package graphs;
import java.util.*;

class Pair{
    int n;
    int w;
    public Pair(int w,int n){
        this.w=w;
        this.n=n;
    }
}
public class prims {
    public static void main(String[] args) {
        int V=3;
        int[][] edges={{0,1,5}};//{{0, 1, 5}, {1, 2, 3}, {0, 2, 1}};
        System.out.println(prims(V,edges));
    }
    public static int prims(int V,int[][] edges){
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new Pair(edges[i][2],edges[i][1]));
            adj.get(edges[i][1]).add(new Pair(edges[i][2],edges[i][0]));
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((x,y)->x.w-y.w);
        int[] vis=new int[V];
        int sum=0;
        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            int n1=curr.n;
            int w1=curr.w;
            if(vis[n1]==1) continue;
            vis[n1]=1;
            sum+=w1;
            vis[n1]=1;
            for(Pair p:adj.get(n1)){
                int n2=p.n,w2=p.w;
                if(vis[n2]==0) pq.offer(new Pair(w2,n2));
            }
        }
        return sum;
    }
}
