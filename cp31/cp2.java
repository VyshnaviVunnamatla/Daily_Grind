package cp31;
import java.util.*;
public class cp2 {
    public static void main(String[] args) {
        int n=1;
        int k=3;
        int[] arr={1};
        System.out.println(fn(n,k,arr));
        // Scanner sc=new Scanner(System.in);
        // int t=sc.nextInt();
        // while(t-->0){
        //     int n=sc.nextInt(),x=sc.nextInt();
        //     int[] arr=new int[n];
        //     for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        //     System.out.println(fn(n,x,arr));
        // }
    }

    public static int fn(int n,int x,int[] arr){
        for(int k=0;k<Integer.MAX_VALUE;k++){
            int cnt=k;
            cnt-=arr[0];
            if(cnt<0) continue;
            for(int i=0;i<n-1;i++){
                cnt=k;
                cnt=cnt-(arr[i+1]-arr[i]);
                if(cnt<0) break;
            }
            if(cnt<0) continue;
            cnt=k;
            cnt=cnt-(x-arr[n-1]);
            cnt=cnt-(x-arr[n-1]);
            if(cnt<0) continue;
            for(int i=n-1;i>=1;i--){
                cnt=k;
                cnt=cnt-(arr[i]-arr[i-1]);
                if(cnt<0) break;
            }
            if(cnt<0) continue;
            cnt=k;
            cnt-=arr[0];
            if(cnt>=0) return k;
        }
        return -1;
    }
}