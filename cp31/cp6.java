package cp31;
import java.util.*;
public class cp6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();   
            }
            System.out.println(fn(n,arr));
        }
    }
    public static String fn(int n,int[] arr){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        if(mp.size()>2) return "No";
        else if(mp.size()==1) return "Yes";
        int[] v=new int[2];
        int[] f=new int[2];
        int i=0;
        for(int k:mp.keySet()){
            v[i]=k;
            f[i]=mp.get(k);
            i++;
        }
        if(arr.length % 2!=0){
            if(f[0]+1==f[1] || f[1]+1==f[0]) return "Yes";
            else return "No";
        }
        else{
            if(f[0]==f[1]) return "Yes";
        }
        return "No";
    }
}
