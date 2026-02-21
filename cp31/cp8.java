package coding.cp31;
import java.util.*;
public class cp8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            int cnt=0;
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==k) cnt++;
            }
            if(cnt>0) System.out.println("Yes");
            else System.out.println("No");
        }

    }
    
}
