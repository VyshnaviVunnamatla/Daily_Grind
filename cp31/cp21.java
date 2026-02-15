package cp31;
import java.util.*;
public class cp21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            System.out.println(blanks(n,arr));
        }
    }
    public static int blanks(int n,int[] arr){
        int maxi=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                int cnt=0,j=i;
                while(j<n){
                    if(arr[j]==0){
                        cnt++;
                        j++;
                    }
                    else break;
                }
                maxi=Math.max(maxi,cnt);
            }
        }
        return maxi;
    }
}


