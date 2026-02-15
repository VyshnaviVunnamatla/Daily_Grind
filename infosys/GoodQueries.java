
import java.util.*;

public class GoodQueries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int p=sc.nextInt();
        int q=sc.nextInt();
        int[][] queries=new int[q][2];
        for(int i=0;i<q;i++){
            queries[i][0]=sc.nextInt();
            queries[i][1]=sc.nextInt();
        }
        System.out.println(gudquer(arr,p,queries));
    }
    public static int gudquer(int[] arr,int p,int[][] queries){
        int cnt=0;
        for(int i=0;i<queries.length;i++){
            arr[queries[i][0]-1]=queries[i][1];
            if(gcdpres(arr,p)) cnt++;
        }
        return cnt;
    }
    public static boolean gcdpres(int[] arr,int p){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(gcd(arr[i],arr[j])==p) return true;
            }
        } 
        return false;  
    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    
}
