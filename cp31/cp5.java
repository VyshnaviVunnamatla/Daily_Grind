package coding.cp31;
import java.util.*;
public class cp5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int j=0;j<n;j++){
                for(int i=1;i<n-1;i++){
                    if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                        int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                    }
                    if(sorted(arr)){
                        System.out.println("Yes");
                        return;
                    }
                }
            }
            System.out.println(sorted(arr)?"Yes":"No");

        }
    }
    public static boolean sorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]) return false;
        }
        return true;
    }
}