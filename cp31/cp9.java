package coding.cp31;
import java.util.*;
public class cp9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n-1];
            int cnt=0;
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<arr.length;i++){
                cnt=cnt+arr[i];
            }

            if(cnt>0) System.out.println(cnt-(2*cnt));
            else System.out.println(cnt+(-2*cnt));
        }
    }
    
}
