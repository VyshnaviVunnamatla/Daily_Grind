package greedy;
import java.util.*;
public class jumpgame {
    public static void main(String[] args) {
        int[] arr={3,2,1,0,4};
        System.out.println(fn(arr));
    }
    public static boolean fn(int[] arr){
        int n=arr.length;
        int maxi=0;
        for(int i=0;i<n;i++){
            if(maxi==n-1) return true;
            maxi=Math.max(maxi,i+arr[i]);
        }
        return false;
    }
}
