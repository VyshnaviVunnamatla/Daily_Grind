import java.util.*;
public class cp23 {
    public static void main(String[] args) {
       // System.out.println("hello vysh");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
            System.out.println(fn(a,b,c,d)==Integer.MAX_VALUE?-1:fn(a,b,c,d));
        }
    }
    public static int fn(int a,int b,int c,int d){
        if(a<Integer.MIN_VALUE || a>Integer.MAX_VALUE || b<Integer.MIN_VALUE || b>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(a==c && b==d) return 0;
        int u=1+fn(a-1,b,c,d);
        int dn=1+fn(a+1,b+1,c,d);
        return Math.min(u,dn);
    }
}