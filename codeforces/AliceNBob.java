
import java.util.*;
public class AliceNBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int[] arr=new int[n];
            int acnt=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]<=a) acnt++;
            }
            int left = arr[0];
            int right = arr[n - 1];
            if (Math.abs(right - a) > Math.abs(left - a)) {
                System.out.println((a + right) / 2 + 1);
            } else {
                System.out.println((a + left) / 2);
            }
        }
        sc.close();
    }
}