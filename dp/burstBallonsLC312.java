import java.util.*;
public class burstBallonsLC312{
    public static void main(String[] args) {
        int[] nums={3,1,5,8};
        System.out.println(maxCoins(nums));
    }
    public static int maxCoins(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        Map<ArrayList,Integer> mp=new HashMap<>();
        int maxi=0;
        for(int i:nums){
            arr.add(i);
            maxi=Math.max(maxi,i);
        }
        return helper(0,arr,mp);

    }
    public static int helper(int i,ArrayList<Integer> arr,Map<ArrayList,Integer> mp){
        if(arr.size()==0) return 0;
        if(mp.get(arr)!=0) return mp.get(arr);
        int nb=helper(i+1,arr,mp);
        int b=(arr.get(i-1)==-1?1:arr.get(i-1))*arr.get(i)*(arr.get(i+1)==arr.size()?1:arr.get(i+1));
        arr.remove(i);
        b+=helper(i,arr,mp);
        mp.put(arr,mp.getOrDefault(arr,0)+Math.max(nb,b));
        return Math.max(nb,b);
    }
}