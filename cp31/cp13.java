package cp31;
import java.util.*;

public class cp13 {
    public static void main(String[] args) {
        int n=7;
        int[] a={1,7,7,2,9,1,4};
        ArrayList<Integer> b=new ArrayList<>();
        ArrayList<Integer> c=new ArrayList<>();
        b.add(a[0]);
        fn(n,a,b,c);
        if(b.size()==0 || c.size()==0) System.out.println("-1");
        else{
            System.out.println(b.size()+" "+c.size());
            for(int i:b) System.out.print(i+" ");
            System.out.println();
            for(int j:c) System.out.print(j+" ");
        }
    }
    public static boolean fn(int n,int[] a,ArrayList<Integer> b,ArrayList<Integer> c){
        for(int i=1;i<n;i++){
            int s=b.size();
            for(int j:b){
                if(j%a[i]==0){
                    b.add(a[i]);
                    break;
                }
            }
            if(s==b.size()){
                for(int j:c){
                    if(j%a[i]==0){
                        c.add(a[i]);
                        break;
                    } 
                }
            }
            if(s==b.size()) return false;
        }
        return true;
    }
}
