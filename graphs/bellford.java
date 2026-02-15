package graphs;
import java.util.*;
public class bellford {
    public static void main(String[] args){
        int[][] edges=/*{{1, 3, 2}, {4, 3, -1}, {2, 4, 1}, {1, 2, 1}, {0, 1, 5}};*/{{0, 1, 4},{1, 2, -6},{2, 3, 5},{3, 1, -2}};
        int V=5,src=0;
        int[] ans=bellford(V,edges,src);
        for(int i:ans) System.out.print(i+" ");
    }
    public static int[] bellford(int V,int[][] edges,int src){
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        for(int j=0;j<V;j++){
            for(int i=0;i<edges.length;i++){
                int u=edges[i][0],v=edges[i][1],w=edges[i][2];
                if(dist[u]!=Integer.MAX_VALUE && dist[u]+w<dist[v]) dist[v]=dist[u]+w;
            }
        }
        for(int[] a:edges){
            int u=a[0],v=a[1],w=a[2];
            if(dist[u]!=Integer.MAX_VALUE && dist[u]+w<dist[v]) return new int[]{-1};
        }
        return dist;
    }
}
