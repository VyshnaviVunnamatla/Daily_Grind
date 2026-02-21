package coding.cp31;
import java.util.*;

// 4 3
// 10 3 830 14
public class cp01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(fn(n,k,arr));
    }
    public static boolean fn(int n,int k,int[] arr){
        if(k==1) return isSorted(arr);
        return true;
    }
    // public static boolean fn(int n,int k,int[] arr){
    //     if(k==1) return isSorted(arr);
    //     for(int x=0;x<n-1;x++){ 
    //         for(int i=0;i<=n-k;i++){ 
    //             for(int j=i+1;j<i+k;j++){ 
    //                 if(arr[i]<arr[j]){ 
    //                     reverse(i,j,arr); 
    //                 } 
    //                 if(isSorted(arr)) return true; 
    //                 if(j==n-1) break; 
    //             } 
    //         } 
    //     }
    //     return isSorted(arr);
    // }
    // public static void reverse(int i,int j,int[] arr){
    //     while(i<j){
    //         int t=arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=t;
    //         i++;
    //         j--;
    //     }
    // }
    public static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}
