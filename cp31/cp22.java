package cp31;
import java.util.*;
public class cp22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long k=sc.nextLong();
            System.out.println(fn(n,k));
        }
    }
    public static String fn(long n,long k){
        if(n==0) return "Yes";
        if(k%2==0){
            return n%2==0?"Yes":"No";
        } 
        else return "Yes";
    }
}
