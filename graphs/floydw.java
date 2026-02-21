package coding.graphs;
import java.util.*;
public class floydw {
    public static void main(String[] args) {
        int[][] dist={{0, 4, 108, 5, 108}, {108, 0, 1, 108, 6}, {2, 108, 0, 3, 108}, {108, 108, 1, 0, 2}, {1, 108, 108, 4, 0}};
        fw(dist);
        for(int[] r:dist){
            for(int i:r) System.out.print(i+" ");
            System.out.println();
        }
        
    }
    public static void fw(int[][] dist){
        int n=dist.length;
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                }
            }
        }
    }

}
