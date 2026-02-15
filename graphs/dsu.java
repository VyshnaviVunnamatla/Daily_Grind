package graphs;
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
public class dsu {
    public static void main(String[] args) {
        DisjointSet ds=new DisjointSet(7);
        // ds.unionByRank(1,2);
        // ds.unionByRank(2,3);
        // ds.unionByRank(4,5);
        // ds.unionByRank(6,7);
        // ds.unionByRank(5,6);
        // if(ds.findUPar(3)==ds.findUPar(7)) System.out.println("same");
        // else System.out.println("not same");

        // ds.unionByRank(3,4);
        // if(ds.findUPar(3)==ds.findUPar(7)) System.out.println("same");
        // else System.out.println("not same");

        ds.unionBySize(1,2);
        ds.unionBySize(2,3);
        ds.unionBySize(4,5);
        ds.unionBySize(6,7);
        ds.unionBySize(5,6);
        if(ds.findUPar(3)==ds.findUPar(7)) System.out.println("same");
        else System.out.println("not same");

        ds.unionBySize(3,4);
        if(ds.findUPar(3)==ds.findUPar(7)) System.out.println("same");
        else System.out.println("not same");
    }

    
}
