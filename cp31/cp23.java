package coding.cp31;

import java.util.*;
public class cp23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
            System.out.println(fn(a,b,c,d));
        }
    }
    public static int fn(int a,int b,int c,int d){
        if(a<-1e8 || a>1e8 || b<-1e8 || b>1e8) return -1;
        if(a==c && b==d) return Math.abs(c-a);
        int l=fn(a-1,b,c,d);
        int r=fn(a+1,b+1,c,d);
        return Math.min(l,r);
    }
}
