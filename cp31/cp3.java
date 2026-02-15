package cp31;
import java.util.*;
public class cp3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int ans=0,cnt=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='.'){
                    cnt++;
                    if(cnt>2){
                        ans=2;
                        break;
                    }
                    else ans++;
                }
                else{
                    cnt=0;
                }
            }
            System.out.println(ans);
        }
    }
}
