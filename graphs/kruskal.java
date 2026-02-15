package graphs;
import java.net.SocketPermission;
import java.util.*;

class DisjointSet{
    List<Integer> rank=new ArrayList<>();
    List<Integer> par=new ArrayList<>();
    List<Integer> size=new ArrayList<>();
    public DisjointSet(int n){
        for(int i=0;i<=n;i++){
            rank.add(0);
            par.add(i);
            size.add(0);
        }
    }
    public int findUPar(int node){
        if(node==par.get(node)) return node;
        int ulp=findUPar(par.get(node));
        par.set(node,ulp);
        return par.get(node);
    }
    public void unionByRank(int u,int v){
        int ulp_u=findUPar(u);
        int ulp_v=findUPar(v);
        if(ulp_u==ulp_v) return;
        if(rank.get(ulp_u)>rank.get(ulp_v)) par.set(ulp_v,ulp_u);
        else if(rank.get(ulp_v)>rank.get(ulp_u)) par.set(ulp_u,ulp_v);
        else{
            par.set(ulp_v,ulp_u);
            rank.set(ulp_u,rank.get(ulp_u)+1);
        }
    }
    public void unionBySize(int u,int v){
        int ulp_u=findUPar(u);
        int ulp_v=findUPar(v);
        if(ulp_u==ulp_v) return;
        if(size.get(ulp_u)<size.get(ulp_v)){
            par.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_v)+size.get(ulp_u));
        }
        else{
            par.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_v)+size.get(ulp_u));
        }

    }
}
class Edge implements Comparable<Edge>{
    int src,dst,wt;
    public Edge(int src,int dst,int wt){
        this.src=src;
        this.dst=dst;
        this.wt=wt;
    }
    public int compareTo(Edge compareEdge){
        return this.wt-compareEdge.wt;
    }
}

public class kruskal {
    public static void main(String[] args) {
        int V=3,E=3;
        int[][] edges={{0,1,5},{1,2,3},{0,2,1}};
        System.out.println(kruskal(V,edges));
    }
    public static int kruskal(int V,int[][] edges){
        List<Edge> e=new ArrayList<>();
        for(int[] i:edges){
            Edge temp=new Edge(i[0],i[1],i[2]);
            e.add(temp);
        }
        DisjointSet ds=new DisjointSet(V);
        Collections.sort(e);
        int ans=0;
        for(int i=0;i<e.size();i++){
            if(ds.findUPar(e.get(i).src)!=ds.findUPar(e.get(i).dst)){
                ans+=e.get(i).wt;
                ds.unionBySize(e.get(i).src, e.get(i).dst);
            }
        }
        return ans;
    }

}
