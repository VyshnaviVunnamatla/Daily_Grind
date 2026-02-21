package coding.cp31;
import java.util.*;
public class cp10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int score=0;
            for(int i=0;i<10;i++){
                String s=sc.next();
                for(int j=0;j<10;j++){
                    if(s.charAt(j)=='X') score+=fn(i,j);
                }
            }
            System.out.println(score);
        }
    }
    public static int fn(int i,int j){
        if (i == 0 || j == 0 || i == 9 || j == 9) return 1;
        else if (i == 1 || j == 1 || i == 8 || j == 8) return 2;
        else if (i == 2 || j == 2 || i == 7 || j == 7) return 3;
        else if (i == 3 || j == 3 || i == 6 || j == 6) return 4;
        return 5;
    }
}
