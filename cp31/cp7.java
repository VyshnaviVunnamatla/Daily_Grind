package coding.cp31;
import java.util.*;
public class cp7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            String x=sc.next();
            String s=sc.next();
            System.out.println(fn(x,s));
        }
    }
    public static int fn(String x,String s){
        int cnt=0;
        while(x.length()<s.length()){
            x+=x;
            cnt++;
        }
        if(x.contains(s)) return cnt;
        cnt++;
        x+=x;
        if(x.contains(s)) return cnt;
        return -1;
    }
}
