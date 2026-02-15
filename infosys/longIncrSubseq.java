import java.lang.reflect.Array;
import java.util.*;
class Pair{
    int i;
    ArrayList<Integer> list;
    Pair(int i,ArrayList<Integer> list){
        this.i=i;
        this.list=list;
    }
}
public class longIncrSubseq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(longestIncrSubseq(arr,m));
    }
    public static int longestIncrSubseq(int[] arr,int m){
        ArrayList<Integer> list=new ArrayList<>();
        Map<Pair,Integer> mp=new HashMap<>();
        mp.put(new Pair(0,list),0);
        return helper(0,arr,m,list,mp);
    }
    public static int helper(int i,int[] arr,int m,ArrayList<Integer> list,Map<Pair,Integer> mp){
        if(i==arr.length) return equalXor(list,m)?list.size():0;
        if(mp.containsKey(new Pair(i,list))) return mp.get(new Pair(i,list));
        int len=0;
        if(list.isEmpty() || arr[i]>list.get(list.size()-1)){
            list.add(arr[i]);
            len=helper(i+1,arr,m,list,mp);
            list.remove(list.size()-1);
        }
        len=Math.max(len,helper(i+1,arr,m,list,mp));
        mp.put(new Pair(i,list),len);
        return len;    
    }
    
    public static boolean equalXor(ArrayList<Integer> list,int m){
        int xor=0;
        if(list.size()==0) return 0>=m?true:false;
        for(int val:list) xor^=val;
        return xor>=m?true:false;
    }
}
